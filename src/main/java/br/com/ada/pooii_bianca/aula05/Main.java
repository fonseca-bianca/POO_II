package br.com.ada.pooii_bianca.aula05;

public class Main {
    public static void main(String[] args) {
        imprimirClasse(String.class);
    }

    //GENERIC em Interface:
    //Generic <> vai DEPOIS do nome da Interface
    //dentro do <> pode colocar a quantidade de parâmetros q quisermos
    /**
     * ex.:
     * interface InterfaceGenerica<T>{
     *     T get(); //Objeto Genérico fica no lugar do retorno (no caso, o T)
     * }
     *
     */

    //Generic que segue contrato:
    //no caso abaixo, a 'InterfaceGenerica' aceita qlqr Objeto q implementa a Interface A
    /**
     * interface InterfaceGenerica<T extends A>{
     *      T get();
     * }
     */

    //Gereric com MAIS de uma Interface como parâmetro:
    /**
     * interface InterfaceGenerica<T extends A, B, C>{
     *     T get();
     * }
     */

    //Classe e Interface dentro do extends:
    //Classe vem 1º, coloca um & (comercial) seguida da Interface

    /**
     * interface A{...}
     * class B{...}
     * interface InterfaceGenerica<T extends B & A>{
     *      T get();
     * }
     *
     */
    public static <T> void imprimirClasse(Class<T> classe) {

        System.out.println(classe);
    }
}
