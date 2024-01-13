package br.com.ada.pooii_bianca.aula01;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        //criando NOVA instância da Classe ContaCorrente e atribuindo ela à variável 'cc'
        //new: construtor da Classe ContaCorrente criando NOVO Objeto ContaCorrente
        ContaCorrente cc = new ContaCorrente();

        //chamando Método 'depositar' do Objeto ContaCorrente cc
        cc.depositar(10.0);

        //Método 'getSaldo()" chamado no Objeto ContaCorrente cc pra retornar saldo atual após depósito
        System.out.println(cc.getSaldo());
    }
}

//Abstract: classe NÃO existe, apenas serve de modelo pra outras Classes. NÃO pode ser instanciada (NÃO pode criar
//Objeto diretamente dela
abstract class Conta {
    //titular e saldo: variáveis q armazenam o estado da Class Conta
    //ambos estavam como Private no exemplo, nesse caso, só podem ser acessados DENTRO da Class Conta
    protected String titular;
    protected double saldo = 0.0;

    //criando Método no qual as contas irão definir o tipo de comportamento
    //quem implementar Conta, terá q implementar o Método abaixo
    abstract void depositar(double valor);
    abstract void sacar(double valor);

    public double getSaldo(){
        return saldo;
    }
}

//extends: pois ContaCorrente está herdando de Conta, logo, tem q herdar os Métodos de Conta pro projeto compilar
class ContaCorrente extends Conta {

    @Override
    void depositar(double valor) {
        this.saldo += valor * 0.95;
        //NÃO é possível, pois 'saldo' está PRIVATE
        //pra acessar, mudar o PAI pra Protected pros filhos poderem acessar
        //this: está acessando o Atributo SALDO dessa instância. Acessa Campo ou chama Método do Objeto atual da Class Conta
        //super: está acessando Atributo da Classe PAI
    }

    @Override
    void sacar(double valor) {
        this.saldo -= valor * 0.95;
    }
}

