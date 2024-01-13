package br.com.ada.pooii_bianca.aula01;

//modificador acesso public pra criar Interface (pode ser outro, MAS esse é o mais comum)
public interface Autentica extends AutenticaTwoFactor{

    //TODOS atributos da Interface são public static final (NÃO podem ser alterados)
    //NÃO necessita colocar antes, pq o Intellij reconhece como redundante, pois já sabe q eles são sempre assim
    String SENHA = "123";

    //Métodos são public abstract, pois NÃO têm implementações
    //NÃO necessita colocar antes, pq o Intellij reconhece como redundante, pois já sabe q eles são sempre assim
    boolean autentica(String senha);

    //Método default pra NÃO quebrar os cód Java implementados antes do Java 8
    //ninguém q NÃO implementa esse NOVO Método da Interface será obrigado a implementar tbm (@Override), assim como a Classe Abstract
    default boolean autenticaDefault(String senha){
        return senha.equals("123");
    }

}