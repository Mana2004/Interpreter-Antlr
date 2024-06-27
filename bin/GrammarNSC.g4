grammar GrammarNSC;

program : statements;

statements : statement
           | statements statement;

statement : Identifier '=' expr ';'
          | 'begin' statements 'end'
          | 'if' expr 'then' statement
          | 'if' expr 'then' statement 'else' statement
          | 'while' expr 'do' statement
          | 'for' Identifier 'of' Number 'to' Number 'do' statement
          | 'loop' Identifier ':' Number 'do' statement
          | 'print' Identifier ';'
          | 'print' stringLiteral ',' Identifier ';';

expr : expr binop expr
     | '!' expr
     | '(' expr ')'
     | Identifier
     | Number;

binop : '+' | '-' | '*' | '/' | '<' | '>' | '<=' | '>=' | '==' | '!=' | '^';

Identifier : [a-zA-Z] [a-zA-Z0-9_]*;
Number : [0-9]+ ('.' [0-9]*)?;
stringLiteral : '"' .*? '"';

WS : [ \t\r\n]+ -> skip;
