import grammar.lengBasicBaseVisitor;
import grammar.lengBasicParser;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.RuleNode;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.io.IOException;
import java.util.ArrayList;

public class visitantes<T> extends lengBasicBaseVisitor<T> {
    Printer dibujo;
    ArrayList types=new ArrayList();
    ArrayList argNames= new ArrayList();
    public visitantes() throws IOException {
        dibujo=new Printer();
    }

    @Override
    public T visitBegin(lengBasicParser.BeginContext ctx) {
        dibujo.Esperalo();
        if(ctx.imports()!=null){
       // visitImports(ctx.imports());
            }
        for(lengBasicParser.GlobalThingsContext j:ctx.globalThings()){

          //  visitGlobalThings(j);
        }
        if(ctx.main()!=null){
        //visitMain(ctx.main());
        }
        /*
        dibujo.jPanel1.setOption(8,"gracias por usar el programa");
        dibujo.Esperalo();*/

        return super.visitBegin(ctx);
    }

    @Override
    public T visitImports(lengBasicParser.ImportsContext ctx) {
        return super.visitImports(ctx);
    }

    @Override
    public T visitStatement(lengBasicParser.StatementContext ctx) {
        return super.visitStatement(ctx);
    }

    @Override
    public T visitFun_statement(lengBasicParser.Fun_statementContext ctx) {

        return super.visitFun_statement(ctx);
    }

    @Override
    public T visitGlobalThings(lengBasicParser.GlobalThingsContext ctx) {
        if(ctx.declaracion()!=null){
           // visitDeclaracion(ctx.declaracion());
        }
        else if(ctx.assignmentexpression()!=null){

        //visitAssignmentexpression(ctx.assignmentexpression());
             }
        else if(ctx.function_declaration()!=null){
        //visitFunction_declaration(ctx.function_declaration());
                 }
        else if(ctx.void_declaration()!=null){
        //visitVoid_declaration(ctx.void_declaration());
                    }


        return super.visitGlobalThings(ctx);
    }

    @Override
    public T visitLocalThings(lengBasicParser.LocalThingsContext ctx) {
        return super.visitLocalThings(ctx);
    }

    @Override
    public T visitMain(lengBasicParser.MainContext ctx) {
        dibujo.jPanel1.setOption(6,"");
        dibujo.Esperalo();
        return super.visitMain(ctx);
    }

    @Override
    public T visitDeclaracion(lengBasicParser.DeclaracionContext ctx) {
       if(ctx.declaracion_asignacion()!=null){
           System.out.println("voy");
          // visitDeclaracion_asignacion(ctx.declaracion_asignacion());
       }
       else if (ctx.simpleDeclaration()!=null){
          // visitSimpleDeclaration(ctx.simpleDeclaration());
       }

        return super.visitDeclaracion(ctx);
    }

    @Override
    public T visitVoid_declaration(lengBasicParser.Void_declarationContext ctx) {
        return super.visitVoid_declaration(ctx);
    }

    @Override
    public T visitElso(lengBasicParser.ElsoContext ctx) {
        return super.visitElso(ctx);
    }

    @Override
    public T visitFunction_declaration(lengBasicParser.Function_declarationContext ctx) {
        ArrayList typesAux=new ArrayList();
        ArrayList argNamesAux= new ArrayList();
        String text;


        types.clear();
        argNames.clear();
        int x;
        try {
            x= ctx.getChild(3).getChildCount();
        }
        catch (Exception ex2){
            x=0;
        }


        for(int i=0;i<x;i=i+3){
            try {
                types.add(ctx.getChild(3).getChild(i).getText());
                argNames.add(ctx.getChild(3).getChild(i + 1).getText());
            }
            catch (Exception ex){
                types.add("vacio");
                argNames.add("vacio");
            }
        }


        try {
            typesAux = (ArrayList) types.clone();
            argNamesAux = (ArrayList) argNames.clone();
        }
        catch (Exception ex){
            typesAux.add("vacio");
            argNamesAux.add("vacio");
        }


        dibujo.addFunction(ctx.getChild(1).getText(),ctx.getChild(0).getText(),typesAux,argNamesAux,ctx.getChild(5).getText());
        dibujo.jPanel1.setOption(1,"Con el nombre "+ctx.getChild(1).getText());
        dibujo.Esperalo();
        return super.visitFunction_declaration(ctx);
    }

    @Override
    public T visitDeclaracion_asignacion(lengBasicParser.Declaracion_asignacionContext ctx) {
        if (!ctx.toString().contains("146")) {
            System.out.println(ctx.getChild(0).getText());
            System.out.println(ctx.getChild(1).getText());
            System.out.println(ctx.getChild(2).getText());
            System.out.println(ctx.getChild(3).getText());
            System.out.println(ctx.parent.getParent().toString());
            if (ctx.parent.getParent().toString().contains("[93]")) {//es global
                dibujo.addVarGlobal(ctx.getChild(1).getText(), ctx.getChild(3).getText(), false,ctx.getChild(0).getText());
                dibujo.jPanel1.setOption(2,ctx.getChild(1).getText()+"y se le da el valor de "+ctx.getChild(3).getText());
            } else {
                dibujo.addVarLocal(ctx.getChild(1).getText(), ctx.getChild(3).getText(), false,ctx.getChild(0).getText());
                dibujo.jPanel1.setOption(2,ctx.getChild(1).getText()+" y se le da el valor de "+ctx.getChild(3).getText());
            }
            dibujo.Esperalo();
        }

        return super.visitDeclaracion_asignacion(ctx);
    }

    @Override
    public T visitSimpleDeclaration(lengBasicParser.SimpleDeclarationContext ctx) {
        if (!ctx.toString().contains("146")) {
            if (ctx.parent.getParent().toString().contains("[93]")) {
                if (ctx.getText().contains("[")) {//es arreglo xd
                    if (ctx.getText().contains(",")) {//contiene varias variables
                        System.out.println(ctx.getChild(0).getText());//tipo
                        int childes = ctx.getChild(1).getChildCount();
                        for (int i = 0; i < childes - 1; i = i + 2) {
                            System.out.println(ctx.getChild(1).getChild(i).getText()); //identificadores
                            dibujo.addVarGlobal(ctx.getChild(1).getChild(i).getText(), "", true,ctx.getChild(0).getText());
                        }
                        dibujo.jPanel1.setOption(3, "con los nombres " + ctx.getChild(1).getText() + "[]");
                        System.out.println(ctx.getChild(1).getChild(childes - 1).getChild(1).getText());//tamaño
                    } else {//SOLO DECLARA UNA
                        System.out.println(ctx.getChild(0).getText());//tipo
                        System.out.println(ctx.getChild(1).getChild(0).getText()); //identificadores
                        System.out.println(ctx.getChild(1).getChild(1).getChild(1).getText());//tamaño
                        dibujo.addVarGlobal(ctx.getChild(1).getChild(0).getText(), "", true,ctx.getChild(0).getText());
                        dibujo.jPanel1.setOption(2, "con el nombre " + ctx.getChild(1).getChild(0).getText() + "[]");
                    }
                } else {//no es arreglo xd
                    if (ctx.getText().contains(",")) {//contiene varias variables
                        System.out.println(ctx.getChild(0).getText());//tipo
                        int variables = ctx.getChild(1).getChildCount();
                        for (int i = 0; i < variables; i = i + 2) {
                            System.out.println(ctx.getChild(1).getChild(i).getText());//identificadores
                            dibujo.addVarGlobal(ctx.getChild(1).getChild(i).getText(), "", false,ctx.getChild(0).getText());
                        }
                        dibujo.jPanel1.setOption(3, "con los nombres " + ctx.getChild(1).getText());
                    } else {
                        System.out.println(ctx.getChild(0).getText());//tipo
                        System.out.println(ctx.getChild(1).getText());//identificador
                        dibujo.addVarGlobal(ctx.getChild(1).getText(), "", false,ctx.getChild(0).getText());
                        dibujo.jPanel1.setOption(2, "con el nombre " + ctx.getChild(1).getChild(0).getText());
                    }
                }
            } else {
                if (ctx.getText().contains("[")) {//es arreglo xd
                    if (ctx.getText().contains(",")) {//contiene varias variables
                        System.out.println(ctx.getChild(0).getText());//tipo
                        int childes = ctx.getChild(1).getChildCount();
                        for (int i = 0; i < childes - 1; i = i + 2) {
                            System.out.println(ctx.getChild(1).getChild(i).getText()); //identificadores
                            dibujo.addVarLocal(ctx.getChild(1).getChild(i).getText(), "", true,ctx.getChild(0).getText());
                        }
                        dibujo.jPanel1.setOption(3, "con los nombres " + ctx.getChild(1).getText() + "[]");
                        System.out.println(ctx.getChild(1).getChild(childes - 1).getChild(1).getText());//tamaño
                    } else {//SOLO DECLARA UNA
                        System.out.println(ctx.getChild(0).getText());//tipo
                        System.out.println(ctx.getChild(1).getChild(0).getText()); //identificadores
                        System.out.println(ctx.getChild(1).getChild(1).getChild(1).getText());//tamaño
                        dibujo.addVarLocal(ctx.getChild(1).getChild(0).getText(), "", true,ctx.getChild(0).getText());
                        dibujo.jPanel1.setOption(2, "con el nombre " + ctx.getChild(1).getChild(0).getText() + "[]");
                    }
                } else {//no es arreglo xd
                    if (ctx.getText().contains(",")) {//contiene varias variables
                        System.out.println(ctx.getChild(0).getText());//tipo
                        int variables = ctx.getChild(1).getChildCount();
                        for (int i = 0; i < variables; i = i + 2) {
                            System.out.println(ctx.getChild(1).getChild(i).getText());//identificadores
                            dibujo.addVarLocal(ctx.getChild(1).getChild(i).getText(), "", false,ctx.getChild(0).getText());
                        }
                        dibujo.jPanel1.setOption(3, "con los nombres " + ctx.getChild(1).getText());
                    } else {
                        System.out.println(ctx.getChild(0).getText());//tipo
                        System.out.println(ctx.getChild(1).getText());//identificador
                        dibujo.addVarLocal(ctx.getChild(1).getText(), "", false,ctx.getChild(0).getText());
                        dibujo.jPanel1.setOption(2, "con el nombre " + ctx.getChild(1).getChild(0).getText());
                    }
                }
            }
        }
        dibujo.Esperalo();
        return super.visitSimpleDeclaration(ctx);
    }

    @Override
    public T visitExpresion(lengBasicParser.ExpresionContext ctx) {
        return super.visitExpresion(ctx);
    }

    @Override
    public T visitSalida(lengBasicParser.SalidaContext ctx) {
        return super.visitSalida(ctx);
    }

    @Override
    public T visitCiclo(lengBasicParser.CicloContext ctx) {
        return super.visitCiclo(ctx);
    }

    @Override
    public T visitDesicion(lengBasicParser.DesicionContext ctx) {
        String condition=ctx.getChild(2).getText();

        return super.visitDesicion(ctx);
    }

    @Override
    public T visitWHILe(lengBasicParser.WHILeContext ctx) {
        return super.visitWHILe(ctx);
    }

    @Override
    public T visitDo_while(lengBasicParser.Do_whileContext ctx) {
        return super.visitDo_while(ctx);
    }

    @Override
    public T visitFOR(lengBasicParser.FORContext ctx) {
        return super.visitFOR(ctx);
    }

    @Override
    public T visitFunction(lengBasicParser.FunctionContext ctx) {
        return super.visitFunction(ctx);
    }

    @Override
    public T visitExpresion_decimal(lengBasicParser.Expresion_decimalContext ctx) {
        return super.visitExpresion_decimal(ctx);
    }

    @Override
    public T visitExpresion_entera(lengBasicParser.Expresion_enteraContext ctx) {
        return super.visitExpresion_entera(ctx);
    }

    @Override
    public T visitExpresion_palabra(lengBasicParser.Expresion_palabraContext ctx) {
        return super.visitExpresion_palabra(ctx);
    }

    @Override
    public T visitAssignmentexpression(lengBasicParser.AssignmentexpressionContext ctx) {

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
        dibujo.jPanel1.setOption(5,ctx.getChild(0).getText()+" El valor de "+ctx.getChild(2).getText());
        dibujo.Esperalo();
        return super.visitAssignmentexpression(ctx);
    }

    @Override
    public T visitExpresion_logica(lengBasicParser.Expresion_logicaContext ctx) {
        return super.visitExpresion_logica(ctx);
    }

    @Override
    public T visitConditionalexpression(lengBasicParser.ConditionalexpressionContext ctx) {
        return super.visitConditionalexpression(ctx);
    }

    @Override
    public T visitExpresion_mat(lengBasicParser.Expresion_matContext ctx) {
        return super.visitExpresion_mat(ctx);
    }

    @Override
    public T visitLogicalandexpression(lengBasicParser.LogicalandexpressionContext ctx) {
        return super.visitLogicalandexpression(ctx);
    }

    @Override
    public T visitLogicalorexpression(lengBasicParser.LogicalorexpressionContext ctx) {
        return super.visitLogicalorexpression(ctx);
    }

    @Override
    public T visitEqualityexpression(lengBasicParser.EqualityexpressionContext ctx) {
        return super.visitEqualityexpression(ctx);
    }

    @Override
    public T visitAndexpression(lengBasicParser.AndexpressionContext ctx) {
        return super.visitAndexpression(ctx);
    }

    @Override
    public T visitExclusiveorexpression(lengBasicParser.ExclusiveorexpressionContext ctx) {
        return super.visitExclusiveorexpression(ctx);
    }

    @Override
    public T visitInclusiveorexpression(lengBasicParser.InclusiveorexpressionContext ctx) {
        return super.visitInclusiveorexpression(ctx);
    }

    @Override
    public T visitRelationalexpression(lengBasicParser.RelationalexpressionContext ctx) {
        return super.visitRelationalexpression(ctx);
    }

    @Override
    public T visitShiftoperator(lengBasicParser.ShiftoperatorContext ctx) {
        return super.visitShiftoperator(ctx);
    }

    @Override
    public T visitMulriplicacion(lengBasicParser.MulriplicacionContext ctx) {
        return super.visitMulriplicacion(ctx);
    }

    @Override
    public T visitAdicion(lengBasicParser.AdicionContext ctx) {
        return super.visitAdicion(ctx);
    }

    @Override
    public T visitPost_operators(lengBasicParser.Post_operatorsContext ctx) {
        return super.visitPost_operators(ctx);
    }

    @Override
    public T visitPre_operators(lengBasicParser.Pre_operatorsContext ctx) {
        return super.visitPre_operators(ctx);
    }

    @Override
    public T visitTipos(lengBasicParser.TiposContext ctx) {
        return super.visitTipos(ctx);
    }

    @Override
    public T visitTipos_sin_pre(lengBasicParser.Tipos_sin_preContext ctx) {
        return super.visitTipos_sin_pre(ctx);
    }

    @Override
    public T visitTipos_con_pre(lengBasicParser.Tipos_con_preContext ctx) {
        return super.visitTipos_con_pre(ctx);
    }

    @Override
    public T visitVariables(lengBasicParser.VariablesContext ctx) {
        return super.visitVariables(ctx);
    }

    @Override
    public T visitPretipo(lengBasicParser.PretipoContext ctx) {
        return super.visitPretipo(ctx);
    }

    @Override
    public T visitAssignmentoperator(lengBasicParser.AssignmentoperatorContext ctx) {
        return super.visitAssignmentoperator(ctx);
    }

    @Override
    public T visitNumero(lengBasicParser.NumeroContext ctx) {
        return super.visitNumero(ctx);
    }

    @Override
    public T visitIndex(lengBasicParser.IndexContext ctx) {
        return super.visitIndex(ctx);
    }

    @Override
    public T visitArguments(lengBasicParser.ArgumentsContext ctx) {


        return super.visitArguments(ctx);
    }
}