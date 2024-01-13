package br.com.ada.pooii_bianca.aula01.exercicio01;

//Objetos de cada Classe criados
//chamando os métodos pelo polimorfismo (referência dos Objetos - Veiculo e VeiculoMotorizado)
public class Main {
    public static void main(String[] args) {
        VeiculoMotorizado carro = new Carro();
        VeiculoMotorizado moto = new Moto();
        Veiculo bicicleta = new Bicicleta();

        carro.ligarMotorVeiculo();
        carro.acelerar(10);
        carro.frear();
        carro.desligar();

        moto.ligarMotorVeiculo();
        moto.acelerar(15);
        moto.frear();
        moto.desligar();

        bicicleta.ligarMotorVeiculo();
        bicicleta.acelerar(20);
        bicicleta.frear();
        bicicleta.desligar();
    }
}
