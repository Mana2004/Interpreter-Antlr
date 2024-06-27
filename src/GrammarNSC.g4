grammar GrammarNSC;

program : statements;

statements
    : statement #state
    | statements statement  #states_state;

statement
    : identifier '=' binop ';'   #equal
    | 'begin' statements 'end'  #begin_end
    | 'if' binop 'then' statement    #if_then
    | 'if' binop 'then' statement 'else' statement   #if_then_else
    | 'while' binop 'do' statement   #while_do
    | 'for' identifier 'of' number 'to' number 'do' statement   #for_do
    | 'loop' identifier ':' number 'do' statement   #loop_do
    | 'print' identifier ';'    #print
    | 'print' sl ',' identifier ';' #print_literal;

binop
    : expr
    | binop '<' expr
    | binop '>' expr
    | binop '<=' expr
    | binop '>=' expr
    | binop '==' expr
    | binop '!=' expr   ;

expr
    : term
    |expr '+' term
    |expr '-' term ;

term
    : factor
    |term '*' factor
    |term '/' factor
    |term '%' factor    ;

factor
    : result
    | result '^' factor ;

result
    : number
    | identifier
    | '(' expr ')'
    | '!' expr  ;

identifier : Identifier;
number : Number;
sl : StringLiteral;

Identifier : [a-zA-Z][a-zA-Z0-9_]* ;
Number : [0-9]+ ('.' [0-9]+)? ;
StringLiteral : '"' .*? '"' ;
WS : [ \t\r\n]+ -> skip ;