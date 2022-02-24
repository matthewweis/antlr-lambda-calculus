// Generated from org/example/Lambda.g4 by ANTLR 4.1
package org.example;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link LambdaParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface LambdaVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link LambdaParser#app}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitApp(@NotNull LambdaParser.AppContext ctx);

	/**
	 * Visit a parse tree produced by {@link LambdaParser#application}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitApplication(@NotNull LambdaParser.ApplicationContext ctx);

	/**
	 * Visit a parse tree produced by {@link LambdaParser#function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction(@NotNull LambdaParser.FunctionContext ctx);

	/**
	 * Visit a parse tree produced by {@link LambdaParser#scope}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitScope(@NotNull LambdaParser.ScopeContext ctx);

	/**
	 * Visit a parse tree produced by {@link LambdaParser#variable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariable(@NotNull LambdaParser.VariableContext ctx);

	/**
	 * Visit a parse tree produced by {@link LambdaParser#fn}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFn(@NotNull LambdaParser.FnContext ctx);
}