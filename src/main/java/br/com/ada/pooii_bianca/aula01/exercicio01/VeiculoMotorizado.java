package br.com.ada.pooii_bianca.aula01.exercicio01;

public interface VeiculoMotorizado extends Veiculo{
    void ligarMotorVeiculo();

    void desligar();

    @Override
    default void acelerar(int velocidade) {

    }
}
