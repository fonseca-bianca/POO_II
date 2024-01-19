package br.com.ada.pooii_bianca.aula03.exercicio01;

public class Main {
    public static void main(String[] args) {
        //NOVA instância da Class MinhaLista criada e atribuída à variável 'listaDeNomes'
        MinhaLista listaDeNomes = new MinhaLista();

        //NOVA instância da Class Pessoa criada com argumentos (id e nome) e, após, é adicionada à variável 'listaDeNomes'
        Pessoa jorge = new Pessoa(1, "jorge");
        listaDeNomes.adicionar(jorge);

        Pessoa maria = new Pessoa(2, "maria");
        listaDeNomes.adicionar(maria);

        Pessoa jess = new Pessoa(3, "jess");
        listaDeNomes.adicionar(jess);


        System.out.println("Elemento na posição 2: " + listaDeNomes.obter(2)); // Saída: Pessoa[id=3, nome="jess]
        System.out.println("A lista contém a pessoa maria? " + listaDeNomes.contem(maria)); // Saída: true
        System.out.println("Qual a posicao do elemento de ID 3? " + listaDeNomes.indice(3)); // Saída: 2
    }
}
