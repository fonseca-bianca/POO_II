package br.com.ada.pooii_bianca.aula01;

//modificador acesso public pra criar Interface (pode ser outro, MAS esse é o mais comum)
public interface Autentica extends AutenticaTwoFactor {

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

/**
 * CÓDIGO AULA PROFESSOR COM ANOTAÇÕES:
 public interface Autentica {

 /**
 * ATRIBUTOS na Interface:
 * são sempre CONSTANTES, NÃO podem ser alterados depois de declarados
 * public static final Integer TAMANHO_MAX_SENHA = 8;

Integer TAMANHO_MAX_SENHA = 8;

//Método abstract:
//por padrão é PUBLIC, portanto, NÃO precisa colocar na frente
boolean autentica(String senha);

//Método default: permite implementação Método CONCRETO na Interface (a partir da versão 8 do Java)
//pertence ao Objeto q implementar a INTERFACE
default boolean autenticaDefault(String senha) {
    return autenticaPrivate(senha);
}

//Método static: pode ser colocado, mas ele será do escopo da INTERFACE e NÃO do Objeto/Método q implementa essa Interface
static boolean autenticaStatico(String senha) {
    return senha.equals("123");
}

//Método private: pertence ao Objeto q implementar a INTERFACE
private boolean autenticaPrivate(String senha) {
    return senha.equals("123");
}

boolean twoFA();
}
*/