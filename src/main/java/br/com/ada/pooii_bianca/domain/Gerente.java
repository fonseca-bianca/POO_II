package br.com.ada.pooii_bianca.domain;

public class Gerente extends Funcionario implements Comparable<Gerente> {

    public Gerente(String nome, double salario) {
        super(nome, salario);
    }

    @Override
    public double getBonus() {
        return this.salario * 0.3;
    }

    //SOBRESCREVER toString() pra ser impresso o valor do dado e NÃO o endereço dele na memória
    @Override
    public int compareTo(Gerente o) {
        //transformando Double em int
        double resultado = o.getBonus() - this.getBonus();
        //pega Double da Classe Wrapper: tem Método estático .valueOf()
        return Double.valueOf(resultado).intValue();
    }

    @Override
    public String toString(){
        return this.nome + ": salário: " + this.salario + " bônus: " + this.getBonus();
    }
}
