/**
 * Created by diugalde on 5/6/15.
 */

import org.antlr.v4.runtime.*;

class Cuby {

    //Clase metodo principal para ejecutat scanner de antlr4
    public static void main(String[] args) throws Exception {
        //Menu para seleccion de modo de entrada
        println("Tipo de entrada: ")
        println("  1- Archivo")
        println("  2- Consola")
        print("-> ")
        //Archivo leido desde la carpeta donde se ecuentre el a.jar generado
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
            //Generacion de input para recusos necesarios del antlr
            input = new ANTLRInputStream(System.in)
        }

        //Inicializacion del lexer, con metodos sobre escritos para mensajes personalizados
        CubyLexer lexer = new CubyLexer(input)

        //'Servicio; para escuchar y manejar errores.
        lexer.removeErrorListeners()
        lexer.addErrorListener(new CubyErrorListener())

        //Se toman todos los tokens reconocidos por el lexer
        CommonTokenStream tokens = new CommonTokenStream(lexer)

        tokens.fill()



        //Ciclo creado para imprimir una lista con todos los token encontrados.
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
