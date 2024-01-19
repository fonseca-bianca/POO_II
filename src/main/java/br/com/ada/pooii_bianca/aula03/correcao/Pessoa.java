package br.com.ada.pooii_bianca.aula03.correcao;

public record Pessoa(long id, String nome) implements ObjetoComId<Long> {

    @Override
    public Long getId(){
        return id;
    }
}
