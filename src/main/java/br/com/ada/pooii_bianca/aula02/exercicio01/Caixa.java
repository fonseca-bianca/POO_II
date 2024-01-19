package br.com.ada.pooii_bianca.aula02.exercicio01;

public class Caixa<T> {

    /**
     * public class Caixa --> aq vem o tipo<E, K, N, T, V, S, U> {
     *  private --> aq vai ser o tipo informado --> obj;
     *  public Caixa (aq vai ser o tipo informado --> obj){
     *      this.obj = obj;
     * }
     * public aq vai ser o tipo informado --> getObj(){
     *  return obj;
     * }
     * public Integer aq vai ser o tipo informado --> getNext(){ --> informa o próximo
     *  Integer integer = (Integer) this.obj;
     *  return integer+1;
     * }
     * public void imprimir(){
     *  System.out.println(this.obj);
     * }
     */

    /**
     * E - Element (used extensively by the Java Collections Framework)
     * K - Key
     * N - Number
     * T - Type
     * V - Value
     * S,U,V etc. - 2nd, 3rd, 4th types
     * */

    private T obj;

    public Caixa(T obj) {
        this.obj = obj;
    }

    public T getObj() {
        return obj;
    }

//    public Integer getNext() {
//        Integer integer = (Integer) this.obj;
//        return integer+1;
//    }

    public void getInt(T numero) {
        System.out.println(numero);
    }

    public String imprimir() {
        return this.obj.toString();
    }
}
