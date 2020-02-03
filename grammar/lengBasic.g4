grammar lengBasic;


///REGLAS

begin:imports globalThings* main? EOF;
imports:('import' BIBLIOTECA)* ('using''namespace''std'COT|) ;
statement:'{' localThings*'}'  ;
fun_statement: '{' localThings* 'return' expresion COT'}'  ;
globalThings:declaracion| assignmentexpression|function_declaration|void_declaration;
localThings:declaracion |ciclo|assignmentexpression|desicion;
main: 'int main' '(' ')'statement'return' '0' ;
declaracion : simpleDeclaration|declaracion_asignacion;
void_declaration:'void' ID '(' arguments')' statement;
function_declaration: tipos ID '('arguments')' fun_statement COT;
declaracion_asignacion:tipos ID assignmentoperator expresion COT;
simpleDeclaration : tipos variables COT;
expresion:expresion_entera | expresion_decimal|expresion_logica|expresion_mat|expresion_palabra;

ciclo:fOR |wHILe |do_while;
desicion:  IF '(' expresion_logica')' statement (ELSE statement|ELSE desicion |);

wHILe: WHile '(' expresion_logica ')' statement;
do_while: Do statement WHile '(' expresion_logica ')' COT;
fOR: FOR'(' (simpleDeclaration|declaracion_asignacion) expresion_logica? ';' expresion_mat? ')' statement;


expresion_decimal:REAL;
expresion_entera:INT;
expresion_palabra:WORD;

assignmentexpression : /*conditionalexpression|*/  (ID index* assignmentoperator expresion|post_operators|pre_operators) COT;

expresion_logica:logicalorexpression ;

conditionalexpression
   : logicalorexpression
   | logicalorexpression '?' assignmentexpression ':' assignmentexpression
   ;

expresion_mat:adicion|post_operators|pre_operators;



logicalandexpression: inclusiveorexpression| logicalandexpression '&&' inclusiveorexpression| logicalandexpression 'and' inclusiveorexpression;

logicalorexpression: logicalandexpression| logicalorexpression '||' logicalandexpression| logicalorexpression 'or' logicalandexpression;

equalityexpression: relationalexpression|'!'expresion_logica| equalityexpression '==' relationalexpression| equalityexpression '!=' relationalexpression;

andexpression: equalityexpression| andexpression '&' equalityexpression;

exclusiveorexpression : andexpression| exclusiveorexpression '^' andexpression;

inclusiveorexpression: exclusiveorexpression| inclusiveorexpression '|' exclusiveorexpression;

relationalexpression: adicion| relationalexpression '<' adicion| relationalexpression '>' adicion| relationalexpression '<=' adicion| relationalexpression '>=' adicion;

shiftoperator
  : RightShift
  | LeftShift
  ;
mulriplicacion: numero| mulriplicacion '*' numero| mulriplicacion '/' numero| mulriplicacion '%' numero;

adicion: mulriplicacion| adicion '+' mulriplicacion| adicion '-' mulriplicacion;

post_operators:ID index*('++'|'--');
pre_operators: ('++'|'--') ID index*;

                   /*Declarations*/
tipos:(pretipo tipos_con_pre|tipos_sin_pre|tipos_con_pre);
tipos_sin_pre:'char'|'char16'|'char32'|'wchar'|'bool'|'auto'|'string';
tipos_con_pre:'int'|'float'|'double';
variables: (ID(','ID)*) index*;
pretipo:  'short'| 'long'| 'signed'| 'unsigned';
assignmentoperator   : '='| '*='| '/='| '%=' | '+='|'-='| RightShiftAssign | LeftShiftAssign | '&='| '^='| '|=';
numero:ID index*|expresion_entera|expresion_decimal|'('expresion')';
index:'['expresion_mat']';
arguments:tipos ID(','tipos ID)*|;


///LETRAS
CHAR : [/$%\\];

REAL : [0-9]+'.'+[0-9]+;
INT :[0-9]+;
BOOL : ([01]|'true'|'false');
COT:';';
IF:'if';
ELSE:'else';
WHile:'while';
FOR: 'for';
Do:'do';
LeftShift: '<<';
RightShift:'>>';
ID : [a-zA-Z_]+[0-9]* ;
BIBLIOTECA: '"'ID'.h''"'|'<'ID'.h''>';
WORD: '"'(ID|INT|REAL|' ')*'"';
///TIPOS



///COMENTARIOS

Whitespace
   : [ \t]+ -> skip
   ;
Newline
   : ('\r' '\n'? | '\n') -> skip
   ;
BlockComment
   : '/*' .*? '*/' -> skip
   ;
LineComment
   : '//' ~ [\r\n]* -> skip
   ;