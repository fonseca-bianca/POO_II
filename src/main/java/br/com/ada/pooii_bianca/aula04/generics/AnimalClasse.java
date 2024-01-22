package br.com.ada.pooii_bianca.aula04.generics;

//DIFERENÇAS entre Class e Record:

/**
 * Class AnimalClasse:
 * classe COMUM. Pode ter campos mutáveis, encapscular
 *
 * Record AnimalClasse:
 * RECORD: é um portador 'invisível' de determinado conjunto de componentes.
 * É OBRIGADO a expor uma API
 * TODOS seus Atributos são 'final', isto é, NÃO podem ser estendidos
 * NÃO pode trabalhar com HERANÇA (EXTENDS)
 * SOMENTE consegue implementar uma OU mais Interfaces
 * NÃO permite criar variáveis de instância NÃO estáticas (STATIC) em seu corpo
 */
public class AnimalClasse {
    private final String nome;
    private final int idade;

    public AnimalClasse(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public String nome() {
        return nome;
    }

    public int idade() {
        return idade;
    }
}
