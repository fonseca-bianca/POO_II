package br.com.ada.pooii_bianca.aula06;

public class Almoxarifado extends Funcionario {

    public Almoxarifado(String nome, double salario) {
        super(nome, salario);
    }

    @Override
    public double calcularBonus() {
        return getSalario() * 0.17;
    }
}
