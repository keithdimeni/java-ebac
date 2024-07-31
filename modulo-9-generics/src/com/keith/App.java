package com.keith;

import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {
        List<String> lista = new ArrayList();
        lista.add("Nome");
        lista.add("Sobrenome");

        print(lista);

        List<Integer> lista2 = new ArrayList<>();
        lista2.add(3);
        lista2.add(4);
        print2(lista2);

        System.out.println(getValue(lista));;
        System.out.println(getValue(lista2));;

        GenericEntry<String> generic = new GenericEntry<>("Teste");

        System.out.println(generic.getData());

    }

    public static void print(List<String> lista){
        lista.forEach(item -> {
            System.out.println(item);
        });
    }

    public static <T> void print2(List<T> lista) {
        lista.forEach(item -> System.out.println(item));
    }

    public static <T> T getValue(List<T> lista) {
        return lista.get(0);
    }
}
