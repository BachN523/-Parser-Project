// Generated from D:/System/Pi Cloud/Documents/CodeMan/parser/parser/src/main/antlr/Python.g4 by ANTLR 4.13.2
package main.java;
//import main.antlr.PythonParser;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link PythonParser}.
 */
public interface PythonListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link PythonParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(PythonParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(PythonParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(PythonParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(PythonParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(PythonParser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(PythonParser.AssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#arithmetic}.
	 * @param ctx the parse tree
	 */
	void enterArithmetic(PythonParser.ArithmeticContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#arithmetic}.
	 * @param ctx the parse tree
	 */
	void exitArithmetic(PythonParser.ArithmeticContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#array}.
	 * @param ctx the parse tree
	 */
	void enterArray(PythonParser.ArrayContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#array}.
	 * @param ctx the parse tree
	 */
	void exitArray(PythonParser.ArrayContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(PythonParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(PythonParser.ExpressionContext ctx);
}