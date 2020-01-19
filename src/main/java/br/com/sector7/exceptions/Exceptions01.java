package br.com.sector7.exceptions;

import java.io.*;

/**
 * Hieraquia de exceptions:
 *                                    Throwable
 *                                        |
 *                     ---------------------------------------------------------
 *                     |                                                       |
 *                 Exception                                                 Error
 *                     |                                                       |
 *            -----------------------------------------------             (Erros que não podem ser recuperados [Runtime Errors])
 *            |                                             |
 *       RuntimeException (unchecked)        (Checked Exceptions. Ex: IOException, FileNotFoundException, etc)
 *            |
 *     (ClassCastException | IndexOutOfBoundsException | etc)
 *
 */
public class Exceptions01 {

    /**
     * -------------------------------------------------------------------------------------------
     * O construtor da classe FileReader pode lançar FileNotFoundException.
     * Esse tipo de exceção é do tipo checked, ou seja, é checada em tempo de compilação.
     * Sendo assim, é necessário tratar o erro ou declarar que o método lança uma exceção do tipo
     * FileNotFoundException ou uma exceção que seja pai dela.
     * Throwable -> Exception -> IOException -> FileNotFoundException.
     *
     * Caso não seja tratado o erro, ou não seja declarado throws, haverá erro de compilação
     * -------------------------------------------------------------------------------------------
     */
    private static void lerArquivo() throws FileNotFoundException /* <--- ou lança a exceção */ {
        try {
            // Obtendo o local do arquivo
            File file = new File(
                    // Buscando arquivo na pasta /resources no classpath...
                    Exceptions01.class.getClassLoader()
                            .getResource("text.txt")
                            .getFile()
            );

            // Criando objeto leitor de arquivo
            FileReader fileReader = new FileReader(file);

            // output
            System.out.println(fileReader.read());
        }
        catch (FileNotFoundException fnfe) /* <--- ou trata o erro */{

            // Tratando o erro, o programa continuará normalmente.
            System.err.println("Tratando o erro e finalizando o programa normalmente...");

            // Printando a pilha de erros
            fnfe.printStackTrace();

            // Também é possível lançar novamente o erro para o método chamador
            //throw new FileNotFoundException("Lançando o erro para o método chamador");
        }
        catch (IOException ioe) {
            System.err.println("Erro durante a leitura do arquivo");
        }
    }

    public static void main(String [] args) {
        /**
         * Como declaramos que o método lerArquivo() pode lançar um exceção do tipo checked,
         * então é necessário ou tratar a exceção ou declarar throws
         */
        try {
            lerArquivo();
        }
        catch (IOException e) /* <--- Podemos capturar pela exceção pai */ {
            System.out.println("Tratando a exceção no método main()");
        }
    }
}
