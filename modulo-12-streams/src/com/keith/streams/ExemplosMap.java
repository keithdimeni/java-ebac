package com.keith.streams;

import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class ExemplosMap {
    public static void main(String[] args) {
        List<Pessoa> lista = new Pessoa().popularPessoas();

        Stream<Integer> streamIdade = lista.stream()
                .filter(pessoa -> pessoa.getNacionalidade().equals("Angola"))
                .map(Pessoa::getIdade);

        //O stream e especifico evitando o autoboxing tornando assim mais perfomatico
        IntStream streamIdadeInt = lista.stream()
                .filter(pessoa -> pessoa.getNacionalidade().equals("Angola"))
                .mapToInt(Pessoa::getIdade);
    }
}
