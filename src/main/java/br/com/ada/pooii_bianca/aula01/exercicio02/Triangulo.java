package br.com.ada.pooii_bianca.aula01.exercicio02;

public class Triangulo implements Shape{
    public double base;

    public double altura;

    public Triangulo(double base, double altura){
        this.base = base;
        this.altura = altura;
    }

    public double calcularArea(){
        return (base * altura) / 2;
    }
}
