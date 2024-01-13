package br.com.ada.pooii_bianca.aula01.exercicio02;

public class Main {
    public static void main(String[] args) {
        Shape circulo = new Circulo(2.0);
        Shape retangulo = new Retangulo(2.0, 3.0);
        Shape triangulo = new Triangulo(2.0, 4.0);

        System.out.println("A área do círuclo é: " + circulo.calcularArea());
        System.out.println("A área do retângulo é: " + retangulo.calcularArea());
        System.out.println("A área do triângulo é: " + triangulo.calcularArea());
    }
}
