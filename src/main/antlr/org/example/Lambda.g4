// based on: https://github.com/antlr/grammars-v4/blob/master/lambda/lambda.g4
grammar Lambda;

expr
    : name=VARIABLE #variable
    | fn            #function
    | app           #application
    ;

fn
    : 'λ' name=VARIABLE '.' scope
    ;

app
    : '(' left=expr right=expr ')'
    ;

scope
    : expr
    ;

VARIABLE
    : [a-z] [a-zA-Z0-9]*
    ;

WS
   : [ \t\r\n] -> skip
   ;