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
        System.err.println(" Error léxico(linea:"+line+", columna:"+charPositionInLine+": el símbolo "+"'"+invalidChar+"'"+" es una sorpresa para mi."
                )
    }
}