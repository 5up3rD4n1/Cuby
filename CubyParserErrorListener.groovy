/**
 * Created by badsa on 20/05/15.
 */

import org.antlr.v4.runtime.*;

//Class for custom errors.
class CubyParserErrorListener extends BaseErrorListener {


    // Overrides the syntaxError method, changing the error message to spanish.
    @Override
    public void syntaxError(Recognizer<?, ?> recognizer,
                            Object offendingSymbol,
                            int line, int charPositionInLine,
                            String msg,
                            RecognitionException e)
    {
        System.err.println(" Error sintáctico(línea:"+line+", columna:"+charPositionInLine+"): " +msg+".")
    }


}