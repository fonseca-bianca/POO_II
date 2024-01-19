package br.com.ada.pooii_bianca.aula01;

import br.com.ada.pooii_bianca.domain.Gerente;
import br.com.ada.pooii_bianca.domain.Vendedor;

public class MainCodigoProf {
    public static void main(String[] args) {

        /** checked and unchecked exceptions in java
         * UNCHECKED:
         * NÃO necesserariamente serão tratadas, pois podem OU NÃO aparecer pro Dev
         * normalmente são erros oriundos da Lógica do Programa
         * cód compila e roda --> isso é ruim, pq o Dev NÃO vê acontecendo e tbm NÃO é avisado na hora
         * AritmeticException lançada:
         * int resultadoDivisao = 10 / 0;
         *
         * CHECKED:
         * Java NÃO deixa o cód compilar, ele mostra o erro e para ali mesmo pro Dev poder realizar a correção
         * OBRIGATORIAMENTE devem ser tratadas pro Java poder compilar o cód
         * ex.: ler todos os Bytes de um arquivo:
         * Files.readAllBytes(Path.of(first:""));
         *
         */

        Vendedor vendedor = new Vendedor("igor", 1000);
        Gerente gerente = new Gerente("maria", 2000);


        autentica(vendedor, vendedor.getSenha());
//        autentica(funcionario2, "123");

        System.out.println("Imprimindo o bonus do jorge: " + vendedor.getBonus());
        System.out.println("Imprimindo o bonus da maria: " + gerente.getBonus());
    }

    public static void autentica(Autentica a, String senha) {

        a.autenticaDefault(senha);

        if (a.autentica(senha)) {
            System.out.println("Autenticado");
        } else {
            System.out.println("Nao autenticado");
        }
    }
}