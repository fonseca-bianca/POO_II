package br.com.ada.pooii_bianca.aula01.exercicio02;

public class Retangulo implements Shape{
    public double largura;

    public double altura;

    public Retangulo(double largura, double altura){
        this.largura = largura;
        this.altura = altura;
    }

    public double calcularArea(){
        return largura * altura;
    }
}
