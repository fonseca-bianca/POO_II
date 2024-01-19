package br.com.ada.pooii_bianca.aula02;

import br.com.ada.pooii_bianca.domain.Vendedor;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class Main {
    public static void main(String[] args) {

        Vendedor vendedor = new Vendedor("jorge", 1200);

        Integer ano = null;
        /**
         * Integer ano = null; --> pede pro Java separar um espaço na memória, mas SEM valor (NULL), pra, depois de compilado o cód, o resultado ir pro espaço de memória vazio
         * if (vendedor.getNome().equals("jorge")){
         *  ano = 1994;
         * } else if(vendedor.getNome().equals("roberto")){
         *  ano = 1997;
         *  }
         *  System.out.println("ano de nascimento: " + ano);
         *
         *  IMPRIMIRÁ: ano de nascimento: null --> o próprio Java já converte o 'ano' pra toString()
         *  se quisermos q imprima 'NullPointerExcepction', aí é necessário colocar ao lado do 'ano' 'ano.toString();'
         *
         *  else: é uma solução pro 'NullPointerException', pq daí damos mais uma opção pra ele cair (caso ocorra o erro OU nenhuma das oções anteriores seja aceita)
         */

        if (vendedor.getNome().equals("jorge")) {
            ano = 1994;
        } else if (vendedor.getNome().equals("roberto")) {
            ano = 1997;
        }

        // unchecked exception: EVITAR SEMPRE!
        if (ano != null) {
            System.out.println("Ano de nascimento: " + ano.toString());
        }

        // checked exception: exceção TRATADA
        //OBS.: try... catch: consome muito da memória e demora pra ser lido. Evitar pra cód grande
        try {
            Files.readAllBytes(Path.of("")); //tenta ler TODOS os Bytes do arquivo com String vazia
        } catch (IOException e) { //É um fluxo alternativo. Se houver exceção, ela será lançada e atribuída à variável 'e'
            // cria o arquivo
            e.printStackTrace(); //imprime exceção. Mostra sequência da chamada de Métodos q ocasionou a exceção
        }


    }
}