grammar Lenguaje;

program     : statement* EOF ;

statement
    : decl ';'
    | assign ';'
    | printStmt ';'
    | ifStmt
    | whileStmt
    ;

decl        : (INT | FLOAT | STRING) ID ( '=' expr )? ;
assign      : ID '=' expr ;
printStmt   : PRINT expr ;

ifStmt      : IF '(' expr ')' block (ELSE block)? ;
whileStmt   : WHILE '(' expr ')' block ;
block       : '{' statement* '}' ;

expr
    : expr op=('*'|'/') expr        # mulDiv
    | expr op=('+'|'-') expr        # addSub
    | expr op=('<'|'>'|'<='|'>='|'=='|'!=') expr  # compare
    | '(' expr ')'                  # parens
    | NUMBER                        # number
    | STRINGLIT                     # string
    | ID                            # id
    ;

IF      : 'if';
ELSE    : 'else';
WHILE   : 'while';
PRINT   : 'print';

INT     : 'int';
FLOAT   : 'float';
STRING  : 'string';

ID      : [a-zA-Z_][a-zA-Z_0-9]* ;
NUMBER  : [0-9]+ ('.' [0-9]+)? ;
STRINGLIT: '"' (~["\r\n])* '"' ;

WS      : [ \t\r\n]+ -> skip ;
COMMENT : '//' ~[\r\n]* -> skip ;
