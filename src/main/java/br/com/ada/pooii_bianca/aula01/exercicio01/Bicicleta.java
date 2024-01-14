package br.com.ada.pooii_bianca.aula01.exercicio01;

public class Bicicleta implements Veiculo{

    @Override
    public void acelerar(int velocidade) {
        System.out.println("A bicicleta está andando a: " + velocidade + "km/h");
    }

    @Override
    public void frear() {
        System.out.println("A bicicleta está freando");
    }

}
