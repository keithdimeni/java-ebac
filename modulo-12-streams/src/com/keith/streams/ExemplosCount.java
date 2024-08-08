package com.keith.streams;

import java.util.List;

public class ExemplosCount {
    public static void main(String[] args) {
        List<Pessoa> lista = new Pessoa().popularPessoas();
        long count = lista.stream()
                .filter(pessoa -> pessoa.getNome().startsWith("D"))
                .count();
        System.out.println(count);
    }
}
