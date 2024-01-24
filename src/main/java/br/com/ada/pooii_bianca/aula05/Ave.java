package br.com.ada.pooii_bianca.aula05;


//a Classe q implementar Ave, vai ter q implentar os métodos da Ave + métodos da classe Animal
//método: comer() --> class Animal
//método: voar() --> class Ave


//NÃO PODE:
// Interface implementar outra Inteface
/**
 * ex.: public interface Ave implements Animal{...}
 */
//PODE (HERANÇA das Interfaces)
// Interface herdar MAIS de uma Interface
/**
 * interface Ave extends Animal, AnimalA, AnimalB{...}
 *
 * interface AveVoadora implements AnimalA{...}
 */
public interface Ave extends Animal{
    void voar();

    //default: quem implementar a Interface q contém esse Método, tbm terá acesso a esse Método (como se ele pertencesse à Interface)
    //NÃO pode haver 2 métodos Default com o MESMO nome
    /**
     * ex.:
     * interface A{
     *     default void comer();
     *     sout();
     * }
     * interface B{
     *     default void comer();
     *     sout();
     * }
     *
     * na IMPLEMENTAÇÃO DE MÉTODOS na Interface, se herdar de 2 Interfaces com métodos default de MESMO nome,
     * então será necessário informar QUAL desses métodos será usado e o comportamento dele
     */
    //static: NÃO faz parte de quem implementa a Interface, mas SIM da própria Interface. NÃO terá acesso a nada da classe q o implementa
}
