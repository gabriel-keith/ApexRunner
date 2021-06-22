package apexrunner;

import apexrunner.antlr.ApexLexer;
import apexrunner.antlr.ApexParser;
import apexrunner.antlr.ApexParserBaseListener;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {

    public static void main(String[] args) throws IOException {
//        ApexLexer lexer = new ApexLexer(CharStreams.fromFileName("./data/apex/Point.cls"));
//        CommonTokenStream tokenStream = new CommonTokenStream(lexer);
//        ApexParser parser = new ApexParser(tokenStream);
//
//        ApexParser.CompilationUnitContext ctx = parser.compilationUnit();
//        var classDec = ctx.typeDeclaration(0);
//
//        ApexClass apexClass = new AbstractSyntaxTreeLoader().loadClass(classDec);
//        System.out.println(new JavaClassGenerator().generate(apexClass).toString());
//

        Finder finder = new Finder("*.cls");
        Files.walkFileTree(Paths.get("."), finder);
        finder.done();
    }


    public static class Finder extends SimpleFileVisitor<Path> {
        private final PathMatcher matcher;
        private final ProblemFileHandler errorHandler = new ProblemFileHandler();
        private final Counter counter = new Counter();

        Finder(String pattern) {
            matcher = FileSystems.getDefault()
                    .getPathMatcher("glob:" + pattern);
        }

        void find(Path file) throws IOException {
            Path name = file.getFileName();
            if (name != null && matcher.matches(name)) {
                errorHandler.setCurrentFile(name.toString());

                ApexLexer lexer = new ApexLexer(CharStreams.fromPath(file));
                CommonTokenStream tokenStream = new CommonTokenStream(lexer);
                ApexParser parser = new ApexParser(tokenStream);
                parser.setErrorHandler(errorHandler);

                ParseTree tree = parser.compilationUnit();

                ParseTreeWalker.DEFAULT.walk(counter, tree);
            }
        }

        public void done() {
            for (String file : errorHandler.getProblemFiles()) {
                System.out.println(file);
            }

            System.out.println(counter.methodCount);
            System.out.println(counter.testMethodCount);
        }

        @Override
        public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
            find(file);
            return FileVisitResult.CONTINUE;
        }

        @Override
        public FileVisitResult preVisitDirectory(Path dir, BasicFileAttributes attrs) throws IOException {
            find(dir);
            return FileVisitResult.CONTINUE;
        }

        @Override
        public FileVisitResult visitFileFailed(Path file, IOException exc) {
            System.err.println(exc);
            return FileVisitResult.CONTINUE;
        }
    }

    private static class Counter extends ApexParserBaseListener {
        Integer testMethodCount = 0;
        Integer methodCount = 0;

        @Override
        public void enterMethodDeclaration(ApexParser.MethodDeclarationContext ctx) {
            List<ApexParser.ModifierContext> modifiers = ((ApexParser.ClassBodyDeclarationContext) ctx.parent.parent).modifier();

            for (var mod : modifiers) {
                var annotation = mod.annotation();
                if (annotation != null && annotation.getText().equalsIgnoreCase("@istest")) {
                    testMethodCount++;
                }
            }

            methodCount++;
        }
    }

    private static class ProblemFileHandler extends DefaultErrorStrategy {
        private Set<String> problemFiles = new HashSet<>();
        private String currentFile;

        public void setCurrentFile(String currentFile) {
            this.currentFile = currentFile;
        }

        public Set<String> getProblemFiles() {
            return problemFiles;
        }

        @Override
        protected void reportUnwantedToken(Parser recognizer) {
            super.reportUnwantedToken(recognizer);
            problemFiles.add(currentFile);
        }

        @Override
        public void reportError(Parser recognizer, RecognitionException e) {
            super.reportError(recognizer, e);
            problemFiles.add(currentFile);
        }
    }
}
