/**
 * Created by diugalde on 5/6/15.
 */

import org.antlr.v4.runtime.*;

class Cuby {
    public static void main(String[] args) throws Exception {

        if(args.length == 0) {
            println("Debe ingresar el nombre del archivo de entrada (Ej: entrada.etc")
        }else {
            // Creates an input stream for reading the console input.gg
            ANTLRInputStream input = new ANTLRInputStream(System.in)

            // Initialize tucode lexer instance.
            CubyLexer lexer = new CubyLexer(input)

            // Add a custom error listener to the lexer.
            lexer.removeErrorListeners()
            lexer.addErrorListener(new CubyErrorListener())

            // Create a buffer of tokens pulled from the lexer.
            CommonTokenStream tokens = new CommonTokenStream(lexer)

            tokens.fill()

            println("Lista de tokens:")

            //Iterates trough the buffer of tokens.
            int tokenNumber = 1;
            for (Object tok : tokens.getTokens()) {
                println("      Token #" + tokenNumber.toString() + ": " + tok.toString().split("'")[1])
                tokenNumber++
            }

        }

    }
}
