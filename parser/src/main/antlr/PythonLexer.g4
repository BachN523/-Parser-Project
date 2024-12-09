lexer grammar PythonLexer;

options {
    superClass = PythonLexerBase; // Ensure you extend your custom base class
}

tokens { DEDENT }

// Lexer rules for various tokens
WS: [ \n\r]+ -> skip;

INDENT: [\t]+; // Placeholder
DEDENT: 'DEDENT';  // token

NUMBER: '-'? [0-9]+('.'[0-9]+)?;
STRING: '"' .*? '"' | '\'' .*? '\'';
COMMENT: '#' ~[\r\n]* -> skip;
MULTI_LINE_COMMENT: '\'' '\'' '\'' .*? '\'' '\'' '\'' -> skip;
BOOL: 'True' | 'False';
IF: 'if';
ELIF: 'elif';
ELSE: 'else';
WHILE: 'while';
FOR: 'for';
IN: 'in';
NOT: 'not';
AND: 'and';
OR: 'or';
LT: '<';
LE: '<=';
GT: '>';
GE: '>=';
EQ: '==';
NE: '!=';
COLON: ':';
ASSIGN: '=';
PLUS_ASSIGN: '+=';
MINUS_ASSIGN: '-=';
MUL_ASSIGN: '*=';
DIV_ASSIGN: '/=';
PLUS: '+';
MINUS: '-';
MUL: '*';
DIV: '/';
MOD: '%';
COMMA: ',';
LPAREN: '(';
RPAREN: ')';
LBRACK: '[';
RBRACK: ']';
RANGE: 'range';
IDENTIFIER: [a-zA-Z_][a-zA-Z_0-9]*;
