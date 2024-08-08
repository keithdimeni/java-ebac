package com.keith.streams;

import java.util.List;
import java.util.stream.Stream;

public class ExemplosForEach {
    public static void main(String[] args) {
        List<Pessoa> lista = new Pessoa().popularPessoas();

        lista.stream().forEach(pessoa -> System.out.println(pessoa.getNome() + " - " + pessoa.getNacionalidade()));
        System.out.println();
        lista.stream().filter(pessoa -> pessoa.getNacionalidade().equals("Angola"))
                .forEach(p -> System.out.println(p.getNome() + " - " + p.getNacionalidade()));

        System.out.println();
        Stream<Pessoa> stream = lista.stream().filter(pessoa -> pessoa.getNacionalidade().equals("Estados Unidos da America"));
        stream.forEach(pessoa -> System.out.println(pessoa.getNome()));

        System.out.println();
        lista.stream().filter(pessoa -> pessoa.getNacionalidade().equals("India"))
                .map(Pessoa::getIdade)
                .forEach(pessoa -> System.out.println(pessoa));
    }
}
