// Generated from D:/meow/programm/Interpreter/src/GrammarNSC.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link GrammarNSCParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface GrammarNSCVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link GrammarNSCParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(GrammarNSCParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by the {@code states_state}
	 * labeled alternative in {@link GrammarNSCParser#statements}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStates_state(GrammarNSCParser.States_stateContext ctx);
	/**
	 * Visit a parse tree produced by the {@code state}
	 * labeled alternative in {@link GrammarNSCParser#statements}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitState(GrammarNSCParser.StateContext ctx);
	/**
	 * Visit a parse tree produced by the {@code equal}
	 * labeled alternative in {@link GrammarNSCParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEqual(GrammarNSCParser.EqualContext ctx);
	/**
	 * Visit a parse tree produced by the {@code begin_end}
	 * labeled alternative in {@link GrammarNSCParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBegin_end(GrammarNSCParser.Begin_endContext ctx);
	/**
	 * Visit a parse tree produced by the {@code if_then}
	 * labeled alternative in {@link GrammarNSCParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf_then(GrammarNSCParser.If_thenContext ctx);
	/**
	 * Visit a parse tree produced by the {@code if_then_else}
	 * labeled alternative in {@link GrammarNSCParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf_then_else(GrammarNSCParser.If_then_elseContext ctx);
	/**
	 * Visit a parse tree produced by the {@code while_do}
	 * labeled alternative in {@link GrammarNSCParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhile_do(GrammarNSCParser.While_doContext ctx);
	/**
	 * Visit a parse tree produced by the {@code for_do}
	 * labeled alternative in {@link GrammarNSCParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFor_do(GrammarNSCParser.For_doContext ctx);
	/**
	 * Visit a parse tree produced by the {@code loop_do}
	 * labeled alternative in {@link GrammarNSCParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLoop_do(GrammarNSCParser.Loop_doContext ctx);
	/**
	 * Visit a parse tree produced by the {@code print}
	 * labeled alternative in {@link GrammarNSCParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrint(GrammarNSCParser.PrintContext ctx);
	/**
	 * Visit a parse tree produced by the {@code print_literal}
	 * labeled alternative in {@link GrammarNSCParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrint_literal(GrammarNSCParser.Print_literalContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarNSCParser#binop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBinop(GrammarNSCParser.BinopContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarNSCParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr(GrammarNSCParser.ExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarNSCParser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTerm(GrammarNSCParser.TermContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarNSCParser#factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFactor(GrammarNSCParser.FactorContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarNSCParser#result}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitResult(GrammarNSCParser.ResultContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarNSCParser#identifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifier(GrammarNSCParser.IdentifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarNSCParser#number}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumber(GrammarNSCParser.NumberContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarNSCParser#sl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSl(GrammarNSCParser.SlContext ctx);
}