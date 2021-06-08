package apexrunner;

import apexrunner.ast.AbstractSyntaxTreeLoader;
import apexrunner.ast.ApexClass;
import apexrunner.ast.JavaClassGenerator;
import apexrunner.parser.ApexLexer;
import apexrunner.parser.ApexParser;
import org.antlr.v4.runtime.*;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        ApexLexer lexer = new ApexLexer(CharStreams.fromFileName("./data/apex/Point.cls"));
        CommonTokenStream tokenStream = new CommonTokenStream(lexer);
        ApexParser parser = new ApexParser(tokenStream);

        ApexParser.CompilationUnitContext ctx = parser.compilationUnit();
        var classDec = ctx.typeDeclaration(0);

        ApexClass apexClass = new AbstractSyntaxTreeLoader().loadClass(classDec);
        System.out.println(new JavaClassGenerator().generate(apexClass).toString());
    }
}
