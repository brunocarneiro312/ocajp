package br.com.sector7.primitivos;

/**
 * --------------------------------------------------
 * Estudo sobre os tipos primitivos da linguagem Java
 * --------------------------------------------------
 * @author brunocarneiro
 */
public class TiposPrimitivos {

    /**
     * ----------------------------------------
     * Temos 8 tipos primitivos no Java
     * ----------------------------------------
     * Tipo    | Tamanho
     * ------------------
     * boolean | ? bits
     * ------------------
     * byte    | 8 bits
     * ------------------
     * short   | 16 bits
     * ------------------
     * char    | 16 bits
     * ------------------
     * int     | 32 bits
     * ------------------
     * long    | 64 bits
     * ------------------
     * float   | 32 bits
     * ------------------
     * double  | 64 bits
     * ------------------
     */
    // Inicializando as variáveis com o seu valor padrão de forma explícita
    boolean bool    = false;
    byte    aByte   = 0;
    short   aShort  = 0;
    char    aChar   = '\u0000'; // null
    int     anInt   = 0;
    long    aLong   = 0;
    float   aFloat  = 0;
    double  aDouble = 0;

    /**
     * ------------------------------------------------------
     * 1) Implicit Type Casting (Conversão de Tipo Implícito)
     * ------------------------------------------------------
     * byte ---> (short | char) ---> int ---> long ---> float ---> double
     *
     * ¹ A conversão de tipo implícito ocorre quando se atribui uma variável de valor menor para uma variável de valor maior.
     * ² byte < (short | char) < int < float < long < double (o da esquerda é menor do que o da direita)
     * ³ Esse processo é conhecido como "widening" ou "upcasting"
     */
    private void implicitTypeCasting() {

    }

    /**
     * -------------------------------------------------------
     * 2 ) Explicit Type Casting (Conversão de Tipo Explícito)
     * -------------------------------------------------------
     * double ---> float ---> long ---> int ---> (short | char) ---> byte
     *
     * ¹ A conversão de tipo explícito deve ocorrer quando se está tentando converter um tipo primitivo maior para um tipo menor.
     * ² Ao realizar a conversão de tipo explícita, o programador está dizendo ao compilador que aceita a perda de precisão oriunda desse tipo de conversão.
     * ³ Ao tentar realizar uma conversão de um tipo maior para um tipo menor sem que haja conversão explícita, há erro de compilação.
     * ₄ Esse processo é conhecido como "narrowing" ou "downcasting"
     */
    private void explicitTypeCasting() {

    }

    public static void main(String [] args) {

    }

}
