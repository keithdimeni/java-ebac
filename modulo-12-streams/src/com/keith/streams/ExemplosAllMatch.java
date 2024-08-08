package com.keith.streams;

import java.util.List;

public class ExemplosAllMatch {
    public static void main(String[] args) {
        List<Pessoa> lista = new Pessoa().popularPessoas();

        boolean resultado = lista.stream()
                .allMatch(pessoa -> pessoa.getNacionalidade().equals("Mexico"));
        System.out.println(resultado);
    }
}
