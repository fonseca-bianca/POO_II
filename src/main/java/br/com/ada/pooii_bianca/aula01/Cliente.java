package br.com.ada.pooii_bianca.aula01;

import br.com.ada.pooii_bianca.aula01.Autentica;

public class Cliente implements Autentica {

    private String senha;
    @Override
    public boolean autentica(String senha) {
        return this.senha.equals(senha);
    }

    @Override
    public boolean twoFA() {
        return false;
    }
}
