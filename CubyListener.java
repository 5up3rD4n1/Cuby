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
	 * Enter a parse tree produced by {@link CubyParser#operacion_aritmetica}.
	 * @param ctx the parse tree
	 */
	void enterOperacion_aritmetica(CubyParser.Operacion_aritmeticaContext ctx);
	/**
	 * Exit a parse tree produced by {@link CubyParser#operacion_aritmetica}.
	 * @param ctx the parse tree
	 */
	void exitOperacion_aritmetica(CubyParser.Operacion_aritmeticaContext ctx);
	/**
	 * Enter a parse tree produced by {@link CubyParser#operacion_unaria}.
	 * @param ctx the parse tree
	 */
	void enterOperacion_unaria(CubyParser.Operacion_unariaContext ctx);
	/**
	 * Exit a parse tree produced by {@link CubyParser#operacion_unaria}.
	 * @param ctx the parse tree
	 */
	void exitOperacion_unaria(CubyParser.Operacion_unariaContext ctx);
	/**
	 * Enter a parse tree produced by {@link CubyParser#operacion_logica}.
	 * @param ctx the parse tree
	 */
	void enterOperacion_logica(CubyParser.Operacion_logicaContext ctx);
	/**
	 * Exit a parse tree produced by {@link CubyParser#operacion_logica}.
	 * @param ctx the parse tree
	 */
	void exitOperacion_logica(CubyParser.Operacion_logicaContext ctx);
	/**
	 * Enter a parse tree produced by {@link CubyParser#operacion_relacional}.
	 * @param ctx the parse tree
	 */
	void enterOperacion_relacional(CubyParser.Operacion_relacionalContext ctx);
	/**
	 * Exit a parse tree produced by {@link CubyParser#operacion_relacional}.
	 * @param ctx the parse tree
	 */
	void exitOperacion_relacional(CubyParser.Operacion_relacionalContext ctx);
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
	 * Enter a parse tree produced by {@link CubyParser#funciones_predefinidas}.
	 * @param ctx the parse tree
	 */
	void enterFunciones_predefinidas(CubyParser.Funciones_predefinidasContext ctx);
	/**
	 * Exit a parse tree produced by {@link CubyParser#funciones_predefinidas}.
	 * @param ctx the parse tree
	 */
	void exitFunciones_predefinidas(CubyParser.Funciones_predefinidasContext ctx);
	/**
	 * Enter a parse tree produced by {@link CubyParser#funcion_por_usuario}.
	 * @param ctx the parse tree
	 */
	void enterFuncion_por_usuario(CubyParser.Funcion_por_usuarioContext ctx);
	/**
	 * Exit a parse tree produced by {@link CubyParser#funcion_por_usuario}.
	 * @param ctx the parse tree
	 */
	void exitFuncion_por_usuario(CubyParser.Funcion_por_usuarioContext ctx);
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
	 * Enter a parse tree produced by {@link CubyParser#definicion_identificador}.
	 * @param ctx the parse tree
	 */
	void enterDefinicion_identificador(CubyParser.Definicion_identificadorContext ctx);
	/**
	 * Exit a parse tree produced by {@link CubyParser#definicion_identificador}.
	 * @param ctx the parse tree
	 */
	void exitDefinicion_identificador(CubyParser.Definicion_identificadorContext ctx);
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
	 * Enter a parse tree produced by {@link CubyParser#asignacion_variable}.
	 * @param ctx the parse tree
	 */
	void enterAsignacion_variable(CubyParser.Asignacion_variableContext ctx);
	/**
	 * Exit a parse tree produced by {@link CubyParser#asignacion_variable}.
	 * @param ctx the parse tree
	 */
	void exitAsignacion_variable(CubyParser.Asignacion_variableContext ctx);
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
	 * Enter a parse tree produced by {@link CubyParser#dato}.
	 * @param ctx the parse tree
	 */
	void enterDato(CubyParser.DatoContext ctx);
	/**
	 * Exit a parse tree produced by {@link CubyParser#dato}.
	 * @param ctx the parse tree
	 */
	void exitDato(CubyParser.DatoContext ctx);
	/**
	 * Enter a parse tree produced by {@link CubyParser#sentencia}.
	 * @param ctx the parse tree
	 */
	void enterSentencia(CubyParser.SentenciaContext ctx);
	/**
	 * Exit a parse tree produced by {@link CubyParser#sentencia}.
	 * @param ctx the parse tree
	 */
	void exitSentencia(CubyParser.SentenciaContext ctx);
	/**
	 * Enter a parse tree produced by {@link CubyParser#sentencia_de_salto}.
	 * @param ctx the parse tree
	 */
	void enterSentencia_de_salto(CubyParser.Sentencia_de_saltoContext ctx);
	/**
	 * Exit a parse tree produced by {@link CubyParser#sentencia_de_salto}.
	 * @param ctx the parse tree
	 */
	void exitSentencia_de_salto(CubyParser.Sentencia_de_saltoContext ctx);
	/**
	 * Enter a parse tree produced by {@link CubyParser#sentencia_condicional}.
	 * @param ctx the parse tree
	 */
	void enterSentencia_condicional(CubyParser.Sentencia_condicionalContext ctx);
	/**
	 * Exit a parse tree produced by {@link CubyParser#sentencia_condicional}.
	 * @param ctx the parse tree
	 */
	void exitSentencia_condicional(CubyParser.Sentencia_condicionalContext ctx);
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
	 * Enter a parse tree produced by {@link CubyParser#sentencia_de_iteracion}.
	 * @param ctx the parse tree
	 */
	void enterSentencia_de_iteracion(CubyParser.Sentencia_de_iteracionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CubyParser#sentencia_de_iteracion}.
	 * @param ctx the parse tree
	 */
	void exitSentencia_de_iteracion(CubyParser.Sentencia_de_iteracionContext ctx);
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
	 * Enter a parse tree produced by {@link CubyParser#llamada_eat}.
	 * @param ctx the parse tree
	 */
	void enterLlamada_eat(CubyParser.Llamada_eatContext ctx);
	/**
	 * Exit a parse tree produced by {@link CubyParser#llamada_eat}.
	 * @param ctx the parse tree
	 */
	void exitLlamada_eat(CubyParser.Llamada_eatContext ctx);
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
	 * Enter a parse tree produced by {@link CubyParser#funciones}.
	 * @param ctx the parse tree
	 */
	void enterFunciones(CubyParser.FuncionesContext ctx);
	/**
	 * Exit a parse tree produced by {@link CubyParser#funciones}.
	 * @param ctx the parse tree
	 */
	void exitFunciones(CubyParser.FuncionesContext ctx);
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