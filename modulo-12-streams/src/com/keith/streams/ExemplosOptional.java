package com.keith.streams;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class ExemplosOptional {
    public static void main(String[] args) {
        List<Pessoa> lista = new Pessoa().popularPessoas();

        Optional<Pessoa> opcional = lista.stream()
                .max(Comparator.comparing(Pessoa::getIdade));
        if (opcional.isPresent()) {
            System.out.println(opcional.get());
        }

        //A mesma coisa que a de cima
        opcional.ifPresent(System.out::println);
    }
}
