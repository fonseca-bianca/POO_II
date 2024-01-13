package br.com.ada.pooii_bianca.aula01.exercicio02;

public class Circulo implements Shape{
    public double raio;

    public Circulo(double raio){
        this.raio = raio;
    }

    public double calcularArea(){
        return Math.PI * Math.pow(raio, 2);
    }
}


