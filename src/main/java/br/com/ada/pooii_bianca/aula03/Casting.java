package br.com.ada.pooii_bianca.aula03;
import java.util.ArrayList;
import java.util.List;

//CASTING: convertendo um tipo de dado em outro tipo
public class Casting {

    public static void main(String[] args) {

        long id = 123;
        String idString = "123-abc";
        int idInt = 456;

        List ids = new ArrayList();
        ids.add(id);
        ids.add(idString);
        ids.add(idInt);

        // CASTING EXPLICITOS
        // processo do java para converter um objeto de um tipo em outro tipo

        // [123, "123-abc"]
        //  0       1

        Long idLong = (long) ids.get(0); //casting

        System.out.println(idLong);


        // ClassCastException

        if (ids.get(1) instanceof Long) { //verifica se o 2º elemento da lista 'ids' é uma instância de Long
            Long idLong2 = (long) ids.get(1); //se a condição acima for TRUE, daí aq será feito o 'casting' do 2º elemento da lista 'ids'
            //será feito o casting pra um Long e será armazenado na variável 'idLong2'
            System.out.println(idLong2);
        }

        //vai verificar se 3º elemento da lista 'ids' é uma instância de Long OU de Integer
        if (ids.get(2) instanceof Long || ids.get(2) instanceof Integer) {
            //se a condição acima for TRUE, então aq será feito o casting do 3º elemento pra Integer e será armazenado na variável 'i'
            Integer i = (Integer) ids.get(2);

            //casting da variável 'i' pra um tipo Long e armazenar na variável 'idLong2' do tipo Long
            Long idLong2 = (long) i;
            System.out.println(idLong2);
        }

    }

}
