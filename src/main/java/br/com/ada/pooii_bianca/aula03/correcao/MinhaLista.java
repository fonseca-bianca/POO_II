package br.com.ada.pooii_bianca.aula03.correcao;


import java.util.List;
import java.util.ArrayList;

public class MinhaLista<T extends ObjetoComId<U>, U> {
    // GENERIC BOUNDED

    private final List<T> elementos = new ArrayList<>();

    // adicionar(T elemento);
    public void adicionar(T elemento) {

        this.elementos.add(elemento);
    }

    // T obter(int indice)
    public T obter(int indice) {
        if (indice >= 0 && indice < elementos.size()) {
            T objetoEncontrado = this.elementos.get(indice);
            return objetoEncontrado;
        }
        throw new IndexOutOfBoundsException("Posicao invalida");
    }

    //int indice(U identificador);
    public int indice(U id) {
        for (int i = 0; i < this.elementos.size(); i++) {

            T elementoDaPosicao = this.elementos.get(i);
            boolean isIgual = elementoDaPosicao.getId().equals(id);

            if (isIgual) {
                return i;
            }
        }
        return -1;
    }

    // boolean contem(T elemento)
    public boolean contem(T elemento) {

        // return this.elementos.contains(elemento);
        for (int i = 0; i < this.elementos.size(); i++) {
            T elementoDaPosicao = this.elementos.get(i);
            if (elemento.equals(elementoDaPosicao)) {
                return true;
            }
        }
        return false;
    }
}


/**public class MinhaLista<T, U> {
    //GENERIC BOUNDED
    private final List<T> elementos = new ArrayList<>(); //raw type

    //T é o Objeto - adicionar o elemento
    // adicionar(T elemento);
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
    //throw new IndexOutOfBoundsException("Posicao invalida");

    /**OU
     * public T obter(int indice) {
     *         if (indice >= 0 && indice < elementos.size()) {
     *             T objetoEncontrado = this.elementos.get(indice);
     *             return objetoEncontrado;
     *         }
     *         throw new IndexOutOfBoundsException("Posicao invalida");
     *     }
     *
     */
/**
//int indice(U identificador);
public int indice(U id) {
    for (int i = 0; i < this.elementos.size(); i++) {

        T elementoDaPosicao = this.elementos.get(i);
        boolean isIgual = elementoDaPosicao.getId().equals(id);

        if (isIgual) {
            return i;
        }
    }
    return -1;
}

//U é o id (índice) do Objeto q retornar o int

     //public int indice(U id){
     //this.elementos.indexOf()
     //}


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
*/

