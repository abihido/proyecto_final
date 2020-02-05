import com.sun.glass.ui.SystemClipboard;
import grammar.lengBasicBaseListener;
import grammar.lengBasicLexer;
import grammar.lengBasicParser;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.RuleContext;
import org.antlr.v4.runtime.tree.*;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;


public class Short_to_unicode extends lengBasicBaseListener {
    Printer dibujo;
    ArrayList types=new ArrayList();
    ArrayList argNames= new ArrayList();
    visitantes turista= new visitantes();
    public Short_to_unicode() throws IOException {
         dibujo=new Printer();
    }
    int Linea = 0;


    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void enterBegin(lengBasicParser.BeginContext ctx) {
        dibujo.Esperalo();
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void exitBegin(lengBasicParser.BeginContext ctx) {

        dibujo.Esperalo();
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void enterStatement(lengBasicParser.StatementContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void exitStatement(lengBasicParser.StatementContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void enterGlobalThings(lengBasicParser.GlobalThingsContext ctx) {

    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void exitGlobalThings(lengBasicParser.GlobalThingsContext ctx) {

    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void enterLocalThings(lengBasicParser.LocalThingsContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void exitLocalThings(lengBasicParser.LocalThingsContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void enterMain(lengBasicParser.MainContext ctx) {

        dibujo.Esperalo();
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void exitMain(lengBasicParser.MainContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void enterDeclaracion(lengBasicParser.DeclaracionContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void exitDeclaracion(lengBasicParser.DeclaracionContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void enterFunction_declaration(lengBasicParser.Function_declarationContext ctx) {
        /*System.out.println("esta en la linea: "+Linea);
        Linea++;*/
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void exitFunction_declaration(lengBasicParser.Function_declarationContext ctx)  {
        ArrayList typesAux=new ArrayList();
        System.out.println(ctx.getParent().toString());
        ArrayList argNamesAux= new ArrayList();
        String text;
        try {
            typesAux = (ArrayList) types.clone();
            argNamesAux = (ArrayList) argNames.clone();
        }
        catch (Exception ex){
            typesAux.add("vacio");
            argNamesAux.add("vacio");
        }



        dibujo.addFunction(ctx.getChild(1).getText(),ctx.getChild(0).getText(),typesAux,argNamesAux,ctx.getChild(5).getText());
        dibujo.Esperalo();

    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */



    @Override public void enterDeclaracion_asignacion(lengBasicParser.Declaracion_asignacionContext ctx) {
      /*  System.out.println("esta en la linea: "+Linea);
        Linea++;*/
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void exitDeclaracion_asignacion(lengBasicParser.Declaracion_asignacionContext ctx) {
        if (!ctx.toString().contains("146")) {
            System.out.println(ctx.getChild(0).getText());
            System.out.println(ctx.getChild(1).getText());
            System.out.println(ctx.getChild(2).getText());
            System.out.println(ctx.getChild(3).getText());
            System.out.println(ctx.parent.getParent().toString());
            if (ctx.parent.getParent().toString().contains("[93]")) {//es global
                dibujo.addVarGlobal(ctx.getChild(1).getText(), ctx.getChild(3).getText(), false,ctx.getChild(0).getText());
            } else {
                dibujo.addVarLocal(ctx.getChild(1).getText(), ctx.getChild(3).getText(), false,ctx.getChild(0).getText());
            }
            dibujo.Esperalo();
        }
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void enterSimpleDeclaration(lengBasicParser.SimpleDeclarationContext ctx) {
       /* System.out.println("esta en la linea: "+Linea);
        Linea++;*/
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void exitSimpleDeclaration(lengBasicParser.SimpleDeclarationContext ctx) {


        dibujo.Esperalo();
    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void enterExpresion(lengBasicParser.ExpresionContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void exitExpresion(lengBasicParser.ExpresionContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void enterCiclo(lengBasicParser.CicloContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void exitCiclo(lengBasicParser.CicloContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void enterDesicion(lengBasicParser.DesicionContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void exitDesicion(lengBasicParser.DesicionContext ctx) {



    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void enterWHILe(lengBasicParser.WHILeContext ctx) {
         }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void exitWHILe(lengBasicParser.WHILeContext ctx) {

    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */

    @Override public void enterDo_while(lengBasicParser.Do_whileContext ctx) {



    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void exitDo_while(lengBasicParser.Do_whileContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void enterFOR(lengBasicParser.FORContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void exitFOR(lengBasicParser.FORContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void enterExpresion_decimal(lengBasicParser.Expresion_decimalContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void exitExpresion_decimal(lengBasicParser.Expresion_decimalContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void enterExpresion_entera(lengBasicParser.Expresion_enteraContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void exitExpresion_entera(lengBasicParser.Expresion_enteraContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void enterAssignmentexpression(lengBasicParser.AssignmentexpressionContext ctx) {

    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void exitAssignmentexpression(lengBasicParser.AssignmentexpressionContext ctx) {
        if(ctx.getText().contains(",")){
            System.out.println(ctx.getChild(0).getText());//id
            System.out.println(ctx.getChild(2).getText());//funcion
            dibujo.modifyVar(ctx.getChild(0).getText(),ctx.getChild(2).getText());
        }else if(ctx.getText().contains("+=")){
            System.out.println(ctx.getChild(0).getText());//id
            System.out.println(ctx.getChild(0).getText()+"+"+ ctx.getChild(2).getText());//valor
            dibujo.modifyVar(ctx.getChild(0).getText(),ctx.getChild(0).getText()+"+"+ ctx.getChild(2).getText());
        }else if(ctx.getText().contains("/=")){
            System.out.println(ctx.getChild(0).getText());//id
            System.out.println(ctx.getChild(0).getText()+"/"+ ctx.getChild(2).getText());//valor
            dibujo.modifyVar(ctx.getChild(0).getText(),ctx.getChild(0).getText()+"/"+ ctx.getChild(2).getText());
        }else if(ctx.getText().contains("*=")){
            System.out.println(ctx.getChild(0).getText());//id
            System.out.println(ctx.getChild(0).getText()+"*"+ ctx.getChild(2).getText());//valor
            dibujo.modifyVar(ctx.getChild(0).getText(),ctx.getChild(0).getText()+"*"+ ctx.getChild(2).getText());
        }else if(ctx.getText().contains("-=")){
            System.out.println(ctx.getChild(0).getText());//id
            System.out.println(ctx.getChild(0).getText()+"-"+ ctx.getChild(2).getText());//valor
            dibujo.modifyVar(ctx.getChild(0).getText(),ctx.getChild(0).getText()+"-"+ ctx.getChild(2).getText());
        }else if(ctx.getText().contains("%=")){
            System.out.println(ctx.getChild(0).getText());//id
            System.out.println(ctx.getChild(0).getText()+"%"+ ctx.getChild(2).getText());//valor
            dibujo.modifyVar(ctx.getChild(0).getText(),ctx.getChild(0).getText()+"%"+ ctx.getChild(2).getText());
        }else if(ctx.getText().contains("&=")){
            System.out.println(ctx.getChild(0).getText());//id
            System.out.println(ctx.getChild(0).getText()+"&"+ ctx.getChild(2).getText());//valor
            dibujo.modifyVar(ctx.getChild(0).getText(),ctx.getChild(0).getText()+"&"+ ctx.getChild(2).getText());
        }else if(ctx.getText().contains("^=")){
            System.out.println(ctx.getChild(0).getText());//id
            System.out.println(ctx.getChild(0).getText()+"^"+ ctx.getChild(2).getText());//valor
            dibujo.modifyVar(ctx.getChild(0).getText(),ctx.getChild(0).getText()+"^"+ ctx.getChild(2).getText());
        }else if(ctx.getText().contains("|=")){
            System.out.println(ctx.getChild(0).getText());//id
            System.out.println(ctx.getChild(0).getText()+"|"+ ctx.getChild(2).getText());//valor
            dibujo.modifyVar(ctx.getChild(0).getText(),ctx.getChild(0).getText()+"|"+ ctx.getChild(2).getText());
        }else {
            System.out.println(ctx.getChild(0).getText());//id
            System.out.println(ctx.getChild(2).getText());//valor
            dibujo.modifyVar(ctx.getChild(0).getText(),ctx.getChild(2).getText());
        }
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void enterExpresion_logica(lengBasicParser.Expresion_logicaContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void exitExpresion_logica(lengBasicParser.Expresion_logicaContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void enterConditionalexpression(lengBasicParser.ConditionalexpressionContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void exitConditionalexpression(lengBasicParser.ConditionalexpressionContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void enterExpresion_mat(lengBasicParser.Expresion_matContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void exitExpresion_mat(lengBasicParser.Expresion_matContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void enterLogicalandexpression(lengBasicParser.LogicalandexpressionContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void exitLogicalandexpression(lengBasicParser.LogicalandexpressionContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void enterLogicalorexpression(lengBasicParser.LogicalorexpressionContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void exitLogicalorexpression(lengBasicParser.LogicalorexpressionContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void enterEqualityexpression(lengBasicParser.EqualityexpressionContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void exitEqualityexpression(lengBasicParser.EqualityexpressionContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void enterAndexpression(lengBasicParser.AndexpressionContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void exitAndexpression(lengBasicParser.AndexpressionContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void enterExclusiveorexpression(lengBasicParser.ExclusiveorexpressionContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void exitExclusiveorexpression(lengBasicParser.ExclusiveorexpressionContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void enterInclusiveorexpression(lengBasicParser.InclusiveorexpressionContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void exitInclusiveorexpression(lengBasicParser.InclusiveorexpressionContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void enterRelationalexpression(lengBasicParser.RelationalexpressionContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void exitRelationalexpression(lengBasicParser.RelationalexpressionContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void enterShiftoperator(lengBasicParser.ShiftoperatorContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void exitShiftoperator(lengBasicParser.ShiftoperatorContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void enterMulriplicacion(lengBasicParser.MulriplicacionContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void exitMulriplicacion(lengBasicParser.MulriplicacionContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void enterAdicion(lengBasicParser.AdicionContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void exitAdicion(lengBasicParser.AdicionContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void enterPost_operators(lengBasicParser.Post_operatorsContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void exitPost_operators(lengBasicParser.Post_operatorsContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void enterPre_operators(lengBasicParser.Pre_operatorsContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void exitPre_operators(lengBasicParser.Pre_operatorsContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void enterTipos(lengBasicParser.TiposContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void exitTipos(lengBasicParser.TiposContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void enterTipos_sin_pre(lengBasicParser.Tipos_sin_preContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void exitTipos_sin_pre(lengBasicParser.Tipos_sin_preContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void enterTipos_con_pre(lengBasicParser.Tipos_con_preContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void exitTipos_con_pre(lengBasicParser.Tipos_con_preContext ctx) {
        /*System.out.println( ctx.getText());*/
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */

    @Override public void enterVariables(lengBasicParser.VariablesContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void exitVariables(lengBasicParser.VariablesContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void enterPretipo(lengBasicParser.PretipoContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void exitPretipo(lengBasicParser.PretipoContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void enterAssignmentoperator(lengBasicParser.AssignmentoperatorContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void exitAssignmentoperator(lengBasicParser.AssignmentoperatorContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void enterNumero(lengBasicParser.NumeroContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void exitNumero(lengBasicParser.NumeroContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void enterIndex(lengBasicParser.IndexContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void exitIndex(lengBasicParser.IndexContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void enterArguments(lengBasicParser.ArgumentsContext ctx) {
        System.out.println("esta en la linea: "+Linea);
        Linea++;
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void exitArguments(lengBasicParser.ArgumentsContext ctx) {
        types.clear();
        argNames.clear();
        int x;
        try {
            x= ctx.children.size();
        }
        catch (Exception ex2){
            x=0;
        }
        for(int i=0;i<x;i=i+3){
            try {
                types.add(ctx.getChild(i).getText());
                argNames.add(ctx.getChild(i + 1).getText());
            }
            catch (Exception ex){
                types.add("vacio");
                argNames.add("vacio");
            }
        }
    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void enterEveryRule(ParserRuleContext ctx) {

    }


    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void exitEveryRule(ParserRuleContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void visitTerminal(TerminalNode node) {

    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void visitErrorNode(ErrorNode node) { }

}
