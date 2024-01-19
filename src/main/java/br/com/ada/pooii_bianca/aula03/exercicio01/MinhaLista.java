package br.com.ada.pooii_bianca.aula03.exercicio01;

import java.util.ArrayList;

public class MinhaLista{

    //chamado ArrayList 'lista' com modificador de método privado declarado
    private ArrayList<Pessoa> lista;

    //construtor da Class MinhaLista é criado e inicializa 'lista' com NOVA lista de Objetos (Pessoa)
    public MinhaLista(){
        lista = new ArrayList<>();
    }

    //método void vai adicionar Objeto 'pessoa' à lista de Pessoa
    public void adicionar(Pessoa pessoa){
        lista.add(pessoa);
    }

    //método public vai receber um int como parâmetro e retornará o Objeto Pessoa no índice da lista conforme ele for chamado
    public Pessoa obter(int indice){
        return lista.get(indice);
    }

    //método receve id como parâmetro
    //vai retornar o índice do Objeto Pessoa com o id q constar na lista
    //caso contrário, o método retornará -1 como resposta
    public int indice(long id){
        for(int i = 0; i < lista.size(); i++){
            if(lista.get(i).id() == id){
                return i;
            }
        }
        return -1;
    }

    //método public q recebe Objeto Pessoa como parâmetro e retorna um boolean
    //True se na lista constar o Objeto pretendido
    //False se na lista NÃO constar o Objeto pretendido
    public boolean contem(Pessoa pessoa){
        return lista.contains(pessoa);
    }
}
