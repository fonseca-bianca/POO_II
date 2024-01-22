package br.com.ada.pooii_bianca.aula05.exercicio_pilha;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Stack<String> minhaStack = new StackImpl<>();

        List<Object> todosOsElementos = new ArrayList<>();

        // PUSH
        System.out.println("PUSH");
        minhaStack.push("lucia");
        minhaStack.push("maria");
        minhaStack.push("erica");
        minhaStack.push("paula");

        // POP
        System.out.println("POP");
        String nome = minhaStack.pop();
        System.out.println(nome);

        nome = minhaStack.pop();
        System.out.println(nome);

        // PEEK
        System.out.println("PEEK");
        nome = minhaStack.peek();
        System.out.println(nome);

        nome = minhaStack.peek();
        System.out.println(nome);

        // IS EMPTY
        System.out.println("IS EMPTY");
        boolean empty = minhaStack.isEmpty();
        System.out.println(empty);

        // TESTANDO TRANSFERENCIA
//        minhaStack.transferirObjetos(todosOsElementos);

        System.out.println(todosOsElementos);
    }
}