package com.keith.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class ExemplosCollect {
    public static void main(String[] args) {
        List<Pessoa> lista = new Pessoa().popularPessoas();

        List<Pessoa> listaAngola = lista.stream()
                .filter(pessoa -> pessoa.getNacionalidade().equals("Angola"))
                .collect(Collectors.toList());
        listaAngola.forEach(System.out::println);

        System.out.println("*************");
        System.out.println("*************");
        System.out.println();

        lista.stream()
                .filter(pessoa -> pessoa.getNacionalidade().equals("Angola"))
                .collect(Collectors.toList())
                .forEach(System.out::println);

        System.out.println("**************");
        System.out.println("**************");
        System.out.println();

        Set<Pessoa> setAngola = lista.stream()
                .filter(pessoa -> pessoa.getNacionalidade().equals("Angola"))
                .collect(Collectors.toSet());
        setAngola.forEach(System.out::println);
        System.out.println();

        lista.stream()
                .filter(pessoa -> pessoa.getNacionalidade().equals("Angola"))
                .collect(Collectors.toSet())
                .forEach(System.out::println);

        System.out.println("***************");
        System.out.println("***************");

        ArrayList<Pessoa> arrayList = lista.stream()
                .filter(pessoa -> pessoa.getNacionalidade().equals("Angola"))
                .collect(Collectors.toCollection(ArrayList::new));
        arrayList.forEach(System.out::println);
        System.out.println();

        lista.stream()
                .filter(pessoa -> pessoa.getNacionalidade().equals("Angola"))
                .collect(Collectors.toCollection(ArrayList::new))
                .forEach(System.out::println);

        System.out.println("**************");
        System.out.println("**************");

        lista.stream()
                .filter(pessoa -> pessoa.getNacionalidade().equals("Angola"))
                .collect(Collectors.toMap(Pessoa::getIdade, Pessoa::new))
                .forEach((k, v) -> System.out.println(  k + " - " + v.getNome()));
        System.out.println();

        lista.stream()
                //.filter(pessoa -> pessoa.getNacionalidade().equals("Angola"))
                .collect(Collectors.groupingBy(Pessoa::getIdade))
                .forEach((k, v) -> System.out.println(  k + " - " + v));
    }
}
