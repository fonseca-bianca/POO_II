package br.com.ada.pooii_bianca.aula06;

public class Gerente extends Funcionario {

    public Gerente(String nome, double salario) {
        super(nome, salario);
    }

    @Override
    public double calcularBonus() {
        return getSalario() * 0.5;
    }
}
