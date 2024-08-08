package com.keith.streams;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class ExemplosSorted {
    public static void main(String[] args) {
        List<Pessoa> lista = new Pessoa().popularPessoas();

        Stream<Pessoa> streamPessoa = lista.stream()
                .filter(pessoa -> pessoa.getNacionalidade().equals("Angola"))
                .sorted(Comparator.comparing(Pessoa::getIdade));

        Stream<Pessoa> streamPessoa2 = lista.stream()
                .sorted(Comparator.comparing(Pessoa::getIdade));

        Stream<Pessoa> streamPessoa3 = lista.stream()
                .sorted((p1, p2) -> Integer.compare(p2.getIdade(), p1.getIdade()));

    }
}
