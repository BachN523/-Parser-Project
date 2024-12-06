parser grammar PythonParser;

options {
    superClass = PythonParserBase;
    tokenVocab = PythonLexer; // Use the lexer for token vocabulary
}

// Parser Rules
program: (statement NEWLINE?)* EOF;

statement: conditional
         | assignment
         | loop
         | COMMENT
         | MULTI_LINE_COMMENT
         | rangeCall
         | NEWLINE
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

conditional: IF condition COLON NEWLINE content
             (ELIF condition COLON NEWLINE content)*
             (ELSE COLON NEWLINE content)?;

content: INDENT statement+ DEDENT;

// Loop structures
loop: whileLoop | forLoop;

whileLoop: WHILE condition COLON NEWLINE content;

forLoop: FOR IDENTIFIER IN rangeCall COLON NEWLINE content |
            FOR IDENTIFIER IN expr COLON NEWLINE content;

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
