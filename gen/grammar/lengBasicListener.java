// Generated from C:/Users/juanda/IdeaProjects/proyecto final/grammar\lengBasic.g4 by ANTLR 4.7.2
package grammar;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link lengBasicParser}.
 */
public interface lengBasicListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link lengBasicParser#begin}.
	 * @param ctx the parse tree
	 */
	void enterBegin(lengBasicParser.BeginContext ctx);
	/**
	 * Exit a parse tree produced by {@link lengBasicParser#begin}.
	 * @param ctx the parse tree
	 */
	void exitBegin(lengBasicParser.BeginContext ctx);
	/**
	 * Enter a parse tree produced by {@link lengBasicParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(lengBasicParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link lengBasicParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(lengBasicParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link lengBasicParser#globalThings}.
	 * @param ctx the parse tree
	 */
	void enterGlobalThings(lengBasicParser.GlobalThingsContext ctx);
	/**
	 * Exit a parse tree produced by {@link lengBasicParser#globalThings}.
	 * @param ctx the parse tree
	 */
	void exitGlobalThings(lengBasicParser.GlobalThingsContext ctx);
	/**
	 * Enter a parse tree produced by {@link lengBasicParser#localThings}.
	 * @param ctx the parse tree
	 */
	void enterLocalThings(lengBasicParser.LocalThingsContext ctx);
	/**
	 * Exit a parse tree produced by {@link lengBasicParser#localThings}.
	 * @param ctx the parse tree
	 */
	void exitLocalThings(lengBasicParser.LocalThingsContext ctx);
	/**
	 * Enter a parse tree produced by {@link lengBasicParser#main}.
	 * @param ctx the parse tree
	 */
	void enterMain(lengBasicParser.MainContext ctx);
	/**
	 * Exit a parse tree produced by {@link lengBasicParser#main}.
	 * @param ctx the parse tree
	 */
	void exitMain(lengBasicParser.MainContext ctx);
	/**
	 * Enter a parse tree produced by {@link lengBasicParser#declaracion}.
	 * @param ctx the parse tree
	 */
	void enterDeclaracion(lengBasicParser.DeclaracionContext ctx);
	/**
	 * Exit a parse tree produced by {@link lengBasicParser#declaracion}.
	 * @param ctx the parse tree
	 */
	void exitDeclaracion(lengBasicParser.DeclaracionContext ctx);
	/**
	 * Enter a parse tree produced by {@link lengBasicParser#function_declaration}.
	 * @param ctx the parse tree
	 */
	void enterFunction_declaration(lengBasicParser.Function_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link lengBasicParser#function_declaration}.
	 * @param ctx the parse tree
	 */
	void exitFunction_declaration(lengBasicParser.Function_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link lengBasicParser#declaracion_asignacion}.
	 * @param ctx the parse tree
	 */
	void enterDeclaracion_asignacion(lengBasicParser.Declaracion_asignacionContext ctx);
	/**
	 * Exit a parse tree produced by {@link lengBasicParser#declaracion_asignacion}.
	 * @param ctx the parse tree
	 */
	void exitDeclaracion_asignacion(lengBasicParser.Declaracion_asignacionContext ctx);
	/**
	 * Enter a parse tree produced by {@link lengBasicParser#simpleDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterSimpleDeclaration(lengBasicParser.SimpleDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link lengBasicParser#simpleDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitSimpleDeclaration(lengBasicParser.SimpleDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link lengBasicParser#expresion}.
	 * @param ctx the parse tree
	 */
	void enterExpresion(lengBasicParser.ExpresionContext ctx);
	/**
	 * Exit a parse tree produced by {@link lengBasicParser#expresion}.
	 * @param ctx the parse tree
	 */
	void exitExpresion(lengBasicParser.ExpresionContext ctx);
	/**
	 * Enter a parse tree produced by {@link lengBasicParser#ciclo}.
	 * @param ctx the parse tree
	 */
	void enterCiclo(lengBasicParser.CicloContext ctx);
	/**
	 * Exit a parse tree produced by {@link lengBasicParser#ciclo}.
	 * @param ctx the parse tree
	 */
	void exitCiclo(lengBasicParser.CicloContext ctx);
	/**
	 * Enter a parse tree produced by {@link lengBasicParser#desicion}.
	 * @param ctx the parse tree
	 */
	void enterDesicion(lengBasicParser.DesicionContext ctx);
	/**
	 * Exit a parse tree produced by {@link lengBasicParser#desicion}.
	 * @param ctx the parse tree
	 */
	void exitDesicion(lengBasicParser.DesicionContext ctx);
	/**
	 * Enter a parse tree produced by {@link lengBasicParser#wHILe}.
	 * @param ctx the parse tree
	 */
	void enterWHILe(lengBasicParser.WHILeContext ctx);
	/**
	 * Exit a parse tree produced by {@link lengBasicParser#wHILe}.
	 * @param ctx the parse tree
	 */
	void exitWHILe(lengBasicParser.WHILeContext ctx);
	/**
	 * Enter a parse tree produced by {@link lengBasicParser#do_while}.
	 * @param ctx the parse tree
	 */
	void enterDo_while(lengBasicParser.Do_whileContext ctx);
	/**
	 * Exit a parse tree produced by {@link lengBasicParser#do_while}.
	 * @param ctx the parse tree
	 */
	void exitDo_while(lengBasicParser.Do_whileContext ctx);
	/**
	 * Enter a parse tree produced by {@link lengBasicParser#fOR}.
	 * @param ctx the parse tree
	 */
	void enterFOR(lengBasicParser.FORContext ctx);
	/**
	 * Exit a parse tree produced by {@link lengBasicParser#fOR}.
	 * @param ctx the parse tree
	 */
	void exitFOR(lengBasicParser.FORContext ctx);
	/**
	 * Enter a parse tree produced by {@link lengBasicParser#expresion_decimal}.
	 * @param ctx the parse tree
	 */
	void enterExpresion_decimal(lengBasicParser.Expresion_decimalContext ctx);
	/**
	 * Exit a parse tree produced by {@link lengBasicParser#expresion_decimal}.
	 * @param ctx the parse tree
	 */
	void exitExpresion_decimal(lengBasicParser.Expresion_decimalContext ctx);
	/**
	 * Enter a parse tree produced by {@link lengBasicParser#expresion_entera}.
	 * @param ctx the parse tree
	 */
	void enterExpresion_entera(lengBasicParser.Expresion_enteraContext ctx);
	/**
	 * Exit a parse tree produced by {@link lengBasicParser#expresion_entera}.
	 * @param ctx the parse tree
	 */
	void exitExpresion_entera(lengBasicParser.Expresion_enteraContext ctx);
	/**
	 * Enter a parse tree produced by {@link lengBasicParser#assignmentexpression}.
	 * @param ctx the parse tree
	 */
	void enterAssignmentexpression(lengBasicParser.AssignmentexpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link lengBasicParser#assignmentexpression}.
	 * @param ctx the parse tree
	 */
	void exitAssignmentexpression(lengBasicParser.AssignmentexpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link lengBasicParser#expresion_logica}.
	 * @param ctx the parse tree
	 */
	void enterExpresion_logica(lengBasicParser.Expresion_logicaContext ctx);
	/**
	 * Exit a parse tree produced by {@link lengBasicParser#expresion_logica}.
	 * @param ctx the parse tree
	 */
	void exitExpresion_logica(lengBasicParser.Expresion_logicaContext ctx);
	/**
	 * Enter a parse tree produced by {@link lengBasicParser#conditionalexpression}.
	 * @param ctx the parse tree
	 */
	void enterConditionalexpression(lengBasicParser.ConditionalexpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link lengBasicParser#conditionalexpression}.
	 * @param ctx the parse tree
	 */
	void exitConditionalexpression(lengBasicParser.ConditionalexpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link lengBasicParser#expresion_mat}.
	 * @param ctx the parse tree
	 */
	void enterExpresion_mat(lengBasicParser.Expresion_matContext ctx);
	/**
	 * Exit a parse tree produced by {@link lengBasicParser#expresion_mat}.
	 * @param ctx the parse tree
	 */
	void exitExpresion_mat(lengBasicParser.Expresion_matContext ctx);
	/**
	 * Enter a parse tree produced by {@link lengBasicParser#logicalandexpression}.
	 * @param ctx the parse tree
	 */
	void enterLogicalandexpression(lengBasicParser.LogicalandexpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link lengBasicParser#logicalandexpression}.
	 * @param ctx the parse tree
	 */
	void exitLogicalandexpression(lengBasicParser.LogicalandexpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link lengBasicParser#logicalorexpression}.
	 * @param ctx the parse tree
	 */
	void enterLogicalorexpression(lengBasicParser.LogicalorexpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link lengBasicParser#logicalorexpression}.
	 * @param ctx the parse tree
	 */
	void exitLogicalorexpression(lengBasicParser.LogicalorexpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link lengBasicParser#equalityexpression}.
	 * @param ctx the parse tree
	 */
	void enterEqualityexpression(lengBasicParser.EqualityexpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link lengBasicParser#equalityexpression}.
	 * @param ctx the parse tree
	 */
	void exitEqualityexpression(lengBasicParser.EqualityexpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link lengBasicParser#andexpression}.
	 * @param ctx the parse tree
	 */
	void enterAndexpression(lengBasicParser.AndexpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link lengBasicParser#andexpression}.
	 * @param ctx the parse tree
	 */
	void exitAndexpression(lengBasicParser.AndexpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link lengBasicParser#exclusiveorexpression}.
	 * @param ctx the parse tree
	 */
	void enterExclusiveorexpression(lengBasicParser.ExclusiveorexpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link lengBasicParser#exclusiveorexpression}.
	 * @param ctx the parse tree
	 */
	void exitExclusiveorexpression(lengBasicParser.ExclusiveorexpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link lengBasicParser#inclusiveorexpression}.
	 * @param ctx the parse tree
	 */
	void enterInclusiveorexpression(lengBasicParser.InclusiveorexpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link lengBasicParser#inclusiveorexpression}.
	 * @param ctx the parse tree
	 */
	void exitInclusiveorexpression(lengBasicParser.InclusiveorexpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link lengBasicParser#relationalexpression}.
	 * @param ctx the parse tree
	 */
	void enterRelationalexpression(lengBasicParser.RelationalexpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link lengBasicParser#relationalexpression}.
	 * @param ctx the parse tree
	 */
	void exitRelationalexpression(lengBasicParser.RelationalexpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link lengBasicParser#shiftoperator}.
	 * @param ctx the parse tree
	 */
	void enterShiftoperator(lengBasicParser.ShiftoperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link lengBasicParser#shiftoperator}.
	 * @param ctx the parse tree
	 */
	void exitShiftoperator(lengBasicParser.ShiftoperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link lengBasicParser#mulriplicacion}.
	 * @param ctx the parse tree
	 */
	void enterMulriplicacion(lengBasicParser.MulriplicacionContext ctx);
	/**
	 * Exit a parse tree produced by {@link lengBasicParser#mulriplicacion}.
	 * @param ctx the parse tree
	 */
	void exitMulriplicacion(lengBasicParser.MulriplicacionContext ctx);
	/**
	 * Enter a parse tree produced by {@link lengBasicParser#adicion}.
	 * @param ctx the parse tree
	 */
	void enterAdicion(lengBasicParser.AdicionContext ctx);
	/**
	 * Exit a parse tree produced by {@link lengBasicParser#adicion}.
	 * @param ctx the parse tree
	 */
	void exitAdicion(lengBasicParser.AdicionContext ctx);
	/**
	 * Enter a parse tree produced by {@link lengBasicParser#post_operators}.
	 * @param ctx the parse tree
	 */
	void enterPost_operators(lengBasicParser.Post_operatorsContext ctx);
	/**
	 * Exit a parse tree produced by {@link lengBasicParser#post_operators}.
	 * @param ctx the parse tree
	 */
	void exitPost_operators(lengBasicParser.Post_operatorsContext ctx);
	/**
	 * Enter a parse tree produced by {@link lengBasicParser#pre_operators}.
	 * @param ctx the parse tree
	 */
	void enterPre_operators(lengBasicParser.Pre_operatorsContext ctx);
	/**
	 * Exit a parse tree produced by {@link lengBasicParser#pre_operators}.
	 * @param ctx the parse tree
	 */
	void exitPre_operators(lengBasicParser.Pre_operatorsContext ctx);
	/**
	 * Enter a parse tree produced by {@link lengBasicParser#tipos}.
	 * @param ctx the parse tree
	 */
	void enterTipos(lengBasicParser.TiposContext ctx);
	/**
	 * Exit a parse tree produced by {@link lengBasicParser#tipos}.
	 * @param ctx the parse tree
	 */
	void exitTipos(lengBasicParser.TiposContext ctx);
	/**
	 * Enter a parse tree produced by {@link lengBasicParser#tipos_sin_pre}.
	 * @param ctx the parse tree
	 */
	void enterTipos_sin_pre(lengBasicParser.Tipos_sin_preContext ctx);
	/**
	 * Exit a parse tree produced by {@link lengBasicParser#tipos_sin_pre}.
	 * @param ctx the parse tree
	 */
	void exitTipos_sin_pre(lengBasicParser.Tipos_sin_preContext ctx);
	/**
	 * Enter a parse tree produced by {@link lengBasicParser#tipos_con_pre}.
	 * @param ctx the parse tree
	 */
	void enterTipos_con_pre(lengBasicParser.Tipos_con_preContext ctx);
	/**
	 * Exit a parse tree produced by {@link lengBasicParser#tipos_con_pre}.
	 * @param ctx the parse tree
	 */
	void exitTipos_con_pre(lengBasicParser.Tipos_con_preContext ctx);
	/**
	 * Enter a parse tree produced by {@link lengBasicParser#tipos_fun}.
	 * @param ctx the parse tree
	 */
	void enterTipos_fun(lengBasicParser.Tipos_funContext ctx);
	/**
	 * Exit a parse tree produced by {@link lengBasicParser#tipos_fun}.
	 * @param ctx the parse tree
	 */
	void exitTipos_fun(lengBasicParser.Tipos_funContext ctx);
	/**
	 * Enter a parse tree produced by {@link lengBasicParser#tipos_sin_pre_fun}.
	 * @param ctx the parse tree
	 */
	void enterTipos_sin_pre_fun(lengBasicParser.Tipos_sin_pre_funContext ctx);
	/**
	 * Exit a parse tree produced by {@link lengBasicParser#tipos_sin_pre_fun}.
	 * @param ctx the parse tree
	 */
	void exitTipos_sin_pre_fun(lengBasicParser.Tipos_sin_pre_funContext ctx);
	/**
	 * Enter a parse tree produced by {@link lengBasicParser#tipos_con_pre_fun}.
	 * @param ctx the parse tree
	 */
	void enterTipos_con_pre_fun(lengBasicParser.Tipos_con_pre_funContext ctx);
	/**
	 * Exit a parse tree produced by {@link lengBasicParser#tipos_con_pre_fun}.
	 * @param ctx the parse tree
	 */
	void exitTipos_con_pre_fun(lengBasicParser.Tipos_con_pre_funContext ctx);
	/**
	 * Enter a parse tree produced by {@link lengBasicParser#variables}.
	 * @param ctx the parse tree
	 */
	void enterVariables(lengBasicParser.VariablesContext ctx);
	/**
	 * Exit a parse tree produced by {@link lengBasicParser#variables}.
	 * @param ctx the parse tree
	 */
	void exitVariables(lengBasicParser.VariablesContext ctx);
	/**
	 * Enter a parse tree produced by {@link lengBasicParser#pretipo}.
	 * @param ctx the parse tree
	 */
	void enterPretipo(lengBasicParser.PretipoContext ctx);
	/**
	 * Exit a parse tree produced by {@link lengBasicParser#pretipo}.
	 * @param ctx the parse tree
	 */
	void exitPretipo(lengBasicParser.PretipoContext ctx);
	/**
	 * Enter a parse tree produced by {@link lengBasicParser#assignmentoperator}.
	 * @param ctx the parse tree
	 */
	void enterAssignmentoperator(lengBasicParser.AssignmentoperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link lengBasicParser#assignmentoperator}.
	 * @param ctx the parse tree
	 */
	void exitAssignmentoperator(lengBasicParser.AssignmentoperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link lengBasicParser#numero}.
	 * @param ctx the parse tree
	 */
	void enterNumero(lengBasicParser.NumeroContext ctx);
	/**
	 * Exit a parse tree produced by {@link lengBasicParser#numero}.
	 * @param ctx the parse tree
	 */
	void exitNumero(lengBasicParser.NumeroContext ctx);
	/**
	 * Enter a parse tree produced by {@link lengBasicParser#index}.
	 * @param ctx the parse tree
	 */
	void enterIndex(lengBasicParser.IndexContext ctx);
	/**
	 * Exit a parse tree produced by {@link lengBasicParser#index}.
	 * @param ctx the parse tree
	 */
	void exitIndex(lengBasicParser.IndexContext ctx);
	/**
	 * Enter a parse tree produced by {@link lengBasicParser#arguments}.
	 * @param ctx the parse tree
	 */
	void enterArguments(lengBasicParser.ArgumentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link lengBasicParser#arguments}.
	 * @param ctx the parse tree
	 */
	void exitArguments(lengBasicParser.ArgumentsContext ctx);
}