package br.com.ada.pooii_bianca.domain;

import br.com.ada.pooii_bianca.aula01.Autentica;
//Cliente é o Objeto q implementa Autentica, então esse Objeto tem o 'autenticaDefault(senha);', pois está pegando da INTERFACE
public class Cliente implements Autentica {

    private String senha;
    @Override
    public boolean autentica(String senha) {
        //Autentica.autenticaStatica(senha); --> escopo direto da INTERFACE e NÃO do Objeto
        //autenticaDefault(senha); --> escopo pega direto do Objeto
        return this.senha.equals(senha);

        /**
         * int range = Autentica.TAMANHO_DA_SENHA; --> vai ser 8. Pega da Interface
         * COLOCA UMA VALIDAÇÃO, pq estamos chamando um Método da senha, do Objeto
         * if(senha != null && senha.length() > range){
         *  return false;
         */
    }

    @Override
    public boolean twoFA() {

        return false;
    }
}



