package br.com.ada.pooii_bianca.aula01;

import br.com.ada.pooii_bianca.domain.Funcionario;
import br.com.ada.pooii_bianca.domain.Gerente;
import br.com.ada.pooii_bianca.domain.Vendedor;

public class MainFuncionario{
    public static void main(String[] args) {

        //cria variável 'vendedor'// = cria instância
        Vendedor vendedor = new Vendedor("jorge", 1000);
        Funcionario gerente = new Gerente("maria", 3000);

        //imprimir o bônus do funcionário
        //System.out.println(funcionario1.getBonus());

        //transforma variável Funcionario acima em Vendedor pra getSenha() funcionar, já q esse método está implementado lá em Vendedor
        autentica(vendedor, vendedor.getSenha());


        System.out.println("Impressão do bônus do Jorge: " + vendedor.getBonus());
        System.out.println("Impressão do bônus da Maria: " + gerente.getBonus());
    }

    //Método q pode receber a Interface Autentica
    public static void autentica(Autentica a, String senha){
        a.autenticaDefault(senha);
        if(a.autentica(senha)){
            System.out.println("Autenticado");
        } else {
            System.out.println("Não autenticado");
        }
    }
}




//double resultado = 0.0;
//if(this.cargo == "vendedor"); == compara endereço na memória das Classes
//.equals(): compara se valor de 'cargo' é IGUAL ao valor de 'vendedor'
/** if(this.cargo.equals("vendedor")){ //.equals() da String: ignora se é maiúscula ou minúscula. NÃO é da Classe Object

 resultado = this.salario * 0.2;
 } else if(this.cargo.equalsIgnoreCase("gerente")){ //vai ignorar sem houver maiúsculas ou minúsculas
 //OU this.cargo.toLowerCase().equals("vendedor".toLowerCase()))
 resultado = this.salario * 0.3;
 }
 return resultado;
 }

 */
//pro código NÃO ficar muito extenso, o ideal é criar uma Subclasse
//remover cargo acima, pois ninguém mais pode instanciar o Funcionario



