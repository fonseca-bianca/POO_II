package br.com.ada.pooii_bianca.aula01;

public abstract class Funcionario {

    //Atributos da Class Funcionario:
    protected String nome;
    protected double salario;

    //agora o bônus depende do cargo
    //private String cargo; //1-vendedor, 2-gerente

    //criação método construtor
    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
        //this.cargo = cargo;
    }

    //método pra pegar o bônus do salário do funcionário
    public abstract double getBonus();
}
