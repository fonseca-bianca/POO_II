package br.com.ada.pooii_bianca.aula05.exercicio_pilha;

import java.util.ArrayList;
import java.util.List;

//StackImpl: é uma class q implementa a Interface Stack
//<E>: é um tipo de parâmetro GENÉRICO da Interface Stack
public class StackImpl<E> implements Stack<E> {

    //List 'listaInterna' do tipo constante é declarada
    //essa lista irá armazenar os elementos da pilha
    private final List<E> listaInterna;

    //CONSTRUTOR da Class StackImpl
    //vai inicializar 'listaInterna' como um NOVO ArrayList
    public StackImpl() {

        this.listaInterna = new ArrayList<>();
    }

    //Método q ADICIONA elemento topo da pilha. Adiciona ao FINAL da listaInterna
    @Override
    public void push(E elemento) {
        listaInterna.add(elemento);
    }


    //Método q REMOVE e RETORNA ÚLTIMO elemento topo da pilha (SE ela NÃO esiver vazia)
    @Override
    public E pop() {
        if (!isEmpty())
            return listaInterna.remove(listaInterna.size() - 1);
        return null;
    }

    //Método RETORNA elemento topo pilha SEM removê-lo
    //Se a pilha NÃO estiver vazia, então irá retornar ÚLTIMO elemento da listaInterna
    //se pilha vazia, retornará NULL
    @Override
    public E peek() {
        if (!isEmpty())
            return listaInterna.get(listaInterna.size() - 1);
        return null;
    }

    //Método q verfica se pilha VAZIA
    //se TRUE = vazia
    //se FALSE = falso
    @Override
    public boolean isEmpty() {
        return listaInterna.isEmpty();
    }

    //Método q irá TRANSFERIR TODOS os OBJECTS de uma pilha pra outra
    //irá percorrer CADA elemento na listaInterna
    //irá adiconar CADA elemento à listaInterna
    @Override
    public void transferirObjetos(List<? super E> lista) {
        for (E e : listaInterna)
            lista.add(e);
    }

}
