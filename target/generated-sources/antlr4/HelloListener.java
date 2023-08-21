// Generated from Hello.g4 by ANTLR 4.13.0

	import java.util.ArrayList;
	import java.util.List;
	import symbols.DataType;
	import java.util.Stack;
	import symbols.Identifier;
	import symbols.SymbolTable;
	import expressions.*;
	import ast.*;
	import java.util.HashMap;
	import java.util.Map;
	

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link HelloParser}.
 */
public interface HelloListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link HelloParser#programa}.
	 * @param ctx the parse tree
	 */
	void enterPrograma(HelloParser.ProgramaContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#programa}.
	 * @param ctx the parse tree
	 */
	void exitPrograma(HelloParser.ProgramaContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#decl}.
	 * @param ctx the parse tree
	 */
	void enterDecl(HelloParser.DeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#decl}.
	 * @param ctx the parse tree
	 */
	void exitDecl(HelloParser.DeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#tipo}.
	 * @param ctx the parse tree
	 */
	void enterTipo(HelloParser.TipoContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#tipo}.
	 * @param ctx the parse tree
	 */
	void exitTipo(HelloParser.TipoContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#lista_var}.
	 * @param ctx the parse tree
	 */
	void enterLista_var(HelloParser.Lista_varContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#lista_var}.
	 * @param ctx the parse tree
	 */
	void exitLista_var(HelloParser.Lista_varContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#cmd}.
	 * @param ctx the parse tree
	 */
	void enterCmd(HelloParser.CmdContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#cmd}.
	 * @param ctx the parse tree
	 */
	void exitCmd(HelloParser.CmdContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#cmdWhile}.
	 * @param ctx the parse tree
	 */
	void enterCmdWhile(HelloParser.CmdWhileContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#cmdWhile}.
	 * @param ctx the parse tree
	 */
	void exitCmdWhile(HelloParser.CmdWhileContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#cmdIf}.
	 * @param ctx the parse tree
	 */
	void enterCmdIf(HelloParser.CmdIfContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#cmdIf}.
	 * @param ctx the parse tree
	 */
	void exitCmdIf(HelloParser.CmdIfContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#cmdRead}.
	 * @param ctx the parse tree
	 */
	void enterCmdRead(HelloParser.CmdReadContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#cmdRead}.
	 * @param ctx the parse tree
	 */
	void exitCmdRead(HelloParser.CmdReadContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#cmdWrite}.
	 * @param ctx the parse tree
	 */
	void enterCmdWrite(HelloParser.CmdWriteContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#cmdWrite}.
	 * @param ctx the parse tree
	 */
	void exitCmdWrite(HelloParser.CmdWriteContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#cmdAttr}.
	 * @param ctx the parse tree
	 */
	void enterCmdAttr(HelloParser.CmdAttrContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#cmdAttr}.
	 * @param ctx the parse tree
	 */
	void exitCmdAttr(HelloParser.CmdAttrContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(HelloParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(HelloParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#termo}.
	 * @param ctx the parse tree
	 */
	void enterTermo(HelloParser.TermoContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#termo}.
	 * @param ctx the parse tree
	 */
	void exitTermo(HelloParser.TermoContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#exprl}.
	 * @param ctx the parse tree
	 */
	void enterExprl(HelloParser.ExprlContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#exprl}.
	 * @param ctx the parse tree
	 */
	void exitExprl(HelloParser.ExprlContext ctx);
}