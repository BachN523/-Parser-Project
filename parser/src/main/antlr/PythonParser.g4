parser grammar PythonParser;

options {
    superClass = PythonParserBase;
    tokenVocab = PythonLexer; // Use the lexer for token vocabulary
}

// Parser Rules
program: statement+ EOF;

statement: conditional
         | assignment
         | loop
         | COMMENT
         | MULTI_LINE_COMMENT
         | rangeCall
         | INDENT statement;

// Assignment rule (only match if identifier is followed by assignment operator)
assignment: IDENTIFIER assignOps expr;

// Expressions and operators
expr: NUMBER
    | STRING
    | BOOL
    | IDENTIFIER
    | expr operator expr
    | LPAREN expr RPAREN
    | list;

operator: PLUS | MINUS | MUL | DIV | MOD;

list: LBRACK (expr (COMMA expr)*)? RBRACK;

conditional: IF condition COLON block
             (ELIF condition COLON block)*
             (ELSE COLON block)?;

conditions: IF | ELIF | ELSE;

block: INDENT statement next_block*;
next_block: block | INDENT block | block INDENT;

// Loop structures
loop: whileLoop | forLoop;

whileLoop: WHILE condition COLON block;

forLoop: FOR IDENTIFIER IN rangeCall COLON block |
            FOR IDENTIFIER IN IDENTIFIER COLON block;

// Condition expression
condition: expr comparisonOp expr
         | condition logicalOp condition
         | NOT condition
         | LPAREN condition RPAREN
         | BOOL
         | expr;

logicalOp: AND | OR;
comparisonOp: LT | LE | GT | GE | EQ | NE;
assignOps: ASSIGN | PLUS_ASSIGN | MINUS_ASSIGN | MUL_ASSIGN | DIV_ASSIGN;

rangeCall: RANGE LPAREN rangeArguments RPAREN;
rangeArguments: expr COMMA expr;  // range takes two arguments: start, end
