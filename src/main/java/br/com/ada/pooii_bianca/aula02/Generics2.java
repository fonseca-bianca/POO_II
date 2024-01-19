package br.com.ada.pooii_bianca.aula02;


import br.com.ada.pooii_bianca.domain.Cliente;
import br.com.ada.pooii_bianca.domain.Vendedor;

import java.util.List;

public class Generics2 {

    public static void main(String[] args) {


//        VendedorRepositorio repositorio = new VendedorRepositorio();

        Vendedor vendedor = new Vendedor("Jorge", 1200);
//        repositorio.salvarVendendor(vendedor);

//        ClienteRepositorio repositorioCliente = new ClienteRepositorio();

        Cliente cliente = new Cliente();
//        repositorioCliente.salvarCliente(cliente);


        // repositorio do vendedor
        Repositorio<Vendedor> repositorioGenericoVendedor = new RepositorioGenerico<>();
        repositorioGenericoVendedor.salvar(vendedor);
        repositorioGenericoVendedor.buscarPorNome("jorge");

        // repositorio do cliente
        //avisa a memória q precisa do espaço           = new: aloca espaço na memória E cria o NOVO Objeto na memória do compilador JavaC
        Repositorio<Cliente> repositorioGenericoCliente = new RepositorioGenerico<>();
        repositorioGenericoCliente.salvar(cliente);
        repositorioGenericoCliente.buscarPorNome("maria");



        VendedorRepositorio vRepo = new VendedorRepositorio();
        vRepo.salvar(vendedor);

        ClienteRepositorio cRepo = new ClienteRepositorio();
        cRepo.buscarPorCPF("123");

        salvarObj(cRepo, cliente);

    }

    //POLIMORFISMO:
    //Método polimórfico q receberá como Argumentos: Repositorio repo e Cliente cliente
    public static void salvarObj(Repositorio repo, Cliente cliente) {
        repo.salvar(cliente);
    }

}

