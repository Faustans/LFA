grammar Interpreter;

program: stat* EOF;

stat: assign #statAssign
    | print #statExpr
    | load #statLoad
    | save #statSave;

//print no terminal de tabelas ou escrever num ficheiro
print: 'print' expr ';' #printConsole
      | 'printFile' expr ';' #printFile;

assign: ID '=' expr ';' #assignExpr
      | ID '=' CSV ';' #assignCSV;

expr: selectC #exprSelect
    | unite #exprUnite
    | arithmetic #exprArith
    | textExpr #exprText
    | table #exprTable;

//LOAD E SAVE DO PROGRAMA ATUAL
load: 'load(' ID ')' ';';
save: 'save(' ID ')' ';';

//Operações aritméticas
arithmetic: access '*' INT  #multAr
          | access '/' INT  #divAr
          | access '%' INT  #remAr
          | access '^' op=('+' | '-')? INT #powerAr
          | access '+' INT  #plusAr
          | access '-' INT #minusAr;

//Operações com String
textExpr: access '+' ID #concatExpr
        | access '-' ID #deleteExpr
        | access '<<' #invertExpr;

// Criar nova tabela selecionando colunas de uma tabela existente seletcC(csv, coluna1, coluna2, coluna3, colunaX) -> Colunas a selecionar
//Pode-se implementar um intervalo também
//retorna a tabela final
selectC: 'selectC(' table ',' (INT (',' INT)*)? ')';

//unir duas colunas de duas tabelas, tendo em conta uma coluna de comparação(p.e. nºMEC)
// unite(csv1,csv2,colunaCSV1,colunaCSV2,ColunaComparação)
//retorna a tabela final
unite: 'unite(' table ',' table ',' INT ',' INT ',' INT ')';

//acessar a coluna INT de uma tabela
access : table '[' INT ']';

table: ID #tableID
    |  CSV #tableCSV;

CSV: [a-zA-Z]+? '.csv';
ID: [a-zA-Z]+;
INT: [0-9]+;
WS: [ \t\r\n]+ ->skip;
COMMENT: '//' .*? '\n' ->skip;
