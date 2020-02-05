// Generated from C:/Users/juanda/IdeaProjects/proyecto final/grammar\lengBasic.g4 by ANTLR 4.7.2
package grammar;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link lengBasicParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface lengBasicVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link lengBasicParser#begin}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBegin(lengBasicParser.BeginContext ctx);
	/**
	 * Visit a parse tree produced by {@link lengBasicParser#imports}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImports(lengBasicParser.ImportsContext ctx);
	/**
	 * Visit a parse tree produced by {@link lengBasicParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(lengBasicParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link lengBasicParser#fun_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFun_statement(lengBasicParser.Fun_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link lengBasicParser#globalThings}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGlobalThings(lengBasicParser.GlobalThingsContext ctx);
	/**
	 * Visit a parse tree produced by {@link lengBasicParser#localThings}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLocalThings(lengBasicParser.LocalThingsContext ctx);
	/**
	 * Visit a parse tree produced by {@link lengBasicParser#main}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMain(lengBasicParser.MainContext ctx);
	/**
	 * Visit a parse tree produced by {@link lengBasicParser#declaracion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaracion(lengBasicParser.DeclaracionContext ctx);
	/**
	 * Visit a parse tree produced by {@link lengBasicParser#void_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVoid_declaration(lengBasicParser.Void_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link lengBasicParser#function_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_declaration(lengBasicParser.Function_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link lengBasicParser#declaracion_asignacion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaracion_asignacion(lengBasicParser.Declaracion_asignacionContext ctx);
	/**
	 * Visit a parse tree produced by {@link lengBasicParser#simpleDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimpleDeclaration(lengBasicParser.SimpleDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link lengBasicParser#expresion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpresion(lengBasicParser.ExpresionContext ctx);
	/**
	 * Visit a parse tree produced by {@link lengBasicParser#salida}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSalida(lengBasicParser.SalidaContext ctx);
	/**
	 * Visit a parse tree produced by {@link lengBasicParser#ciclo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCiclo(lengBasicParser.CicloContext ctx);
	/**
	 * Visit a parse tree produced by {@link lengBasicParser#desicion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDesicion(lengBasicParser.DesicionContext ctx);
	/**
	 * Visit a parse tree produced by {@link lengBasicParser#elso}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElso(lengBasicParser.ElsoContext ctx);
	/**
	 * Visit a parse tree produced by {@link lengBasicParser#wHILe}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWHILe(lengBasicParser.WHILeContext ctx);
	/**
	 * Visit a parse tree produced by {@link lengBasicParser#do_while}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDo_while(lengBasicParser.Do_whileContext ctx);
	/**
	 * Visit a parse tree produced by {@link lengBasicParser#fOR}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFOR(lengBasicParser.FORContext ctx);
	/**
	 * Visit a parse tree produced by {@link lengBasicParser#function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction(lengBasicParser.FunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link lengBasicParser#expresion_decimal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpresion_decimal(lengBasicParser.Expresion_decimalContext ctx);
	/**
	 * Visit a parse tree produced by {@link lengBasicParser#expresion_entera}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpresion_entera(lengBasicParser.Expresion_enteraContext ctx);
	/**
	 * Visit a parse tree produced by {@link lengBasicParser#expresion_palabra}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpresion_palabra(lengBasicParser.Expresion_palabraContext ctx);
	/**
	 * Visit a parse tree produced by {@link lengBasicParser#assignmentexpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignmentexpression(lengBasicParser.AssignmentexpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link lengBasicParser#expresion_logica}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpresion_logica(lengBasicParser.Expresion_logicaContext ctx);
	/**
	 * Visit a parse tree produced by {@link lengBasicParser#conditionalexpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConditionalexpression(lengBasicParser.ConditionalexpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link lengBasicParser#expresion_mat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpresion_mat(lengBasicParser.Expresion_matContext ctx);
	/**
	 * Visit a parse tree produced by .
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogicalandexpression(lengBasicParser.LogicalandexpressionContext ctx);
	/**
	 * Visit a parse tree produced by .
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogicalorexpression(lengBasicParser.LogicalorexpressionContext ctx);
	/**
	 * Visit a parse tree produced by .
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEqualityexpression(lengBasicParser.EqualityexpressionContext ctx);
	/**
	 * Visit a parse tree produced by .
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAndexpression(lengBasicParser.AndexpressionContext ctx);
	/**
	 * Visit a parse tree produced by .
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExclusiveorexpression(lengBasicParser.ExclusiveorexpressionContext ctx);
	/**
	 * Visit a parse tree produced by .
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInclusiveorexpression(lengBasicParser.InclusiveorexpressionContext ctx);
	/**
	 * Visit a parse tree produced by .
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelationalexpression(lengBasicParser.RelationalexpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link lengBasicParser#shiftoperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShiftoperator(lengBasicParser.ShiftoperatorContext ctx);
	/**
	 * Visit a parse tree produced by .
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMulriplicacion(lengBasicParser.MulriplicacionContext ctx);
	/**
	 * Visit a parse tree produced by .
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAdicion(lengBasicParser.AdicionContext ctx);
	/**
	 * Visit a parse tree produced by {@link lengBasicParser#post_operators}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPost_operators(lengBasicParser.Post_operatorsContext ctx);
	/**
	 * Visit a parse tree produced by {@link lengBasicParser#pre_operators}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPre_operators(lengBasicParser.Pre_operatorsContext ctx);
	/**
	 * Visit a parse tree produced by {@link lengBasicParser#tipos}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTipos(lengBasicParser.TiposContext ctx);
	/**
	 * Visit a parse tree produced by {@link lengBasicParser#tipos_sin_pre}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTipos_sin_pre(lengBasicParser.Tipos_sin_preContext ctx);
	/**
	 * Visit a parse tree produced by {@link lengBasicParser#tipos_con_pre}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTipos_con_pre(lengBasicParser.Tipos_con_preContext ctx);
	/**
	 * Visit a parse tree produced by {@link lengBasicParser#variables}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariables(lengBasicParser.VariablesContext ctx);
	/**
	 * Visit a parse tree produced by {@link lengBasicParser#pretipo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPretipo(lengBasicParser.PretipoContext ctx);
	/**
	 * Visit a parse tree produced by {@link lengBasicParser#assignmentoperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignmentoperator(lengBasicParser.AssignmentoperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link lengBasicParser#numero}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumero(lengBasicParser.NumeroContext ctx);
	/**
	 * Visit a parse tree produced by {@link lengBasicParser#index}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIndex(lengBasicParser.IndexContext ctx);
	/**
	 * Visit a parse tree produced by {@link lengBasicParser#arguments}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArguments(lengBasicParser.ArgumentsContext ctx);
}