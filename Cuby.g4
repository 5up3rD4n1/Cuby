grammar Cuby; // Gramatica de Cuby.

expresion
	: elemento
	| OP_NEGACION expresion
	| expresion ( OP_MULTIPLICACION | OP_DIVISION ) expresion
	| expresion (OP_SUMA | OP_RESTA) expresion
	| expresion (OP_MAYORQUE | OP_MENORQUE | OP_MAYOROIGUAL | OP_MENOROIGUAL | OP_IGUALQUE| OP_DIFERENTEQUE) expresion
	| OP_NEGACION expresion
	| expresion OP_AND expresion
	| expresion OP_OR expresion
	;

elemento
	: '(' expresion ')'
	| llamada_funcion
	| literal
	;

literal
	: ENTERO
	| CARACTER
	| TEXTO
	| IDENTIFICADOR
	;

llamada_funcion
	: IDENTIFICADOR '(' entradas? ')' (';')? 
	;

entradas 
	: entrada (',' entrada)*
	;

entrada
	: expresion
	;

declarar_identificador
	: tipo_dato IDENTIFICADOR 
	;

declaracion_variable
	: declarar_identificador OP_ASIGNACION expresion ';'
	;

proposicion
	: declaracion_variable 
	| condicional 
	| llamada_imprimir 
	| llamada_amay
	| llamada_cae
	| llamada_eac
	| llamada_tae
	| llamada_longitud
	| llamada_invertir
	| llamada_esDigito
	| llamada_amin
	| resultado
	;

tipo_dato
	: (TIPO_ENTERO | TIPO_CARACTER | TIPO_TEXTO | TIPO_BOOLEANO)
	; 

resultado 
	: RET expresion ';'
	;

condicional 
	: SI '(' expresion ')' bloque (SII '(' expresion ')' bloque)*? (SINO bloque)?
	| CASO IDENTIFICADOR ':' ( CUANDO  ( ENTERO | CARACTER | TEXTO | BOOLEANO ) bloque )+ (SINO bloque)?
	;


parametros
	: parametro (COMA parametro )*
	;

parametro
	: declarar_identificador
	;

//estructuras de repeticion
expresion_actualizacion
	: IDENTIFICADOR ( OP_ASIGNACION | OP_ASIGNAR_SUMA | OP_ASIGNAR_RESTA | OP_ASIGNAR_MULTIPLICACION | OP_ASIGNAR_DIVISION
		| OP_ASIGNAR_MODULO) expresion
	| IDENTIFICADOR ( OP_INCREMENTAR | OP_DECREMENTAR )
    ;

estructura_repeticion
	: PARA '(' declaracion_variable expresion ';' expresion_actualizacion ')' bloque
	| MIENTRAS '(' expresion ')' bloque
	| REPITA bloque HASTA '(' expresion ')'
	| ( ENTERO | IDENTIFICADOR ) PUNTO VECES bloque
	;	

bloque
	: DELIMITADOR_BLOQUE proposicion* SALIR? SEGUIR? DELIMITADOR_BLOQUE
	;

definir_funcion
	: DEF declarar_identificador  '(' parametros? ')' bloque
	; 

llamada_imprimir
	: FUNC_IMPRIMIR '(' ( ENTERO | CARACTER | TEXTO | BOOLEANO ) ')' ';'
	;

llamada_amay
	: FUNC_A_MAYUSCULA '(' (TEXTO | CARACTER) ')' ';'
	;

llamada_amin
	: FUNC_A_MINUSCULA '(' (TEXTO | CARACTER) ')' ';'
	;

llamada_cae
	: FUNC_CARACTER_A_ENTERO '(' CARACTER ')' ';'
	;

llamada_eac
	: FUNC_ENTERO_A_CARACTER '(' ENTERO ')' ';'
	;

llamada_tae
	: FUNC_TEXTO_A_ENTERO '(' (TEXTO | CARACTER) ')' ';'
	;

llamada_longitud
	: FUNC_LONGITUD_TEXTO '(' (TEXTO | CARACTER) ')' ';'
	;

llamada_invertir
	: FUNC_INVERTIR_TEXTO '(' TEXTO ')' ';'
	;

llamada_esLetra
	: FUNC_ES_LETRA '(' CARACTER ')' ';'
	;

llamada_esDigito
	: FUNC_ES_DIGITO '(' CARACTER ')' ';'
	;

funcion_principal
	: FUNC_PRINCIPAL  '(' ')' bloque
	;

programa
	: definir_funcion* funcion_principal
	;


// ==============================
//    		   TOKENS
// ==============================


// Separadores

COMA        : ',' ;
DOSPUNTOS   : ':' ;
PUNTO_COMA  : ';' ;
PUNTO 	    : '.' ;
DOBLEPUNTO  : '..';


//Operaciones

OP_NEGACION : '~' ;
OP_AND      : '&&';
OP_OR       : '||';

OP_IGUALQUE     : '==';
OP_DIFERENTEQUE : '!=';
OP_MAYORQUE     : '>' ;
OP_MENORQUE     : '<' ;
OP_MENOROIGUAL  : '<=';
OP_MAYOROIGUAL  : '>=';

OP_NEGATIVO : '-';

OP_MULTIPLICACION : '*' ;
OP_DIVISION 	  : '/' ;
OP_MOD 			  : '%' ;
OP_SUMA 		  : '+' ;
OP_RESTA 		  : '-' ;

OP_DECREMENTAR : '--';
OP_INCREMENTAR : '++';

OP_ASIGNACION : '=';
OP_ASIGNAR_RESTA: '-=';
OP_ASIGNAR_SUMA: '+=';
OP_ASIGNAR_MULTIPLICACION: '*=';
OP_ASIGNAR_DIVISION: '/=';
OP_ASIGNAR_MODULO: '%=';





DELIMITADOR_BLOQUE: '|';
FIN_LINEA: ( '\n' | ';' );

fragment COMILLA: '\'';

ENTERO: [0] | ( [1-9] [0-9]* );
BOOLEANO: ('verdadero'|'falso');
IDENTIFICADOR: [a-z]+;
COMENTARIO: '/*' (.)*? '*/' -> skip;
ESPACIOS_BLANCO : [' '\t\r\n]+ -> skip ;

CARACTER
	: '\'' (.) '\'' 
	| ~['\\] 
	| COMILLA (.) COMILLA
	;

TEXTO : (CARACTER)+;




// Nombres de funciones

FUNC_IMPRIMIR: 'escribir';
FUNC_PRINCIPAL: 'principal';

FUNC_A_MAYUSCULA : 'aMay';
FUNC_A_MINUSCULA : 'aMin';

FUNC_CARACTER_A_ENTERO : 'cae';
FUNC_ENTERO_A_CARACTER : 'eac';

FUNC_ENTERO_A_TEXTO : 'eat';
FUNC_TEXTO_A_ENTERO : 'tae';

FUNC_LONGITUD_TEXTO : 'longitud';
FUNC_INVERTIR_TEXTO : 'invertir';

FUNC_ES_LETRA : 'esLetra?';
FUNC_ES_DIGITO : 'esDigito?';



// Palabras reservadas

PARA: 'para';
REPITA: 'repita';
MIENTRAS: 'mientras';
SI: 'si';
SII: 'sii';
SINO: 'sino';
DEF: 'def';
SALIR: 'salir';
RET: 'ret';
CASO: 'caso';
CUANDO: 'cuando';
SEGUIR: 'seguir'; //continuar
VECES : 'veces';
HASTA : 'hasta';



// Tipos

TIPO_ENTERO   : 'entero';
TIPO_CARACTER : 'caracter';
TIPO_TEXTO    : 'texto';
TIPO_BOOLEANO : 'booleano';