package br.com.ada.pooii_bianca.aula01.exercicio01;

public class Moto implements VeiculoMotorizado{
    @Override
    public void ligarMotorVeiculo() {
        System.out.println("A moto está ligada");
    }

    @Override
    public void acelerar(int velocidade) {
        System.out.println("A moto está acelerando a: " + velocidade + "km/h");
    }

    @Override
    public void frear() {
        System.out.println("A moto está freando");
    }

    @Override
    public void desligar() {
        System.out.println("A moto está desligada");
    }
}
