package com.keith.streams;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Stream;

public class CriandoStreams {
    public static void main(String[] args) {
        Stream<String> list = List.of("Keith", "Dimeni", "Biengo").stream();
        Stream<String> set = Set.of("Mauricioi", "Dimeni", "Augusto", "Puati").stream();

        Map<String, String> map = Map.of("Nome", "Keith");
        Stream<String> chaves = map.keySet().stream();
        Stream<String> valores = map.values().stream();

    }
}
