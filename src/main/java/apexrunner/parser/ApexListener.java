package apexrunner.parser;// Generated from apex.g4 by ANTLR 4.9
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ApexParser}.
 */
public interface ApexListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link ApexParser#compilationUnit}.
	 * @param ctx the parse tree
	 */
	void enterCompilationUnit(ApexParser.CompilationUnitContext ctx);
	/**
	 * Exit a parse tree produced by {@link ApexParser#compilationUnit}.
	 * @param ctx the parse tree
	 */
	void exitCompilationUnit(ApexParser.CompilationUnitContext ctx);
	/**
	 * Enter a parse tree produced by {@link ApexParser#packageDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterPackageDeclaration(ApexParser.PackageDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ApexParser#packageDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitPackageDeclaration(ApexParser.PackageDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link ApexParser#importDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterImportDeclaration(ApexParser.ImportDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ApexParser#importDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitImportDeclaration(ApexParser.ImportDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link ApexParser#typeDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterTypeDeclaration(ApexParser.TypeDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ApexParser#typeDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitTypeDeclaration(ApexParser.TypeDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link ApexParser#modifier}.
	 * @param ctx the parse tree
	 */
	void enterModifier(ApexParser.ModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link ApexParser#modifier}.
	 * @param ctx the parse tree
	 */
	void exitModifier(ApexParser.ModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link ApexParser#classOrInterfaceModifier}.
	 * @param ctx the parse tree
	 */
	void enterClassOrInterfaceModifier(ApexParser.ClassOrInterfaceModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link ApexParser#classOrInterfaceModifier}.
	 * @param ctx the parse tree
	 */
	void exitClassOrInterfaceModifier(ApexParser.ClassOrInterfaceModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link ApexParser#variableModifier}.
	 * @param ctx the parse tree
	 */
	void enterVariableModifier(ApexParser.VariableModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link ApexParser#variableModifier}.
	 * @param ctx the parse tree
	 */
	void exitVariableModifier(ApexParser.VariableModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link ApexParser#classDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterClassDeclaration(ApexParser.ClassDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ApexParser#classDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitClassDeclaration(ApexParser.ClassDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link ApexParser#typeParameters}.
	 * @param ctx the parse tree
	 */
	void enterTypeParameters(ApexParser.TypeParametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link ApexParser#typeParameters}.
	 * @param ctx the parse tree
	 */
	void exitTypeParameters(ApexParser.TypeParametersContext ctx);
	/**
	 * Enter a parse tree produced by {@link ApexParser#typeParameter}.
	 * @param ctx the parse tree
	 */
	void enterTypeParameter(ApexParser.TypeParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link ApexParser#typeParameter}.
	 * @param ctx the parse tree
	 */
	void exitTypeParameter(ApexParser.TypeParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link ApexParser#typeBound}.
	 * @param ctx the parse tree
	 */
	void enterTypeBound(ApexParser.TypeBoundContext ctx);
	/**
	 * Exit a parse tree produced by {@link ApexParser#typeBound}.
	 * @param ctx the parse tree
	 */
	void exitTypeBound(ApexParser.TypeBoundContext ctx);
	/**
	 * Enter a parse tree produced by {@link ApexParser#enumDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterEnumDeclaration(ApexParser.EnumDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ApexParser#enumDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitEnumDeclaration(ApexParser.EnumDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link ApexParser#enumConstants}.
	 * @param ctx the parse tree
	 */
	void enterEnumConstants(ApexParser.EnumConstantsContext ctx);
	/**
	 * Exit a parse tree produced by {@link ApexParser#enumConstants}.
	 * @param ctx the parse tree
	 */
	void exitEnumConstants(ApexParser.EnumConstantsContext ctx);
	/**
	 * Enter a parse tree produced by {@link ApexParser#enumConstant}.
	 * @param ctx the parse tree
	 */
	void enterEnumConstant(ApexParser.EnumConstantContext ctx);
	/**
	 * Exit a parse tree produced by {@link ApexParser#enumConstant}.
	 * @param ctx the parse tree
	 */
	void exitEnumConstant(ApexParser.EnumConstantContext ctx);
	/**
	 * Enter a parse tree produced by {@link ApexParser#enumBodyDeclarations}.
	 * @param ctx the parse tree
	 */
	void enterEnumBodyDeclarations(ApexParser.EnumBodyDeclarationsContext ctx);
	/**
	 * Exit a parse tree produced by {@link ApexParser#enumBodyDeclarations}.
	 * @param ctx the parse tree
	 */
	void exitEnumBodyDeclarations(ApexParser.EnumBodyDeclarationsContext ctx);
	/**
	 * Enter a parse tree produced by {@link ApexParser#interfaceDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceDeclaration(ApexParser.InterfaceDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ApexParser#interfaceDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceDeclaration(ApexParser.InterfaceDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link ApexParser#typeList}.
	 * @param ctx the parse tree
	 */
	void enterTypeList(ApexParser.TypeListContext ctx);
	/**
	 * Exit a parse tree produced by {@link ApexParser#typeList}.
	 * @param ctx the parse tree
	 */
	void exitTypeList(ApexParser.TypeListContext ctx);
	/**
	 * Enter a parse tree produced by {@link ApexParser#classBody}.
	 * @param ctx the parse tree
	 */
	void enterClassBody(ApexParser.ClassBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link ApexParser#classBody}.
	 * @param ctx the parse tree
	 */
	void exitClassBody(ApexParser.ClassBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link ApexParser#interfaceBody}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceBody(ApexParser.InterfaceBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link ApexParser#interfaceBody}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceBody(ApexParser.InterfaceBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link ApexParser#classBodyDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterClassBodyDeclaration(ApexParser.ClassBodyDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ApexParser#classBodyDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitClassBodyDeclaration(ApexParser.ClassBodyDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link ApexParser#memberDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterMemberDeclaration(ApexParser.MemberDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ApexParser#memberDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitMemberDeclaration(ApexParser.MemberDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link ApexParser#methodDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterMethodDeclaration(ApexParser.MethodDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ApexParser#methodDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitMethodDeclaration(ApexParser.MethodDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link ApexParser#genericMethodDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterGenericMethodDeclaration(ApexParser.GenericMethodDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ApexParser#genericMethodDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitGenericMethodDeclaration(ApexParser.GenericMethodDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link ApexParser#constructorDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterConstructorDeclaration(ApexParser.ConstructorDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ApexParser#constructorDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitConstructorDeclaration(ApexParser.ConstructorDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link ApexParser#genericConstructorDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterGenericConstructorDeclaration(ApexParser.GenericConstructorDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ApexParser#genericConstructorDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitGenericConstructorDeclaration(ApexParser.GenericConstructorDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link ApexParser#fieldDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterFieldDeclaration(ApexParser.FieldDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ApexParser#fieldDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitFieldDeclaration(ApexParser.FieldDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link ApexParser#propertyDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterPropertyDeclaration(ApexParser.PropertyDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ApexParser#propertyDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitPropertyDeclaration(ApexParser.PropertyDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link ApexParser#propertyBodyDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterPropertyBodyDeclaration(ApexParser.PropertyBodyDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ApexParser#propertyBodyDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitPropertyBodyDeclaration(ApexParser.PropertyBodyDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link ApexParser#interfaceBodyDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceBodyDeclaration(ApexParser.InterfaceBodyDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ApexParser#interfaceBodyDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceBodyDeclaration(ApexParser.InterfaceBodyDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link ApexParser#interfaceMemberDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceMemberDeclaration(ApexParser.InterfaceMemberDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ApexParser#interfaceMemberDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceMemberDeclaration(ApexParser.InterfaceMemberDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link ApexParser#constDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterConstDeclaration(ApexParser.ConstDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ApexParser#constDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitConstDeclaration(ApexParser.ConstDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link ApexParser#constantDeclarator}.
	 * @param ctx the parse tree
	 */
	void enterConstantDeclarator(ApexParser.ConstantDeclaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link ApexParser#constantDeclarator}.
	 * @param ctx the parse tree
	 */
	void exitConstantDeclarator(ApexParser.ConstantDeclaratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link ApexParser#interfaceMethodDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceMethodDeclaration(ApexParser.InterfaceMethodDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ApexParser#interfaceMethodDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceMethodDeclaration(ApexParser.InterfaceMethodDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link ApexParser#genericInterfaceMethodDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterGenericInterfaceMethodDeclaration(ApexParser.GenericInterfaceMethodDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ApexParser#genericInterfaceMethodDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitGenericInterfaceMethodDeclaration(ApexParser.GenericInterfaceMethodDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link ApexParser#variableDeclarators}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclarators(ApexParser.VariableDeclaratorsContext ctx);
	/**
	 * Exit a parse tree produced by {@link ApexParser#variableDeclarators}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclarators(ApexParser.VariableDeclaratorsContext ctx);
	/**
	 * Enter a parse tree produced by {@link ApexParser#variableDeclarator}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclarator(ApexParser.VariableDeclaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link ApexParser#variableDeclarator}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclarator(ApexParser.VariableDeclaratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link ApexParser#variableDeclaratorId}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclaratorId(ApexParser.VariableDeclaratorIdContext ctx);
	/**
	 * Exit a parse tree produced by {@link ApexParser#variableDeclaratorId}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclaratorId(ApexParser.VariableDeclaratorIdContext ctx);
	/**
	 * Enter a parse tree produced by {@link ApexParser#variableInitializer}.
	 * @param ctx the parse tree
	 */
	void enterVariableInitializer(ApexParser.VariableInitializerContext ctx);
	/**
	 * Exit a parse tree produced by {@link ApexParser#variableInitializer}.
	 * @param ctx the parse tree
	 */
	void exitVariableInitializer(ApexParser.VariableInitializerContext ctx);
	/**
	 * Enter a parse tree produced by {@link ApexParser#arrayInitializer}.
	 * @param ctx the parse tree
	 */
	void enterArrayInitializer(ApexParser.ArrayInitializerContext ctx);
	/**
	 * Exit a parse tree produced by {@link ApexParser#arrayInitializer}.
	 * @param ctx the parse tree
	 */
	void exitArrayInitializer(ApexParser.ArrayInitializerContext ctx);
	/**
	 * Enter a parse tree produced by {@link ApexParser#enumConstantName}.
	 * @param ctx the parse tree
	 */
	void enterEnumConstantName(ApexParser.EnumConstantNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link ApexParser#enumConstantName}.
	 * @param ctx the parse tree
	 */
	void exitEnumConstantName(ApexParser.EnumConstantNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link ApexParser#type_}.
	 * @param ctx the parse tree
	 */
	void enterType_(ApexParser.Type_Context ctx);
	/**
	 * Exit a parse tree produced by {@link ApexParser#type_}.
	 * @param ctx the parse tree
	 */
	void exitType_(ApexParser.Type_Context ctx);
	/**
	 * Enter a parse tree produced by {@link ApexParser#classOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void enterClassOrInterfaceType(ApexParser.ClassOrInterfaceTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ApexParser#classOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void exitClassOrInterfaceType(ApexParser.ClassOrInterfaceTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link ApexParser#primitiveType}.
	 * @param ctx the parse tree
	 */
	void enterPrimitiveType(ApexParser.PrimitiveTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ApexParser#primitiveType}.
	 * @param ctx the parse tree
	 */
	void exitPrimitiveType(ApexParser.PrimitiveTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link ApexParser#typeArguments}.
	 * @param ctx the parse tree
	 */
	void enterTypeArguments(ApexParser.TypeArgumentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link ApexParser#typeArguments}.
	 * @param ctx the parse tree
	 */
	void exitTypeArguments(ApexParser.TypeArgumentsContext ctx);
	/**
	 * Enter a parse tree produced by {@link ApexParser#typeArgument}.
	 * @param ctx the parse tree
	 */
	void enterTypeArgument(ApexParser.TypeArgumentContext ctx);
	/**
	 * Exit a parse tree produced by {@link ApexParser#typeArgument}.
	 * @param ctx the parse tree
	 */
	void exitTypeArgument(ApexParser.TypeArgumentContext ctx);
	/**
	 * Enter a parse tree produced by {@link ApexParser#qualifiedNameList}.
	 * @param ctx the parse tree
	 */
	void enterQualifiedNameList(ApexParser.QualifiedNameListContext ctx);
	/**
	 * Exit a parse tree produced by {@link ApexParser#qualifiedNameList}.
	 * @param ctx the parse tree
	 */
	void exitQualifiedNameList(ApexParser.QualifiedNameListContext ctx);
	/**
	 * Enter a parse tree produced by {@link ApexParser#formalParameters}.
	 * @param ctx the parse tree
	 */
	void enterFormalParameters(ApexParser.FormalParametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link ApexParser#formalParameters}.
	 * @param ctx the parse tree
	 */
	void exitFormalParameters(ApexParser.FormalParametersContext ctx);
	/**
	 * Enter a parse tree produced by {@link ApexParser#formalParameterList}.
	 * @param ctx the parse tree
	 */
	void enterFormalParameterList(ApexParser.FormalParameterListContext ctx);
	/**
	 * Exit a parse tree produced by {@link ApexParser#formalParameterList}.
	 * @param ctx the parse tree
	 */
	void exitFormalParameterList(ApexParser.FormalParameterListContext ctx);
	/**
	 * Enter a parse tree produced by {@link ApexParser#formalParameter}.
	 * @param ctx the parse tree
	 */
	void enterFormalParameter(ApexParser.FormalParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link ApexParser#formalParameter}.
	 * @param ctx the parse tree
	 */
	void exitFormalParameter(ApexParser.FormalParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link ApexParser#lastFormalParameter}.
	 * @param ctx the parse tree
	 */
	void enterLastFormalParameter(ApexParser.LastFormalParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link ApexParser#lastFormalParameter}.
	 * @param ctx the parse tree
	 */
	void exitLastFormalParameter(ApexParser.LastFormalParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link ApexParser#methodBody}.
	 * @param ctx the parse tree
	 */
	void enterMethodBody(ApexParser.MethodBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link ApexParser#methodBody}.
	 * @param ctx the parse tree
	 */
	void exitMethodBody(ApexParser.MethodBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link ApexParser#constructorBody}.
	 * @param ctx the parse tree
	 */
	void enterConstructorBody(ApexParser.ConstructorBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link ApexParser#constructorBody}.
	 * @param ctx the parse tree
	 */
	void exitConstructorBody(ApexParser.ConstructorBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link ApexParser#qualifiedName}.
	 * @param ctx the parse tree
	 */
	void enterQualifiedName(ApexParser.QualifiedNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link ApexParser#qualifiedName}.
	 * @param ctx the parse tree
	 */
	void exitQualifiedName(ApexParser.QualifiedNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link ApexParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterLiteral(ApexParser.LiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link ApexParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitLiteral(ApexParser.LiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link ApexParser#annotation}.
	 * @param ctx the parse tree
	 */
	void enterAnnotation(ApexParser.AnnotationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ApexParser#annotation}.
	 * @param ctx the parse tree
	 */
	void exitAnnotation(ApexParser.AnnotationContext ctx);
	/**
	 * Enter a parse tree produced by {@link ApexParser#annotationName}.
	 * @param ctx the parse tree
	 */
	void enterAnnotationName(ApexParser.AnnotationNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link ApexParser#annotationName}.
	 * @param ctx the parse tree
	 */
	void exitAnnotationName(ApexParser.AnnotationNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link ApexParser#elementValuePairs}.
	 * @param ctx the parse tree
	 */
	void enterElementValuePairs(ApexParser.ElementValuePairsContext ctx);
	/**
	 * Exit a parse tree produced by {@link ApexParser#elementValuePairs}.
	 * @param ctx the parse tree
	 */
	void exitElementValuePairs(ApexParser.ElementValuePairsContext ctx);
	/**
	 * Enter a parse tree produced by {@link ApexParser#elementValuePair}.
	 * @param ctx the parse tree
	 */
	void enterElementValuePair(ApexParser.ElementValuePairContext ctx);
	/**
	 * Exit a parse tree produced by {@link ApexParser#elementValuePair}.
	 * @param ctx the parse tree
	 */
	void exitElementValuePair(ApexParser.ElementValuePairContext ctx);
	/**
	 * Enter a parse tree produced by {@link ApexParser#elementValue}.
	 * @param ctx the parse tree
	 */
	void enterElementValue(ApexParser.ElementValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link ApexParser#elementValue}.
	 * @param ctx the parse tree
	 */
	void exitElementValue(ApexParser.ElementValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link ApexParser#elementValueArrayInitializer}.
	 * @param ctx the parse tree
	 */
	void enterElementValueArrayInitializer(ApexParser.ElementValueArrayInitializerContext ctx);
	/**
	 * Exit a parse tree produced by {@link ApexParser#elementValueArrayInitializer}.
	 * @param ctx the parse tree
	 */
	void exitElementValueArrayInitializer(ApexParser.ElementValueArrayInitializerContext ctx);
	/**
	 * Enter a parse tree produced by {@link ApexParser#annotationTypeDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterAnnotationTypeDeclaration(ApexParser.AnnotationTypeDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ApexParser#annotationTypeDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitAnnotationTypeDeclaration(ApexParser.AnnotationTypeDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link ApexParser#annotationTypeBody}.
	 * @param ctx the parse tree
	 */
	void enterAnnotationTypeBody(ApexParser.AnnotationTypeBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link ApexParser#annotationTypeBody}.
	 * @param ctx the parse tree
	 */
	void exitAnnotationTypeBody(ApexParser.AnnotationTypeBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link ApexParser#annotationTypeElementDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterAnnotationTypeElementDeclaration(ApexParser.AnnotationTypeElementDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ApexParser#annotationTypeElementDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitAnnotationTypeElementDeclaration(ApexParser.AnnotationTypeElementDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link ApexParser#annotationTypeElementRest}.
	 * @param ctx the parse tree
	 */
	void enterAnnotationTypeElementRest(ApexParser.AnnotationTypeElementRestContext ctx);
	/**
	 * Exit a parse tree produced by {@link ApexParser#annotationTypeElementRest}.
	 * @param ctx the parse tree
	 */
	void exitAnnotationTypeElementRest(ApexParser.AnnotationTypeElementRestContext ctx);
	/**
	 * Enter a parse tree produced by {@link ApexParser#annotationMethodOrConstantRest}.
	 * @param ctx the parse tree
	 */
	void enterAnnotationMethodOrConstantRest(ApexParser.AnnotationMethodOrConstantRestContext ctx);
	/**
	 * Exit a parse tree produced by {@link ApexParser#annotationMethodOrConstantRest}.
	 * @param ctx the parse tree
	 */
	void exitAnnotationMethodOrConstantRest(ApexParser.AnnotationMethodOrConstantRestContext ctx);
	/**
	 * Enter a parse tree produced by {@link ApexParser#annotationMethodRest}.
	 * @param ctx the parse tree
	 */
	void enterAnnotationMethodRest(ApexParser.AnnotationMethodRestContext ctx);
	/**
	 * Exit a parse tree produced by {@link ApexParser#annotationMethodRest}.
	 * @param ctx the parse tree
	 */
	void exitAnnotationMethodRest(ApexParser.AnnotationMethodRestContext ctx);
	/**
	 * Enter a parse tree produced by {@link ApexParser#annotationConstantRest}.
	 * @param ctx the parse tree
	 */
	void enterAnnotationConstantRest(ApexParser.AnnotationConstantRestContext ctx);
	/**
	 * Exit a parse tree produced by {@link ApexParser#annotationConstantRest}.
	 * @param ctx the parse tree
	 */
	void exitAnnotationConstantRest(ApexParser.AnnotationConstantRestContext ctx);
	/**
	 * Enter a parse tree produced by {@link ApexParser#defaultValue}.
	 * @param ctx the parse tree
	 */
	void enterDefaultValue(ApexParser.DefaultValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link ApexParser#defaultValue}.
	 * @param ctx the parse tree
	 */
	void exitDefaultValue(ApexParser.DefaultValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link ApexParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(ApexParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link ApexParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(ApexParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link ApexParser#blockStatement}.
	 * @param ctx the parse tree
	 */
	void enterBlockStatement(ApexParser.BlockStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ApexParser#blockStatement}.
	 * @param ctx the parse tree
	 */
	void exitBlockStatement(ApexParser.BlockStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ApexParser#localVariableDeclarationStatement}.
	 * @param ctx the parse tree
	 */
	void enterLocalVariableDeclarationStatement(ApexParser.LocalVariableDeclarationStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ApexParser#localVariableDeclarationStatement}.
	 * @param ctx the parse tree
	 */
	void exitLocalVariableDeclarationStatement(ApexParser.LocalVariableDeclarationStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ApexParser#localVariableDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterLocalVariableDeclaration(ApexParser.LocalVariableDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ApexParser#localVariableDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitLocalVariableDeclaration(ApexParser.LocalVariableDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link ApexParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(ApexParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ApexParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(ApexParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ApexParser#propertyBlock}.
	 * @param ctx the parse tree
	 */
	void enterPropertyBlock(ApexParser.PropertyBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link ApexParser#propertyBlock}.
	 * @param ctx the parse tree
	 */
	void exitPropertyBlock(ApexParser.PropertyBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link ApexParser#getter}.
	 * @param ctx the parse tree
	 */
	void enterGetter(ApexParser.GetterContext ctx);
	/**
	 * Exit a parse tree produced by {@link ApexParser#getter}.
	 * @param ctx the parse tree
	 */
	void exitGetter(ApexParser.GetterContext ctx);
	/**
	 * Enter a parse tree produced by {@link ApexParser#setter}.
	 * @param ctx the parse tree
	 */
	void enterSetter(ApexParser.SetterContext ctx);
	/**
	 * Exit a parse tree produced by {@link ApexParser#setter}.
	 * @param ctx the parse tree
	 */
	void exitSetter(ApexParser.SetterContext ctx);
	/**
	 * Enter a parse tree produced by {@link ApexParser#catchClause}.
	 * @param ctx the parse tree
	 */
	void enterCatchClause(ApexParser.CatchClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link ApexParser#catchClause}.
	 * @param ctx the parse tree
	 */
	void exitCatchClause(ApexParser.CatchClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link ApexParser#catchType}.
	 * @param ctx the parse tree
	 */
	void enterCatchType(ApexParser.CatchTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ApexParser#catchType}.
	 * @param ctx the parse tree
	 */
	void exitCatchType(ApexParser.CatchTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link ApexParser#finallyBlock}.
	 * @param ctx the parse tree
	 */
	void enterFinallyBlock(ApexParser.FinallyBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link ApexParser#finallyBlock}.
	 * @param ctx the parse tree
	 */
	void exitFinallyBlock(ApexParser.FinallyBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link ApexParser#resourceSpecification}.
	 * @param ctx the parse tree
	 */
	void enterResourceSpecification(ApexParser.ResourceSpecificationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ApexParser#resourceSpecification}.
	 * @param ctx the parse tree
	 */
	void exitResourceSpecification(ApexParser.ResourceSpecificationContext ctx);
	/**
	 * Enter a parse tree produced by {@link ApexParser#resources}.
	 * @param ctx the parse tree
	 */
	void enterResources(ApexParser.ResourcesContext ctx);
	/**
	 * Exit a parse tree produced by {@link ApexParser#resources}.
	 * @param ctx the parse tree
	 */
	void exitResources(ApexParser.ResourcesContext ctx);
	/**
	 * Enter a parse tree produced by {@link ApexParser#resource}.
	 * @param ctx the parse tree
	 */
	void enterResource(ApexParser.ResourceContext ctx);
	/**
	 * Exit a parse tree produced by {@link ApexParser#resource}.
	 * @param ctx the parse tree
	 */
	void exitResource(ApexParser.ResourceContext ctx);
	/**
	 * Enter a parse tree produced by {@link ApexParser#forControl}.
	 * @param ctx the parse tree
	 */
	void enterForControl(ApexParser.ForControlContext ctx);
	/**
	 * Exit a parse tree produced by {@link ApexParser#forControl}.
	 * @param ctx the parse tree
	 */
	void exitForControl(ApexParser.ForControlContext ctx);
	/**
	 * Enter a parse tree produced by {@link ApexParser#forInit}.
	 * @param ctx the parse tree
	 */
	void enterForInit(ApexParser.ForInitContext ctx);
	/**
	 * Exit a parse tree produced by {@link ApexParser#forInit}.
	 * @param ctx the parse tree
	 */
	void exitForInit(ApexParser.ForInitContext ctx);
	/**
	 * Enter a parse tree produced by {@link ApexParser#enhancedForControl}.
	 * @param ctx the parse tree
	 */
	void enterEnhancedForControl(ApexParser.EnhancedForControlContext ctx);
	/**
	 * Exit a parse tree produced by {@link ApexParser#enhancedForControl}.
	 * @param ctx the parse tree
	 */
	void exitEnhancedForControl(ApexParser.EnhancedForControlContext ctx);
	/**
	 * Enter a parse tree produced by {@link ApexParser#forUpdate}.
	 * @param ctx the parse tree
	 */
	void enterForUpdate(ApexParser.ForUpdateContext ctx);
	/**
	 * Exit a parse tree produced by {@link ApexParser#forUpdate}.
	 * @param ctx the parse tree
	 */
	void exitForUpdate(ApexParser.ForUpdateContext ctx);
	/**
	 * Enter a parse tree produced by {@link ApexParser#parExpression}.
	 * @param ctx the parse tree
	 */
	void enterParExpression(ApexParser.ParExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ApexParser#parExpression}.
	 * @param ctx the parse tree
	 */
	void exitParExpression(ApexParser.ParExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ApexParser#expressionList}.
	 * @param ctx the parse tree
	 */
	void enterExpressionList(ApexParser.ExpressionListContext ctx);
	/**
	 * Exit a parse tree produced by {@link ApexParser#expressionList}.
	 * @param ctx the parse tree
	 */
	void exitExpressionList(ApexParser.ExpressionListContext ctx);
	/**
	 * Enter a parse tree produced by {@link ApexParser#statementExpression}.
	 * @param ctx the parse tree
	 */
	void enterStatementExpression(ApexParser.StatementExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ApexParser#statementExpression}.
	 * @param ctx the parse tree
	 */
	void exitStatementExpression(ApexParser.StatementExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ApexParser#constantExpression}.
	 * @param ctx the parse tree
	 */
	void enterConstantExpression(ApexParser.ConstantExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ApexParser#constantExpression}.
	 * @param ctx the parse tree
	 */
	void exitConstantExpression(ApexParser.ConstantExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ApexParser#apexDbUpsertExpression}.
	 * @param ctx the parse tree
	 */
	void enterApexDbUpsertExpression(ApexParser.ApexDbUpsertExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ApexParser#apexDbUpsertExpression}.
	 * @param ctx the parse tree
	 */
	void exitApexDbUpsertExpression(ApexParser.ApexDbUpsertExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ApexParser#apexDbExpression}.
	 * @param ctx the parse tree
	 */
	void enterApexDbExpression(ApexParser.ApexDbExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ApexParser#apexDbExpression}.
	 * @param ctx the parse tree
	 */
	void exitApexDbExpression(ApexParser.ApexDbExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ApexParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(ApexParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ApexParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(ApexParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ApexParser#primary}.
	 * @param ctx the parse tree
	 */
	void enterPrimary(ApexParser.PrimaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link ApexParser#primary}.
	 * @param ctx the parse tree
	 */
	void exitPrimary(ApexParser.PrimaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link ApexParser#creator}.
	 * @param ctx the parse tree
	 */
	void enterCreator(ApexParser.CreatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link ApexParser#creator}.
	 * @param ctx the parse tree
	 */
	void exitCreator(ApexParser.CreatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link ApexParser#createdName}.
	 * @param ctx the parse tree
	 */
	void enterCreatedName(ApexParser.CreatedNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link ApexParser#createdName}.
	 * @param ctx the parse tree
	 */
	void exitCreatedName(ApexParser.CreatedNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link ApexParser#innerCreator}.
	 * @param ctx the parse tree
	 */
	void enterInnerCreator(ApexParser.InnerCreatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link ApexParser#innerCreator}.
	 * @param ctx the parse tree
	 */
	void exitInnerCreator(ApexParser.InnerCreatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link ApexParser#arrayCreatorRest}.
	 * @param ctx the parse tree
	 */
	void enterArrayCreatorRest(ApexParser.ArrayCreatorRestContext ctx);
	/**
	 * Exit a parse tree produced by {@link ApexParser#arrayCreatorRest}.
	 * @param ctx the parse tree
	 */
	void exitArrayCreatorRest(ApexParser.ArrayCreatorRestContext ctx);
	/**
	 * Enter a parse tree produced by {@link ApexParser#mapCreatorRest}.
	 * @param ctx the parse tree
	 */
	void enterMapCreatorRest(ApexParser.MapCreatorRestContext ctx);
	/**
	 * Exit a parse tree produced by {@link ApexParser#mapCreatorRest}.
	 * @param ctx the parse tree
	 */
	void exitMapCreatorRest(ApexParser.MapCreatorRestContext ctx);
	/**
	 * Enter a parse tree produced by {@link ApexParser#setCreatorRest}.
	 * @param ctx the parse tree
	 */
	void enterSetCreatorRest(ApexParser.SetCreatorRestContext ctx);
	/**
	 * Exit a parse tree produced by {@link ApexParser#setCreatorRest}.
	 * @param ctx the parse tree
	 */
	void exitSetCreatorRest(ApexParser.SetCreatorRestContext ctx);
	/**
	 * Enter a parse tree produced by {@link ApexParser#classCreatorRest}.
	 * @param ctx the parse tree
	 */
	void enterClassCreatorRest(ApexParser.ClassCreatorRestContext ctx);
	/**
	 * Exit a parse tree produced by {@link ApexParser#classCreatorRest}.
	 * @param ctx the parse tree
	 */
	void exitClassCreatorRest(ApexParser.ClassCreatorRestContext ctx);
	/**
	 * Enter a parse tree produced by {@link ApexParser#explicitGenericInvocation}.
	 * @param ctx the parse tree
	 */
	void enterExplicitGenericInvocation(ApexParser.ExplicitGenericInvocationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ApexParser#explicitGenericInvocation}.
	 * @param ctx the parse tree
	 */
	void exitExplicitGenericInvocation(ApexParser.ExplicitGenericInvocationContext ctx);
	/**
	 * Enter a parse tree produced by {@link ApexParser#nonWildcardTypeArguments}.
	 * @param ctx the parse tree
	 */
	void enterNonWildcardTypeArguments(ApexParser.NonWildcardTypeArgumentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link ApexParser#nonWildcardTypeArguments}.
	 * @param ctx the parse tree
	 */
	void exitNonWildcardTypeArguments(ApexParser.NonWildcardTypeArgumentsContext ctx);
	/**
	 * Enter a parse tree produced by {@link ApexParser#typeArgumentsOrDiamond}.
	 * @param ctx the parse tree
	 */
	void enterTypeArgumentsOrDiamond(ApexParser.TypeArgumentsOrDiamondContext ctx);
	/**
	 * Exit a parse tree produced by {@link ApexParser#typeArgumentsOrDiamond}.
	 * @param ctx the parse tree
	 */
	void exitTypeArgumentsOrDiamond(ApexParser.TypeArgumentsOrDiamondContext ctx);
	/**
	 * Enter a parse tree produced by {@link ApexParser#nonWildcardTypeArgumentsOrDiamond}.
	 * @param ctx the parse tree
	 */
	void enterNonWildcardTypeArgumentsOrDiamond(ApexParser.NonWildcardTypeArgumentsOrDiamondContext ctx);
	/**
	 * Exit a parse tree produced by {@link ApexParser#nonWildcardTypeArgumentsOrDiamond}.
	 * @param ctx the parse tree
	 */
	void exitNonWildcardTypeArgumentsOrDiamond(ApexParser.NonWildcardTypeArgumentsOrDiamondContext ctx);
	/**
	 * Enter a parse tree produced by {@link ApexParser#superSuffix}.
	 * @param ctx the parse tree
	 */
	void enterSuperSuffix(ApexParser.SuperSuffixContext ctx);
	/**
	 * Exit a parse tree produced by {@link ApexParser#superSuffix}.
	 * @param ctx the parse tree
	 */
	void exitSuperSuffix(ApexParser.SuperSuffixContext ctx);
	/**
	 * Enter a parse tree produced by {@link ApexParser#explicitGenericInvocationSuffix}.
	 * @param ctx the parse tree
	 */
	void enterExplicitGenericInvocationSuffix(ApexParser.ExplicitGenericInvocationSuffixContext ctx);
	/**
	 * Exit a parse tree produced by {@link ApexParser#explicitGenericInvocationSuffix}.
	 * @param ctx the parse tree
	 */
	void exitExplicitGenericInvocationSuffix(ApexParser.ExplicitGenericInvocationSuffixContext ctx);
	/**
	 * Enter a parse tree produced by {@link ApexParser#arguments}.
	 * @param ctx the parse tree
	 */
	void enterArguments(ApexParser.ArgumentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link ApexParser#arguments}.
	 * @param ctx the parse tree
	 */
	void exitArguments(ApexParser.ArgumentsContext ctx);
}