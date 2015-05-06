// Generated from Cuby.g4 by ANTLR 4.5
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class CubyParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.5", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, COMA=3, DOSPUNTOS=4, PUNTO_COMA=5, PUNTO=6, DOBLEPUNTO=7, 
		DELIMITADOR_BLOQUE=8, OP_NEGACION=9, OP_AND=10, OP_OR=11, OP_IGUALQUE=12, 
		OP_DIFERENTEQUE=13, OP_MAYORQUE=14, OP_MENORQUE=15, OP_MENOROIGUAL=16, 
		OP_MAYOROIGUAL=17, OP_NEGATIVO=18, OP_MULTIPLICACION=19, OP_DIVISION=20, 
		OP_MOD=21, OP_SUMA=22, OP_RESTA=23, OP_DECREMENTAR=24, OP_INCREMENTAR=25, 
		OP_ASIGNACION=26, OP_ASIGNAR_RESTA=27, OP_ASIGNAR_SUMA=28, OP_ASIGNAR_MULTIPLICACION=29, 
		OP_ASIGNAR_DIVISION=30, OP_ASIGNAR_MODULO=31, FUNC_IMPRIMIR=32, FUNC_PRINCIPAL=33, 
		FUNC_A_MAYUSCULA=34, FUNC_A_MINUSCULA=35, FUNC_CARACTER_A_ENTERO=36, FUNC_ENTERO_A_CARACTER=37, 
		FUNC_ENTERO_A_TEXTO=38, FUNC_TEXTO_A_ENTERO=39, FUNC_LONGITUD_TEXTO=40, 
		FUNC_INVERTIR_TEXTO=41, FUNC_ES_LETRA=42, FUNC_ES_DIGITO=43, PARA=44, 
		REPITA=45, MIENTRAS=46, SI=47, SII=48, SINO=49, DEF=50, SALIR=51, RET=52, 
		CASO=53, CUANDO=54, SEGUIR=55, VECES=56, HASTA=57, TIPO_ENTERO=58, TIPO_CARACTER=59, 
		TIPO_TEXTO=60, TIPO_BOOLEANO=61, ENTERO=62, BOOLEANO=63, IDENTIFICADOR=64, 
		COMENTARIO=65, ESPACIOS_BLANCO=66, CARACTER=67, TEXTO=68;
	public static final int
		RULE_expresion = 0, RULE_elemento = 1, RULE_literal = 2, RULE_llamada_funcion = 3, 
		RULE_entradas = 4, RULE_entrada = 5, RULE_declarar_identificador = 6, 
		RULE_declaracion_variable = 7, RULE_proposicion = 8, RULE_tipo_dato = 9, 
		RULE_resultado = 10, RULE_condicional = 11, RULE_parametros = 12, RULE_parametro = 13, 
		RULE_expresion_actualizacion = 14, RULE_estructura_repeticion = 15, RULE_bloque = 16, 
		RULE_definir_funcion = 17, RULE_llamada_imprimir = 18, RULE_llamada_amay = 19, 
		RULE_llamada_amin = 20, RULE_llamada_cae = 21, RULE_llamada_eac = 22, 
		RULE_llamada_tae = 23, RULE_llamada_longitud = 24, RULE_llamada_invertir = 25, 
		RULE_llamada_esLetra = 26, RULE_llamada_esDigito = 27, RULE_funcion_principal = 28, 
		RULE_programa = 29;
	public static final String[] ruleNames = {
		"expresion", "elemento", "literal", "llamada_funcion", "entradas", "entrada", 
		"declarar_identificador", "declaracion_variable", "proposicion", "tipo_dato", 
		"resultado", "condicional", "parametros", "parametro", "expresion_actualizacion", 
		"estructura_repeticion", "bloque", "definir_funcion", "llamada_imprimir", 
		"llamada_amay", "llamada_amin", "llamada_cae", "llamada_eac", "llamada_tae", 
		"llamada_longitud", "llamada_invertir", "llamada_esLetra", "llamada_esDigito", 
		"funcion_principal", "programa"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'('", "')'", "','", "':'", "';'", "'.'", "'..'", "'|'", "'~'", 
		"'%%'", "'$$'", "'=='", "'!='", "'>'", "'<'", "'<='", "'>='", null, "'*'", 
		"'/'", "'%'", "'+'", null, "'--'", "'++'", "'='", "'-='", "'+='", "'*='", 
		"'/='", "'%='", "'escribir'", "'principal'", "'aMay'", "'aMin'", "'cae'", 
		"'eac'", "'eat'", "'tae'", "'longitud'", "'invertir'", "'esLetra?'", "'esDigito?'", 
		"'para'", "'repita'", "'mientras'", "'si'", "'sii'", "'sino'", "'def'", 
		"'salir'", "'ret'", "'caso'", "'cuando'", "'seguir'", "'veces'", "'hasta'", 
		"'entero'", "'caracter'", "'texto'", "'booleano'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, "COMA", "DOSPUNTOS", "PUNTO_COMA", "PUNTO", "DOBLEPUNTO", 
		"DELIMITADOR_BLOQUE", "OP_NEGACION", "OP_AND", "OP_OR", "OP_IGUALQUE", 
		"OP_DIFERENTEQUE", "OP_MAYORQUE", "OP_MENORQUE", "OP_MENOROIGUAL", "OP_MAYOROIGUAL", 
		"OP_NEGATIVO", "OP_MULTIPLICACION", "OP_DIVISION", "OP_MOD", "OP_SUMA", 
		"OP_RESTA", "OP_DECREMENTAR", "OP_INCREMENTAR", "OP_ASIGNACION", "OP_ASIGNAR_RESTA", 
		"OP_ASIGNAR_SUMA", "OP_ASIGNAR_MULTIPLICACION", "OP_ASIGNAR_DIVISION", 
		"OP_ASIGNAR_MODULO", "FUNC_IMPRIMIR", "FUNC_PRINCIPAL", "FUNC_A_MAYUSCULA", 
		"FUNC_A_MINUSCULA", "FUNC_CARACTER_A_ENTERO", "FUNC_ENTERO_A_CARACTER", 
		"FUNC_ENTERO_A_TEXTO", "FUNC_TEXTO_A_ENTERO", "FUNC_LONGITUD_TEXTO", "FUNC_INVERTIR_TEXTO", 
		"FUNC_ES_LETRA", "FUNC_ES_DIGITO", "PARA", "REPITA", "MIENTRAS", "SI", 
		"SII", "SINO", "DEF", "SALIR", "RET", "CASO", "CUANDO", "SEGUIR", "VECES", 
		"HASTA", "TIPO_ENTERO", "TIPO_CARACTER", "TIPO_TEXTO", "TIPO_BOOLEANO", 
		"ENTERO", "BOOLEANO", "IDENTIFICADOR", "COMENTARIO", "ESPACIOS_BLANCO", 
		"CARACTER", "TEXTO"
	};
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "Cuby.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public CubyParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ExpresionContext extends ParserRuleContext {
		public TerminalNode OP_NEGACION() { return getToken(CubyParser.OP_NEGACION, 0); }
		public List<ExpresionContext> expresion() {
			return getRuleContexts(ExpresionContext.class);
		}
		public ExpresionContext expresion(int i) {
			return getRuleContext(ExpresionContext.class,i);
		}
		public ElementoContext elemento() {
			return getRuleContext(ElementoContext.class,0);
		}
		public TerminalNode OP_MULTIPLICACION() { return getToken(CubyParser.OP_MULTIPLICACION, 0); }
		public TerminalNode OP_DIVISION() { return getToken(CubyParser.OP_DIVISION, 0); }
		public TerminalNode OP_SUMA() { return getToken(CubyParser.OP_SUMA, 0); }
		public TerminalNode OP_RESTA() { return getToken(CubyParser.OP_RESTA, 0); }
		public TerminalNode OP_MAYORQUE() { return getToken(CubyParser.OP_MAYORQUE, 0); }
		public TerminalNode OP_MENORQUE() { return getToken(CubyParser.OP_MENORQUE, 0); }
		public TerminalNode OP_MAYOROIGUAL() { return getToken(CubyParser.OP_MAYOROIGUAL, 0); }
		public TerminalNode OP_MENOROIGUAL() { return getToken(CubyParser.OP_MENOROIGUAL, 0); }
		public TerminalNode OP_IGUALQUE() { return getToken(CubyParser.OP_IGUALQUE, 0); }
		public TerminalNode OP_DIFERENTEQUE() { return getToken(CubyParser.OP_DIFERENTEQUE, 0); }
		public TerminalNode OP_AND() { return getToken(CubyParser.OP_AND, 0); }
		public TerminalNode OP_OR() { return getToken(CubyParser.OP_OR, 0); }
		public ExpresionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expresion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CubyListener ) ((CubyListener)listener).enterExpresion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CubyListener ) ((CubyListener)listener).exitExpresion(this);
		}
	}

	public final ExpresionContext expresion() throws RecognitionException {
		return expresion(0);
	}

	private ExpresionContext expresion(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpresionContext _localctx = new ExpresionContext(_ctx, _parentState);
		ExpresionContext _prevctx = _localctx;
		int _startState = 0;
		enterRecursionRule(_localctx, 0, RULE_expresion, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(66);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				{
				setState(61);
				match(OP_NEGACION);
				setState(62);
				expresion(7);
				}
				break;
			case 2:
				{
				setState(63);
				match(OP_NEGACION);
				setState(64);
				expresion(3);
				}
				break;
			case 3:
				{
				setState(65);
				elemento();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(85);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(83);
					switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
					case 1:
						{
						_localctx = new ExpresionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expresion);
						setState(68);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(69);
						_la = _input.LA(1);
						if ( !(_la==OP_MULTIPLICACION || _la==OP_DIVISION) ) {
						_errHandler.recoverInline(this);
						} else {
							consume();
						}
						setState(70);
						expresion(7);
						}
						break;
					case 2:
						{
						_localctx = new ExpresionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expresion);
						setState(71);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(72);
						_la = _input.LA(1);
						if ( !(_la==OP_SUMA || _la==OP_RESTA) ) {
						_errHandler.recoverInline(this);
						} else {
							consume();
						}
						setState(73);
						expresion(6);
						}
						break;
					case 3:
						{
						_localctx = new ExpresionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expresion);
						setState(74);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(75);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OP_IGUALQUE) | (1L << OP_DIFERENTEQUE) | (1L << OP_MAYORQUE) | (1L << OP_MENORQUE) | (1L << OP_MENOROIGUAL) | (1L << OP_MAYOROIGUAL))) != 0)) ) {
						_errHandler.recoverInline(this);
						} else {
							consume();
						}
						setState(76);
						expresion(5);
						}
						break;
					case 4:
						{
						_localctx = new ExpresionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expresion);
						setState(77);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(78);
						match(OP_AND);
						setState(79);
						expresion(3);
						}
						break;
					case 5:
						{
						_localctx = new ExpresionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expresion);
						setState(80);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(81);
						match(OP_OR);
						setState(82);
						expresion(2);
						}
						break;
					}
					} 
				}
				setState(87);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class ElementoContext extends ParserRuleContext {
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public Llamada_funcionContext llamada_funcion() {
			return getRuleContext(Llamada_funcionContext.class,0);
		}
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public ElementoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elemento; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CubyListener ) ((CubyListener)listener).enterElemento(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CubyListener ) ((CubyListener)listener).exitElemento(this);
		}
	}

	public final ElementoContext elemento() throws RecognitionException {
		ElementoContext _localctx = new ElementoContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_elemento);
		try {
			setState(94);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(88);
				match(T__0);
				setState(89);
				expresion(0);
				setState(90);
				match(T__1);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(92);
				llamada_funcion();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(93);
				literal();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LiteralContext extends ParserRuleContext {
		public TerminalNode ENTERO() { return getToken(CubyParser.ENTERO, 0); }
		public TerminalNode CARACTER() { return getToken(CubyParser.CARACTER, 0); }
		public TerminalNode TEXTO() { return getToken(CubyParser.TEXTO, 0); }
		public TerminalNode IDENTIFICADOR() { return getToken(CubyParser.IDENTIFICADOR, 0); }
		public LiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CubyListener ) ((CubyListener)listener).enterLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CubyListener ) ((CubyListener)listener).exitLiteral(this);
		}
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(96);
			_la = _input.LA(1);
			if ( !(((((_la - 62)) & ~0x3f) == 0 && ((1L << (_la - 62)) & ((1L << (ENTERO - 62)) | (1L << (IDENTIFICADOR - 62)) | (1L << (CARACTER - 62)) | (1L << (TEXTO - 62)))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Llamada_funcionContext extends ParserRuleContext {
		public TerminalNode IDENTIFICADOR() { return getToken(CubyParser.IDENTIFICADOR, 0); }
		public EntradasContext entradas() {
			return getRuleContext(EntradasContext.class,0);
		}
		public Llamada_funcionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_llamada_funcion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CubyListener ) ((CubyListener)listener).enterLlamada_funcion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CubyListener ) ((CubyListener)listener).exitLlamada_funcion(this);
		}
	}

	public final Llamada_funcionContext llamada_funcion() throws RecognitionException {
		Llamada_funcionContext _localctx = new Llamada_funcionContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_llamada_funcion);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(98);
			match(IDENTIFICADOR);
			setState(99);
			match(T__0);
			setState(101);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << OP_NEGACION) | (1L << ENTERO))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (IDENTIFICADOR - 64)) | (1L << (CARACTER - 64)) | (1L << (TEXTO - 64)))) != 0)) {
				{
				setState(100);
				entradas();
				}
			}

			setState(103);
			match(T__1);
			setState(105);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				{
				setState(104);
				match(PUNTO_COMA);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EntradasContext extends ParserRuleContext {
		public List<EntradaContext> entrada() {
			return getRuleContexts(EntradaContext.class);
		}
		public EntradaContext entrada(int i) {
			return getRuleContext(EntradaContext.class,i);
		}
		public EntradasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_entradas; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CubyListener ) ((CubyListener)listener).enterEntradas(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CubyListener ) ((CubyListener)listener).exitEntradas(this);
		}
	}

	public final EntradasContext entradas() throws RecognitionException {
		EntradasContext _localctx = new EntradasContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_entradas);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(107);
			entrada();
			setState(112);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMA) {
				{
				{
				setState(108);
				match(COMA);
				setState(109);
				entrada();
				}
				}
				setState(114);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EntradaContext extends ParserRuleContext {
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public EntradaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_entrada; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CubyListener ) ((CubyListener)listener).enterEntrada(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CubyListener ) ((CubyListener)listener).exitEntrada(this);
		}
	}

	public final EntradaContext entrada() throws RecognitionException {
		EntradaContext _localctx = new EntradaContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_entrada);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(115);
			expresion(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Declarar_identificadorContext extends ParserRuleContext {
		public Tipo_datoContext tipo_dato() {
			return getRuleContext(Tipo_datoContext.class,0);
		}
		public TerminalNode IDENTIFICADOR() { return getToken(CubyParser.IDENTIFICADOR, 0); }
		public Declarar_identificadorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declarar_identificador; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CubyListener ) ((CubyListener)listener).enterDeclarar_identificador(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CubyListener ) ((CubyListener)listener).exitDeclarar_identificador(this);
		}
	}

	public final Declarar_identificadorContext declarar_identificador() throws RecognitionException {
		Declarar_identificadorContext _localctx = new Declarar_identificadorContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_declarar_identificador);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(117);
			tipo_dato();
			setState(118);
			match(IDENTIFICADOR);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Declaracion_variableContext extends ParserRuleContext {
		public Declarar_identificadorContext declarar_identificador() {
			return getRuleContext(Declarar_identificadorContext.class,0);
		}
		public TerminalNode OP_ASIGNACION() { return getToken(CubyParser.OP_ASIGNACION, 0); }
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public Declaracion_variableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaracion_variable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CubyListener ) ((CubyListener)listener).enterDeclaracion_variable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CubyListener ) ((CubyListener)listener).exitDeclaracion_variable(this);
		}
	}

	public final Declaracion_variableContext declaracion_variable() throws RecognitionException {
		Declaracion_variableContext _localctx = new Declaracion_variableContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_declaracion_variable);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(120);
			declarar_identificador();
			setState(121);
			match(OP_ASIGNACION);
			setState(122);
			expresion(0);
			setState(123);
			match(PUNTO_COMA);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ProposicionContext extends ParserRuleContext {
		public Declaracion_variableContext declaracion_variable() {
			return getRuleContext(Declaracion_variableContext.class,0);
		}
		public CondicionalContext condicional() {
			return getRuleContext(CondicionalContext.class,0);
		}
		public Llamada_imprimirContext llamada_imprimir() {
			return getRuleContext(Llamada_imprimirContext.class,0);
		}
		public Llamada_amayContext llamada_amay() {
			return getRuleContext(Llamada_amayContext.class,0);
		}
		public Llamada_caeContext llamada_cae() {
			return getRuleContext(Llamada_caeContext.class,0);
		}
		public Llamada_eacContext llamada_eac() {
			return getRuleContext(Llamada_eacContext.class,0);
		}
		public Llamada_taeContext llamada_tae() {
			return getRuleContext(Llamada_taeContext.class,0);
		}
		public Llamada_longitudContext llamada_longitud() {
			return getRuleContext(Llamada_longitudContext.class,0);
		}
		public Llamada_invertirContext llamada_invertir() {
			return getRuleContext(Llamada_invertirContext.class,0);
		}
		public Llamada_esDigitoContext llamada_esDigito() {
			return getRuleContext(Llamada_esDigitoContext.class,0);
		}
		public Llamada_aminContext llamada_amin() {
			return getRuleContext(Llamada_aminContext.class,0);
		}
		public ResultadoContext resultado() {
			return getRuleContext(ResultadoContext.class,0);
		}
		public ProposicionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_proposicion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CubyListener ) ((CubyListener)listener).enterProposicion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CubyListener ) ((CubyListener)listener).exitProposicion(this);
		}
	}

	public final ProposicionContext proposicion() throws RecognitionException {
		ProposicionContext _localctx = new ProposicionContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_proposicion);
		try {
			setState(137);
			switch (_input.LA(1)) {
			case TIPO_ENTERO:
			case TIPO_CARACTER:
			case TIPO_TEXTO:
			case TIPO_BOOLEANO:
				enterOuterAlt(_localctx, 1);
				{
				setState(125);
				declaracion_variable();
				}
				break;
			case SI:
			case CASO:
				enterOuterAlt(_localctx, 2);
				{
				setState(126);
				condicional();
				}
				break;
			case FUNC_IMPRIMIR:
				enterOuterAlt(_localctx, 3);
				{
				setState(127);
				llamada_imprimir();
				}
				break;
			case FUNC_A_MAYUSCULA:
				enterOuterAlt(_localctx, 4);
				{
				setState(128);
				llamada_amay();
				}
				break;
			case FUNC_CARACTER_A_ENTERO:
				enterOuterAlt(_localctx, 5);
				{
				setState(129);
				llamada_cae();
				}
				break;
			case FUNC_ENTERO_A_CARACTER:
				enterOuterAlt(_localctx, 6);
				{
				setState(130);
				llamada_eac();
				}
				break;
			case FUNC_TEXTO_A_ENTERO:
				enterOuterAlt(_localctx, 7);
				{
				setState(131);
				llamada_tae();
				}
				break;
			case FUNC_LONGITUD_TEXTO:
				enterOuterAlt(_localctx, 8);
				{
				setState(132);
				llamada_longitud();
				}
				break;
			case FUNC_INVERTIR_TEXTO:
				enterOuterAlt(_localctx, 9);
				{
				setState(133);
				llamada_invertir();
				}
				break;
			case FUNC_ES_DIGITO:
				enterOuterAlt(_localctx, 10);
				{
				setState(134);
				llamada_esDigito();
				}
				break;
			case FUNC_A_MINUSCULA:
				enterOuterAlt(_localctx, 11);
				{
				setState(135);
				llamada_amin();
				}
				break;
			case RET:
				enterOuterAlt(_localctx, 12);
				{
				setState(136);
				resultado();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Tipo_datoContext extends ParserRuleContext {
		public TerminalNode TIPO_ENTERO() { return getToken(CubyParser.TIPO_ENTERO, 0); }
		public TerminalNode TIPO_CARACTER() { return getToken(CubyParser.TIPO_CARACTER, 0); }
		public TerminalNode TIPO_TEXTO() { return getToken(CubyParser.TIPO_TEXTO, 0); }
		public TerminalNode TIPO_BOOLEANO() { return getToken(CubyParser.TIPO_BOOLEANO, 0); }
		public Tipo_datoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tipo_dato; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CubyListener ) ((CubyListener)listener).enterTipo_dato(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CubyListener ) ((CubyListener)listener).exitTipo_dato(this);
		}
	}

	public final Tipo_datoContext tipo_dato() throws RecognitionException {
		Tipo_datoContext _localctx = new Tipo_datoContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_tipo_dato);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(139);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TIPO_ENTERO) | (1L << TIPO_CARACTER) | (1L << TIPO_TEXTO) | (1L << TIPO_BOOLEANO))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ResultadoContext extends ParserRuleContext {
		public TerminalNode RET() { return getToken(CubyParser.RET, 0); }
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public ResultadoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_resultado; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CubyListener ) ((CubyListener)listener).enterResultado(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CubyListener ) ((CubyListener)listener).exitResultado(this);
		}
	}

	public final ResultadoContext resultado() throws RecognitionException {
		ResultadoContext _localctx = new ResultadoContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_resultado);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(141);
			match(RET);
			setState(142);
			expresion(0);
			setState(143);
			match(PUNTO_COMA);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CondicionalContext extends ParserRuleContext {
		public TerminalNode SI() { return getToken(CubyParser.SI, 0); }
		public List<ExpresionContext> expresion() {
			return getRuleContexts(ExpresionContext.class);
		}
		public ExpresionContext expresion(int i) {
			return getRuleContext(ExpresionContext.class,i);
		}
		public List<BloqueContext> bloque() {
			return getRuleContexts(BloqueContext.class);
		}
		public BloqueContext bloque(int i) {
			return getRuleContext(BloqueContext.class,i);
		}
		public List<TerminalNode> SII() { return getTokens(CubyParser.SII); }
		public TerminalNode SII(int i) {
			return getToken(CubyParser.SII, i);
		}
		public TerminalNode SINO() { return getToken(CubyParser.SINO, 0); }
		public TerminalNode CASO() { return getToken(CubyParser.CASO, 0); }
		public TerminalNode IDENTIFICADOR() { return getToken(CubyParser.IDENTIFICADOR, 0); }
		public List<TerminalNode> CUANDO() { return getTokens(CubyParser.CUANDO); }
		public TerminalNode CUANDO(int i) {
			return getToken(CubyParser.CUANDO, i);
		}
		public List<TerminalNode> ENTERO() { return getTokens(CubyParser.ENTERO); }
		public TerminalNode ENTERO(int i) {
			return getToken(CubyParser.ENTERO, i);
		}
		public List<TerminalNode> CARACTER() { return getTokens(CubyParser.CARACTER); }
		public TerminalNode CARACTER(int i) {
			return getToken(CubyParser.CARACTER, i);
		}
		public List<TerminalNode> TEXTO() { return getTokens(CubyParser.TEXTO); }
		public TerminalNode TEXTO(int i) {
			return getToken(CubyParser.TEXTO, i);
		}
		public List<TerminalNode> BOOLEANO() { return getTokens(CubyParser.BOOLEANO); }
		public TerminalNode BOOLEANO(int i) {
			return getToken(CubyParser.BOOLEANO, i);
		}
		public CondicionalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condicional; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CubyListener ) ((CubyListener)listener).enterCondicional(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CubyListener ) ((CubyListener)listener).exitCondicional(this);
		}
	}

	public final CondicionalContext condicional() throws RecognitionException {
		CondicionalContext _localctx = new CondicionalContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_condicional);
		int _la;
		try {
			int _alt;
			setState(179);
			switch (_input.LA(1)) {
			case SI:
				enterOuterAlt(_localctx, 1);
				{
				setState(145);
				match(SI);
				setState(146);
				match(T__0);
				setState(147);
				expresion(0);
				setState(148);
				match(T__1);
				setState(149);
				bloque();
				setState(158);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
				while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1+1 ) {
						{
						{
						setState(150);
						match(SII);
						setState(151);
						match(T__0);
						setState(152);
						expresion(0);
						setState(153);
						match(T__1);
						setState(154);
						bloque();
						}
						} 
					}
					setState(160);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
				}
				setState(163);
				_la = _input.LA(1);
				if (_la==SINO) {
					{
					setState(161);
					match(SINO);
					setState(162);
					bloque();
					}
				}

				}
				break;
			case CASO:
				enterOuterAlt(_localctx, 2);
				{
				setState(165);
				match(CASO);
				setState(166);
				match(IDENTIFICADOR);
				setState(167);
				match(DOSPUNTOS);
				setState(171); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(168);
					match(CUANDO);
					setState(169);
					_la = _input.LA(1);
					if ( !(((((_la - 62)) & ~0x3f) == 0 && ((1L << (_la - 62)) & ((1L << (ENTERO - 62)) | (1L << (BOOLEANO - 62)) | (1L << (CARACTER - 62)) | (1L << (TEXTO - 62)))) != 0)) ) {
					_errHandler.recoverInline(this);
					} else {
						consume();
					}
					setState(170);
					bloque();
					}
					}
					setState(173); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==CUANDO );
				setState(177);
				_la = _input.LA(1);
				if (_la==SINO) {
					{
					setState(175);
					match(SINO);
					setState(176);
					bloque();
					}
				}

				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParametrosContext extends ParserRuleContext {
		public List<ParametroContext> parametro() {
			return getRuleContexts(ParametroContext.class);
		}
		public ParametroContext parametro(int i) {
			return getRuleContext(ParametroContext.class,i);
		}
		public List<TerminalNode> COMA() { return getTokens(CubyParser.COMA); }
		public TerminalNode COMA(int i) {
			return getToken(CubyParser.COMA, i);
		}
		public ParametrosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parametros; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CubyListener ) ((CubyListener)listener).enterParametros(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CubyListener ) ((CubyListener)listener).exitParametros(this);
		}
	}

	public final ParametrosContext parametros() throws RecognitionException {
		ParametrosContext _localctx = new ParametrosContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_parametros);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(181);
			parametro();
			setState(186);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMA) {
				{
				{
				setState(182);
				match(COMA);
				setState(183);
				parametro();
				}
				}
				setState(188);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParametroContext extends ParserRuleContext {
		public Declarar_identificadorContext declarar_identificador() {
			return getRuleContext(Declarar_identificadorContext.class,0);
		}
		public ParametroContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parametro; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CubyListener ) ((CubyListener)listener).enterParametro(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CubyListener ) ((CubyListener)listener).exitParametro(this);
		}
	}

	public final ParametroContext parametro() throws RecognitionException {
		ParametroContext _localctx = new ParametroContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_parametro);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(189);
			declarar_identificador();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Expresion_actualizacionContext extends ParserRuleContext {
		public TerminalNode IDENTIFICADOR() { return getToken(CubyParser.IDENTIFICADOR, 0); }
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public TerminalNode OP_ASIGNACION() { return getToken(CubyParser.OP_ASIGNACION, 0); }
		public TerminalNode OP_ASIGNAR_SUMA() { return getToken(CubyParser.OP_ASIGNAR_SUMA, 0); }
		public TerminalNode OP_ASIGNAR_RESTA() { return getToken(CubyParser.OP_ASIGNAR_RESTA, 0); }
		public TerminalNode OP_ASIGNAR_MULTIPLICACION() { return getToken(CubyParser.OP_ASIGNAR_MULTIPLICACION, 0); }
		public TerminalNode OP_ASIGNAR_DIVISION() { return getToken(CubyParser.OP_ASIGNAR_DIVISION, 0); }
		public TerminalNode OP_ASIGNAR_MODULO() { return getToken(CubyParser.OP_ASIGNAR_MODULO, 0); }
		public TerminalNode OP_INCREMENTAR() { return getToken(CubyParser.OP_INCREMENTAR, 0); }
		public TerminalNode OP_DECREMENTAR() { return getToken(CubyParser.OP_DECREMENTAR, 0); }
		public Expresion_actualizacionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expresion_actualizacion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CubyListener ) ((CubyListener)listener).enterExpresion_actualizacion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CubyListener ) ((CubyListener)listener).exitExpresion_actualizacion(this);
		}
	}

	public final Expresion_actualizacionContext expresion_actualizacion() throws RecognitionException {
		Expresion_actualizacionContext _localctx = new Expresion_actualizacionContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_expresion_actualizacion);
		int _la;
		try {
			setState(196);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(191);
				match(IDENTIFICADOR);
				setState(192);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OP_ASIGNACION) | (1L << OP_ASIGNAR_RESTA) | (1L << OP_ASIGNAR_SUMA) | (1L << OP_ASIGNAR_MULTIPLICACION) | (1L << OP_ASIGNAR_DIVISION) | (1L << OP_ASIGNAR_MODULO))) != 0)) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(193);
				expresion(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(194);
				match(IDENTIFICADOR);
				setState(195);
				_la = _input.LA(1);
				if ( !(_la==OP_DECREMENTAR || _la==OP_INCREMENTAR) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Estructura_repeticionContext extends ParserRuleContext {
		public TerminalNode PARA() { return getToken(CubyParser.PARA, 0); }
		public Declaracion_variableContext declaracion_variable() {
			return getRuleContext(Declaracion_variableContext.class,0);
		}
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public Expresion_actualizacionContext expresion_actualizacion() {
			return getRuleContext(Expresion_actualizacionContext.class,0);
		}
		public BloqueContext bloque() {
			return getRuleContext(BloqueContext.class,0);
		}
		public TerminalNode MIENTRAS() { return getToken(CubyParser.MIENTRAS, 0); }
		public TerminalNode REPITA() { return getToken(CubyParser.REPITA, 0); }
		public TerminalNode HASTA() { return getToken(CubyParser.HASTA, 0); }
		public TerminalNode PUNTO() { return getToken(CubyParser.PUNTO, 0); }
		public TerminalNode VECES() { return getToken(CubyParser.VECES, 0); }
		public TerminalNode ENTERO() { return getToken(CubyParser.ENTERO, 0); }
		public TerminalNode IDENTIFICADOR() { return getToken(CubyParser.IDENTIFICADOR, 0); }
		public Estructura_repeticionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_estructura_repeticion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CubyListener ) ((CubyListener)listener).enterEstructura_repeticion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CubyListener ) ((CubyListener)listener).exitEstructura_repeticion(this);
		}
	}

	public final Estructura_repeticionContext estructura_repeticion() throws RecognitionException {
		Estructura_repeticionContext _localctx = new Estructura_repeticionContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_estructura_repeticion);
		int _la;
		try {
			setState(224);
			switch (_input.LA(1)) {
			case PARA:
				enterOuterAlt(_localctx, 1);
				{
				setState(198);
				match(PARA);
				setState(199);
				match(T__0);
				setState(200);
				declaracion_variable();
				setState(201);
				expresion(0);
				setState(202);
				match(PUNTO_COMA);
				setState(203);
				expresion_actualizacion();
				setState(204);
				match(T__1);
				setState(205);
				bloque();
				}
				break;
			case MIENTRAS:
				enterOuterAlt(_localctx, 2);
				{
				setState(207);
				match(MIENTRAS);
				setState(208);
				match(T__0);
				setState(209);
				expresion(0);
				setState(210);
				match(T__1);
				setState(211);
				bloque();
				}
				break;
			case REPITA:
				enterOuterAlt(_localctx, 3);
				{
				setState(213);
				match(REPITA);
				setState(214);
				bloque();
				setState(215);
				match(HASTA);
				setState(216);
				match(T__0);
				setState(217);
				expresion(0);
				setState(218);
				match(T__1);
				}
				break;
			case ENTERO:
			case IDENTIFICADOR:
				enterOuterAlt(_localctx, 4);
				{
				setState(220);
				_la = _input.LA(1);
				if ( !(_la==ENTERO || _la==IDENTIFICADOR) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(221);
				match(PUNTO);
				setState(222);
				match(VECES);
				setState(223);
				bloque();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BloqueContext extends ParserRuleContext {
		public List<TerminalNode> DELIMITADOR_BLOQUE() { return getTokens(CubyParser.DELIMITADOR_BLOQUE); }
		public TerminalNode DELIMITADOR_BLOQUE(int i) {
			return getToken(CubyParser.DELIMITADOR_BLOQUE, i);
		}
		public List<ProposicionContext> proposicion() {
			return getRuleContexts(ProposicionContext.class);
		}
		public ProposicionContext proposicion(int i) {
			return getRuleContext(ProposicionContext.class,i);
		}
		public TerminalNode SALIR() { return getToken(CubyParser.SALIR, 0); }
		public TerminalNode SEGUIR() { return getToken(CubyParser.SEGUIR, 0); }
		public BloqueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bloque; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CubyListener ) ((CubyListener)listener).enterBloque(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CubyListener ) ((CubyListener)listener).exitBloque(this);
		}
	}

	public final BloqueContext bloque() throws RecognitionException {
		BloqueContext _localctx = new BloqueContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_bloque);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(226);
			match(DELIMITADOR_BLOQUE);
			setState(230);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << FUNC_IMPRIMIR) | (1L << FUNC_A_MAYUSCULA) | (1L << FUNC_A_MINUSCULA) | (1L << FUNC_CARACTER_A_ENTERO) | (1L << FUNC_ENTERO_A_CARACTER) | (1L << FUNC_TEXTO_A_ENTERO) | (1L << FUNC_LONGITUD_TEXTO) | (1L << FUNC_INVERTIR_TEXTO) | (1L << FUNC_ES_DIGITO) | (1L << SI) | (1L << RET) | (1L << CASO) | (1L << TIPO_ENTERO) | (1L << TIPO_CARACTER) | (1L << TIPO_TEXTO) | (1L << TIPO_BOOLEANO))) != 0)) {
				{
				{
				setState(227);
				proposicion();
				}
				}
				setState(232);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(234);
			_la = _input.LA(1);
			if (_la==SALIR) {
				{
				setState(233);
				match(SALIR);
				}
			}

			setState(237);
			_la = _input.LA(1);
			if (_la==SEGUIR) {
				{
				setState(236);
				match(SEGUIR);
				}
			}

			setState(239);
			match(DELIMITADOR_BLOQUE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Definir_funcionContext extends ParserRuleContext {
		public TerminalNode DEF() { return getToken(CubyParser.DEF, 0); }
		public Declarar_identificadorContext declarar_identificador() {
			return getRuleContext(Declarar_identificadorContext.class,0);
		}
		public BloqueContext bloque() {
			return getRuleContext(BloqueContext.class,0);
		}
		public ParametrosContext parametros() {
			return getRuleContext(ParametrosContext.class,0);
		}
		public Definir_funcionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_definir_funcion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CubyListener ) ((CubyListener)listener).enterDefinir_funcion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CubyListener ) ((CubyListener)listener).exitDefinir_funcion(this);
		}
	}

	public final Definir_funcionContext definir_funcion() throws RecognitionException {
		Definir_funcionContext _localctx = new Definir_funcionContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_definir_funcion);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(241);
			match(DEF);
			setState(242);
			declarar_identificador();
			setState(243);
			match(T__0);
			setState(245);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TIPO_ENTERO) | (1L << TIPO_CARACTER) | (1L << TIPO_TEXTO) | (1L << TIPO_BOOLEANO))) != 0)) {
				{
				setState(244);
				parametros();
				}
			}

			setState(247);
			match(T__1);
			setState(248);
			bloque();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Llamada_imprimirContext extends ParserRuleContext {
		public TerminalNode FUNC_IMPRIMIR() { return getToken(CubyParser.FUNC_IMPRIMIR, 0); }
		public TerminalNode ENTERO() { return getToken(CubyParser.ENTERO, 0); }
		public TerminalNode CARACTER() { return getToken(CubyParser.CARACTER, 0); }
		public TerminalNode TEXTO() { return getToken(CubyParser.TEXTO, 0); }
		public TerminalNode BOOLEANO() { return getToken(CubyParser.BOOLEANO, 0); }
		public Llamada_imprimirContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_llamada_imprimir; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CubyListener ) ((CubyListener)listener).enterLlamada_imprimir(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CubyListener ) ((CubyListener)listener).exitLlamada_imprimir(this);
		}
	}

	public final Llamada_imprimirContext llamada_imprimir() throws RecognitionException {
		Llamada_imprimirContext _localctx = new Llamada_imprimirContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_llamada_imprimir);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(250);
			match(FUNC_IMPRIMIR);
			setState(251);
			match(T__0);
			setState(252);
			_la = _input.LA(1);
			if ( !(((((_la - 62)) & ~0x3f) == 0 && ((1L << (_la - 62)) & ((1L << (ENTERO - 62)) | (1L << (BOOLEANO - 62)) | (1L << (CARACTER - 62)) | (1L << (TEXTO - 62)))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			setState(253);
			match(T__1);
			setState(254);
			match(PUNTO_COMA);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Llamada_amayContext extends ParserRuleContext {
		public TerminalNode FUNC_A_MAYUSCULA() { return getToken(CubyParser.FUNC_A_MAYUSCULA, 0); }
		public TerminalNode TEXTO() { return getToken(CubyParser.TEXTO, 0); }
		public TerminalNode CARACTER() { return getToken(CubyParser.CARACTER, 0); }
		public Llamada_amayContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_llamada_amay; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CubyListener ) ((CubyListener)listener).enterLlamada_amay(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CubyListener ) ((CubyListener)listener).exitLlamada_amay(this);
		}
	}

	public final Llamada_amayContext llamada_amay() throws RecognitionException {
		Llamada_amayContext _localctx = new Llamada_amayContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_llamada_amay);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(256);
			match(FUNC_A_MAYUSCULA);
			setState(257);
			match(T__0);
			setState(258);
			_la = _input.LA(1);
			if ( !(_la==CARACTER || _la==TEXTO) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			setState(259);
			match(T__1);
			setState(260);
			match(PUNTO_COMA);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Llamada_aminContext extends ParserRuleContext {
		public TerminalNode FUNC_A_MINUSCULA() { return getToken(CubyParser.FUNC_A_MINUSCULA, 0); }
		public TerminalNode TEXTO() { return getToken(CubyParser.TEXTO, 0); }
		public TerminalNode CARACTER() { return getToken(CubyParser.CARACTER, 0); }
		public Llamada_aminContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_llamada_amin; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CubyListener ) ((CubyListener)listener).enterLlamada_amin(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CubyListener ) ((CubyListener)listener).exitLlamada_amin(this);
		}
	}

	public final Llamada_aminContext llamada_amin() throws RecognitionException {
		Llamada_aminContext _localctx = new Llamada_aminContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_llamada_amin);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(262);
			match(FUNC_A_MINUSCULA);
			setState(263);
			match(T__0);
			setState(264);
			_la = _input.LA(1);
			if ( !(_la==CARACTER || _la==TEXTO) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			setState(265);
			match(T__1);
			setState(266);
			match(PUNTO_COMA);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Llamada_caeContext extends ParserRuleContext {
		public TerminalNode FUNC_CARACTER_A_ENTERO() { return getToken(CubyParser.FUNC_CARACTER_A_ENTERO, 0); }
		public TerminalNode CARACTER() { return getToken(CubyParser.CARACTER, 0); }
		public Llamada_caeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_llamada_cae; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CubyListener ) ((CubyListener)listener).enterLlamada_cae(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CubyListener ) ((CubyListener)listener).exitLlamada_cae(this);
		}
	}

	public final Llamada_caeContext llamada_cae() throws RecognitionException {
		Llamada_caeContext _localctx = new Llamada_caeContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_llamada_cae);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(268);
			match(FUNC_CARACTER_A_ENTERO);
			setState(269);
			match(T__0);
			setState(270);
			match(CARACTER);
			setState(271);
			match(T__1);
			setState(272);
			match(PUNTO_COMA);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Llamada_eacContext extends ParserRuleContext {
		public TerminalNode FUNC_ENTERO_A_CARACTER() { return getToken(CubyParser.FUNC_ENTERO_A_CARACTER, 0); }
		public TerminalNode ENTERO() { return getToken(CubyParser.ENTERO, 0); }
		public Llamada_eacContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_llamada_eac; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CubyListener ) ((CubyListener)listener).enterLlamada_eac(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CubyListener ) ((CubyListener)listener).exitLlamada_eac(this);
		}
	}

	public final Llamada_eacContext llamada_eac() throws RecognitionException {
		Llamada_eacContext _localctx = new Llamada_eacContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_llamada_eac);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(274);
			match(FUNC_ENTERO_A_CARACTER);
			setState(275);
			match(T__0);
			setState(276);
			match(ENTERO);
			setState(277);
			match(T__1);
			setState(278);
			match(PUNTO_COMA);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Llamada_taeContext extends ParserRuleContext {
		public TerminalNode FUNC_TEXTO_A_ENTERO() { return getToken(CubyParser.FUNC_TEXTO_A_ENTERO, 0); }
		public TerminalNode TEXTO() { return getToken(CubyParser.TEXTO, 0); }
		public TerminalNode CARACTER() { return getToken(CubyParser.CARACTER, 0); }
		public Llamada_taeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_llamada_tae; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CubyListener ) ((CubyListener)listener).enterLlamada_tae(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CubyListener ) ((CubyListener)listener).exitLlamada_tae(this);
		}
	}

	public final Llamada_taeContext llamada_tae() throws RecognitionException {
		Llamada_taeContext _localctx = new Llamada_taeContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_llamada_tae);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(280);
			match(FUNC_TEXTO_A_ENTERO);
			setState(281);
			match(T__0);
			setState(282);
			_la = _input.LA(1);
			if ( !(_la==CARACTER || _la==TEXTO) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			setState(283);
			match(T__1);
			setState(284);
			match(PUNTO_COMA);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Llamada_longitudContext extends ParserRuleContext {
		public TerminalNode FUNC_LONGITUD_TEXTO() { return getToken(CubyParser.FUNC_LONGITUD_TEXTO, 0); }
		public TerminalNode TEXTO() { return getToken(CubyParser.TEXTO, 0); }
		public TerminalNode CARACTER() { return getToken(CubyParser.CARACTER, 0); }
		public Llamada_longitudContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_llamada_longitud; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CubyListener ) ((CubyListener)listener).enterLlamada_longitud(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CubyListener ) ((CubyListener)listener).exitLlamada_longitud(this);
		}
	}

	public final Llamada_longitudContext llamada_longitud() throws RecognitionException {
		Llamada_longitudContext _localctx = new Llamada_longitudContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_llamada_longitud);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(286);
			match(FUNC_LONGITUD_TEXTO);
			setState(287);
			match(T__0);
			setState(288);
			_la = _input.LA(1);
			if ( !(_la==CARACTER || _la==TEXTO) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			setState(289);
			match(T__1);
			setState(290);
			match(PUNTO_COMA);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Llamada_invertirContext extends ParserRuleContext {
		public TerminalNode FUNC_INVERTIR_TEXTO() { return getToken(CubyParser.FUNC_INVERTIR_TEXTO, 0); }
		public TerminalNode TEXTO() { return getToken(CubyParser.TEXTO, 0); }
		public Llamada_invertirContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_llamada_invertir; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CubyListener ) ((CubyListener)listener).enterLlamada_invertir(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CubyListener ) ((CubyListener)listener).exitLlamada_invertir(this);
		}
	}

	public final Llamada_invertirContext llamada_invertir() throws RecognitionException {
		Llamada_invertirContext _localctx = new Llamada_invertirContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_llamada_invertir);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(292);
			match(FUNC_INVERTIR_TEXTO);
			setState(293);
			match(T__0);
			setState(294);
			match(TEXTO);
			setState(295);
			match(T__1);
			setState(296);
			match(PUNTO_COMA);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Llamada_esLetraContext extends ParserRuleContext {
		public TerminalNode FUNC_ES_LETRA() { return getToken(CubyParser.FUNC_ES_LETRA, 0); }
		public TerminalNode CARACTER() { return getToken(CubyParser.CARACTER, 0); }
		public Llamada_esLetraContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_llamada_esLetra; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CubyListener ) ((CubyListener)listener).enterLlamada_esLetra(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CubyListener ) ((CubyListener)listener).exitLlamada_esLetra(this);
		}
	}

	public final Llamada_esLetraContext llamada_esLetra() throws RecognitionException {
		Llamada_esLetraContext _localctx = new Llamada_esLetraContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_llamada_esLetra);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(298);
			match(FUNC_ES_LETRA);
			setState(299);
			match(T__0);
			setState(300);
			match(CARACTER);
			setState(301);
			match(T__1);
			setState(302);
			match(PUNTO_COMA);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Llamada_esDigitoContext extends ParserRuleContext {
		public TerminalNode FUNC_ES_DIGITO() { return getToken(CubyParser.FUNC_ES_DIGITO, 0); }
		public TerminalNode CARACTER() { return getToken(CubyParser.CARACTER, 0); }
		public Llamada_esDigitoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_llamada_esDigito; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CubyListener ) ((CubyListener)listener).enterLlamada_esDigito(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CubyListener ) ((CubyListener)listener).exitLlamada_esDigito(this);
		}
	}

	public final Llamada_esDigitoContext llamada_esDigito() throws RecognitionException {
		Llamada_esDigitoContext _localctx = new Llamada_esDigitoContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_llamada_esDigito);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(304);
			match(FUNC_ES_DIGITO);
			setState(305);
			match(T__0);
			setState(306);
			match(CARACTER);
			setState(307);
			match(T__1);
			setState(308);
			match(PUNTO_COMA);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Funcion_principalContext extends ParserRuleContext {
		public TerminalNode FUNC_PRINCIPAL() { return getToken(CubyParser.FUNC_PRINCIPAL, 0); }
		public BloqueContext bloque() {
			return getRuleContext(BloqueContext.class,0);
		}
		public Funcion_principalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcion_principal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CubyListener ) ((CubyListener)listener).enterFuncion_principal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CubyListener ) ((CubyListener)listener).exitFuncion_principal(this);
		}
	}

	public final Funcion_principalContext funcion_principal() throws RecognitionException {
		Funcion_principalContext _localctx = new Funcion_principalContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_funcion_principal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(310);
			match(FUNC_PRINCIPAL);
			setState(311);
			match(T__0);
			setState(312);
			match(T__1);
			setState(313);
			bloque();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ProgramaContext extends ParserRuleContext {
		public Funcion_principalContext funcion_principal() {
			return getRuleContext(Funcion_principalContext.class,0);
		}
		public TerminalNode EOF() { return getToken(CubyParser.EOF, 0); }
		public List<Definir_funcionContext> definir_funcion() {
			return getRuleContexts(Definir_funcionContext.class);
		}
		public Definir_funcionContext definir_funcion(int i) {
			return getRuleContext(Definir_funcionContext.class,i);
		}
		public ProgramaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_programa; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CubyListener ) ((CubyListener)listener).enterPrograma(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CubyListener ) ((CubyListener)listener).exitPrograma(this);
		}
	}

	public final ProgramaContext programa() throws RecognitionException {
		ProgramaContext _localctx = new ProgramaContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_programa);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(318);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==DEF) {
				{
				{
				setState(315);
				definir_funcion();
				}
				}
				setState(320);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(321);
			funcion_principal();
			setState(322);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 0:
			return expresion_sempred((ExpresionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expresion_sempred(ExpresionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 6);
		case 1:
			return precpred(_ctx, 5);
		case 2:
			return precpred(_ctx, 4);
		case 3:
			return precpred(_ctx, 2);
		case 4:
			return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3F\u0147\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\3\2\3\2\3"+
		"\2\3\2\3\2\3\2\5\2E\n\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3"+
		"\2\3\2\3\2\3\2\7\2V\n\2\f\2\16\2Y\13\2\3\3\3\3\3\3\3\3\3\3\3\3\5\3a\n"+
		"\3\3\4\3\4\3\5\3\5\3\5\5\5h\n\5\3\5\3\5\5\5l\n\5\3\6\3\6\3\6\7\6q\n\6"+
		"\f\6\16\6t\13\6\3\7\3\7\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3"+
		"\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5\n\u008c\n\n\3\13\3\13\3\f\3\f\3\f"+
		"\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\7\r\u009f\n\r\f\r\16"+
		"\r\u00a2\13\r\3\r\3\r\5\r\u00a6\n\r\3\r\3\r\3\r\3\r\3\r\3\r\6\r\u00ae"+
		"\n\r\r\r\16\r\u00af\3\r\3\r\5\r\u00b4\n\r\5\r\u00b6\n\r\3\16\3\16\3\16"+
		"\7\16\u00bb\n\16\f\16\16\16\u00be\13\16\3\17\3\17\3\20\3\20\3\20\3\20"+
		"\3\20\5\20\u00c7\n\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\5\21\u00e3\n\21\3\22\3\22\7\22\u00e7\n\22\f\22\16\22\u00ea"+
		"\13\22\3\22\5\22\u00ed\n\22\3\22\5\22\u00f0\n\22\3\22\3\22\3\23\3\23\3"+
		"\23\3\23\5\23\u00f8\n\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\24"+
		"\3\25\3\25\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\26\3\27\3\27"+
		"\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31"+
		"\3\31\3\31\3\32\3\32\3\32\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\33\3\33"+
		"\3\34\3\34\3\34\3\34\3\34\3\34\3\35\3\35\3\35\3\35\3\35\3\35\3\36\3\36"+
		"\3\36\3\36\3\36\3\37\7\37\u013f\n\37\f\37\16\37\u0142\13\37\3\37\3\37"+
		"\3\37\3\37\3\u00a0\3\2 \2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*"+
		",.\60\62\64\668:<\2\f\3\2\25\26\3\2\30\31\3\2\16\23\5\2@@BBEF\3\2<?\4"+
		"\2@AEF\3\2\34!\3\2\32\33\4\2@@BB\3\2EF\u014e\2D\3\2\2\2\4`\3\2\2\2\6b"+
		"\3\2\2\2\bd\3\2\2\2\nm\3\2\2\2\fu\3\2\2\2\16w\3\2\2\2\20z\3\2\2\2\22\u008b"+
		"\3\2\2\2\24\u008d\3\2\2\2\26\u008f\3\2\2\2\30\u00b5\3\2\2\2\32\u00b7\3"+
		"\2\2\2\34\u00bf\3\2\2\2\36\u00c6\3\2\2\2 \u00e2\3\2\2\2\"\u00e4\3\2\2"+
		"\2$\u00f3\3\2\2\2&\u00fc\3\2\2\2(\u0102\3\2\2\2*\u0108\3\2\2\2,\u010e"+
		"\3\2\2\2.\u0114\3\2\2\2\60\u011a\3\2\2\2\62\u0120\3\2\2\2\64\u0126\3\2"+
		"\2\2\66\u012c\3\2\2\28\u0132\3\2\2\2:\u0138\3\2\2\2<\u0140\3\2\2\2>?\b"+
		"\2\1\2?@\7\13\2\2@E\5\2\2\tAB\7\13\2\2BE\5\2\2\5CE\5\4\3\2D>\3\2\2\2D"+
		"A\3\2\2\2DC\3\2\2\2EW\3\2\2\2FG\f\b\2\2GH\t\2\2\2HV\5\2\2\tIJ\f\7\2\2"+
		"JK\t\3\2\2KV\5\2\2\bLM\f\6\2\2MN\t\4\2\2NV\5\2\2\7OP\f\4\2\2PQ\7\f\2\2"+
		"QV\5\2\2\5RS\f\3\2\2ST\7\r\2\2TV\5\2\2\4UF\3\2\2\2UI\3\2\2\2UL\3\2\2\2"+
		"UO\3\2\2\2UR\3\2\2\2VY\3\2\2\2WU\3\2\2\2WX\3\2\2\2X\3\3\2\2\2YW\3\2\2"+
		"\2Z[\7\3\2\2[\\\5\2\2\2\\]\7\4\2\2]a\3\2\2\2^a\5\b\5\2_a\5\6\4\2`Z\3\2"+
		"\2\2`^\3\2\2\2`_\3\2\2\2a\5\3\2\2\2bc\t\5\2\2c\7\3\2\2\2de\7B\2\2eg\7"+
		"\3\2\2fh\5\n\6\2gf\3\2\2\2gh\3\2\2\2hi\3\2\2\2ik\7\4\2\2jl\7\7\2\2kj\3"+
		"\2\2\2kl\3\2\2\2l\t\3\2\2\2mr\5\f\7\2no\7\5\2\2oq\5\f\7\2pn\3\2\2\2qt"+
		"\3\2\2\2rp\3\2\2\2rs\3\2\2\2s\13\3\2\2\2tr\3\2\2\2uv\5\2\2\2v\r\3\2\2"+
		"\2wx\5\24\13\2xy\7B\2\2y\17\3\2\2\2z{\5\16\b\2{|\7\34\2\2|}\5\2\2\2}~"+
		"\7\7\2\2~\21\3\2\2\2\177\u008c\5\20\t\2\u0080\u008c\5\30\r\2\u0081\u008c"+
		"\5&\24\2\u0082\u008c\5(\25\2\u0083\u008c\5,\27\2\u0084\u008c\5.\30\2\u0085"+
		"\u008c\5\60\31\2\u0086\u008c\5\62\32\2\u0087\u008c\5\64\33\2\u0088\u008c"+
		"\58\35\2\u0089\u008c\5*\26\2\u008a\u008c\5\26\f\2\u008b\177\3\2\2\2\u008b"+
		"\u0080\3\2\2\2\u008b\u0081\3\2\2\2\u008b\u0082\3\2\2\2\u008b\u0083\3\2"+
		"\2\2\u008b\u0084\3\2\2\2\u008b\u0085\3\2\2\2\u008b\u0086\3\2\2\2\u008b"+
		"\u0087\3\2\2\2\u008b\u0088\3\2\2\2\u008b\u0089\3\2\2\2\u008b\u008a\3\2"+
		"\2\2\u008c\23\3\2\2\2\u008d\u008e\t\6\2\2\u008e\25\3\2\2\2\u008f\u0090"+
		"\7\66\2\2\u0090\u0091\5\2\2\2\u0091\u0092\7\7\2\2\u0092\27\3\2\2\2\u0093"+
		"\u0094\7\61\2\2\u0094\u0095\7\3\2\2\u0095\u0096\5\2\2\2\u0096\u0097\7"+
		"\4\2\2\u0097\u00a0\5\"\22\2\u0098\u0099\7\62\2\2\u0099\u009a\7\3\2\2\u009a"+
		"\u009b\5\2\2\2\u009b\u009c\7\4\2\2\u009c\u009d\5\"\22\2\u009d\u009f\3"+
		"\2\2\2\u009e\u0098\3\2\2\2\u009f\u00a2\3\2\2\2\u00a0\u00a1\3\2\2\2\u00a0"+
		"\u009e\3\2\2\2\u00a1\u00a5\3\2\2\2\u00a2\u00a0\3\2\2\2\u00a3\u00a4\7\63"+
		"\2\2\u00a4\u00a6\5\"\22\2\u00a5\u00a3\3\2\2\2\u00a5\u00a6\3\2\2\2\u00a6"+
		"\u00b6\3\2\2\2\u00a7\u00a8\7\67\2\2\u00a8\u00a9\7B\2\2\u00a9\u00ad\7\6"+
		"\2\2\u00aa\u00ab\78\2\2\u00ab\u00ac\t\7\2\2\u00ac\u00ae\5\"\22\2\u00ad"+
		"\u00aa\3\2\2\2\u00ae\u00af\3\2\2\2\u00af\u00ad\3\2\2\2\u00af\u00b0\3\2"+
		"\2\2\u00b0\u00b3\3\2\2\2\u00b1\u00b2\7\63\2\2\u00b2\u00b4\5\"\22\2\u00b3"+
		"\u00b1\3\2\2\2\u00b3\u00b4\3\2\2\2\u00b4\u00b6\3\2\2\2\u00b5\u0093\3\2"+
		"\2\2\u00b5\u00a7\3\2\2\2\u00b6\31\3\2\2\2\u00b7\u00bc\5\34\17\2\u00b8"+
		"\u00b9\7\5\2\2\u00b9\u00bb\5\34\17\2\u00ba\u00b8\3\2\2\2\u00bb\u00be\3"+
		"\2\2\2\u00bc\u00ba\3\2\2\2\u00bc\u00bd\3\2\2\2\u00bd\33\3\2\2\2\u00be"+
		"\u00bc\3\2\2\2\u00bf\u00c0\5\16\b\2\u00c0\35\3\2\2\2\u00c1\u00c2\7B\2"+
		"\2\u00c2\u00c3\t\b\2\2\u00c3\u00c7\5\2\2\2\u00c4\u00c5\7B\2\2\u00c5\u00c7"+
		"\t\t\2\2\u00c6\u00c1\3\2\2\2\u00c6\u00c4\3\2\2\2\u00c7\37\3\2\2\2\u00c8"+
		"\u00c9\7.\2\2\u00c9\u00ca\7\3\2\2\u00ca\u00cb\5\20\t\2\u00cb\u00cc\5\2"+
		"\2\2\u00cc\u00cd\7\7\2\2\u00cd\u00ce\5\36\20\2\u00ce\u00cf\7\4\2\2\u00cf"+
		"\u00d0\5\"\22\2\u00d0\u00e3\3\2\2\2\u00d1\u00d2\7\60\2\2\u00d2\u00d3\7"+
		"\3\2\2\u00d3\u00d4\5\2\2\2\u00d4\u00d5\7\4\2\2\u00d5\u00d6\5\"\22\2\u00d6"+
		"\u00e3\3\2\2\2\u00d7\u00d8\7/\2\2\u00d8\u00d9\5\"\22\2\u00d9\u00da\7;"+
		"\2\2\u00da\u00db\7\3\2\2\u00db\u00dc\5\2\2\2\u00dc\u00dd\7\4\2\2\u00dd"+
		"\u00e3\3\2\2\2\u00de\u00df\t\n\2\2\u00df\u00e0\7\b\2\2\u00e0\u00e1\7:"+
		"\2\2\u00e1\u00e3\5\"\22\2\u00e2\u00c8\3\2\2\2\u00e2\u00d1\3\2\2\2\u00e2"+
		"\u00d7\3\2\2\2\u00e2\u00de\3\2\2\2\u00e3!\3\2\2\2\u00e4\u00e8\7\n\2\2"+
		"\u00e5\u00e7\5\22\n\2\u00e6\u00e5\3\2\2\2\u00e7\u00ea\3\2\2\2\u00e8\u00e6"+
		"\3\2\2\2\u00e8\u00e9\3\2\2\2\u00e9\u00ec\3\2\2\2\u00ea\u00e8\3\2\2\2\u00eb"+
		"\u00ed\7\65\2\2\u00ec\u00eb\3\2\2\2\u00ec\u00ed\3\2\2\2\u00ed\u00ef\3"+
		"\2\2\2\u00ee\u00f0\79\2\2\u00ef\u00ee\3\2\2\2\u00ef\u00f0\3\2\2\2\u00f0"+
		"\u00f1\3\2\2\2\u00f1\u00f2\7\n\2\2\u00f2#\3\2\2\2\u00f3\u00f4\7\64\2\2"+
		"\u00f4\u00f5\5\16\b\2\u00f5\u00f7\7\3\2\2\u00f6\u00f8\5\32\16\2\u00f7"+
		"\u00f6\3\2\2\2\u00f7\u00f8\3\2\2\2\u00f8\u00f9\3\2\2\2\u00f9\u00fa\7\4"+
		"\2\2\u00fa\u00fb\5\"\22\2\u00fb%\3\2\2\2\u00fc\u00fd\7\"\2\2\u00fd\u00fe"+
		"\7\3\2\2\u00fe\u00ff\t\7\2\2\u00ff\u0100\7\4\2\2\u0100\u0101\7\7\2\2\u0101"+
		"\'\3\2\2\2\u0102\u0103\7$\2\2\u0103\u0104\7\3\2\2\u0104\u0105\t\13\2\2"+
		"\u0105\u0106\7\4\2\2\u0106\u0107\7\7\2\2\u0107)\3\2\2\2\u0108\u0109\7"+
		"%\2\2\u0109\u010a\7\3\2\2\u010a\u010b\t\13\2\2\u010b\u010c\7\4\2\2\u010c"+
		"\u010d\7\7\2\2\u010d+\3\2\2\2\u010e\u010f\7&\2\2\u010f\u0110\7\3\2\2\u0110"+
		"\u0111\7E\2\2\u0111\u0112\7\4\2\2\u0112\u0113\7\7\2\2\u0113-\3\2\2\2\u0114"+
		"\u0115\7\'\2\2\u0115\u0116\7\3\2\2\u0116\u0117\7@\2\2\u0117\u0118\7\4"+
		"\2\2\u0118\u0119\7\7\2\2\u0119/\3\2\2\2\u011a\u011b\7)\2\2\u011b\u011c"+
		"\7\3\2\2\u011c\u011d\t\13\2\2\u011d\u011e\7\4\2\2\u011e\u011f\7\7\2\2"+
		"\u011f\61\3\2\2\2\u0120\u0121\7*\2\2\u0121\u0122\7\3\2\2\u0122\u0123\t"+
		"\13\2\2\u0123\u0124\7\4\2\2\u0124\u0125\7\7\2\2\u0125\63\3\2\2\2\u0126"+
		"\u0127\7+\2\2\u0127\u0128\7\3\2\2\u0128\u0129\7F\2\2\u0129\u012a\7\4\2"+
		"\2\u012a\u012b\7\7\2\2\u012b\65\3\2\2\2\u012c\u012d\7,\2\2\u012d\u012e"+
		"\7\3\2\2\u012e\u012f\7E\2\2\u012f\u0130\7\4\2\2\u0130\u0131\7\7\2\2\u0131"+
		"\67\3\2\2\2\u0132\u0133\7-\2\2\u0133\u0134\7\3\2\2\u0134\u0135\7E\2\2"+
		"\u0135\u0136\7\4\2\2\u0136\u0137\7\7\2\2\u01379\3\2\2\2\u0138\u0139\7"+
		"#\2\2\u0139\u013a\7\3\2\2\u013a\u013b\7\4\2\2\u013b\u013c\5\"\22\2\u013c"+
		";\3\2\2\2\u013d\u013f\5$\23\2\u013e\u013d\3\2\2\2\u013f\u0142\3\2\2\2"+
		"\u0140\u013e\3\2\2\2\u0140\u0141\3\2\2\2\u0141\u0143\3\2\2\2\u0142\u0140"+
		"\3\2\2\2\u0143\u0144\5:\36\2\u0144\u0145\7\2\2\3\u0145=\3\2\2\2\27DUW"+
		"`gkr\u008b\u00a0\u00a5\u00af\u00b3\u00b5\u00bc\u00c6\u00e2\u00e8\u00ec"+
		"\u00ef\u00f7\u0140";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}