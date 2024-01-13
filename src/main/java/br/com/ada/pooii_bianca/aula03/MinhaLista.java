package br.com.ada.pooii_bianca;
import java.util.List;
import java.util.ArrayList;

public class MinhaLista<T, U> {

    private final List<T> elementos = new ArrayList<>(); //raw type

//T é o Objeto - adicionar o elemento
public void adicionar(T elemento){
    this.elementos.add(elemento);

}

//obter T (int índice)

    public T obter(int indice){

        if(indice < 0 || indice >= elementos.size()){
            //logica pra caminho alternativo
            return null;
        }
        T objetoEncontrado = this.elementos.get(indice);
        return objetoEncontrado;
    }

//U é o id (índice) do Objeto q retornar o int
    /**
    public int indice(U id){
        this.elementos.indexOf()
    }
     */
//boolean contem (T elemento)

    public boolean contem(T elemento){
       for(int i = 0; i < this.elementos.size(); i++){
           T elementoDaPosicao = this.elementos.get(i);
           if(elemento.equals(elementoDaPosicao)){
               return true;
           }
       }
       return false;
    }



}