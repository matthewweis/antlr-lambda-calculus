// Generated from org/example/Lambda.g4 by ANTLR 4.1
package org.example;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link LambdaParser}.
 */
public interface LambdaListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link LambdaParser#app}.
	 * @param ctx the parse tree
	 */
	void enterApp(@NotNull LambdaParser.AppContext ctx);
	/**
	 * Exit a parse tree produced by {@link LambdaParser#app}.
	 * @param ctx the parse tree
	 */
	void exitApp(@NotNull LambdaParser.AppContext ctx);

	/**
	 * Enter a parse tree produced by {@link LambdaParser#application}.
	 * @param ctx the parse tree
	 */
	void enterApplication(@NotNull LambdaParser.ApplicationContext ctx);
	/**
	 * Exit a parse tree produced by {@link LambdaParser#application}.
	 * @param ctx the parse tree
	 */
	void exitApplication(@NotNull LambdaParser.ApplicationContext ctx);

	/**
	 * Enter a parse tree produced by {@link LambdaParser#function}.
	 * @param ctx the parse tree
	 */
	void enterFunction(@NotNull LambdaParser.FunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link LambdaParser#function}.
	 * @param ctx the parse tree
	 */
	void exitFunction(@NotNull LambdaParser.FunctionContext ctx);

	/**
	 * Enter a parse tree produced by {@link LambdaParser#scope}.
	 * @param ctx the parse tree
	 */
	void enterScope(@NotNull LambdaParser.ScopeContext ctx);
	/**
	 * Exit a parse tree produced by {@link LambdaParser#scope}.
	 * @param ctx the parse tree
	 */
	void exitScope(@NotNull LambdaParser.ScopeContext ctx);

	/**
	 * Enter a parse tree produced by {@link LambdaParser#variable}.
	 * @param ctx the parse tree
	 */
	void enterVariable(@NotNull LambdaParser.VariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link LambdaParser#variable}.
	 * @param ctx the parse tree
	 */
	void exitVariable(@NotNull LambdaParser.VariableContext ctx);

	/**
	 * Enter a parse tree produced by {@link LambdaParser#fn}.
	 * @param ctx the parse tree
	 */
	void enterFn(@NotNull LambdaParser.FnContext ctx);
	/**
	 * Exit a parse tree produced by {@link LambdaParser#fn}.
	 * @param ctx the parse tree
	 */
	void exitFn(@NotNull LambdaParser.FnContext ctx);
}