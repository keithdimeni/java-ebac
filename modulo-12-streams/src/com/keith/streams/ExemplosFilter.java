package com.keith.streams;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class ExemplosFilter {
    public static void main(String[] args) {
        List<Pessoa> lista = new Pessoa().popularPessoas();

        //Primeira forma e a mais comum
        Stream<Pessoa> streamPessoa = lista.stream().filter(pessoa -> pessoa.getNacionalidade().equals("Angola"));
        System.out.println(streamPessoa.toList());

        // Segunda forma de fazer
        Predicate<Pessoa> pred = pessoa -> pessoa.getNacionalidade().equals("Angola");
        Stream<Pessoa> streamPessoa2 = lista.stream().filter(pred);

        //Terceira forma de fazer
        Predicate<Pessoa> pred2 = new Predicate<Pessoa>() {
            @Override
            public boolean test(Pessoa pessoa) {
                return pessoa.getNacionalidade().equals("Angola");
            }
        };
        Stream<Pessoa> pessoaStream3 = lista.stream().filter(pred2);

    }
}
