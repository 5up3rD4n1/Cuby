// Generated from Cuby.g4 by ANTLR 4.5
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link CubyParser}.
 */
public interface CubyListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link CubyParser#expresion}.
	 * @param ctx the parse tree
	 */
	void enterExpresion(CubyParser.ExpresionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CubyParser#expresion}.
	 * @param ctx the parse tree
	 */
	void exitExpresion(CubyParser.ExpresionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CubyParser#elemento}.
	 * @param ctx the parse tree
	 */
	void enterElemento(CubyParser.ElementoContext ctx);
	/**
	 * Exit a parse tree produced by {@link CubyParser#elemento}.
	 * @param ctx the parse tree
	 */
	void exitElemento(CubyParser.ElementoContext ctx);
	/**
	 * Enter a parse tree produced by {@link CubyParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterLiteral(CubyParser.LiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link CubyParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitLiteral(CubyParser.LiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link CubyParser#llamada_funcion}.
	 * @param ctx the parse tree
	 */
	void enterLlamada_funcion(CubyParser.Llamada_funcionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CubyParser#llamada_funcion}.
	 * @param ctx the parse tree
	 */
	void exitLlamada_funcion(CubyParser.Llamada_funcionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CubyParser#entradas}.
	 * @param ctx the parse tree
	 */
	void enterEntradas(CubyParser.EntradasContext ctx);
	/**
	 * Exit a parse tree produced by {@link CubyParser#entradas}.
	 * @param ctx the parse tree
	 */
	void exitEntradas(CubyParser.EntradasContext ctx);
	/**
	 * Enter a parse tree produced by {@link CubyParser#entrada}.
	 * @param ctx the parse tree
	 */
	void enterEntrada(CubyParser.EntradaContext ctx);
	/**
	 * Exit a parse tree produced by {@link CubyParser#entrada}.
	 * @param ctx the parse tree
	 */
	void exitEntrada(CubyParser.EntradaContext ctx);
	/**
	 * Enter a parse tree produced by {@link CubyParser#declarar_identificador}.
	 * @param ctx the parse tree
	 */
	void enterDeclarar_identificador(CubyParser.Declarar_identificadorContext ctx);
	/**
	 * Exit a parse tree produced by {@link CubyParser#declarar_identificador}.
	 * @param ctx the parse tree
	 */
	void exitDeclarar_identificador(CubyParser.Declarar_identificadorContext ctx);
	/**
	 * Enter a parse tree produced by {@link CubyParser#declaracion_variable}.
	 * @param ctx the parse tree
	 */
	void enterDeclaracion_variable(CubyParser.Declaracion_variableContext ctx);
	/**
	 * Exit a parse tree produced by {@link CubyParser#declaracion_variable}.
	 * @param ctx the parse tree
	 */
	void exitDeclaracion_variable(CubyParser.Declaracion_variableContext ctx);
	/**
	 * Enter a parse tree produced by {@link CubyParser#proposicion}.
	 * @param ctx the parse tree
	 */
	void enterProposicion(CubyParser.ProposicionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CubyParser#proposicion}.
	 * @param ctx the parse tree
	 */
	void exitProposicion(CubyParser.ProposicionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CubyParser#tipo_dato}.
	 * @param ctx the parse tree
	 */
	void enterTipo_dato(CubyParser.Tipo_datoContext ctx);
	/**
	 * Exit a parse tree produced by {@link CubyParser#tipo_dato}.
	 * @param ctx the parse tree
	 */
	void exitTipo_dato(CubyParser.Tipo_datoContext ctx);
	/**
	 * Enter a parse tree produced by {@link CubyParser#resultado}.
	 * @param ctx the parse tree
	 */
	void enterResultado(CubyParser.ResultadoContext ctx);
	/**
	 * Exit a parse tree produced by {@link CubyParser#resultado}.
	 * @param ctx the parse tree
	 */
	void exitResultado(CubyParser.ResultadoContext ctx);
	/**
	 * Enter a parse tree produced by {@link CubyParser#condicional}.
	 * @param ctx the parse tree
	 */
	void enterCondicional(CubyParser.CondicionalContext ctx);
	/**
	 * Exit a parse tree produced by {@link CubyParser#condicional}.
	 * @param ctx the parse tree
	 */
	void exitCondicional(CubyParser.CondicionalContext ctx);
	/**
	 * Enter a parse tree produced by {@link CubyParser#parametros}.
	 * @param ctx the parse tree
	 */
	void enterParametros(CubyParser.ParametrosContext ctx);
	/**
	 * Exit a parse tree produced by {@link CubyParser#parametros}.
	 * @param ctx the parse tree
	 */
	void exitParametros(CubyParser.ParametrosContext ctx);
	/**
	 * Enter a parse tree produced by {@link CubyParser#parametro}.
	 * @param ctx the parse tree
	 */
	void enterParametro(CubyParser.ParametroContext ctx);
	/**
	 * Exit a parse tree produced by {@link CubyParser#parametro}.
	 * @param ctx the parse tree
	 */
	void exitParametro(CubyParser.ParametroContext ctx);
	/**
	 * Enter a parse tree produced by {@link CubyParser#expresion_actualizacion}.
	 * @param ctx the parse tree
	 */
	void enterExpresion_actualizacion(CubyParser.Expresion_actualizacionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CubyParser#expresion_actualizacion}.
	 * @param ctx the parse tree
	 */
	void exitExpresion_actualizacion(CubyParser.Expresion_actualizacionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CubyParser#estructura_repeticion}.
	 * @param ctx the parse tree
	 */
	void enterEstructura_repeticion(CubyParser.Estructura_repeticionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CubyParser#estructura_repeticion}.
	 * @param ctx the parse tree
	 */
	void exitEstructura_repeticion(CubyParser.Estructura_repeticionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CubyParser#bloque}.
	 * @param ctx the parse tree
	 */
	void enterBloque(CubyParser.BloqueContext ctx);
	/**
	 * Exit a parse tree produced by {@link CubyParser#bloque}.
	 * @param ctx the parse tree
	 */
	void exitBloque(CubyParser.BloqueContext ctx);
	/**
	 * Enter a parse tree produced by {@link CubyParser#definir_funcion}.
	 * @param ctx the parse tree
	 */
	void enterDefinir_funcion(CubyParser.Definir_funcionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CubyParser#definir_funcion}.
	 * @param ctx the parse tree
	 */
	void exitDefinir_funcion(CubyParser.Definir_funcionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CubyParser#llamada_imprimir}.
	 * @param ctx the parse tree
	 */
	void enterLlamada_imprimir(CubyParser.Llamada_imprimirContext ctx);
	/**
	 * Exit a parse tree produced by {@link CubyParser#llamada_imprimir}.
	 * @param ctx the parse tree
	 */
	void exitLlamada_imprimir(CubyParser.Llamada_imprimirContext ctx);
	/**
	 * Enter a parse tree produced by {@link CubyParser#llamada_amay}.
	 * @param ctx the parse tree
	 */
	void enterLlamada_amay(CubyParser.Llamada_amayContext ctx);
	/**
	 * Exit a parse tree produced by {@link CubyParser#llamada_amay}.
	 * @param ctx the parse tree
	 */
	void exitLlamada_amay(CubyParser.Llamada_amayContext ctx);
	/**
	 * Enter a parse tree produced by {@link CubyParser#llamada_amin}.
	 * @param ctx the parse tree
	 */
	void enterLlamada_amin(CubyParser.Llamada_aminContext ctx);
	/**
	 * Exit a parse tree produced by {@link CubyParser#llamada_amin}.
	 * @param ctx the parse tree
	 */
	void exitLlamada_amin(CubyParser.Llamada_aminContext ctx);
	/**
	 * Enter a parse tree produced by {@link CubyParser#llamada_cae}.
	 * @param ctx the parse tree
	 */
	void enterLlamada_cae(CubyParser.Llamada_caeContext ctx);
	/**
	 * Exit a parse tree produced by {@link CubyParser#llamada_cae}.
	 * @param ctx the parse tree
	 */
	void exitLlamada_cae(CubyParser.Llamada_caeContext ctx);
	/**
	 * Enter a parse tree produced by {@link CubyParser#llamada_eac}.
	 * @param ctx the parse tree
	 */
	void enterLlamada_eac(CubyParser.Llamada_eacContext ctx);
	/**
	 * Exit a parse tree produced by {@link CubyParser#llamada_eac}.
	 * @param ctx the parse tree
	 */
	void exitLlamada_eac(CubyParser.Llamada_eacContext ctx);
	/**
	 * Enter a parse tree produced by {@link CubyParser#llamada_tae}.
	 * @param ctx the parse tree
	 */
	void enterLlamada_tae(CubyParser.Llamada_taeContext ctx);
	/**
	 * Exit a parse tree produced by {@link CubyParser#llamada_tae}.
	 * @param ctx the parse tree
	 */
	void exitLlamada_tae(CubyParser.Llamada_taeContext ctx);
	/**
	 * Enter a parse tree produced by {@link CubyParser#llamada_longitud}.
	 * @param ctx the parse tree
	 */
	void enterLlamada_longitud(CubyParser.Llamada_longitudContext ctx);
	/**
	 * Exit a parse tree produced by {@link CubyParser#llamada_longitud}.
	 * @param ctx the parse tree
	 */
	void exitLlamada_longitud(CubyParser.Llamada_longitudContext ctx);
	/**
	 * Enter a parse tree produced by {@link CubyParser#llamada_invertir}.
	 * @param ctx the parse tree
	 */
	void enterLlamada_invertir(CubyParser.Llamada_invertirContext ctx);
	/**
	 * Exit a parse tree produced by {@link CubyParser#llamada_invertir}.
	 * @param ctx the parse tree
	 */
	void exitLlamada_invertir(CubyParser.Llamada_invertirContext ctx);
	/**
	 * Enter a parse tree produced by {@link CubyParser#llamada_esLetra}.
	 * @param ctx the parse tree
	 */
	void enterLlamada_esLetra(CubyParser.Llamada_esLetraContext ctx);
	/**
	 * Exit a parse tree produced by {@link CubyParser#llamada_esLetra}.
	 * @param ctx the parse tree
	 */
	void exitLlamada_esLetra(CubyParser.Llamada_esLetraContext ctx);
	/**
	 * Enter a parse tree produced by {@link CubyParser#llamada_esDigito}.
	 * @param ctx the parse tree
	 */
	void enterLlamada_esDigito(CubyParser.Llamada_esDigitoContext ctx);
	/**
	 * Exit a parse tree produced by {@link CubyParser#llamada_esDigito}.
	 * @param ctx the parse tree
	 */
	void exitLlamada_esDigito(CubyParser.Llamada_esDigitoContext ctx);
	/**
	 * Enter a parse tree produced by {@link CubyParser#funcion_principal}.
	 * @param ctx the parse tree
	 */
	void enterFuncion_principal(CubyParser.Funcion_principalContext ctx);
	/**
	 * Exit a parse tree produced by {@link CubyParser#funcion_principal}.
	 * @param ctx the parse tree
	 */
	void exitFuncion_principal(CubyParser.Funcion_principalContext ctx);
	/**
	 * Enter a parse tree produced by {@link CubyParser#programa}.
	 * @param ctx the parse tree
	 */
	void enterPrograma(CubyParser.ProgramaContext ctx);
	/**
	 * Exit a parse tree produced by {@link CubyParser#programa}.
	 * @param ctx the parse tree
	 */
	void exitPrograma(CubyParser.ProgramaContext ctx);
}