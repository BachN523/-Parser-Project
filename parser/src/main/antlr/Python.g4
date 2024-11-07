grammar Python;

// Single rule to match an assignment
assignment: IDENTIFIER '=' expr;

// Define an expression that can be an identifier, number, string, or more complex expressions
expr: IDENTIFIER
    | NUMBER
    | STRING
    | expr operator expr
    | '(' expr ')';

// Match a basic identifier (variable name)
IDENTIFIER: [a-zA-Z_][a-zA-Z_0-9]*;

// Match a number (integer or floating point)
NUMBER: [0-9]+('.'[0-9]+)?;

// Define a string literal (can be single or double quoted)
STRING: '"' .*? '"';

// Define arithmetic operators
operator: '+' | '-' | '*' | '/' | '=';

// Define comments that start with # and go to the end of the line
COMMENT: '#' .*? '\r'? '\n' -> skip;

// Skip whitespace
WS: [ \t\r\n]+ -> skip;
