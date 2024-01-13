package br.com.ada.pooii_bianca.aula01;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main2 {

    public static void main(String[] args) {

        //Classe utilitária: seus Métodos são Estáticos
        //.sort(): Método q recebe uma Lista e ordena os itens dela

        //Lis<>: é uma Interface, pq a implementação é um ArrayList<>
        //voltado pra Interface = CONTRATO. É MELHOR, pois NÃO altera nada do cód daq pra frente
        //List<String> a = new ArrayList<>();
        //trabalhando pra implementação
        //ArrayList<String> b = new ArrayList<>(); //aq, se mudarmos implementação a posteriori, vamos ter q alterar o restante do cód

        List<Gerente> gerentes = new ArrayList<>();

        Gerente gerente1 = new Gerente("jorge", 1000);
        Gerente gerente2 = new Gerente("maria", 2000);
        Gerente gerente3 = new Gerente("eduarda", 1500);
        Gerente gerente4 = new Gerente("angela", 3500);
        Gerente gerente5 = new Gerente("gustavo", 1750);

        gerentes.add(gerente1);
        gerentes.add(gerente2);
        gerentes.add(gerente3);
        gerentes.add(gerente4);
        gerentes.add(gerente5);

        //.sort(): SOMENTE irá ordenar se houver um CONTRATO
        //no caso, da erro pq o .sort() NÃO sabe como querermos ordenar os elementos (por nome? por salário?)
        Collections.sort(gerentes);
        /**funcionou pq na classe Gerente incluímos:
         * public int compareTo(Gerente o) {
         *         //transformando Double em int
         *         double resultado = o.getBonus() - this.getBonus();
         *         //pega Double da Classe Wrapper: tem Método estático .valueOf()
         *         return Double.valueOf(resultado).intValue();
         *     }
         * }
         */

        System.out.println(gerentes);
        //println: já chama o toString() por causa da Classe-MÃE Object
    }
}
