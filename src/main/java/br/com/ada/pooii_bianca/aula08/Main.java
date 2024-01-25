package br.com.ada.pooii_bianca.aula08;

public class Main {
    public static void main(String[] args) {
        //SRP:
        //Transaction manager: parou de gerenciar as regras

        //OCP:
        //Transaction manager: aberta pra NOVAS regras e fechada pra modificação

        //LSP:
        //Transaction manager: podemos substituir RuleChecker por qlqr implementação

        //ISP:
        //RuleChecker: recebeu uma segregação quando precisamos de outro grupo de regras
        //pq nem todas as classes vão conseguir implementar o método q tem na classe pai

        //DIP:
        //Transaction manager: agora depende uma lista de abstrações e NÃO implementação
        //tem q depender da Abstração da classe, da Interface (contrato)
    }
}
