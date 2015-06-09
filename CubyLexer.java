// Generated from Cuby.g4 by ANTLR 4.5
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class CubyLexer extends Lexer {
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
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "DELIMITADOR_BLOQUE", "OP_NEGACION", 
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
		"COMILLA", "CARACTER", "TEXTO"
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


	public CubyLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Cuby.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2C\u01d3\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3"+
		"\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\13\3\f\3\f\3\f\3\r"+
		"\3\r\3\16\3\16\3\17\3\17\3\17\3\20\3\20\3\20\3\21\3\21\3\22\3\22\3\23"+
		"\3\23\3\24\3\24\3\25\3\25\3\26\3\26\3\26\3\27\3\27\3\27\3\30\3\30\3\31"+
		"\3\31\3\31\3\32\3\32\3\32\3\33\3\33\3\33\3\34\3\34\3\34\3\35\3\35\3\35"+
		"\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\37\3\37\3\37\3\37\3\37"+
		"\3\37\3\37\3\37\3\37\3\37\3 \3 \3 \3 \3 \3!\3!\3!\3!\3!\3\"\3\"\3\"\3"+
		"\"\3#\3#\3#\3#\3$\3$\3$\3$\3%\3%\3%\3%\3&\3&\3&\3&\3&\3&\3&\3&\3&\3\'"+
		"\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3(\3(\3(\3(\3(\3(\3(\3(\3(\3)\3)\3)\3"+
		")\3)\3)\3)\3)\3)\3)\3*\3*\3*\3*\3*\3+\3+\3+\3+\3+\3+\3+\3,\3,\3,\3,\3"+
		",\3,\3,\3,\3,\3-\3-\3-\3.\3.\3.\3.\3.\3.\3.\3.\3/\3/\3/\3/\3/\3\60\3\60"+
		"\3\60\3\60\3\61\3\61\3\61\3\61\3\61\3\61\3\62\3\62\3\62\3\62\3\63\3\63"+
		"\3\63\3\63\3\63\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\65\3\65\3\65\3\65"+
		"\3\65\3\65\3\65\3\66\3\66\3\66\3\66\3\66\3\66\3\67\3\67\3\67\3\67\3\67"+
		"\3\67\38\38\38\38\38\38\38\39\39\39\39\39\39\39\39\39\3:\3:\3:\3:\3:\3"+
		":\3;\3;\3;\3;\3;\3;\3;\3;\3;\3<\6<\u018f\n<\r<\16<\u0190\3<\3<\3=\3=\5"+
		"=\u0197\n=\3=\3=\7=\u019b\n=\f=\16=\u019e\13=\5=\u01a0\n=\3>\3>\3>\3>"+
		"\3>\3>\3>\3>\3>\3>\3>\3>\3>\3>\5>\u01b0\n>\3?\6?\u01b3\n?\r?\16?\u01b4"+
		"\3@\3@\3@\3@\7@\u01bb\n@\f@\16@\u01be\13@\3@\3@\3@\3@\3@\3A\3A\3B\3B\3"+
		"B\3B\3C\3C\7C\u01cd\nC\fC\16C\u01d0\13C\3C\3C\4\u01bc\u01ce\2D\3\3\5\4"+
		"\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22"+
		"#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C"+
		"#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60_\61a\62c\63e\64g\65i\66k\67m8o9q:s;u<w"+
		"=y>{?}@\177A\u0081\2\u0083B\u0085C\3\2\7\5\2\13\f\17\17\"\"\3\2\62\62"+
		"\3\2\63;\3\2\62;\4\2C\\c|\u01d9\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2"+
		"\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2"+
		"\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2"+
		"\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2"+
		"\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2"+
		"\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2"+
		"\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O"+
		"\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2"+
		"\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2g\3\2\2\2"+
		"\2i\3\2\2\2\2k\3\2\2\2\2m\3\2\2\2\2o\3\2\2\2\2q\3\2\2\2\2s\3\2\2\2\2u"+
		"\3\2\2\2\2w\3\2\2\2\2y\3\2\2\2\2{\3\2\2\2\2}\3\2\2\2\2\177\3\2\2\2\2\u0083"+
		"\3\2\2\2\2\u0085\3\2\2\2\3\u0087\3\2\2\2\5\u0089\3\2\2\2\7\u008b\3\2\2"+
		"\2\t\u008d\3\2\2\2\13\u008f\3\2\2\2\r\u0091\3\2\2\2\17\u0093\3\2\2\2\21"+
		"\u0095\3\2\2\2\23\u0097\3\2\2\2\25\u0099\3\2\2\2\27\u009c\3\2\2\2\31\u009f"+
		"\3\2\2\2\33\u00a1\3\2\2\2\35\u00a3\3\2\2\2\37\u00a6\3\2\2\2!\u00a9\3\2"+
		"\2\2#\u00ab\3\2\2\2%\u00ad\3\2\2\2\'\u00af\3\2\2\2)\u00b1\3\2\2\2+\u00b3"+
		"\3\2\2\2-\u00b6\3\2\2\2/\u00b9\3\2\2\2\61\u00bb\3\2\2\2\63\u00be\3\2\2"+
		"\2\65\u00c1\3\2\2\2\67\u00c4\3\2\2\29\u00c7\3\2\2\2;\u00ca\3\2\2\2=\u00d3"+
		"\3\2\2\2?\u00dd\3\2\2\2A\u00e2\3\2\2\2C\u00e7\3\2\2\2E\u00eb\3\2\2\2G"+
		"\u00ef\3\2\2\2I\u00f3\3\2\2\2K\u00f7\3\2\2\2M\u0100\3\2\2\2O\u0109\3\2"+
		"\2\2Q\u0112\3\2\2\2S\u011c\3\2\2\2U\u0121\3\2\2\2W\u0128\3\2\2\2Y\u0131"+
		"\3\2\2\2[\u0134\3\2\2\2]\u013c\3\2\2\2_\u0141\3\2\2\2a\u0145\3\2\2\2c"+
		"\u014b\3\2\2\2e\u014f\3\2\2\2g\u0154\3\2\2\2i\u015b\3\2\2\2k\u0162\3\2"+
		"\2\2m\u0168\3\2\2\2o\u016e\3\2\2\2q\u0175\3\2\2\2s\u017e\3\2\2\2u\u0184"+
		"\3\2\2\2w\u018e\3\2\2\2y\u019f\3\2\2\2{\u01af\3\2\2\2}\u01b2\3\2\2\2\177"+
		"\u01b6\3\2\2\2\u0081\u01c4\3\2\2\2\u0083\u01c6\3\2\2\2\u0085\u01ca\3\2"+
		"\2\2\u0087\u0088\7*\2\2\u0088\4\3\2\2\2\u0089\u008a\7+\2\2\u008a\6\3\2"+
		"\2\2\u008b\u008c\7.\2\2\u008c\b\3\2\2\2\u008d\u008e\7=\2\2\u008e\n\3\2"+
		"\2\2\u008f\u0090\7\60\2\2\u0090\f\3\2\2\2\u0091\u0092\7~\2\2\u0092\16"+
		"\3\2\2\2\u0093\u0094\7\u0080\2\2\u0094\20\3\2\2\2\u0095\u0096\7{\2\2\u0096"+
		"\22\3\2\2\2\u0097\u0098\7q\2\2\u0098\24\3\2\2\2\u0099\u009a\7?\2\2\u009a"+
		"\u009b\7?\2\2\u009b\26\3\2\2\2\u009c\u009d\7#\2\2\u009d\u009e\7?\2\2\u009e"+
		"\30\3\2\2\2\u009f\u00a0\7@\2\2\u00a0\32\3\2\2\2\u00a1\u00a2\7>\2\2\u00a2"+
		"\34\3\2\2\2\u00a3\u00a4\7>\2\2\u00a4\u00a5\7?\2\2\u00a5\36\3\2\2\2\u00a6"+
		"\u00a7\7@\2\2\u00a7\u00a8\7?\2\2\u00a8 \3\2\2\2\u00a9\u00aa\7,\2\2\u00aa"+
		"\"\3\2\2\2\u00ab\u00ac\7\61\2\2\u00ac$\3\2\2\2\u00ad\u00ae\7\'\2\2\u00ae"+
		"&\3\2\2\2\u00af\u00b0\7-\2\2\u00b0(\3\2\2\2\u00b1\u00b2\7/\2\2\u00b2*"+
		"\3\2\2\2\u00b3\u00b4\7/\2\2\u00b4\u00b5\7/\2\2\u00b5,\3\2\2\2\u00b6\u00b7"+
		"\7-\2\2\u00b7\u00b8\7-\2\2\u00b8.\3\2\2\2\u00b9\u00ba\7?\2\2\u00ba\60"+
		"\3\2\2\2\u00bb\u00bc\7/\2\2\u00bc\u00bd\7?\2\2\u00bd\62\3\2\2\2\u00be"+
		"\u00bf\7-\2\2\u00bf\u00c0\7?\2\2\u00c0\64\3\2\2\2\u00c1\u00c2\7,\2\2\u00c2"+
		"\u00c3\7?\2\2\u00c3\66\3\2\2\2\u00c4\u00c5\7\61\2\2\u00c5\u00c6\7?\2\2"+
		"\u00c68\3\2\2\2\u00c7\u00c8\7\'\2\2\u00c8\u00c9\7?\2\2\u00c9:\3\2\2\2"+
		"\u00ca\u00cb\7g\2\2\u00cb\u00cc\7u\2\2\u00cc\u00cd\7e\2\2\u00cd\u00ce"+
		"\7t\2\2\u00ce\u00cf\7k\2\2\u00cf\u00d0\7d\2\2\u00d0\u00d1\7k\2\2\u00d1"+
		"\u00d2\7t\2\2\u00d2<\3\2\2\2\u00d3\u00d4\7r\2\2\u00d4\u00d5\7t\2\2\u00d5"+
		"\u00d6\7k\2\2\u00d6\u00d7\7p\2\2\u00d7\u00d8\7e\2\2\u00d8\u00d9\7k\2\2"+
		"\u00d9\u00da\7r\2\2\u00da\u00db\7c\2\2\u00db\u00dc\7n\2\2\u00dc>\3\2\2"+
		"\2\u00dd\u00de\7c\2\2\u00de\u00df\7O\2\2\u00df\u00e0\7c\2\2\u00e0\u00e1"+
		"\7{\2\2\u00e1@\3\2\2\2\u00e2\u00e3\7c\2\2\u00e3\u00e4\7O\2\2\u00e4\u00e5"+
		"\7k\2\2\u00e5\u00e6\7p\2\2\u00e6B\3\2\2\2\u00e7\u00e8\7e\2\2\u00e8\u00e9"+
		"\7c\2\2\u00e9\u00ea\7g\2\2\u00eaD\3\2\2\2\u00eb\u00ec\7g\2\2\u00ec\u00ed"+
		"\7c\2\2\u00ed\u00ee\7e\2\2\u00eeF\3\2\2\2\u00ef\u00f0\7g\2\2\u00f0\u00f1"+
		"\7c\2\2\u00f1\u00f2\7v\2\2\u00f2H\3\2\2\2\u00f3\u00f4\7v\2\2\u00f4\u00f5"+
		"\7c\2\2\u00f5\u00f6\7g\2\2\u00f6J\3\2\2\2\u00f7\u00f8\7n\2\2\u00f8\u00f9"+
		"\7q\2\2\u00f9\u00fa\7p\2\2\u00fa\u00fb\7i\2\2\u00fb\u00fc\7k\2\2\u00fc"+
		"\u00fd\7v\2\2\u00fd\u00fe\7w\2\2\u00fe\u00ff\7f\2\2\u00ffL\3\2\2\2\u0100"+
		"\u0101\7k\2\2\u0101\u0102\7p\2\2\u0102\u0103\7x\2\2\u0103\u0104\7g\2\2"+
		"\u0104\u0105\7t\2\2\u0105\u0106\7v\2\2\u0106\u0107\7k\2\2\u0107\u0108"+
		"\7t\2\2\u0108N\3\2\2\2\u0109\u010a\7g\2\2\u010a\u010b\7u\2\2\u010b\u010c"+
		"\7N\2\2\u010c\u010d\7g\2\2\u010d\u010e\7v\2\2\u010e\u010f\7t\2\2\u010f"+
		"\u0110\7c\2\2\u0110\u0111\7A\2\2\u0111P\3\2\2\2\u0112\u0113\7g\2\2\u0113"+
		"\u0114\7u\2\2\u0114\u0115\7F\2\2\u0115\u0116\7k\2\2\u0116\u0117\7i\2\2"+
		"\u0117\u0118\7k\2\2\u0118\u0119\7v\2\2\u0119\u011a\7q\2\2\u011a\u011b"+
		"\7A\2\2\u011bR\3\2\2\2\u011c\u011d\7r\2\2\u011d\u011e\7c\2\2\u011e\u011f"+
		"\7t\2\2\u011f\u0120\7c\2\2\u0120T\3\2\2\2\u0121\u0122\7t\2\2\u0122\u0123"+
		"\7g\2\2\u0123\u0124\7r\2\2\u0124\u0125\7k\2\2\u0125\u0126\7v\2\2\u0126"+
		"\u0127\7c\2\2\u0127V\3\2\2\2\u0128\u0129\7o\2\2\u0129\u012a\7k\2\2\u012a"+
		"\u012b\7g\2\2\u012b\u012c\7p\2\2\u012c\u012d\7v\2\2\u012d\u012e\7t\2\2"+
		"\u012e\u012f\7c\2\2\u012f\u0130\7u\2\2\u0130X\3\2\2\2\u0131\u0132\7u\2"+
		"\2\u0132\u0133\7k\2\2\u0133Z\3\2\2\2\u0134\u0135\7u\2\2\u0135\u0136\7"+
		"k\2\2\u0136\u0137\7p\2\2\u0137\u0138\7q\2\2\u0138\u0139\7\"\2\2\u0139"+
		"\u013a\7u\2\2\u013a\u013b\7k\2\2\u013b\\\3\2\2\2\u013c\u013d\7u\2\2\u013d"+
		"\u013e\7k\2\2\u013e\u013f\7p\2\2\u013f\u0140\7q\2\2\u0140^\3\2\2\2\u0141"+
		"\u0142\7f\2\2\u0142\u0143\7g\2\2\u0143\u0144\7h\2\2\u0144`\3\2\2\2\u0145"+
		"\u0146\7u\2\2\u0146\u0147\7c\2\2\u0147\u0148\7n\2\2\u0148\u0149\7k\2\2"+
		"\u0149\u014a\7t\2\2\u014ab\3\2\2\2\u014b\u014c\7t\2\2\u014c\u014d\7g\2"+
		"\2\u014d\u014e\7v\2\2\u014ed\3\2\2\2\u014f\u0150\7e\2\2\u0150\u0151\7"+
		"c\2\2\u0151\u0152\7u\2\2\u0152\u0153\7q\2\2\u0153f\3\2\2\2\u0154\u0155"+
		"\7e\2\2\u0155\u0156\7w\2\2\u0156\u0157\7c\2\2\u0157\u0158\7p\2\2\u0158"+
		"\u0159\7f\2\2\u0159\u015a\7q\2\2\u015ah\3\2\2\2\u015b\u015c\7u\2\2\u015c"+
		"\u015d\7g\2\2\u015d\u015e\7i\2\2\u015e\u015f\7w\2\2\u015f\u0160\7k\2\2"+
		"\u0160\u0161\7t\2\2\u0161j\3\2\2\2\u0162\u0163\7x\2\2\u0163\u0164\7g\2"+
		"\2\u0164\u0165\7e\2\2\u0165\u0166\7g\2\2\u0166\u0167\7u\2\2\u0167l\3\2"+
		"\2\2\u0168\u0169\7j\2\2\u0169\u016a\7c\2\2\u016a\u016b\7u\2\2\u016b\u016c"+
		"\7v\2\2\u016c\u016d\7c\2\2\u016dn\3\2\2\2\u016e\u016f\7g\2\2\u016f\u0170"+
		"\7p\2\2\u0170\u0171\7v\2\2\u0171\u0172\7g\2\2\u0172\u0173\7t\2\2\u0173"+
		"\u0174\7q\2\2\u0174p\3\2\2\2\u0175\u0176\7e\2\2\u0176\u0177\7c\2\2\u0177"+
		"\u0178\7t\2\2\u0178\u0179\7c\2\2\u0179\u017a\7e\2\2\u017a\u017b\7v\2\2"+
		"\u017b\u017c\7g\2\2\u017c\u017d\7t\2\2\u017dr\3\2\2\2\u017e\u017f\7v\2"+
		"\2\u017f\u0180\7g\2\2\u0180\u0181\7z\2\2\u0181\u0182\7v\2\2\u0182\u0183"+
		"\7q\2\2\u0183t\3\2\2\2\u0184\u0185\7d\2\2\u0185\u0186\7q\2\2\u0186\u0187"+
		"\7q\2\2\u0187\u0188\7n\2\2\u0188\u0189\7g\2\2\u0189\u018a\7c\2\2\u018a"+
		"\u018b\7p\2\2\u018b\u018c\7q\2\2\u018cv\3\2\2\2\u018d\u018f\t\2\2\2\u018e"+
		"\u018d\3\2\2\2\u018f\u0190\3\2\2\2\u0190\u018e\3\2\2\2\u0190\u0191\3\2"+
		"\2\2\u0191\u0192\3\2\2\2\u0192\u0193\b<\2\2\u0193x\3\2\2\2\u0194\u01a0"+
		"\t\3\2\2\u0195\u0197\7/\2\2\u0196\u0195\3\2\2\2\u0196\u0197\3\2\2\2\u0197"+
		"\u0198\3\2\2\2\u0198\u019c\t\4\2\2\u0199\u019b\t\5\2\2\u019a\u0199\3\2"+
		"\2\2\u019b\u019e\3\2\2\2\u019c\u019a\3\2\2\2\u019c\u019d\3\2\2\2\u019d"+
		"\u01a0\3\2\2\2\u019e\u019c\3\2\2\2\u019f\u0194\3\2\2\2\u019f\u0196\3\2"+
		"\2\2\u01a0z\3\2\2\2\u01a1\u01a2\7x\2\2\u01a2\u01a3\7g\2\2\u01a3\u01a4"+
		"\7t\2\2\u01a4\u01a5\7f\2\2\u01a5\u01a6\7c\2\2\u01a6\u01a7\7f\2\2\u01a7"+
		"\u01a8\7g\2\2\u01a8\u01a9\7t\2\2\u01a9\u01b0\7q\2\2\u01aa\u01ab\7h\2\2"+
		"\u01ab\u01ac\7c\2\2\u01ac\u01ad\7n\2\2\u01ad\u01ae\7u\2\2\u01ae\u01b0"+
		"\7q\2\2\u01af\u01a1\3\2\2\2\u01af\u01aa\3\2\2\2\u01b0|\3\2\2\2\u01b1\u01b3"+
		"\t\6\2\2\u01b2\u01b1\3\2\2\2\u01b3\u01b4\3\2\2\2\u01b4\u01b2\3\2\2\2\u01b4"+
		"\u01b5\3\2\2\2\u01b5~\3\2\2\2\u01b6\u01b7\7\61\2\2\u01b7\u01b8\7,\2\2"+
		"\u01b8\u01bc\3\2\2\2\u01b9\u01bb\13\2\2\2\u01ba\u01b9\3\2\2\2\u01bb\u01be"+
		"\3\2\2\2\u01bc\u01bd\3\2\2\2\u01bc\u01ba\3\2\2\2\u01bd\u01bf\3\2\2\2\u01be"+
		"\u01bc\3\2\2\2\u01bf\u01c0\7,\2\2\u01c0\u01c1\7\61\2\2\u01c1\u01c2\3\2"+
		"\2\2\u01c2\u01c3\b@\2\2\u01c3\u0080\3\2\2\2\u01c4\u01c5\7)\2\2\u01c5\u0082"+
		"\3\2\2\2\u01c6\u01c7\7)\2\2\u01c7\u01c8\13\2\2\2\u01c8\u01c9\7)\2\2\u01c9"+
		"\u0084\3\2\2\2\u01ca\u01ce\7$\2\2\u01cb\u01cd\13\2\2\2\u01cc\u01cb\3\2"+
		"\2\2\u01cd\u01d0\3\2\2\2\u01ce\u01cf\3\2\2\2\u01ce\u01cc\3\2\2\2\u01cf"+
		"\u01d1\3\2\2\2\u01d0\u01ce\3\2\2\2\u01d1\u01d2\7$\2\2\u01d2\u0086\3\2"+
		"\2\2\f\2\u0190\u0196\u019c\u019f\u01af\u01b2\u01b4\u01bc\u01ce\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}