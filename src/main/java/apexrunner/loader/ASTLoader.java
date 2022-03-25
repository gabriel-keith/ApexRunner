package apexrunner.loader;

import apexrunner.antlr.ApexParser;
import apexrunner.ast.type.ApexClassDeceleration;
import apexrunner.ast.type.ApexEnumDeceleration;
import apexrunner.ast.type.ApexInterfaceDeceleration;
import apexrunner.ast.type.ApexTypeDeceleration;
import apexrunner.ast.Modifiers;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import java.util.List;

public class ASTLoader {
    Modifiers modifiers;


    public ApexTypeDeceleration loadTypeDeceleration(ApexParser.TypeDeclarationContext ctx) {

        List<ApexParser.ModifierContext> modifierContexts = ctx.modifier();
        Modifiers modifiers = collectModifiers(ctx.modifier());

        var interfaceCtx = ctx.interfaceDeclaration();
        var classCtx = ctx.classDeclaration();
        var enumCtx = ctx.enumDeclaration();


        ApexTypeDeceleration typeDeceleration = null;
        if (interfaceCtx != null) {
            typeDeceleration = loadApexInterface(interfaceCtx);
        } else if (classCtx != null) {
            typeDeceleration = loadApexClass(classCtx);
        } else if (enumCtx != null) {
            typeDeceleration = loadApexEnum(enumCtx);
        }

        return typeDeceleration;
    }

    public ApexInterfaceDeceleration loadApexInterface(ApexParser.InterfaceDeclarationContext ctx) {
        return null;
    }

    public ApexClassDeceleration loadApexClass(ApexParser.ClassDeclarationContext ctx) {
        ctx.
    }

    public ApexEnumDeceleration loadApexEnum(ApexParser.EnumDeclarationContext ctx) {
        return null;
    }

    private static Modifiers collectModifiers(List<ApexParser.ModifierContext> ctxs) {
        Modifiers modifiers = new Modifiers();

        for (var ctx : ctxs) {
            switch (ctx.getStart().getType()) {
                case ApexParser.PUBLIC -> modifiers.setAccessLevel(Modifiers.AccessLevel.PUBLIC);
                case ApexParser.PROTECTED -> modifiers.setAccessLevel(Modifiers.AccessLevel.PROTECTED);
                case ApexParser.PRIVATE -> modifiers.setAccessLevel(Modifiers.AccessLevel.PRIVATE);
                case ApexParser.ABSTRACT -> modifiers.setAbstractionLevel(Modifiers.AbstractionLevel.ABSTRACT);
                case ApexParser.VIRTUAL -> modifiers.setAbstractionLevel(Modifiers.AbstractionLevel.VIRTUAL);
            }
        }

        return modifiers;
    }
}
