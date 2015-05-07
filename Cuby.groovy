/**
 * Created by diugalde on 5/6/15.
 */

import org.antlr.v4.runtime.*;

class Cuby {
    public static void main(String[] args) throws Exception {

        println("Tipo de entrada: ")
        println("  1- Archivo")
        println("  2- Consola")
        print("-> ")
        Scanner reader = new Scanner(System.in)
        int option = reader.nextInt();
        ANTLRInputStream input
        if (option == 1){
            println("Ingrese el nombre del archivo")
            print("-> ")
            String filename = reader.next()
            input = new ANTLRInputStream(new BufferedReader(new FileReader(new File(filename))))
        }else{
            println("Ingrese el programa de prueba")
            // Creates an input stream for reading the console input.
            input = new ANTLRInputStream(System.in)
        }

        // Initialize tucode lexer instance.
        CubyLexer lexer = new CubyLexer(input)

        // Add a custom error listener to the lexer.
        lexer.removeErrorListeners()
        lexer.addErrorListener(new CubyErrorListener())

        // Create a buffer of tokens pulled from the lexer.
        CommonTokenStream tokens = new CommonTokenStream(lexer)

        tokens.fill()



        //Iterates trough the buffer of tokens
        int tokNumber = 0
        for (Object tok : tokens.getTokens()) {
            if (tokNumber==0){
                println("Lista de Tokens:")
                print("['"+tok.toString().split("'")[1]+"'")
            }else{
                print("  ,  '"+tok.toString().split("'")[1]+"'")
            }
            tokNumber++
        }
        println("]")
    }
}
