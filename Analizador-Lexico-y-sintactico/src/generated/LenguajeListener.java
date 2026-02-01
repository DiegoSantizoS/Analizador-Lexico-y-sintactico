// Generated from C:/Users/DFSS/Documents/NetBeansProjects/Analizador-Lexico-y-sintactico/Analizador-Lexico-y-sintactico/src/grammar/Lenguaje.g4 by ANTLR 4.13.2
package generated;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link LenguajeParser}.
 */
public interface LenguajeListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link LenguajeParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(LenguajeParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link LenguajeParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(LenguajeParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link LenguajeParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(LenguajeParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link LenguajeParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(LenguajeParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link LenguajeParser#decl}.
	 * @param ctx the parse tree
	 */
	void enterDecl(LenguajeParser.DeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link LenguajeParser#decl}.
	 * @param ctx the parse tree
	 */
	void exitDecl(LenguajeParser.DeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link LenguajeParser#assign}.
	 * @param ctx the parse tree
	 */
	void enterAssign(LenguajeParser.AssignContext ctx);
	/**
	 * Exit a parse tree produced by {@link LenguajeParser#assign}.
	 * @param ctx the parse tree
	 */
	void exitAssign(LenguajeParser.AssignContext ctx);
	/**
	 * Enter a parse tree produced by {@link LenguajeParser#printStmt}.
	 * @param ctx the parse tree
	 */
	void enterPrintStmt(LenguajeParser.PrintStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link LenguajeParser#printStmt}.
	 * @param ctx the parse tree
	 */
	void exitPrintStmt(LenguajeParser.PrintStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link LenguajeParser#ifStmt}.
	 * @param ctx the parse tree
	 */
	void enterIfStmt(LenguajeParser.IfStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link LenguajeParser#ifStmt}.
	 * @param ctx the parse tree
	 */
	void exitIfStmt(LenguajeParser.IfStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link LenguajeParser#whileStmt}.
	 * @param ctx the parse tree
	 */
	void enterWhileStmt(LenguajeParser.WhileStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link LenguajeParser#whileStmt}.
	 * @param ctx the parse tree
	 */
	void exitWhileStmt(LenguajeParser.WhileStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link LenguajeParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(LenguajeParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link LenguajeParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(LenguajeParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by the {@code number}
	 * labeled alternative in {@link LenguajeParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterNumber(LenguajeParser.NumberContext ctx);
	/**
	 * Exit a parse tree produced by the {@code number}
	 * labeled alternative in {@link LenguajeParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitNumber(LenguajeParser.NumberContext ctx);
	/**
	 * Enter a parse tree produced by the {@code parens}
	 * labeled alternative in {@link LenguajeParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterParens(LenguajeParser.ParensContext ctx);
	/**
	 * Exit a parse tree produced by the {@code parens}
	 * labeled alternative in {@link LenguajeParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitParens(LenguajeParser.ParensContext ctx);
	/**
	 * Enter a parse tree produced by the {@code compare}
	 * labeled alternative in {@link LenguajeParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterCompare(LenguajeParser.CompareContext ctx);
	/**
	 * Exit a parse tree produced by the {@code compare}
	 * labeled alternative in {@link LenguajeParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitCompare(LenguajeParser.CompareContext ctx);
	/**
	 * Enter a parse tree produced by the {@code string}
	 * labeled alternative in {@link LenguajeParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterString(LenguajeParser.StringContext ctx);
	/**
	 * Exit a parse tree produced by the {@code string}
	 * labeled alternative in {@link LenguajeParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitString(LenguajeParser.StringContext ctx);
	/**
	 * Enter a parse tree produced by the {@code addSub}
	 * labeled alternative in {@link LenguajeParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterAddSub(LenguajeParser.AddSubContext ctx);
	/**
	 * Exit a parse tree produced by the {@code addSub}
	 * labeled alternative in {@link LenguajeParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitAddSub(LenguajeParser.AddSubContext ctx);
	/**
	 * Enter a parse tree produced by the {@code id}
	 * labeled alternative in {@link LenguajeParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterId(LenguajeParser.IdContext ctx);
	/**
	 * Exit a parse tree produced by the {@code id}
	 * labeled alternative in {@link LenguajeParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitId(LenguajeParser.IdContext ctx);
	/**
	 * Enter a parse tree produced by the {@code mulDiv}
	 * labeled alternative in {@link LenguajeParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterMulDiv(LenguajeParser.MulDivContext ctx);
	/**
	 * Exit a parse tree produced by the {@code mulDiv}
	 * labeled alternative in {@link LenguajeParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitMulDiv(LenguajeParser.MulDivContext ctx);
}