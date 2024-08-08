package com.keith.streams;

import java.util.List;
import java.util.stream.Stream;

public class ExemplosLimit {
    public static void main(String[] args) {
        List<Pessoa> lista = new Pessoa().popularPessoas();

        Stream<Pessoa> streamPessoa = lista.stream().limit(2);
    }
}
