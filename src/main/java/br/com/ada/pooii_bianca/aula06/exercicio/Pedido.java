package br.com.ada.pooii_bianca.aula06.exercicio;

import java.util.List;

public class Pedido {
    public double calcularTotalPedido() { /*...*/ }
    public List<Item> getItens() { /*...*/ }
    public long getQtdItens() { /*...*/ }
    public void addItem(Item item) { /*...*/ }
    public void deletarItem(Item item) { /*...*/ }

    public void imprimirPedido() { /* Violação do SRP */ }
    public void imprimirItens() { /* Violação do SRP */ }

    public void buscarPedido(long id) { /* Violação do SRP */ }
    public void salvar(Pedido pedido) { /* Violação do SRP */ }
    public void atualizar(long id, Pedido pedido) { /* Violação do SRP */ }
    public void deletar(long id) { /* Violação do SRP */ }

    public void enviarEmailConfirmacao(String mensagem) { /* Violação do SRP */ }

    public void enviarParaTransporte() { /* Violação do SRP */ }
}

//REFATORAÇÃO COM BASE NOS PRINCÍPIOS SOLID:

//Class Pedido
class Pedido {
    private long id;
    private List<Item> itens;

    // getters e setters:
    public double calcularTotalPedido() {
        /*...*/
    }
    public List<Item> getItens() {
        /*...*/
    }
    public long getQtdItens() {
        /*...*/
    }
    public void addItem(Item item) {
        /*...*/
    }
    public void deletarItem(Item item) {
        /*...*/ }
}

//class ImpressaoPedido

public class ImpressaoPedido{
    public void imprimirPedido(Pedido pedido){
        /*...*/
        public void imprimirItens(Pedido pedido){
            /*...*/
        }
    }

}
// Classe GerenciamentoPedido - Responsável pelo gerenciamento do pedido no banco de dados
public class GerenciamentoPedido {
    public Pedido buscarPedido(long id) { /*...*/ }
    public void salvar(Pedido pedido) { /*...*/ }
    public void atualizar(long id, Pedido pedido) { /*...*/ }
    public void deletar(long id) { /*...*/ }
}

// Classe Notificacao - Responsável pelo envio de notificações
public class Notificacao {
    public void enviarEmailConfirmacao(String mensagem) { /*...*/ }
}

// Classe Transporte - Responsável pelo envio do pedido para transporte
public class Transporte {
    public void enviarParaTransporte(Pedido pedido) { /*...*/ }
}

// Classe Item - Detalhes do item
class Item {
    // Detalhes do item
}
