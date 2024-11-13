grammar Python;

// Start rule to match a program (multiple assignments or statements)
program: statement+;

// A statement can be an assignment or other statements (extendable)
statement: assignment | conditional;

// Single rule to match an assignment
assignment: IDENTIFIER assignOps expr;

block: (assignment)*;

// Define the assignment operators
assignOps: '=' | '+=' | '-=' | '*=' | '/=';

// Define an expression that can be an identifier, number, string, or more complex expressions
expr: IDENTIFIER
    | NUMBER
    | STRING
    | expr operator expr
    | '(' expr ')'
    | '[' list ']';

// Define the layout for a list
list: expr ',' list
    | expr
    |;

// Match a basic identifier (variable name)
IDENTIFIER: [a-zA-Z_][a-zA-Z_0-9]*;

// Match a number (integer or floating point)
NUMBER: [0-9]+('.'[0-9]+)?;

// Define a string literal (can be single or double quoted)
STRING: '"' .*? '"' | '\'' .*? '\'';

// Define arithmetic operators
operator: '+' | '-' | '*' | '/' | '=' | '%';

// Define comments that start with # and go to the end of the line
COMMENT: '#' ~[\r\n]* -> skip;  // Skip everything after '#' until the end of the line

// Skip whitespace
WS: [ \t\r\n]+ -> skip;

conditional: 'if' condition ':' statement ('elif' condition ':' statement)* ('else' ':' statement)?;

// Define a condition that can be a comparison or logical expression
condition: expr comparisonOp expr
         | condition logicalOp condition
         | 'not' condition
         | '(' condition ')';

// Define comparison operators
comparisonOp: '<' | '<=' | '>' | '>=' | '==' | '!=';

// Define logical operators
logicalOp: 'and' | 'or';
