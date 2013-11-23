grammar Expr;

/** The start rule; begin parsing here. */
prog:	stat+ ;

stat:	expr NEWLINE
	|	ID '=' expr NEWLINE
	|	NEWLINE
	;

expr:	expr ('*' | '/') expr
	|	expr ('+' | '-') expr
	|	INT
	|	ID
	|	'(' expr ')'
	;

ID	:	[a-zA-Z]+ ;		// match identifiers
INT	:	[0-9]+ ;		// match integers
NEWLINE:'\r' ? '\n' ;	// return newlines to parser (is end-statement signal)
WS	:	[ \t]+ -> skip ;// toss out whitespae
