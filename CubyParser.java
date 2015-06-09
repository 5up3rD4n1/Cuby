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
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, DELIMITADOR_BLOQUE=6, OP_NEGACION=7, 
		OP_AND=8, OP_OR=9, OP_IGUALQUE=10, OP_DIFERENTEQUE=11, OP_MAYORQUE=12, 
		OP_MENORQUE=13, OP_MENOROIGUAL=14, OP_MAYOROIGUAL=15, OP_MULTIPLICACION=16, 
		OP_DIVISION=17, OP_MOD=18, OP_SUMA=19, OP_RESTA=20, OP_DECREMENTAR=21, 
		OP_INCREMENTAR=22, OP_ASIGNACION=23, OP_ASIGNAR_RESTA=24, OP_ASIGNAR_SUMA=25, 
		OP_ASIGNAR_MULTIPLICACION=26, OP_ASIGNAR_DIVISION=27, OP_ASIGNAR_MODULO=28, 
		FUNC_IMPRIMIR=29, FUNC_PRINCIPAL=30, FUNC_A_MAYUSCULA=31, FUNC_A_MINUSCULA=32, 
		FUNC_CARACTER_A_ENTERO=33, FUNC_ENTERO_A_CARACTER=34, FUNC_ENTERO_A_TEXTO=35, 
		FUNC_TEXTO_A_ENTERO=36, FUNC_LONGITUD_TEXTO=37, FUNC_INVERTIR_TEXTO=38, 
		FUNC_ES_LETRA=39, FUNC_ES_DIGITO=40, PARA=41, REPITA=42, MIENTRAS=43, 
		SI=44, SINOSI=45, SINO=46, DEF=47, SALIR=48, RETORNAR=49, CASO=50, CUANDO=51, 
		SEGUIR=52, VECES=53, HASTA=54, TIPO_ENTERO=55, TIPO_CARACTER=56, TIPO_TEXTO=57, 
		TIPO_BOOLEANO=58, ESPACIOS_BLANCO=59, ENTERO=60, BOOLEANO=61, IDENTIFICADOR=62, 
		COMENTARIO=63, CARACTER=64, TEXTO=65;
	public static final int
		RULE_expresion = 0, RULE_elemento = 1, RULE_literal = 2, RULE_operacion_aritmetica = 3, 
		RULE_operacion_unaria = 4, RULE_operacion_logica = 5, RULE_operacion_relacional = 6, 
		RULE_llamada_funcion = 7, RULE_funciones_predefinidas = 8, RULE_funcion_por_usuario = 9, 
		RULE_entradas = 10, RULE_entrada = 11, RULE_definicion_identificador = 12, 
		RULE_declaracion_variable = 13, RULE_asignacion_variable = 14, RULE_proposicion = 15, 
		RULE_tipo_dato = 16, RULE_dato = 17, RULE_sentencia = 18, RULE_sentencia_de_salto = 19, 
		RULE_sentencia_condicional = 20, RULE_expresion_actualizacion = 21, RULE_sentencia_de_iteracion = 22, 
		RULE_bloque = 23, RULE_definir_funcion = 24, RULE_parametros = 25, RULE_parametro = 26, 
		RULE_llamada_imprimir = 27, RULE_llamada_amay = 28, RULE_llamada_amin = 29, 
		RULE_llamada_cae = 30, RULE_llamada_eac = 31, RULE_llamada_tae = 32, RULE_llamada_eat = 33, 
		RULE_llamada_longitud = 34, RULE_llamada_invertir = 35, RULE_llamada_esLetra = 36, 
		RULE_llamada_esDigito = 37, RULE_funcion_principal = 38, RULE_funciones = 39, 
		RULE_programa = 40;
	public static final String[] ruleNames = {
		"expresion", "elemento", "literal", "operacion_aritmetica", "operacion_unaria", 
		"operacion_logica", "operacion_relacional", "llamada_funcion", "funciones_predefinidas", 
		"funcion_por_usuario", "entradas", "entrada", "definicion_identificador", 
		"declaracion_variable", "asignacion_variable", "proposicion", "tipo_dato", 
		"dato", "sentencia", "sentencia_de_salto", "sentencia_condicional", "expresion_actualizacion", 
		"sentencia_de_iteracion", "bloque", "definir_funcion", "parametros", "parametro", 
		"llamada_imprimir", "llamada_amay", "llamada_amin", "llamada_cae", "llamada_eac", 
		"llamada_tae", "llamada_eat", "llamada_longitud", "llamada_invertir", 
		"llamada_esLetra", "llamada_esDigito", "funcion_principal", "funciones", 
		"programa"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'('", "')'", "','", "';'", "'.'", "'|'", "'~'", "'y'", "'o'", "'=='", 
		"'!='", "'>'", "'<'", "'<='", "'>='", "'*'", "'/'", "'%'", "'+'", "'-'", 
		"'--'", "'++'", "'='", "'-='", "'+='", "'*='", "'/='", "'%='", "'escribir'", 
		"'principal'", "'aMay'", "'aMin'", "'cae'", "'eac'", "'eat'", "'tae'", 
		"'longitud'", "'invertir'", "'esLetra?'", "'esDigito?'", "'para'", "'repita'", 
		"'mientras'", "'si'", "'sino si'", "'sino'", "'def'", "'salir'", "'ret'", 
		"'caso'", "'cuando'", "'seguir'", "'veces'", "'hasta'", "'entero'", "'caracter'", 
		"'texto'", "'booleano'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, "DELIMITADOR_BLOQUE", "OP_NEGACION", 
		"OP_AND", "OP_OR", "OP_IGUALQUE", "OP_DIFERENTEQUE", "OP_MAYORQUE", "OP_MENORQUE", 
		"OP_MENOROIGUAL", "OP_MAYOROIGUAL", "OP_MULTIPLICACION", "OP_DIVISION", 
		"OP_MOD", "OP_SUMA", "OP_RESTA", "OP_DECREMENTAR", "OP_INCREMENTAR", "OP_ASIGNACION", 
		"OP_ASIGNAR_RESTA", "OP_ASIGNAR_SUMA", "OP_ASIGNAR_MULTIPLICACION", "OP_ASIGNAR_DIVISION", 
		"OP_ASIGNAR_MODULO", "FUNC_IMPRIMIR", "FUNC_PRINCIPAL", "FUNC_A_MAYUSCULA", 
		"FUNC_A_MINUSCULA", "FUNC_CARACTER_A_ENTERO", "FUNC_ENTERO_A_CARACTER", 
		"FUNC_ENTERO_A_TEXTO", "FUNC_TEXTO_A_ENTERO", "FUNC_LONGITUD_TEXTO", "FUNC_INVERTIR_TEXTO", 
		"FUNC_ES_LETRA", "FUNC_ES_DIGITO", "PARA", "REPITA", "MIENTRAS", "SI", 
		"SINOSI", "SINO", "DEF", "SALIR", "RETORNAR", "CASO", "CUANDO", "SEGUIR", 
		"VECES", "HASTA", "TIPO_ENTERO", "TIPO_CARACTER", "TIPO_TEXTO", "TIPO_BOOLEANO", 
		"ESPACIOS_BLANCO", "ENTERO", "BOOLEANO", "IDENTIFICADOR", "COMENTARIO", 
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
		public TerminalNode IDENTIFICADOR() { return getToken(CubyParser.IDENTIFICADOR, 0); }
		public Operacion_unariaContext operacion_unaria() {
			return getRuleContext(Operacion_unariaContext.class,0);
		}
		public Operacion_aritmeticaContext operacion_aritmetica() {
			return getRuleContext(Operacion_aritmeticaContext.class,0);
		}
		public Operacion_logicaContext operacion_logica() {
			return getRuleContext(Operacion_logicaContext.class,0);
		}
		public Operacion_relacionalContext operacion_relacional() {
			return getRuleContext(Operacion_relacionalContext.class,0);
		}
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
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(91);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				{
				setState(83);
				match(OP_NEGACION);
				setState(84);
				expresion(1);
				}
				break;
			case 2:
				{
				setState(85);
				elemento();
				}
				break;
			case 3:
				{
				setState(86);
				match(IDENTIFICADOR);
				setState(87);
				operacion_unaria();
				}
				break;
			case 4:
				{
				setState(88);
				operacion_unaria();
				setState(89);
				match(IDENTIFICADOR);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(107);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(105);
					switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
					case 1:
						{
						_localctx = new ExpresionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expresion);
						setState(93);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(94);
						operacion_aritmetica();
						setState(95);
						expresion(7);
						}
						break;
					case 2:
						{
						_localctx = new ExpresionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expresion);
						setState(97);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(98);
						operacion_logica();
						setState(99);
						expresion(6);
						}
						break;
					case 3:
						{
						_localctx = new ExpresionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expresion);
						setState(101);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(102);
						operacion_relacional();
						setState(103);
						expresion(5);
						}
						break;
					}
					} 
				}
				setState(109);
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
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public Llamada_funcionContext llamada_funcion() {
			return getRuleContext(Llamada_funcionContext.class,0);
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
			setState(112);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(110);
				literal();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(111);
				llamada_funcion();
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
		public TerminalNode BOOLEANO() { return getToken(CubyParser.BOOLEANO, 0); }
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
			setState(114);
			_la = _input.LA(1);
			if ( !(((((_la - 60)) & ~0x3f) == 0 && ((1L << (_la - 60)) & ((1L << (ENTERO - 60)) | (1L << (BOOLEANO - 60)) | (1L << (IDENTIFICADOR - 60)) | (1L << (CARACTER - 60)) | (1L << (TEXTO - 60)))) != 0)) ) {
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

	public static class Operacion_aritmeticaContext extends ParserRuleContext {
		public TerminalNode OP_SUMA() { return getToken(CubyParser.OP_SUMA, 0); }
		public TerminalNode OP_RESTA() { return getToken(CubyParser.OP_RESTA, 0); }
		public TerminalNode OP_MULTIPLICACION() { return getToken(CubyParser.OP_MULTIPLICACION, 0); }
		public TerminalNode OP_DIVISION() { return getToken(CubyParser.OP_DIVISION, 0); }
		public TerminalNode OP_MOD() { return getToken(CubyParser.OP_MOD, 0); }
		public TerminalNode OP_ASIGNAR_SUMA() { return getToken(CubyParser.OP_ASIGNAR_SUMA, 0); }
		public TerminalNode OP_ASIGNAR_RESTA() { return getToken(CubyParser.OP_ASIGNAR_RESTA, 0); }
		public TerminalNode OP_ASIGNAR_MULTIPLICACION() { return getToken(CubyParser.OP_ASIGNAR_MULTIPLICACION, 0); }
		public TerminalNode OP_ASIGNAR_DIVISION() { return getToken(CubyParser.OP_ASIGNAR_DIVISION, 0); }
		public TerminalNode OP_ASIGNAR_MODULO() { return getToken(CubyParser.OP_ASIGNAR_MODULO, 0); }
		public Operacion_aritmeticaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operacion_aritmetica; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CubyListener ) ((CubyListener)listener).enterOperacion_aritmetica(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CubyListener ) ((CubyListener)listener).exitOperacion_aritmetica(this);
		}
	}

	public final Operacion_aritmeticaContext operacion_aritmetica() throws RecognitionException {
		Operacion_aritmeticaContext _localctx = new Operacion_aritmeticaContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_operacion_aritmetica);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(116);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OP_MULTIPLICACION) | (1L << OP_DIVISION) | (1L << OP_MOD) | (1L << OP_SUMA) | (1L << OP_RESTA) | (1L << OP_ASIGNAR_RESTA) | (1L << OP_ASIGNAR_SUMA) | (1L << OP_ASIGNAR_MULTIPLICACION) | (1L << OP_ASIGNAR_DIVISION) | (1L << OP_ASIGNAR_MODULO))) != 0)) ) {
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

	public static class Operacion_unariaContext extends ParserRuleContext {
		public TerminalNode OP_INCREMENTAR() { return getToken(CubyParser.OP_INCREMENTAR, 0); }
		public TerminalNode OP_DECREMENTAR() { return getToken(CubyParser.OP_DECREMENTAR, 0); }
		public Operacion_unariaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operacion_unaria; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CubyListener ) ((CubyListener)listener).enterOperacion_unaria(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CubyListener ) ((CubyListener)listener).exitOperacion_unaria(this);
		}
	}

	public final Operacion_unariaContext operacion_unaria() throws RecognitionException {
		Operacion_unariaContext _localctx = new Operacion_unariaContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_operacion_unaria);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(118);
			_la = _input.LA(1);
			if ( !(_la==OP_DECREMENTAR || _la==OP_INCREMENTAR) ) {
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

	public static class Operacion_logicaContext extends ParserRuleContext {
		public TerminalNode OP_AND() { return getToken(CubyParser.OP_AND, 0); }
		public TerminalNode OP_OR() { return getToken(CubyParser.OP_OR, 0); }
		public Operacion_logicaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operacion_logica; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CubyListener ) ((CubyListener)listener).enterOperacion_logica(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CubyListener ) ((CubyListener)listener).exitOperacion_logica(this);
		}
	}

	public final Operacion_logicaContext operacion_logica() throws RecognitionException {
		Operacion_logicaContext _localctx = new Operacion_logicaContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_operacion_logica);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(120);
			_la = _input.LA(1);
			if ( !(_la==OP_AND || _la==OP_OR) ) {
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

	public static class Operacion_relacionalContext extends ParserRuleContext {
		public TerminalNode OP_MAYORQUE() { return getToken(CubyParser.OP_MAYORQUE, 0); }
		public TerminalNode OP_MENORQUE() { return getToken(CubyParser.OP_MENORQUE, 0); }
		public TerminalNode OP_MAYOROIGUAL() { return getToken(CubyParser.OP_MAYOROIGUAL, 0); }
		public TerminalNode OP_MENOROIGUAL() { return getToken(CubyParser.OP_MENOROIGUAL, 0); }
		public TerminalNode OP_IGUALQUE() { return getToken(CubyParser.OP_IGUALQUE, 0); }
		public TerminalNode OP_DIFERENTEQUE() { return getToken(CubyParser.OP_DIFERENTEQUE, 0); }
		public Operacion_relacionalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operacion_relacional; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CubyListener ) ((CubyListener)listener).enterOperacion_relacional(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CubyListener ) ((CubyListener)listener).exitOperacion_relacional(this);
		}
	}

	public final Operacion_relacionalContext operacion_relacional() throws RecognitionException {
		Operacion_relacionalContext _localctx = new Operacion_relacionalContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_operacion_relacional);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(122);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OP_IGUALQUE) | (1L << OP_DIFERENTEQUE) | (1L << OP_MAYORQUE) | (1L << OP_MENORQUE) | (1L << OP_MENOROIGUAL) | (1L << OP_MAYOROIGUAL))) != 0)) ) {
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
		public Funcion_por_usuarioContext funcion_por_usuario() {
			return getRuleContext(Funcion_por_usuarioContext.class,0);
		}
		public Funciones_predefinidasContext funciones_predefinidas() {
			return getRuleContext(Funciones_predefinidasContext.class,0);
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
		enterRule(_localctx, 14, RULE_llamada_funcion);
		try {
			setState(126);
			switch (_input.LA(1)) {
			case IDENTIFICADOR:
				enterOuterAlt(_localctx, 1);
				{
				setState(124);
				funcion_por_usuario();
				}
				break;
			case FUNC_IMPRIMIR:
			case FUNC_A_MAYUSCULA:
			case FUNC_A_MINUSCULA:
			case FUNC_CARACTER_A_ENTERO:
			case FUNC_ENTERO_A_CARACTER:
			case FUNC_ENTERO_A_TEXTO:
			case FUNC_TEXTO_A_ENTERO:
			case FUNC_LONGITUD_TEXTO:
			case FUNC_INVERTIR_TEXTO:
			case FUNC_ES_LETRA:
			case FUNC_ES_DIGITO:
				enterOuterAlt(_localctx, 2);
				{
				setState(125);
				funciones_predefinidas();
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

	public static class Funciones_predefinidasContext extends ParserRuleContext {
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
		public Llamada_eatContext llamada_eat() {
			return getRuleContext(Llamada_eatContext.class,0);
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
		public Llamada_esLetraContext llamada_esLetra() {
			return getRuleContext(Llamada_esLetraContext.class,0);
		}
		public Funciones_predefinidasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funciones_predefinidas; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CubyListener ) ((CubyListener)listener).enterFunciones_predefinidas(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CubyListener ) ((CubyListener)listener).exitFunciones_predefinidas(this);
		}
	}

	public final Funciones_predefinidasContext funciones_predefinidas() throws RecognitionException {
		Funciones_predefinidasContext _localctx = new Funciones_predefinidasContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_funciones_predefinidas);
		try {
			setState(139);
			switch (_input.LA(1)) {
			case FUNC_IMPRIMIR:
				enterOuterAlt(_localctx, 1);
				{
				setState(128);
				llamada_imprimir();
				}
				break;
			case FUNC_A_MAYUSCULA:
				enterOuterAlt(_localctx, 2);
				{
				setState(129);
				llamada_amay();
				}
				break;
			case FUNC_CARACTER_A_ENTERO:
				enterOuterAlt(_localctx, 3);
				{
				setState(130);
				llamada_cae();
				}
				break;
			case FUNC_ENTERO_A_CARACTER:
				enterOuterAlt(_localctx, 4);
				{
				setState(131);
				llamada_eac();
				}
				break;
			case FUNC_TEXTO_A_ENTERO:
				enterOuterAlt(_localctx, 5);
				{
				setState(132);
				llamada_tae();
				}
				break;
			case FUNC_ENTERO_A_TEXTO:
				enterOuterAlt(_localctx, 6);
				{
				setState(133);
				llamada_eat();
				}
				break;
			case FUNC_LONGITUD_TEXTO:
				enterOuterAlt(_localctx, 7);
				{
				setState(134);
				llamada_longitud();
				}
				break;
			case FUNC_INVERTIR_TEXTO:
				enterOuterAlt(_localctx, 8);
				{
				setState(135);
				llamada_invertir();
				}
				break;
			case FUNC_ES_DIGITO:
				enterOuterAlt(_localctx, 9);
				{
				setState(136);
				llamada_esDigito();
				}
				break;
			case FUNC_A_MINUSCULA:
				enterOuterAlt(_localctx, 10);
				{
				setState(137);
				llamada_amin();
				}
				break;
			case FUNC_ES_LETRA:
				enterOuterAlt(_localctx, 11);
				{
				setState(138);
				llamada_esLetra();
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

	public static class Funcion_por_usuarioContext extends ParserRuleContext {
		public TerminalNode IDENTIFICADOR() { return getToken(CubyParser.IDENTIFICADOR, 0); }
		public EntradasContext entradas() {
			return getRuleContext(EntradasContext.class,0);
		}
		public Funcion_por_usuarioContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcion_por_usuario; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CubyListener ) ((CubyListener)listener).enterFuncion_por_usuario(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CubyListener ) ((CubyListener)listener).exitFuncion_por_usuario(this);
		}
	}

	public final Funcion_por_usuarioContext funcion_por_usuario() throws RecognitionException {
		Funcion_por_usuarioContext _localctx = new Funcion_por_usuarioContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_funcion_por_usuario);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(141);
			match(IDENTIFICADOR);
			setState(142);
			match(T__0);
			setState(144);
			_la = _input.LA(1);
			if (((((_la - 7)) & ~0x3f) == 0 && ((1L << (_la - 7)) & ((1L << (OP_NEGACION - 7)) | (1L << (OP_DECREMENTAR - 7)) | (1L << (OP_INCREMENTAR - 7)) | (1L << (FUNC_IMPRIMIR - 7)) | (1L << (FUNC_A_MAYUSCULA - 7)) | (1L << (FUNC_A_MINUSCULA - 7)) | (1L << (FUNC_CARACTER_A_ENTERO - 7)) | (1L << (FUNC_ENTERO_A_CARACTER - 7)) | (1L << (FUNC_ENTERO_A_TEXTO - 7)) | (1L << (FUNC_TEXTO_A_ENTERO - 7)) | (1L << (FUNC_LONGITUD_TEXTO - 7)) | (1L << (FUNC_INVERTIR_TEXTO - 7)) | (1L << (FUNC_ES_LETRA - 7)) | (1L << (FUNC_ES_DIGITO - 7)) | (1L << (ENTERO - 7)) | (1L << (BOOLEANO - 7)) | (1L << (IDENTIFICADOR - 7)) | (1L << (CARACTER - 7)) | (1L << (TEXTO - 7)))) != 0)) {
				{
				setState(143);
				entradas();
				}
			}

			setState(146);
			match(T__1);
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
		enterRule(_localctx, 20, RULE_entradas);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(148);
			entrada();
			setState(153);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2) {
				{
				{
				setState(149);
				match(T__2);
				setState(150);
				entrada();
				}
				}
				setState(155);
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
		enterRule(_localctx, 22, RULE_entrada);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(156);
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

	public static class Definicion_identificadorContext extends ParserRuleContext {
		public Tipo_datoContext tipo_dato() {
			return getRuleContext(Tipo_datoContext.class,0);
		}
		public TerminalNode IDENTIFICADOR() { return getToken(CubyParser.IDENTIFICADOR, 0); }
		public Definicion_identificadorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_definicion_identificador; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CubyListener ) ((CubyListener)listener).enterDefinicion_identificador(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CubyListener ) ((CubyListener)listener).exitDefinicion_identificador(this);
		}
	}

	public final Definicion_identificadorContext definicion_identificador() throws RecognitionException {
		Definicion_identificadorContext _localctx = new Definicion_identificadorContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_definicion_identificador);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(158);
			tipo_dato();
			setState(159);
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
		public Definicion_identificadorContext definicion_identificador() {
			return getRuleContext(Definicion_identificadorContext.class,0);
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
		enterRule(_localctx, 26, RULE_declaracion_variable);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(161);
			definicion_identificador();
			setState(162);
			match(OP_ASIGNACION);
			setState(163);
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

	public static class Asignacion_variableContext extends ParserRuleContext {
		public TerminalNode IDENTIFICADOR() { return getToken(CubyParser.IDENTIFICADOR, 0); }
		public TerminalNode OP_ASIGNACION() { return getToken(CubyParser.OP_ASIGNACION, 0); }
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public Asignacion_variableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_asignacion_variable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CubyListener ) ((CubyListener)listener).enterAsignacion_variable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CubyListener ) ((CubyListener)listener).exitAsignacion_variable(this);
		}
	}

	public final Asignacion_variableContext asignacion_variable() throws RecognitionException {
		Asignacion_variableContext _localctx = new Asignacion_variableContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_asignacion_variable);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(165);
			match(IDENTIFICADOR);
			setState(166);
			match(OP_ASIGNACION);
			setState(167);
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

	public static class ProposicionContext extends ParserRuleContext {
		public Declaracion_variableContext declaracion_variable() {
			return getRuleContext(Declaracion_variableContext.class,0);
		}
		public Asignacion_variableContext asignacion_variable() {
			return getRuleContext(Asignacion_variableContext.class,0);
		}
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public SentenciaContext sentencia() {
			return getRuleContext(SentenciaContext.class,0);
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
		enterRule(_localctx, 30, RULE_proposicion);
		try {
			setState(179);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(169);
				declaracion_variable();
				setState(170);
				match(T__3);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(172);
				asignacion_variable();
				setState(173);
				match(T__3);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(175);
				expresion(0);
				setState(176);
				match(T__3);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(178);
				sentencia();
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
		enterRule(_localctx, 32, RULE_tipo_dato);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(181);
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

	public static class DatoContext extends ParserRuleContext {
		public TerminalNode ENTERO() { return getToken(CubyParser.ENTERO, 0); }
		public TerminalNode BOOLEANO() { return getToken(CubyParser.BOOLEANO, 0); }
		public TerminalNode TEXTO() { return getToken(CubyParser.TEXTO, 0); }
		public TerminalNode CARACTER() { return getToken(CubyParser.CARACTER, 0); }
		public DatoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dato; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CubyListener ) ((CubyListener)listener).enterDato(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CubyListener ) ((CubyListener)listener).exitDato(this);
		}
	}

	public final DatoContext dato() throws RecognitionException {
		DatoContext _localctx = new DatoContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_dato);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(183);
			_la = _input.LA(1);
			if ( !(((((_la - 60)) & ~0x3f) == 0 && ((1L << (_la - 60)) & ((1L << (ENTERO - 60)) | (1L << (BOOLEANO - 60)) | (1L << (CARACTER - 60)) | (1L << (TEXTO - 60)))) != 0)) ) {
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

	public static class SentenciaContext extends ParserRuleContext {
		public Sentencia_condicionalContext sentencia_condicional() {
			return getRuleContext(Sentencia_condicionalContext.class,0);
		}
		public Sentencia_de_saltoContext sentencia_de_salto() {
			return getRuleContext(Sentencia_de_saltoContext.class,0);
		}
		public Sentencia_de_iteracionContext sentencia_de_iteracion() {
			return getRuleContext(Sentencia_de_iteracionContext.class,0);
		}
		public BloqueContext bloque() {
			return getRuleContext(BloqueContext.class,0);
		}
		public SentenciaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sentencia; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CubyListener ) ((CubyListener)listener).enterSentencia(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CubyListener ) ((CubyListener)listener).exitSentencia(this);
		}
	}

	public final SentenciaContext sentencia() throws RecognitionException {
		SentenciaContext _localctx = new SentenciaContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_sentencia);
		try {
			setState(189);
			switch (_input.LA(1)) {
			case SI:
			case CASO:
				enterOuterAlt(_localctx, 1);
				{
				setState(185);
				sentencia_condicional();
				}
				break;
			case SALIR:
			case RETORNAR:
			case SEGUIR:
				enterOuterAlt(_localctx, 2);
				{
				setState(186);
				sentencia_de_salto();
				}
				break;
			case PARA:
			case REPITA:
			case MIENTRAS:
			case ENTERO:
			case IDENTIFICADOR:
				enterOuterAlt(_localctx, 3);
				{
				setState(187);
				sentencia_de_iteracion();
				}
				break;
			case DELIMITADOR_BLOQUE:
				enterOuterAlt(_localctx, 4);
				{
				setState(188);
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

	public static class Sentencia_de_saltoContext extends ParserRuleContext {
		public TerminalNode SALIR() { return getToken(CubyParser.SALIR, 0); }
		public TerminalNode SEGUIR() { return getToken(CubyParser.SEGUIR, 0); }
		public TerminalNode RETORNAR() { return getToken(CubyParser.RETORNAR, 0); }
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public Sentencia_de_saltoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sentencia_de_salto; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CubyListener ) ((CubyListener)listener).enterSentencia_de_salto(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CubyListener ) ((CubyListener)listener).exitSentencia_de_salto(this);
		}
	}

	public final Sentencia_de_saltoContext sentencia_de_salto() throws RecognitionException {
		Sentencia_de_saltoContext _localctx = new Sentencia_de_saltoContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_sentencia_de_salto);
		int _la;
		try {
			setState(200);
			switch (_input.LA(1)) {
			case SALIR:
				enterOuterAlt(_localctx, 1);
				{
				setState(191);
				match(SALIR);
				setState(192);
				match(T__3);
				}
				break;
			case SEGUIR:
				enterOuterAlt(_localctx, 2);
				{
				setState(193);
				match(SEGUIR);
				setState(194);
				match(T__3);
				}
				break;
			case RETORNAR:
				enterOuterAlt(_localctx, 3);
				{
				setState(195);
				match(RETORNAR);
				setState(197);
				_la = _input.LA(1);
				if (((((_la - 7)) & ~0x3f) == 0 && ((1L << (_la - 7)) & ((1L << (OP_NEGACION - 7)) | (1L << (OP_DECREMENTAR - 7)) | (1L << (OP_INCREMENTAR - 7)) | (1L << (FUNC_IMPRIMIR - 7)) | (1L << (FUNC_A_MAYUSCULA - 7)) | (1L << (FUNC_A_MINUSCULA - 7)) | (1L << (FUNC_CARACTER_A_ENTERO - 7)) | (1L << (FUNC_ENTERO_A_CARACTER - 7)) | (1L << (FUNC_ENTERO_A_TEXTO - 7)) | (1L << (FUNC_TEXTO_A_ENTERO - 7)) | (1L << (FUNC_LONGITUD_TEXTO - 7)) | (1L << (FUNC_INVERTIR_TEXTO - 7)) | (1L << (FUNC_ES_LETRA - 7)) | (1L << (FUNC_ES_DIGITO - 7)) | (1L << (ENTERO - 7)) | (1L << (BOOLEANO - 7)) | (1L << (IDENTIFICADOR - 7)) | (1L << (CARACTER - 7)) | (1L << (TEXTO - 7)))) != 0)) {
					{
					setState(196);
					expresion(0);
					}
				}

				setState(199);
				match(T__3);
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

	public static class Sentencia_condicionalContext extends ParserRuleContext {
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
		public List<TerminalNode> SINOSI() { return getTokens(CubyParser.SINOSI); }
		public TerminalNode SINOSI(int i) {
			return getToken(CubyParser.SINOSI, i);
		}
		public TerminalNode SINO() { return getToken(CubyParser.SINO, 0); }
		public TerminalNode CASO() { return getToken(CubyParser.CASO, 0); }
		public TerminalNode IDENTIFICADOR() { return getToken(CubyParser.IDENTIFICADOR, 0); }
		public List<TerminalNode> DELIMITADOR_BLOQUE() { return getTokens(CubyParser.DELIMITADOR_BLOQUE); }
		public TerminalNode DELIMITADOR_BLOQUE(int i) {
			return getToken(CubyParser.DELIMITADOR_BLOQUE, i);
		}
		public List<TerminalNode> CUANDO() { return getTokens(CubyParser.CUANDO); }
		public TerminalNode CUANDO(int i) {
			return getToken(CubyParser.CUANDO, i);
		}
		public List<DatoContext> dato() {
			return getRuleContexts(DatoContext.class);
		}
		public DatoContext dato(int i) {
			return getRuleContext(DatoContext.class,i);
		}
		public Sentencia_condicionalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sentencia_condicional; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CubyListener ) ((CubyListener)listener).enterSentencia_condicional(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CubyListener ) ((CubyListener)listener).exitSentencia_condicional(this);
		}
	}

	public final Sentencia_condicionalContext sentencia_condicional() throws RecognitionException {
		Sentencia_condicionalContext _localctx = new Sentencia_condicionalContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_sentencia_condicional);
		int _la;
		try {
			setState(239);
			switch (_input.LA(1)) {
			case SI:
				enterOuterAlt(_localctx, 1);
				{
				setState(202);
				match(SI);
				setState(203);
				match(T__0);
				setState(204);
				expresion(0);
				setState(205);
				match(T__1);
				setState(206);
				bloque();
				setState(215);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==SINOSI) {
					{
					{
					setState(207);
					match(SINOSI);
					setState(208);
					match(T__0);
					setState(209);
					expresion(0);
					setState(210);
					match(T__1);
					setState(211);
					bloque();
					}
					}
					setState(217);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(220);
				_la = _input.LA(1);
				if (_la==SINO) {
					{
					setState(218);
					match(SINO);
					setState(219);
					bloque();
					}
				}

				}
				break;
			case CASO:
				enterOuterAlt(_localctx, 2);
				{
				setState(222);
				match(CASO);
				setState(223);
				match(IDENTIFICADOR);
				setState(224);
				match(DELIMITADOR_BLOQUE);
				setState(229); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(225);
					match(CUANDO);
					setState(226);
					dato();
					setState(227);
					bloque();
					}
					}
					setState(231); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==CUANDO );
				setState(235);
				_la = _input.LA(1);
				if (_la==SINO) {
					{
					setState(233);
					match(SINO);
					setState(234);
					bloque();
					}
				}

				setState(237);
				match(DELIMITADOR_BLOQUE);
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
		enterRule(_localctx, 42, RULE_expresion_actualizacion);
		int _la;
		try {
			setState(248);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(241);
				match(IDENTIFICADOR);
				setState(242);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OP_ASIGNACION) | (1L << OP_ASIGNAR_RESTA) | (1L << OP_ASIGNAR_SUMA) | (1L << OP_ASIGNAR_MULTIPLICACION) | (1L << OP_ASIGNAR_DIVISION) | (1L << OP_ASIGNAR_MODULO))) != 0)) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(243);
				expresion(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(244);
				match(IDENTIFICADOR);
				setState(245);
				_la = _input.LA(1);
				if ( !(_la==OP_DECREMENTAR || _la==OP_INCREMENTAR) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(246);
				_la = _input.LA(1);
				if ( !(_la==OP_DECREMENTAR || _la==OP_INCREMENTAR) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(247);
				match(IDENTIFICADOR);
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

	public static class Sentencia_de_iteracionContext extends ParserRuleContext {
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
		public TerminalNode VECES() { return getToken(CubyParser.VECES, 0); }
		public TerminalNode ENTERO() { return getToken(CubyParser.ENTERO, 0); }
		public TerminalNode IDENTIFICADOR() { return getToken(CubyParser.IDENTIFICADOR, 0); }
		public Sentencia_de_iteracionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sentencia_de_iteracion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CubyListener ) ((CubyListener)listener).enterSentencia_de_iteracion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CubyListener ) ((CubyListener)listener).exitSentencia_de_iteracion(this);
		}
	}

	public final Sentencia_de_iteracionContext sentencia_de_iteracion() throws RecognitionException {
		Sentencia_de_iteracionContext _localctx = new Sentencia_de_iteracionContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_sentencia_de_iteracion);
		int _la;
		try {
			setState(277);
			switch (_input.LA(1)) {
			case PARA:
				enterOuterAlt(_localctx, 1);
				{
				setState(250);
				match(PARA);
				setState(251);
				match(T__0);
				setState(252);
				declaracion_variable();
				setState(253);
				match(T__3);
				setState(254);
				expresion(0);
				setState(255);
				match(T__3);
				setState(256);
				expresion_actualizacion();
				setState(257);
				match(T__1);
				setState(258);
				bloque();
				}
				break;
			case MIENTRAS:
				enterOuterAlt(_localctx, 2);
				{
				setState(260);
				match(MIENTRAS);
				setState(261);
				match(T__0);
				setState(262);
				expresion(0);
				setState(263);
				match(T__1);
				setState(264);
				bloque();
				}
				break;
			case REPITA:
				enterOuterAlt(_localctx, 3);
				{
				setState(266);
				match(REPITA);
				setState(267);
				bloque();
				setState(268);
				match(HASTA);
				setState(269);
				match(T__0);
				setState(270);
				expresion(0);
				setState(271);
				match(T__1);
				}
				break;
			case ENTERO:
			case IDENTIFICADOR:
				enterOuterAlt(_localctx, 4);
				{
				setState(273);
				_la = _input.LA(1);
				if ( !(_la==ENTERO || _la==IDENTIFICADOR) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(274);
				match(T__4);
				setState(275);
				match(VECES);
				setState(276);
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
		public List<ProposicionContext> proposicion() {
			return getRuleContexts(ProposicionContext.class);
		}
		public ProposicionContext proposicion(int i) {
			return getRuleContext(ProposicionContext.class,i);
		}
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
		enterRule(_localctx, 46, RULE_bloque);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(279);
			match(DELIMITADOR_BLOQUE);
			setState(283);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(280);
					proposicion();
					}
					} 
				}
				setState(285);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
			}
			setState(286);
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
		public TerminalNode IDENTIFICADOR() { return getToken(CubyParser.IDENTIFICADOR, 0); }
		public BloqueContext bloque() {
			return getRuleContext(BloqueContext.class,0);
		}
		public Tipo_datoContext tipo_dato() {
			return getRuleContext(Tipo_datoContext.class,0);
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
		enterRule(_localctx, 48, RULE_definir_funcion);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(288);
			match(DEF);
			setState(290);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TIPO_ENTERO) | (1L << TIPO_CARACTER) | (1L << TIPO_TEXTO) | (1L << TIPO_BOOLEANO))) != 0)) {
				{
				setState(289);
				tipo_dato();
				}
			}

			setState(292);
			match(IDENTIFICADOR);
			setState(293);
			match(T__0);
			setState(295);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TIPO_ENTERO) | (1L << TIPO_CARACTER) | (1L << TIPO_TEXTO) | (1L << TIPO_BOOLEANO))) != 0)) {
				{
				setState(294);
				parametros();
				}
			}

			setState(297);
			match(T__1);
			setState(298);
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

	public static class ParametrosContext extends ParserRuleContext {
		public List<ParametroContext> parametro() {
			return getRuleContexts(ParametroContext.class);
		}
		public ParametroContext parametro(int i) {
			return getRuleContext(ParametroContext.class,i);
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
		enterRule(_localctx, 50, RULE_parametros);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(300);
			parametro();
			setState(305);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2) {
				{
				{
				setState(301);
				match(T__2);
				setState(302);
				parametro();
				}
				}
				setState(307);
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
		public Definicion_identificadorContext definicion_identificador() {
			return getRuleContext(Definicion_identificadorContext.class,0);
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
		enterRule(_localctx, 52, RULE_parametro);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(308);
			definicion_identificador();
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
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
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
		enterRule(_localctx, 54, RULE_llamada_imprimir);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(310);
			match(FUNC_IMPRIMIR);
			setState(311);
			match(T__0);
			setState(312);
			expresion(0);
			setState(313);
			match(T__1);
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
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
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
		enterRule(_localctx, 56, RULE_llamada_amay);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(315);
			match(FUNC_A_MAYUSCULA);
			setState(316);
			match(T__0);
			setState(317);
			expresion(0);
			setState(318);
			match(T__1);
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
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
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
		enterRule(_localctx, 58, RULE_llamada_amin);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(320);
			match(FUNC_A_MINUSCULA);
			setState(321);
			match(T__0);
			setState(322);
			expresion(0);
			setState(323);
			match(T__1);
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
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
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
		enterRule(_localctx, 60, RULE_llamada_cae);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(325);
			match(FUNC_CARACTER_A_ENTERO);
			setState(326);
			match(T__0);
			setState(327);
			expresion(0);
			setState(328);
			match(T__1);
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
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
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
		enterRule(_localctx, 62, RULE_llamada_eac);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(330);
			match(FUNC_ENTERO_A_CARACTER);
			setState(331);
			match(T__0);
			setState(332);
			expresion(0);
			setState(333);
			match(T__1);
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
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
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
		enterRule(_localctx, 64, RULE_llamada_tae);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(335);
			match(FUNC_TEXTO_A_ENTERO);
			setState(336);
			match(T__0);
			setState(337);
			expresion(0);
			setState(338);
			match(T__1);
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

	public static class Llamada_eatContext extends ParserRuleContext {
		public TerminalNode FUNC_ENTERO_A_TEXTO() { return getToken(CubyParser.FUNC_ENTERO_A_TEXTO, 0); }
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public Llamada_eatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_llamada_eat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CubyListener ) ((CubyListener)listener).enterLlamada_eat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CubyListener ) ((CubyListener)listener).exitLlamada_eat(this);
		}
	}

	public final Llamada_eatContext llamada_eat() throws RecognitionException {
		Llamada_eatContext _localctx = new Llamada_eatContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_llamada_eat);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(340);
			match(FUNC_ENTERO_A_TEXTO);
			setState(341);
			match(T__0);
			setState(342);
			expresion(0);
			setState(343);
			match(T__1);
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
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
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
		enterRule(_localctx, 68, RULE_llamada_longitud);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(345);
			match(FUNC_LONGITUD_TEXTO);
			setState(346);
			match(T__0);
			setState(347);
			expresion(0);
			setState(348);
			match(T__1);
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
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
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
		enterRule(_localctx, 70, RULE_llamada_invertir);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(350);
			match(FUNC_INVERTIR_TEXTO);
			setState(351);
			match(T__0);
			setState(352);
			expresion(0);
			setState(353);
			match(T__1);
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
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
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
		enterRule(_localctx, 72, RULE_llamada_esLetra);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(355);
			match(FUNC_ES_LETRA);
			setState(356);
			match(T__0);
			setState(357);
			expresion(0);
			setState(358);
			match(T__1);
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
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
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
		enterRule(_localctx, 74, RULE_llamada_esDigito);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(360);
			match(FUNC_ES_DIGITO);
			setState(361);
			match(T__0);
			setState(362);
			expresion(0);
			setState(363);
			match(T__1);
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
		enterRule(_localctx, 76, RULE_funcion_principal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(365);
			match(FUNC_PRINCIPAL);
			setState(366);
			match(T__0);
			setState(367);
			match(T__1);
			setState(368);
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

	public static class FuncionesContext extends ParserRuleContext {
		public List<Definir_funcionContext> definir_funcion() {
			return getRuleContexts(Definir_funcionContext.class);
		}
		public Definir_funcionContext definir_funcion(int i) {
			return getRuleContext(Definir_funcionContext.class,i);
		}
		public FuncionesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funciones; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CubyListener ) ((CubyListener)listener).enterFunciones(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CubyListener ) ((CubyListener)listener).exitFunciones(this);
		}
	}

	public final FuncionesContext funciones() throws RecognitionException {
		FuncionesContext _localctx = new FuncionesContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_funciones);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(370);
			definir_funcion();
			setState(374);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==DEF) {
				{
				{
				setState(371);
				definir_funcion();
				}
				}
				setState(376);
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

	public static class ProgramaContext extends ParserRuleContext {
		public Funcion_principalContext funcion_principal() {
			return getRuleContext(Funcion_principalContext.class,0);
		}
		public TerminalNode EOF() { return getToken(CubyParser.EOF, 0); }
		public FuncionesContext funciones() {
			return getRuleContext(FuncionesContext.class,0);
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
		enterRule(_localctx, 80, RULE_programa);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(378);
			_la = _input.LA(1);
			if (_la==DEF) {
				{
				setState(377);
				funciones();
				}
			}

			setState(380);
			funcion_principal();
			setState(381);
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
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3C\u0182\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\3\2\3\2"+
		"\3\2\3\2\3\2\3\2\3\2\3\2\3\2\5\2^\n\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2"+
		"\3\2\3\2\3\2\3\2\7\2l\n\2\f\2\16\2o\13\2\3\3\3\3\5\3s\n\3\3\4\3\4\3\5"+
		"\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\5\t\u0081\n\t\3\n\3\n\3\n\3\n\3\n"+
		"\3\n\3\n\3\n\3\n\3\n\3\n\5\n\u008e\n\n\3\13\3\13\3\13\5\13\u0093\n\13"+
		"\3\13\3\13\3\f\3\f\3\f\7\f\u009a\n\f\f\f\16\f\u009d\13\f\3\r\3\r\3\16"+
		"\3\16\3\16\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\5\21\u00b6\n\21\3\22\3\22\3\23\3\23\3\24"+
		"\3\24\3\24\3\24\5\24\u00c0\n\24\3\25\3\25\3\25\3\25\3\25\3\25\5\25\u00c8"+
		"\n\25\3\25\5\25\u00cb\n\25\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26"+
		"\3\26\3\26\7\26\u00d8\n\26\f\26\16\26\u00db\13\26\3\26\3\26\5\26\u00df"+
		"\n\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\6\26\u00e8\n\26\r\26\16\26\u00e9"+
		"\3\26\3\26\5\26\u00ee\n\26\3\26\3\26\5\26\u00f2\n\26\3\27\3\27\3\27\3"+
		"\27\3\27\3\27\3\27\5\27\u00fb\n\27\3\30\3\30\3\30\3\30\3\30\3\30\3\30"+
		"\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30"+
		"\3\30\3\30\3\30\3\30\3\30\3\30\5\30\u0118\n\30\3\31\3\31\7\31\u011c\n"+
		"\31\f\31\16\31\u011f\13\31\3\31\3\31\3\32\3\32\5\32\u0125\n\32\3\32\3"+
		"\32\3\32\5\32\u012a\n\32\3\32\3\32\3\32\3\33\3\33\3\33\7\33\u0132\n\33"+
		"\f\33\16\33\u0135\13\33\3\34\3\34\3\35\3\35\3\35\3\35\3\35\3\36\3\36\3"+
		"\36\3\36\3\36\3\37\3\37\3\37\3\37\3\37\3 \3 \3 \3 \3 \3!\3!\3!\3!\3!\3"+
		"\"\3\"\3\"\3\"\3\"\3#\3#\3#\3#\3#\3$\3$\3$\3$\3$\3%\3%\3%\3%\3%\3&\3&"+
		"\3&\3&\3&\3\'\3\'\3\'\3\'\3\'\3(\3(\3(\3(\3(\3)\3)\7)\u0177\n)\f)\16)"+
		"\u017a\13)\3*\5*\u017d\n*\3*\3*\3*\3*\2\3\2+\2\4\6\b\n\f\16\20\22\24\26"+
		"\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPR\2\13\4\2>@BC\4\2\22\26"+
		"\32\36\3\2\27\30\3\2\n\13\3\2\f\21\3\29<\4\2>?BC\3\2\31\36\4\2>>@@\u0185"+
		"\2]\3\2\2\2\4r\3\2\2\2\6t\3\2\2\2\bv\3\2\2\2\nx\3\2\2\2\fz\3\2\2\2\16"+
		"|\3\2\2\2\20\u0080\3\2\2\2\22\u008d\3\2\2\2\24\u008f\3\2\2\2\26\u0096"+
		"\3\2\2\2\30\u009e\3\2\2\2\32\u00a0\3\2\2\2\34\u00a3\3\2\2\2\36\u00a7\3"+
		"\2\2\2 \u00b5\3\2\2\2\"\u00b7\3\2\2\2$\u00b9\3\2\2\2&\u00bf\3\2\2\2(\u00ca"+
		"\3\2\2\2*\u00f1\3\2\2\2,\u00fa\3\2\2\2.\u0117\3\2\2\2\60\u0119\3\2\2\2"+
		"\62\u0122\3\2\2\2\64\u012e\3\2\2\2\66\u0136\3\2\2\28\u0138\3\2\2\2:\u013d"+
		"\3\2\2\2<\u0142\3\2\2\2>\u0147\3\2\2\2@\u014c\3\2\2\2B\u0151\3\2\2\2D"+
		"\u0156\3\2\2\2F\u015b\3\2\2\2H\u0160\3\2\2\2J\u0165\3\2\2\2L\u016a\3\2"+
		"\2\2N\u016f\3\2\2\2P\u0174\3\2\2\2R\u017c\3\2\2\2TU\b\2\1\2UV\7\t\2\2"+
		"V^\5\2\2\3W^\5\4\3\2XY\7@\2\2Y^\5\n\6\2Z[\5\n\6\2[\\\7@\2\2\\^\3\2\2\2"+
		"]T\3\2\2\2]W\3\2\2\2]X\3\2\2\2]Z\3\2\2\2^m\3\2\2\2_`\f\b\2\2`a\5\b\5\2"+
		"ab\5\2\2\tbl\3\2\2\2cd\f\7\2\2de\5\f\7\2ef\5\2\2\bfl\3\2\2\2gh\f\6\2\2"+
		"hi\5\16\b\2ij\5\2\2\7jl\3\2\2\2k_\3\2\2\2kc\3\2\2\2kg\3\2\2\2lo\3\2\2"+
		"\2mk\3\2\2\2mn\3\2\2\2n\3\3\2\2\2om\3\2\2\2ps\5\6\4\2qs\5\20\t\2rp\3\2"+
		"\2\2rq\3\2\2\2s\5\3\2\2\2tu\t\2\2\2u\7\3\2\2\2vw\t\3\2\2w\t\3\2\2\2xy"+
		"\t\4\2\2y\13\3\2\2\2z{\t\5\2\2{\r\3\2\2\2|}\t\6\2\2}\17\3\2\2\2~\u0081"+
		"\5\24\13\2\177\u0081\5\22\n\2\u0080~\3\2\2\2\u0080\177\3\2\2\2\u0081\21"+
		"\3\2\2\2\u0082\u008e\58\35\2\u0083\u008e\5:\36\2\u0084\u008e\5> \2\u0085"+
		"\u008e\5@!\2\u0086\u008e\5B\"\2\u0087\u008e\5D#\2\u0088\u008e\5F$\2\u0089"+
		"\u008e\5H%\2\u008a\u008e\5L\'\2\u008b\u008e\5<\37\2\u008c\u008e\5J&\2"+
		"\u008d\u0082\3\2\2\2\u008d\u0083\3\2\2\2\u008d\u0084\3\2\2\2\u008d\u0085"+
		"\3\2\2\2\u008d\u0086\3\2\2\2\u008d\u0087\3\2\2\2\u008d\u0088\3\2\2\2\u008d"+
		"\u0089\3\2\2\2\u008d\u008a\3\2\2\2\u008d\u008b\3\2\2\2\u008d\u008c\3\2"+
		"\2\2\u008e\23\3\2\2\2\u008f\u0090\7@\2\2\u0090\u0092\7\3\2\2\u0091\u0093"+
		"\5\26\f\2\u0092\u0091\3\2\2\2\u0092\u0093\3\2\2\2\u0093\u0094\3\2\2\2"+
		"\u0094\u0095\7\4\2\2\u0095\25\3\2\2\2\u0096\u009b\5\30\r\2\u0097\u0098"+
		"\7\5\2\2\u0098\u009a\5\30\r\2\u0099\u0097\3\2\2\2\u009a\u009d\3\2\2\2"+
		"\u009b\u0099\3\2\2\2\u009b\u009c\3\2\2\2\u009c\27\3\2\2\2\u009d\u009b"+
		"\3\2\2\2\u009e\u009f\5\2\2\2\u009f\31\3\2\2\2\u00a0\u00a1\5\"\22\2\u00a1"+
		"\u00a2\7@\2\2\u00a2\33\3\2\2\2\u00a3\u00a4\5\32\16\2\u00a4\u00a5\7\31"+
		"\2\2\u00a5\u00a6\5\2\2\2\u00a6\35\3\2\2\2\u00a7\u00a8\7@\2\2\u00a8\u00a9"+
		"\7\31\2\2\u00a9\u00aa\5\2\2\2\u00aa\37\3\2\2\2\u00ab\u00ac\5\34\17\2\u00ac"+
		"\u00ad\7\6\2\2\u00ad\u00b6\3\2\2\2\u00ae\u00af\5\36\20\2\u00af\u00b0\7"+
		"\6\2\2\u00b0\u00b6\3\2\2\2\u00b1\u00b2\5\2\2\2\u00b2\u00b3\7\6\2\2\u00b3"+
		"\u00b6\3\2\2\2\u00b4\u00b6\5&\24\2\u00b5\u00ab\3\2\2\2\u00b5\u00ae\3\2"+
		"\2\2\u00b5\u00b1\3\2\2\2\u00b5\u00b4\3\2\2\2\u00b6!\3\2\2\2\u00b7\u00b8"+
		"\t\7\2\2\u00b8#\3\2\2\2\u00b9\u00ba\t\b\2\2\u00ba%\3\2\2\2\u00bb\u00c0"+
		"\5*\26\2\u00bc\u00c0\5(\25\2\u00bd\u00c0\5.\30\2\u00be\u00c0\5\60\31\2"+
		"\u00bf\u00bb\3\2\2\2\u00bf\u00bc\3\2\2\2\u00bf\u00bd\3\2\2\2\u00bf\u00be"+
		"\3\2\2\2\u00c0\'\3\2\2\2\u00c1\u00c2\7\62\2\2\u00c2\u00cb\7\6\2\2\u00c3"+
		"\u00c4\7\66\2\2\u00c4\u00cb\7\6\2\2\u00c5\u00c7\7\63\2\2\u00c6\u00c8\5"+
		"\2\2\2\u00c7\u00c6\3\2\2\2\u00c7\u00c8\3\2\2\2\u00c8\u00c9\3\2\2\2\u00c9"+
		"\u00cb\7\6\2\2\u00ca\u00c1\3\2\2\2\u00ca\u00c3\3\2\2\2\u00ca\u00c5\3\2"+
		"\2\2\u00cb)\3\2\2\2\u00cc\u00cd\7.\2\2\u00cd\u00ce\7\3\2\2\u00ce\u00cf"+
		"\5\2\2\2\u00cf\u00d0\7\4\2\2\u00d0\u00d9\5\60\31\2\u00d1\u00d2\7/\2\2"+
		"\u00d2\u00d3\7\3\2\2\u00d3\u00d4\5\2\2\2\u00d4\u00d5\7\4\2\2\u00d5\u00d6"+
		"\5\60\31\2\u00d6\u00d8\3\2\2\2\u00d7\u00d1\3\2\2\2\u00d8\u00db\3\2\2\2"+
		"\u00d9\u00d7\3\2\2\2\u00d9\u00da\3\2\2\2\u00da\u00de\3\2\2\2\u00db\u00d9"+
		"\3\2\2\2\u00dc\u00dd\7\60\2\2\u00dd\u00df\5\60\31\2\u00de\u00dc\3\2\2"+
		"\2\u00de\u00df\3\2\2\2\u00df\u00f2\3\2\2\2\u00e0\u00e1\7\64\2\2\u00e1"+
		"\u00e2\7@\2\2\u00e2\u00e7\7\b\2\2\u00e3\u00e4\7\65\2\2\u00e4\u00e5\5$"+
		"\23\2\u00e5\u00e6\5\60\31\2\u00e6\u00e8\3\2\2\2\u00e7\u00e3\3\2\2\2\u00e8"+
		"\u00e9\3\2\2\2\u00e9\u00e7\3\2\2\2\u00e9\u00ea\3\2\2\2\u00ea\u00ed\3\2"+
		"\2\2\u00eb\u00ec\7\60\2\2\u00ec\u00ee\5\60\31\2\u00ed\u00eb\3\2\2\2\u00ed"+
		"\u00ee\3\2\2\2\u00ee\u00ef\3\2\2\2\u00ef\u00f0\7\b\2\2\u00f0\u00f2\3\2"+
		"\2\2\u00f1\u00cc\3\2\2\2\u00f1\u00e0\3\2\2\2\u00f2+\3\2\2\2\u00f3\u00f4"+
		"\7@\2\2\u00f4\u00f5\t\t\2\2\u00f5\u00fb\5\2\2\2\u00f6\u00f7\7@\2\2\u00f7"+
		"\u00fb\t\4\2\2\u00f8\u00f9\t\4\2\2\u00f9\u00fb\7@\2\2\u00fa\u00f3\3\2"+
		"\2\2\u00fa\u00f6\3\2\2\2\u00fa\u00f8\3\2\2\2\u00fb-\3\2\2\2\u00fc\u00fd"+
		"\7+\2\2\u00fd\u00fe\7\3\2\2\u00fe\u00ff\5\34\17\2\u00ff\u0100\7\6\2\2"+
		"\u0100\u0101\5\2\2\2\u0101\u0102\7\6\2\2\u0102\u0103\5,\27\2\u0103\u0104"+
		"\7\4\2\2\u0104\u0105\5\60\31\2\u0105\u0118\3\2\2\2\u0106\u0107\7-\2\2"+
		"\u0107\u0108\7\3\2\2\u0108\u0109\5\2\2\2\u0109\u010a\7\4\2\2\u010a\u010b"+
		"\5\60\31\2\u010b\u0118\3\2\2\2\u010c\u010d\7,\2\2\u010d\u010e\5\60\31"+
		"\2\u010e\u010f\78\2\2\u010f\u0110\7\3\2\2\u0110\u0111\5\2\2\2\u0111\u0112"+
		"\7\4\2\2\u0112\u0118\3\2\2\2\u0113\u0114\t\n\2\2\u0114\u0115\7\7\2\2\u0115"+
		"\u0116\7\67\2\2\u0116\u0118\5\60\31\2\u0117\u00fc\3\2\2\2\u0117\u0106"+
		"\3\2\2\2\u0117\u010c\3\2\2\2\u0117\u0113\3\2\2\2\u0118/\3\2\2\2\u0119"+
		"\u011d\7\b\2\2\u011a\u011c\5 \21\2\u011b\u011a\3\2\2\2\u011c\u011f\3\2"+
		"\2\2\u011d\u011b\3\2\2\2\u011d\u011e\3\2\2\2\u011e\u0120\3\2\2\2\u011f"+
		"\u011d\3\2\2\2\u0120\u0121\7\b\2\2\u0121\61\3\2\2\2\u0122\u0124\7\61\2"+
		"\2\u0123\u0125\5\"\22\2\u0124\u0123\3\2\2\2\u0124\u0125\3\2\2\2\u0125"+
		"\u0126\3\2\2\2\u0126\u0127\7@\2\2\u0127\u0129\7\3\2\2\u0128\u012a\5\64"+
		"\33\2\u0129\u0128\3\2\2\2\u0129\u012a\3\2\2\2\u012a\u012b\3\2\2\2\u012b"+
		"\u012c\7\4\2\2\u012c\u012d\5\60\31\2\u012d\63\3\2\2\2\u012e\u0133\5\66"+
		"\34\2\u012f\u0130\7\5\2\2\u0130\u0132\5\66\34\2\u0131\u012f\3\2\2\2\u0132"+
		"\u0135\3\2\2\2\u0133\u0131\3\2\2\2\u0133\u0134\3\2\2\2\u0134\65\3\2\2"+
		"\2\u0135\u0133\3\2\2\2\u0136\u0137\5\32\16\2\u0137\67\3\2\2\2\u0138\u0139"+
		"\7\37\2\2\u0139\u013a\7\3\2\2\u013a\u013b\5\2\2\2\u013b\u013c\7\4\2\2"+
		"\u013c9\3\2\2\2\u013d\u013e\7!\2\2\u013e\u013f\7\3\2\2\u013f\u0140\5\2"+
		"\2\2\u0140\u0141\7\4\2\2\u0141;\3\2\2\2\u0142\u0143\7\"\2\2\u0143\u0144"+
		"\7\3\2\2\u0144\u0145\5\2\2\2\u0145\u0146\7\4\2\2\u0146=\3\2\2\2\u0147"+
		"\u0148\7#\2\2\u0148\u0149\7\3\2\2\u0149\u014a\5\2\2\2\u014a\u014b\7\4"+
		"\2\2\u014b?\3\2\2\2\u014c\u014d\7$\2\2\u014d\u014e\7\3\2\2\u014e\u014f"+
		"\5\2\2\2\u014f\u0150\7\4\2\2\u0150A\3\2\2\2\u0151\u0152\7&\2\2\u0152\u0153"+
		"\7\3\2\2\u0153\u0154\5\2\2\2\u0154\u0155\7\4\2\2\u0155C\3\2\2\2\u0156"+
		"\u0157\7%\2\2\u0157\u0158\7\3\2\2\u0158\u0159\5\2\2\2\u0159\u015a\7\4"+
		"\2\2\u015aE\3\2\2\2\u015b\u015c\7\'\2\2\u015c\u015d\7\3\2\2\u015d\u015e"+
		"\5\2\2\2\u015e\u015f\7\4\2\2\u015fG\3\2\2\2\u0160\u0161\7(\2\2\u0161\u0162"+
		"\7\3\2\2\u0162\u0163\5\2\2\2\u0163\u0164\7\4\2\2\u0164I\3\2\2\2\u0165"+
		"\u0166\7)\2\2\u0166\u0167\7\3\2\2\u0167\u0168\5\2\2\2\u0168\u0169\7\4"+
		"\2\2\u0169K\3\2\2\2\u016a\u016b\7*\2\2\u016b\u016c\7\3\2\2\u016c\u016d"+
		"\5\2\2\2\u016d\u016e\7\4\2\2\u016eM\3\2\2\2\u016f\u0170\7 \2\2\u0170\u0171"+
		"\7\3\2\2\u0171\u0172\7\4\2\2\u0172\u0173\5\60\31\2\u0173O\3\2\2\2\u0174"+
		"\u0178\5\62\32\2\u0175\u0177\5\62\32\2\u0176\u0175\3\2\2\2\u0177\u017a"+
		"\3\2\2\2\u0178\u0176\3\2\2\2\u0178\u0179\3\2\2\2\u0179Q\3\2\2\2\u017a"+
		"\u0178\3\2\2\2\u017b\u017d\5P)\2\u017c\u017b\3\2\2\2\u017c\u017d\3\2\2"+
		"\2\u017d\u017e\3\2\2\2\u017e\u017f\5N(\2\u017f\u0180\7\2\2\3\u0180S\3"+
		"\2\2\2\33]kmr\u0080\u008d\u0092\u009b\u00b5\u00bf\u00c7\u00ca\u00d9\u00de"+
		"\u00e9\u00ed\u00f1\u00fa\u0117\u011d\u0124\u0129\u0133\u0178\u017c";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}