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
		TIPO_TEXTO=60, TIPO_BOOLEANO=61, ESPACIOS_BLANCO=62, ENTERO=63, BOOLEANO=64, 
		IDENTIFICADOR=65, COMENTARIO=66, CARACTER=67, TEXTO=68;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "COMA", "DOSPUNTOS", "PUNTO_COMA", "PUNTO", "DOBLEPUNTO", 
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
		"ESPACIOS_BLANCO", "ENTERO", "BOOLEANO", "IDENTIFICADOR", "COMENTARIO", 
		"COMILLA", "CARACTER", "TEXTO"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'('", "')'", "','", "':'", "';'", "'.'", "'..'", "'|'", "'~'", 
		"'y'", "'o'", "'=='", "'!='", "'>'", "'<'", "'<='", "'>='", null, "'*'", 
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2F\u01d9\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\3\2\3\2\3\3\3\3"+
		"\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13"+
		"\3\f\3\f\3\r\3\r\3\r\3\16\3\16\3\16\3\17\3\17\3\20\3\20\3\21\3\21\3\21"+
		"\3\22\3\22\3\22\3\23\3\23\3\24\3\24\3\25\3\25\3\26\3\26\3\27\3\27\3\30"+
		"\3\30\3\31\3\31\3\31\3\32\3\32\3\32\3\33\3\33\3\34\3\34\3\34\3\35\3\35"+
		"\3\35\3\36\3\36\3\36\3\37\3\37\3\37\3 \3 \3 \3!\3!\3!\3!\3!\3!\3!\3!\3"+
		"!\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3#\3#\3#\3#\3#\3$\3$\3$\3$\3"+
		"$\3%\3%\3%\3%\3&\3&\3&\3&\3\'\3\'\3\'\3\'\3(\3(\3(\3(\3)\3)\3)\3)\3)\3"+
		")\3)\3)\3)\3*\3*\3*\3*\3*\3*\3*\3*\3*\3+\3+\3+\3+\3+\3+\3+\3+\3+\3,\3"+
		",\3,\3,\3,\3,\3,\3,\3,\3,\3-\3-\3-\3-\3-\3.\3.\3.\3.\3.\3.\3.\3/\3/\3"+
		"/\3/\3/\3/\3/\3/\3/\3\60\3\60\3\60\3\61\3\61\3\61\3\61\3\62\3\62\3\62"+
		"\3\62\3\62\3\63\3\63\3\63\3\63\3\64\3\64\3\64\3\64\3\64\3\64\3\65\3\65"+
		"\3\65\3\65\3\66\3\66\3\66\3\66\3\66\3\67\3\67\3\67\3\67\3\67\3\67\3\67"+
		"\38\38\38\38\38\38\38\39\39\39\39\39\39\3:\3:\3:\3:\3:\3:\3;\3;\3;\3;"+
		"\3;\3;\3;\3<\3<\3<\3<\3<\3<\3<\3<\3<\3=\3=\3=\3=\3=\3=\3>\3>\3>\3>\3>"+
		"\3>\3>\3>\3>\3?\6?\u0198\n?\r?\16?\u0199\3?\3?\3@\3@\3@\7@\u01a1\n@\f"+
		"@\16@\u01a4\13@\5@\u01a6\n@\3A\3A\3A\3A\3A\3A\3A\3A\3A\3A\3A\3A\3A\3A"+
		"\5A\u01b6\nA\3B\6B\u01b9\nB\rB\16B\u01ba\3C\3C\3C\3C\7C\u01c1\nC\fC\16"+
		"C\u01c4\13C\3C\3C\3C\3C\3C\3D\3D\3E\3E\3E\3E\3F\3F\7F\u01d3\nF\fF\16F"+
		"\u01d6\13F\3F\3F\4\u01c2\u01d4\2G\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23"+
		"\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31"+
		"\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60"+
		"_\61a\62c\63e\64g\65i\66k\67m8o9q:s;u<w=y>{?}@\177A\u0081B\u0083C\u0085"+
		"D\u0087\2\u0089E\u008bF\3\2\7\5\2\13\f\17\17\"\"\3\2\62\62\3\2\63;\3\2"+
		"\62;\3\2c|\u01de\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13"+
		"\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2"+
		"\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2"+
		"!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3"+
		"\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2"+
		"\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E"+
		"\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2"+
		"\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2"+
		"\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2g\3\2\2\2\2i\3\2\2\2\2k"+
		"\3\2\2\2\2m\3\2\2\2\2o\3\2\2\2\2q\3\2\2\2\2s\3\2\2\2\2u\3\2\2\2\2w\3\2"+
		"\2\2\2y\3\2\2\2\2{\3\2\2\2\2}\3\2\2\2\2\177\3\2\2\2\2\u0081\3\2\2\2\2"+
		"\u0083\3\2\2\2\2\u0085\3\2\2\2\2\u0089\3\2\2\2\2\u008b\3\2\2\2\3\u008d"+
		"\3\2\2\2\5\u008f\3\2\2\2\7\u0091\3\2\2\2\t\u0093\3\2\2\2\13\u0095\3\2"+
		"\2\2\r\u0097\3\2\2\2\17\u0099\3\2\2\2\21\u009c\3\2\2\2\23\u009e\3\2\2"+
		"\2\25\u00a0\3\2\2\2\27\u00a2\3\2\2\2\31\u00a4\3\2\2\2\33\u00a7\3\2\2\2"+
		"\35\u00aa\3\2\2\2\37\u00ac\3\2\2\2!\u00ae\3\2\2\2#\u00b1\3\2\2\2%\u00b4"+
		"\3\2\2\2\'\u00b6\3\2\2\2)\u00b8\3\2\2\2+\u00ba\3\2\2\2-\u00bc\3\2\2\2"+
		"/\u00be\3\2\2\2\61\u00c0\3\2\2\2\63\u00c3\3\2\2\2\65\u00c6\3\2\2\2\67"+
		"\u00c8\3\2\2\29\u00cb\3\2\2\2;\u00ce\3\2\2\2=\u00d1\3\2\2\2?\u00d4\3\2"+
		"\2\2A\u00d7\3\2\2\2C\u00e0\3\2\2\2E\u00ea\3\2\2\2G\u00ef\3\2\2\2I\u00f4"+
		"\3\2\2\2K\u00f8\3\2\2\2M\u00fc\3\2\2\2O\u0100\3\2\2\2Q\u0104\3\2\2\2S"+
		"\u010d\3\2\2\2U\u0116\3\2\2\2W\u011f\3\2\2\2Y\u0129\3\2\2\2[\u012e\3\2"+
		"\2\2]\u0135\3\2\2\2_\u013e\3\2\2\2a\u0141\3\2\2\2c\u0145\3\2\2\2e\u014a"+
		"\3\2\2\2g\u014e\3\2\2\2i\u0154\3\2\2\2k\u0158\3\2\2\2m\u015d\3\2\2\2o"+
		"\u0164\3\2\2\2q\u016b\3\2\2\2s\u0171\3\2\2\2u\u0177\3\2\2\2w\u017e\3\2"+
		"\2\2y\u0187\3\2\2\2{\u018d\3\2\2\2}\u0197\3\2\2\2\177\u01a5\3\2\2\2\u0081"+
		"\u01b5\3\2\2\2\u0083\u01b8\3\2\2\2\u0085\u01bc\3\2\2\2\u0087\u01ca\3\2"+
		"\2\2\u0089\u01cc\3\2\2\2\u008b\u01d0\3\2\2\2\u008d\u008e\7*\2\2\u008e"+
		"\4\3\2\2\2\u008f\u0090\7+\2\2\u0090\6\3\2\2\2\u0091\u0092\7.\2\2\u0092"+
		"\b\3\2\2\2\u0093\u0094\7<\2\2\u0094\n\3\2\2\2\u0095\u0096\7=\2\2\u0096"+
		"\f\3\2\2\2\u0097\u0098\7\60\2\2\u0098\16\3\2\2\2\u0099\u009a\7\60\2\2"+
		"\u009a\u009b\7\60\2\2\u009b\20\3\2\2\2\u009c\u009d\7~\2\2\u009d\22\3\2"+
		"\2\2\u009e\u009f\7\u0080\2\2\u009f\24\3\2\2\2\u00a0\u00a1\7{\2\2\u00a1"+
		"\26\3\2\2\2\u00a2\u00a3\7q\2\2\u00a3\30\3\2\2\2\u00a4\u00a5\7?\2\2\u00a5"+
		"\u00a6\7?\2\2\u00a6\32\3\2\2\2\u00a7\u00a8\7#\2\2\u00a8\u00a9\7?\2\2\u00a9"+
		"\34\3\2\2\2\u00aa\u00ab\7@\2\2\u00ab\36\3\2\2\2\u00ac\u00ad\7>\2\2\u00ad"+
		" \3\2\2\2\u00ae\u00af\7>\2\2\u00af\u00b0\7?\2\2\u00b0\"\3\2\2\2\u00b1"+
		"\u00b2\7@\2\2\u00b2\u00b3\7?\2\2\u00b3$\3\2\2\2\u00b4\u00b5\7/\2\2\u00b5"+
		"&\3\2\2\2\u00b6\u00b7\7,\2\2\u00b7(\3\2\2\2\u00b8\u00b9\7\61\2\2\u00b9"+
		"*\3\2\2\2\u00ba\u00bb\7\'\2\2\u00bb,\3\2\2\2\u00bc\u00bd\7-\2\2\u00bd"+
		".\3\2\2\2\u00be\u00bf\7/\2\2\u00bf\60\3\2\2\2\u00c0\u00c1\7/\2\2\u00c1"+
		"\u00c2\7/\2\2\u00c2\62\3\2\2\2\u00c3\u00c4\7-\2\2\u00c4\u00c5\7-\2\2\u00c5"+
		"\64\3\2\2\2\u00c6\u00c7\7?\2\2\u00c7\66\3\2\2\2\u00c8\u00c9\7/\2\2\u00c9"+
		"\u00ca\7?\2\2\u00ca8\3\2\2\2\u00cb\u00cc\7-\2\2\u00cc\u00cd\7?\2\2\u00cd"+
		":\3\2\2\2\u00ce\u00cf\7,\2\2\u00cf\u00d0\7?\2\2\u00d0<\3\2\2\2\u00d1\u00d2"+
		"\7\61\2\2\u00d2\u00d3\7?\2\2\u00d3>\3\2\2\2\u00d4\u00d5\7\'\2\2\u00d5"+
		"\u00d6\7?\2\2\u00d6@\3\2\2\2\u00d7\u00d8\7g\2\2\u00d8\u00d9\7u\2\2\u00d9"+
		"\u00da\7e\2\2\u00da\u00db\7t\2\2\u00db\u00dc\7k\2\2\u00dc\u00dd\7d\2\2"+
		"\u00dd\u00de\7k\2\2\u00de\u00df\7t\2\2\u00dfB\3\2\2\2\u00e0\u00e1\7r\2"+
		"\2\u00e1\u00e2\7t\2\2\u00e2\u00e3\7k\2\2\u00e3\u00e4\7p\2\2\u00e4\u00e5"+
		"\7e\2\2\u00e5\u00e6\7k\2\2\u00e6\u00e7\7r\2\2\u00e7\u00e8\7c\2\2\u00e8"+
		"\u00e9\7n\2\2\u00e9D\3\2\2\2\u00ea\u00eb\7c\2\2\u00eb\u00ec\7O\2\2\u00ec"+
		"\u00ed\7c\2\2\u00ed\u00ee\7{\2\2\u00eeF\3\2\2\2\u00ef\u00f0\7c\2\2\u00f0"+
		"\u00f1\7O\2\2\u00f1\u00f2\7k\2\2\u00f2\u00f3\7p\2\2\u00f3H\3\2\2\2\u00f4"+
		"\u00f5\7e\2\2\u00f5\u00f6\7c\2\2\u00f6\u00f7\7g\2\2\u00f7J\3\2\2\2\u00f8"+
		"\u00f9\7g\2\2\u00f9\u00fa\7c\2\2\u00fa\u00fb\7e\2\2\u00fbL\3\2\2\2\u00fc"+
		"\u00fd\7g\2\2\u00fd\u00fe\7c\2\2\u00fe\u00ff\7v\2\2\u00ffN\3\2\2\2\u0100"+
		"\u0101\7v\2\2\u0101\u0102\7c\2\2\u0102\u0103\7g\2\2\u0103P\3\2\2\2\u0104"+
		"\u0105\7n\2\2\u0105\u0106\7q\2\2\u0106\u0107\7p\2\2\u0107\u0108\7i\2\2"+
		"\u0108\u0109\7k\2\2\u0109\u010a\7v\2\2\u010a\u010b\7w\2\2\u010b\u010c"+
		"\7f\2\2\u010cR\3\2\2\2\u010d\u010e\7k\2\2\u010e\u010f\7p\2\2\u010f\u0110"+
		"\7x\2\2\u0110\u0111\7g\2\2\u0111\u0112\7t\2\2\u0112\u0113\7v\2\2\u0113"+
		"\u0114\7k\2\2\u0114\u0115\7t\2\2\u0115T\3\2\2\2\u0116\u0117\7g\2\2\u0117"+
		"\u0118\7u\2\2\u0118\u0119\7N\2\2\u0119\u011a\7g\2\2\u011a\u011b\7v\2\2"+
		"\u011b\u011c\7t\2\2\u011c\u011d\7c\2\2\u011d\u011e\7A\2\2\u011eV\3\2\2"+
		"\2\u011f\u0120\7g\2\2\u0120\u0121\7u\2\2\u0121\u0122\7F\2\2\u0122\u0123"+
		"\7k\2\2\u0123\u0124\7i\2\2\u0124\u0125\7k\2\2\u0125\u0126\7v\2\2\u0126"+
		"\u0127\7q\2\2\u0127\u0128\7A\2\2\u0128X\3\2\2\2\u0129\u012a\7r\2\2\u012a"+
		"\u012b\7c\2\2\u012b\u012c\7t\2\2\u012c\u012d\7c\2\2\u012dZ\3\2\2\2\u012e"+
		"\u012f\7t\2\2\u012f\u0130\7g\2\2\u0130\u0131\7r\2\2\u0131\u0132\7k\2\2"+
		"\u0132\u0133\7v\2\2\u0133\u0134\7c\2\2\u0134\\\3\2\2\2\u0135\u0136\7o"+
		"\2\2\u0136\u0137\7k\2\2\u0137\u0138\7g\2\2\u0138\u0139\7p\2\2\u0139\u013a"+
		"\7v\2\2\u013a\u013b\7t\2\2\u013b\u013c\7c\2\2\u013c\u013d\7u\2\2\u013d"+
		"^\3\2\2\2\u013e\u013f\7u\2\2\u013f\u0140\7k\2\2\u0140`\3\2\2\2\u0141\u0142"+
		"\7u\2\2\u0142\u0143\7k\2\2\u0143\u0144\7k\2\2\u0144b\3\2\2\2\u0145\u0146"+
		"\7u\2\2\u0146\u0147\7k\2\2\u0147\u0148\7p\2\2\u0148\u0149\7q\2\2\u0149"+
		"d\3\2\2\2\u014a\u014b\7f\2\2\u014b\u014c\7g\2\2\u014c\u014d\7h\2\2\u014d"+
		"f\3\2\2\2\u014e\u014f\7u\2\2\u014f\u0150\7c\2\2\u0150\u0151\7n\2\2\u0151"+
		"\u0152\7k\2\2\u0152\u0153\7t\2\2\u0153h\3\2\2\2\u0154\u0155\7t\2\2\u0155"+
		"\u0156\7g\2\2\u0156\u0157\7v\2\2\u0157j\3\2\2\2\u0158\u0159\7e\2\2\u0159"+
		"\u015a\7c\2\2\u015a\u015b\7u\2\2\u015b\u015c\7q\2\2\u015cl\3\2\2\2\u015d"+
		"\u015e\7e\2\2\u015e\u015f\7w\2\2\u015f\u0160\7c\2\2\u0160\u0161\7p\2\2"+
		"\u0161\u0162\7f\2\2\u0162\u0163\7q\2\2\u0163n\3\2\2\2\u0164\u0165\7u\2"+
		"\2\u0165\u0166\7g\2\2\u0166\u0167\7i\2\2\u0167\u0168\7w\2\2\u0168\u0169"+
		"\7k\2\2\u0169\u016a\7t\2\2\u016ap\3\2\2\2\u016b\u016c\7x\2\2\u016c\u016d"+
		"\7g\2\2\u016d\u016e\7e\2\2\u016e\u016f\7g\2\2\u016f\u0170\7u\2\2\u0170"+
		"r\3\2\2\2\u0171\u0172\7j\2\2\u0172\u0173\7c\2\2\u0173\u0174\7u\2\2\u0174"+
		"\u0175\7v\2\2\u0175\u0176\7c\2\2\u0176t\3\2\2\2\u0177\u0178\7g\2\2\u0178"+
		"\u0179\7p\2\2\u0179\u017a\7v\2\2\u017a\u017b\7g\2\2\u017b\u017c\7t\2\2"+
		"\u017c\u017d\7q\2\2\u017dv\3\2\2\2\u017e\u017f\7e\2\2\u017f\u0180\7c\2"+
		"\2\u0180\u0181\7t\2\2\u0181\u0182\7c\2\2\u0182\u0183\7e\2\2\u0183\u0184"+
		"\7v\2\2\u0184\u0185\7g\2\2\u0185\u0186\7t\2\2\u0186x\3\2\2\2\u0187\u0188"+
		"\7v\2\2\u0188\u0189\7g\2\2\u0189\u018a\7z\2\2\u018a\u018b\7v\2\2\u018b"+
		"\u018c\7q\2\2\u018cz\3\2\2\2\u018d\u018e\7d\2\2\u018e\u018f\7q\2\2\u018f"+
		"\u0190\7q\2\2\u0190\u0191\7n\2\2\u0191\u0192\7g\2\2\u0192\u0193\7c\2\2"+
		"\u0193\u0194\7p\2\2\u0194\u0195\7q\2\2\u0195|\3\2\2\2\u0196\u0198\t\2"+
		"\2\2\u0197\u0196\3\2\2\2\u0198\u0199\3\2\2\2\u0199\u0197\3\2\2\2\u0199"+
		"\u019a\3\2\2\2\u019a\u019b\3\2\2\2\u019b\u019c\b?\2\2\u019c~\3\2\2\2\u019d"+
		"\u01a6\t\3\2\2\u019e\u01a2\t\4\2\2\u019f\u01a1\t\5\2\2\u01a0\u019f\3\2"+
		"\2\2\u01a1\u01a4\3\2\2\2\u01a2\u01a0\3\2\2\2\u01a2\u01a3\3\2\2\2\u01a3"+
		"\u01a6\3\2\2\2\u01a4\u01a2\3\2\2\2\u01a5\u019d\3\2\2\2\u01a5\u019e\3\2"+
		"\2\2\u01a6\u0080\3\2\2\2\u01a7\u01a8\7x\2\2\u01a8\u01a9\7g\2\2\u01a9\u01aa"+
		"\7t\2\2\u01aa\u01ab\7f\2\2\u01ab\u01ac\7c\2\2\u01ac\u01ad\7f\2\2\u01ad"+
		"\u01ae\7g\2\2\u01ae\u01af\7t\2\2\u01af\u01b6\7q\2\2\u01b0\u01b1\7h\2\2"+
		"\u01b1\u01b2\7c\2\2\u01b2\u01b3\7n\2\2\u01b3\u01b4\7u\2\2\u01b4\u01b6"+
		"\7q\2\2\u01b5\u01a7\3\2\2\2\u01b5\u01b0\3\2\2\2\u01b6\u0082\3\2\2\2\u01b7"+
		"\u01b9\t\6\2\2\u01b8\u01b7\3\2\2\2\u01b9\u01ba\3\2\2\2\u01ba\u01b8\3\2"+
		"\2\2\u01ba\u01bb\3\2\2\2\u01bb\u0084\3\2\2\2\u01bc\u01bd\7\61\2\2\u01bd"+
		"\u01be\7,\2\2\u01be\u01c2\3\2\2\2\u01bf\u01c1\13\2\2\2\u01c0\u01bf\3\2"+
		"\2\2\u01c1\u01c4\3\2\2\2\u01c2\u01c3\3\2\2\2\u01c2\u01c0\3\2\2\2\u01c3"+
		"\u01c5\3\2\2\2\u01c4\u01c2\3\2\2\2\u01c5\u01c6\7,\2\2\u01c6\u01c7\7\61"+
		"\2\2\u01c7\u01c8\3\2\2\2\u01c8\u01c9\bC\2\2\u01c9\u0086\3\2\2\2\u01ca"+
		"\u01cb\7)\2\2\u01cb\u0088\3\2\2\2\u01cc\u01cd\7)\2\2\u01cd\u01ce\13\2"+
		"\2\2\u01ce\u01cf\7)\2\2\u01cf\u008a\3\2\2\2\u01d0\u01d4\7$\2\2\u01d1\u01d3"+
		"\13\2\2\2\u01d2\u01d1\3\2\2\2\u01d3\u01d6\3\2\2\2\u01d4\u01d5\3\2\2\2"+
		"\u01d4\u01d2\3\2\2\2\u01d5\u01d7\3\2\2\2\u01d6\u01d4\3\2\2\2\u01d7\u01d8"+
		"\7$\2\2\u01d8\u008c\3\2\2\2\n\2\u0199\u01a2\u01a5\u01b5\u01ba\u01c2\u01d4"+
		"\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}