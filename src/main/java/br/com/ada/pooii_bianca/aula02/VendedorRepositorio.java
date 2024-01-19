package br.com.ada.pooii_bianca.aula02;

import br.com.ada.pooii_bianca.domain.Vendedor;

public class VendedorRepositorio implements Repositorio<Vendedor> {

    /**public void salvarVendedor(Vendedor vendedor){
     * //salva o vendedor no Banco de Dados
     * }
     */


    @Override
    public void salvar(Vendedor entidade) {
    }

    @Override
    public Vendedor buscarPorNome(String nome) {
        //busca vendedor por nome
        return null;
    }

    @Override
    public Boolean deletar(Vendedor entidade) {
        return null;
    }

    @Override
    public Vendedor atualizar(Vendedor entidade) {
        return null;
    }
}
