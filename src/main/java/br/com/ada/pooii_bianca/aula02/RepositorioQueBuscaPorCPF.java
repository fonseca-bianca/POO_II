package br.com.ada.pooii_bianca.aula02;

public interface RepositorioQueBuscaPorCPF<T> extends Repositorio<T> {

    T buscarPorCPF(String cpf);
}
