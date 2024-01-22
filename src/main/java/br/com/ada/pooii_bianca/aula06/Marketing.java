package br.com.ada.pooii_bianca.aula06;

public class Marketing extends Funcionario {

    public Marketing(String nome, double salario) {
        super(nome, salario);
    }

    @Override
    public double calcularBonus() {
        return getSalario() * 0.3;
    }

}
