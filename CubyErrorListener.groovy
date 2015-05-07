import org.antlr.v4.runtime.*;

class CubyErrorListener extends BaseErrorListener {

    // Overrides the syntaxError method, changing the message error to spanish.
    @Override
    public void syntaxError(Recognizer<?, ?> recognizer,
                            Object offendingSymbol,
                            int line, int charPositionInLine,
                            String msg,
                            RecognitionException e)
    {
        char invalidChar = msg.charAt(msg.length()-2)
        System.err.println(" Error de tipo léxico: el simbolo: "+"'"+invalidChar+"'"+", en la linea:" + line +
                " columna:"+charPositionInLine+" es una sorpresa para mi."
                )
    }
}