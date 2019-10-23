package nl.han.ica.icss.parser;

import java.awt.*;
import java.util.Stack;

import nl.han.ica.icss.ast.*;
import nl.han.ica.icss.ast.literals.ColorLiteral;
import nl.han.ica.icss.ast.literals.PixelLiteral;
import nl.han.ica.icss.ast.selectors.ClassSelector;
import nl.han.ica.icss.ast.selectors.IdSelector;
import nl.han.ica.icss.ast.selectors.TagSelector;

/**
 * This class extracts the ICSS Abstract Syntax Tree from the Antlr Parse tree.
 */
public class ASTListener extends ICSSBaseListener {

    //Accumulator attributes:
    private AST ast;

    //Use this to keep track of the parent nodes when recursively traversing the ast
    private Stack<ASTNode> currentContainer;

    public ASTListener() {
        ast = new AST();
        currentContainer = new Stack<>();
    }

    public AST getAST() {
        return ast;
    }

    @Override
    public void enterStylesheet(ICSSParser.StylesheetContext ctx) {
        Stylesheet stylesheet = new Stylesheet();
        ast.setRoot(stylesheet);
        currentContainer.push(stylesheet);
    }

    @Override
    public void exitStylesheet(ICSSParser.StylesheetContext ctx) {
        currentContainer.pop();
    }

    @Override
    public void enterStylerule(ICSSParser.StyleruleContext ctx) {
        Stylerule stylerule = new Stylerule();
        currentContainer.peek().addChild(stylerule);
        currentContainer.push(stylerule);
    }

    @Override
    public void exitStylerule(ICSSParser.StyleruleContext ctx) {
        currentContainer.pop();
    }

    @Override
    public void enterSelector(ICSSParser.SelectorContext ctx) {
        if (ctx.CLASS_IDENT() != null) {
            ASTNode astNode = new ClassSelector(ctx.getText());
            currentContainer.peek().addChild(astNode);
        } else if (ctx.ID_IDENT() != null) {
            ASTNode astNode = new IdSelector(ctx.getText());
            currentContainer.peek().addChild(astNode);
        } else if (ctx.LOWER_IDENT() != null) {
            ASTNode astNode = new TagSelector(ctx.getText());
            currentContainer.peek().addChild(astNode);
        }
    }

    @Override
    public void exitSelector(ICSSParser.SelectorContext ctx) {
    }

    @Override
    public void enterDeclaration(ICSSParser.DeclarationContext ctx) {
        if (ctx.attribute().LOWER_IDENT() != null) {
            Declaration declaration = new Declaration();
            declaration.addChild(new PropertyName(ctx.attribute().getText()));
            currentContainer.peek().addChild(declaration);
            currentContainer.push(declaration);
        }
    }

    @Override
    public void exitDeclaration(ICSSParser.DeclarationContext ctx) {
        currentContainer.pop();
    }

    @Override
    public void enterValue(ICSSParser.ValueContext ctx) {
        if (ctx.COLOR() != null) {
            ASTNode astNode = new ColorLiteral(ctx.getText());
            currentContainer.peek().addChild(astNode);
        } else if (ctx.PIXELSIZE() != null) {
            ASTNode astNode = new PixelLiteral(ctx.getText());
            currentContainer.peek().addChild(astNode);
        }
    }

    @Override
    public void exitValue(ICSSParser.ValueContext ctx) {
    }
}
