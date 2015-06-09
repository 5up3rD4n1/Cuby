grammar Cuby; // Gramatica de Cuby.

expresion
	: elemento
	| expresion operacion_aritmetica expresion
	| expresion operacion_logica expresion
	| expresion operacion_relacional expresion
	| IDENTIFICADOR operacion_unaria
	| operacion_unaria IDENTIFICADOR
	| OP_NEGACION expresion
	;

elemento
	: literal
	| llamada_funcion
	;

literal
	: ENTERO
	| CARACTER
	| TEXTO
	| IDENTIFICADOR
	| BOOLEANO
	;

operacion_aritmetica
	: OP_SUMA
	| OP_RESTA
	| OP_MULTIPLICACION 
	| OP_DIVISION
	| OP_MOD
	| OP_ASIGNAR_SUMA
	| OP_ASIGNAR_RESTA
	| OP_ASIGNAR_MULTIPLICACION
	| OP_ASIGNAR_DIVISION
	| OP_ASIGNAR_MODULO
	;

operacion_unaria
	: OP_INCREMENTAR
	| OP_DECREMENTAR
	;

operacion_logica
	: OP_AND
	| OP_OR
	;

operacion_relacional
	: OP_MAYORQUE 
	| OP_MENORQUE 
	| OP_MAYOROIGUAL 
	| OP_MENOROIGUAL 
	| OP_IGUALQUE 
	| OP_DIFERENTEQUE
	;

// nombreFuncion(2+2)
llamada_funcion
	: funcion_por_usuario // definida por usuario
	| funciones_predefinidas // predefinida
	;

funciones_predefinidas
	: llamada_imprimir 
	| llamada_amay
	| llamada_cae
	| llamada_eac
	| llamada_tae
	| llamada_eat
	| llamada_longitud
	| llamada_invertir
	| llamada_esDigito
	| llamada_amin
	| llamada_esLetra
	;

funcion_por_usuario
	: IDENTIFICADOR '(' entradas? ')'
	;

entradas 
	: entrada (',' entrada)*
	;

entrada
	: expresion
	;

definicion_identificador
	: tipo_dato IDENTIFICADOR 
	;

declaracion_variable
	: definicion_identificador OP_ASIGNACION expresion
	;

asignacion_variable
	: IDENTIFICADOR OP_ASIGNACION expresion
	;

proposicion
	: declaracion_variable ';'
	| asignacion_variable ';'
	| expresion ';'
	| sentencia	
	;

tipo_dato
	: (TIPO_ENTERO | TIPO_CARACTER | TIPO_TEXTO | TIPO_BOOLEANO)
	; 

dato
	: ENTERO
	| BOOLEANO
	| TEXTO
	| CARACTER
	;	

sentencia
	: sentencia_condicional
	| sentencia_de_salto
	| sentencia_de_iteracion
	| bloque
	;


sentencia_de_salto
	: SALIR ';'
	| SEGUIR ';'
	| RETORNAR expresion? ';'
	;

sentencia_condicional 
	: SI '(' expresion ')' bloque (SINOSI '(' expresion ')' bloque)* (SINO bloque)?
	| CASO IDENTIFICADOR DELIMITADOR_BLOQUE ( CUANDO  dato bloque )+ (SINO bloque)? DELIMITADOR_BLOQUE
	;

expresion_actualizacion
	: IDENTIFICADOR ( OP_ASIGNACION | OP_ASIGNAR_SUMA | OP_ASIGNAR_RESTA | OP_ASIGNAR_MULTIPLICACION | OP_ASIGNAR_DIVISION
		| OP_ASIGNAR_MODULO) expresion
	| IDENTIFICADOR ( OP_INCREMENTAR | OP_DECREMENTAR )
	| ( OP_INCREMENTAR | OP_DECREMENTAR ) IDENTIFICADOR
    ;

sentencia_de_iteracion
	: PARA '(' declaracion_variable ';' expresion ';' expresion_actualizacion ')' bloque
	| MIENTRAS '(' expresion ')' bloque
	| REPITA bloque HASTA '(' expresion ')'
	| ( ENTERO | IDENTIFICADOR ) '.' VECES bloque
	;

bloque
	: '|' proposicion* '|'
	;

definir_funcion
	: DEF tipo_dato? IDENTIFICADOR '(' parametros? ')' bloque
	;

parametros
	: parametro (',' parametro)*
	;

parametro
	: definicion_identificador
	;

llamada_imprimir
	: FUNC_IMPRIMIR '(' expresion ')' 
	;

llamada_amay
	: FUNC_A_MAYUSCULA '(' expresion ')'
	;

llamada_amin
	: FUNC_A_MINUSCULA '(' expresion ')' 
	;

llamada_cae
	: FUNC_CARACTER_A_ENTERO '(' expresion ')'
	;

llamada_eac
	: FUNC_ENTERO_A_CARACTER '(' expresion ')'
	;

llamada_tae
	: FUNC_TEXTO_A_ENTERO '(' expresion ')'
	;

llamada_eat
	: FUNC_ENTERO_A_TEXTO '(' expresion ')'
	;	

llamada_longitud
	: FUNC_LONGITUD_TEXTO '('expresion')'
	;

llamada_invertir
	: FUNC_INVERTIR_TEXTO '(' expresion ')'
	;

llamada_esLetra
	: FUNC_ES_LETRA '(' expresion ')'
	;

llamada_esDigito
	: FUNC_ES_DIGITO '(' expresion ')'
	;


funcion_principal
	: FUNC_PRINCIPAL  '(' ')' bloque
	;

funciones
	: definir_funcion (definir_funcion)*
	;

programa
	: funciones? funcion_principal EOF
	;


// ==============================
//    		   TOKENS
// ==============================

// Delimitador

DELIMITADOR_BLOQUE: '|';


//Operaciones

OP_NEGACION : '~' ;
OP_AND      : 'y' ;
OP_OR       : 'o' ;

OP_IGUALQUE     : '==';
OP_DIFERENTEQUE : '!=';
OP_MAYORQUE     : '>' ;
OP_MENORQUE     : '<' ;
OP_MENOROIGUAL  : '<=';
OP_MAYOROIGUAL  : '>=';


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





//FIN_LINEA: ';' ; // '\n'


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
SINOSI: 'sino si';
SINO: 'sino';
DEF: 'def';
SALIR: 'salir';
RETORNAR: 'ret';
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

ESPACIOS_BLANCO : [ \t\r\n]+ -> skip ;

ENTERO: [0] | '-'? ( [1-9] [0-9]* );
BOOLEANO: ('verdadero'|'falso');
IDENTIFICADOR: ([a-z]|[A-Z])+;

COMENTARIO: '/*' (.)*? '*/' -> skip;


fragment COMILLA: '\'';
CARACTER : '\''(.)'\'' ;
TEXTO    : '"'(.)*? '"';