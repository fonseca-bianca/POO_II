package br.com.ada.pooii_bianca.aula02;

import br.com.ada.pooii_bianca.aula02.exercicio01.Caixa;
import br.com.ada.pooii_bianca.domain.Vendedor;

import java.util.ArrayList;
import java.util.List;

public class Generics {

    public static void main(String args[]) {

        //CaixaDeInteiro box = new CaixaDeInteiro(obj: 1);
        //box.imprimir();

        // Generics: deixa o Objeto genérico, ele passa a aceitar qlqr tipo de Objeto
        //pode usar a nível de Classe e de Método
        //tipo é inferido em tempo de execução pelo Java
        // cria 1 Classe na qual podemos passar: Integer, Double ou String como uma Classe genérica
        //ex.: Caixa<Integer> caixaDeInteger = new Caixa<>(obj: 1);


        Caixa<String> box = new Caixa<>("abc"); //operador Diamond: SEM o tipo entre <>
        Caixa<Integer> caixaDeInteger = new Caixa<>(1); //Caixa<Integer> o tipo dinâmico dela é SÓ INTEGER

        String resultadoCaixaDaString = box.imprimir();
        box.getInt("asdf");

        String resultadoCaixaDoInteger = caixaDeInteger.imprimir();
        caixaDeInteger.getInt(123);

        System.out.println(resultadoCaixaDaString);
        System.out.println(resultadoCaixaDoInteger);

        Vendedor vendedor = new Vendedor("jorge", 1200);

        Caixa<Vendedor> caixaVendedor = new Caixa<>(vendedor);
        String string = caixaVendedor.imprimir();
        System.out.println(string);

        List<Vendedor> lista = new ArrayList<>();
        lista.add(new Vendedor("novo", 14000));

        //casting

    }

}
