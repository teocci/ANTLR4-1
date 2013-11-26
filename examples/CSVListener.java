// Generated from CSV.g4 by ANTLR 4.1
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link CSVParser}.
 */
public interface CSVListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link CSVParser#field}.
	 * @param ctx the parse tree
	 */
	void enterField(@NotNull CSVParser.FieldContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSVParser#field}.
	 * @param ctx the parse tree
	 */
	void exitField(@NotNull CSVParser.FieldContext ctx);

	/**
	 * Enter a parse tree produced by {@link CSVParser#hdr}.
	 * @param ctx the parse tree
	 */
	void enterHdr(@NotNull CSVParser.HdrContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSVParser#hdr}.
	 * @param ctx the parse tree
	 */
	void exitHdr(@NotNull CSVParser.HdrContext ctx);

	/**
	 * Enter a parse tree produced by {@link CSVParser#file}.
	 * @param ctx the parse tree
	 */
	void enterFile(@NotNull CSVParser.FileContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSVParser#file}.
	 * @param ctx the parse tree
	 */
	void exitFile(@NotNull CSVParser.FileContext ctx);

	/**
	 * Enter a parse tree produced by {@link CSVParser#row}.
	 * @param ctx the parse tree
	 */
	void enterRow(@NotNull CSVParser.RowContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSVParser#row}.
	 * @param ctx the parse tree
	 */
	void exitRow(@NotNull CSVParser.RowContext ctx);
}