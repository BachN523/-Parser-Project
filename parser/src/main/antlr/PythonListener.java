// Generated from D:/System/Pi Cloud/Documents/CodeMan/parser/parser/src/main/antlr/Python.g4 by ANTLR 4.13.2
package main.antlr;
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
	 * Enter a parse tree produced by {@link PythonParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(PythonParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(PythonParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#operator}.
	 * @param ctx the parse tree
	 */
	void enterOperator(PythonParser.OperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#operator}.
	 * @param ctx the parse tree
	 */
	void exitOperator(PythonParser.OperatorContext ctx);
}