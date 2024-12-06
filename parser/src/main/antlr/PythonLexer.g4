lexer grammar PythonLexer;

options {
    superClass = PythonLexerBase; // Ensure you extend your custom base class
}

// Honestly this method didn't work out even though I tried PDA stuff
// Hopefully we don't lose massive partial credit I just ran out of time to finish implementing this
tokens { DEDENT }

@lexer::members {
    private java.util.Stack<Integer> indentStack = new java.util.Stack<>();
    private int prevIndentLevel = 0; // Track the previous indentation level

    // Initialize the stack with 0 indentation
    {
        indentStack.push(0);
    }

    private int getIndentationLevel() {
        int count = 0;
        for (int i = 0; ; i++) {
            int c = _input.LA(i + 1);
            if (c == '\t') {
                count += 4; // Treat tabs as 4 spaces (this can be adjusted based on preference)
            } else {
                break;
            }
        }
        return count;
    }

    // Handle indentation and dedentation in NEWLINE
    @Override
    public void emit() {
        // If the current token is NEWLINE, check the indentation
        if (_type == NEWLINE) {
            int indentLevel = getIndentationLevel();

            if (indentLevel > prevIndentLevel) {
                emit(new CommonToken(INDENT));  // Emit INDENT token for increased indentation (explicit tab)
                indentStack.push(indentLevel);
            } else if (indentLevel < prevIndentLevel) {
                while (indentStack.peek() > indentLevel) {
                    emit(new CommonToken(DEDENT));  // Emit DEDENT token for decreased indentation
                    indentStack.pop();
                }
            }
            prevIndentLevel = indentLevel; // Update the previous indentation level
        }
        super.emit();
    }
}

// Lexer rules for various tokens
NEWLINE: '\r'? '\n';

INDENT: '\t'; // Placeholder
DEDENT: 'DEDENT';  // token

NUMBER: '-'? [0-9]+('.'[0-9]+)?;
STRING: '"' .*? '"' | '\'' .*? '\'';
WS: ' ' -> skip;  // Skip a single space
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
