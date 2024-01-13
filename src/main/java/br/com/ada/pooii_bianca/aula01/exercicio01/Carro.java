package br.com.ada.pooii_bianca.aula01.exercicio01;

public class Carro implements VeiculoMotorizado{

    @Override
    public void ligarMotorVeiculo() {
        System.out.println("O carro está ligado");
    }

    @Override
    public void acelerar(int velocidade) {
        System.out.println("O Carro está acelerando a: " + velocidade + "km/h");
    }

    @Override
    public void frear() {
        System.out.println("O carro está freando");
    }

    @Override
    public void desligar() {
        System.out.println("O carro está desligado");
    }
}
