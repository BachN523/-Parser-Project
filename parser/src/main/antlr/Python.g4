grammar Python;

program: statement+;

statement
    : assignment
    | arithmetic
    | array
    ;

assignment
    : ID '=' expression
    ;

arithmetic
    : ID '=' expression (('+'|'-'|'*'|'/'|'%') expression)*
    ;

array
    : ID '=' '[' (expression (',' expression)*)? ']'
    ;

expression
    : ID
    | INT
    | FLOAT
    | STRING
    | expression ('+'|'-'|'*'|'/'|'%') expression
    | '(' expression ')'
    ;

ID: [a-zA-Z_][a-zA-Z_0-9]*;
INT: [0-9]+;
FLOAT: [0-9]+ '.' [0-9]+;
STRING: '"' .*? '"';
WS: [ \t\r\n]+ -> skip;
