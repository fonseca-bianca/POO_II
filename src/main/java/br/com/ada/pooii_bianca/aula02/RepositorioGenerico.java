package br.com.ada.pooii_bianca.aula02;

//import br.com.ada.pooii_bianca.domain.Vendedor;

//criamos 1 repositório q cabe pra TODOS os Objetos (Cliente, Vendedor, Funcionário, Gerente, etc.)
//vai receber o <TIPO>
public class RepositorioGenerico<T> implements Repositorio<T> {

    @Override
    public void salvar(T entidade) { //entidade: é o parâmetro do T
    }

    @Override
    public T buscarPorNome(String nome) {
        return null;
    }

    @Override
    public Boolean deletar(T entidade) {
        return null;
    }

    @Override
    public T atualizar(T entidade) {
        return null;
    }
}