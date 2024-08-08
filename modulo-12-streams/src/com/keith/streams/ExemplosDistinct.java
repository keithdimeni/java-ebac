package com.keith.streams;

import java.util.List;
import java.util.stream.Stream;

public class ExemplosDistinct {
    public static void main(String[] args) {
        List<Pessoa> lista = new Pessoa().popularPessoas();

        Stream<Pessoa> streamPessoa = lista.stream().distinct();
    }
}
