package com.keith.exercicios;

import java.util.Comparator;

public class ComparaSexoPessoa implements Comparator<Pessoa> {
    @Override
    public int compare(Pessoa pessoa1, Pessoa pessoa2) {
        return Integer.compare(pessoa1.getSexo(), pessoa2.getSexo());
    }
}
