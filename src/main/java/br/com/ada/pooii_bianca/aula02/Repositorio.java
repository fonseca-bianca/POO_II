package br.com.ada.pooii_bianca.aula02;

//é o contrato "MAIOR" das Interfaces, as quais (e as Classes) irão seguir os Métodos e Atributos implementados
public interface Repositorio<T> {

    void salvar(T entidade); //método q NÃO retorna nada (void)

    T buscarPorNome(String nome);

    Boolean deletar(T entidade);

    T atualizar(T entidade);

}