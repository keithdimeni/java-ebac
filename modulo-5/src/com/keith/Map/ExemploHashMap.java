package com.keith.Map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class ExemploHashMap {
    public static void main(String[] args) {
        exemploLitaSimples();
        exemploListaSimplesIterandoValores();
        exemploListaSimplesIterandoChaves();
        exemploListaSimplesIterandoChaveValor();
    }

    public static void exemploLitaSimples() {
        System.out.println("**** EXEMPLO LISTA SIMPLES ****");
        Map<Integer, String> lista = new HashMap<>();
        lista.put(1, "João da Silva");
        lista.put(2, "Antônio Sousa");
        lista.put(3, "Lúcia Ferreira");
        lista.put(4, "João da Silva");
        System.out.println(lista);
        System.out.println();
    }
    public static void exemploListaSimplesIterandoValores(){
        System.out.println("**** EXEMPLO LISTA SIMPLES ITERANDO VALORES ****");
        Map<Integer, String> lista = new HashMap<>();
        lista.put(1, "João da Silva");
        lista.put(2, "Antônio Sousa");
        lista.put(3, "Lúcia Ferreira");
        lista.put(4, "João da Silva");

        for(String value : lista.values()){
            System.out.println(value);
        }
        System.out.println();
    }
    public static void exemploListaSimplesIterandoChaves(){
        System.out.println("**** EXEMPLO LISTA SIMPLES ITERANDO CHAVES ****");
        Map<Integer, String> lista = new HashMap<>();
        lista.put(1, "João da Silva");
        lista.put(2, "Antônio Sousa");
        lista.put(3, "Lúcia Ferreira");
        lista.put(4, "João da Silva");

        for (Integer chave : lista.keySet()){
            System.out.println(chave);
        }
        System.out.println();
    }
    public static void exemploListaSimplesIterandoChaveValor(){
        System.out.println("**** EXEMPLO LISTA SIMPLES ITERANDO CHAVE VALOR ****");
        Map<Integer, String> lista = new HashMap<>();
        lista.put(1, "João da Silva");
        lista.put(2, "Antônio Sousa");
        lista.put(3, "Lúcia Ferreira");
        lista.put(4, "João da Silva");

        System.out.println("for comum");
        Set<Map.Entry<Integer, String>> entry = lista.entrySet();
        for (Map.Entry<Integer, String> e : entry) {
            System.out.println("Chave: " + e.getKey());
            System.out.println("Valor: " + e.getValue());
        }
        System.out.println();

        System.out.println("forEach Stream");
        lista.entrySet().forEach(e -> {
            System.out.println("Chave: " + e.getKey());
            System.out.println("Valore: " + e.getValue());
        });
        System.out.println();

        System.out.println("forEach stream 1");
        lista.keySet().stream().forEach(System.out::println);
        System.out.println();

        System.out.println("forEach stream 2");
        lista.values().stream().forEach(System.out::println);
        System.out.println();

        System.out.println("forEach stream 3");
        lista.forEach((key, value) -> System.out.println(key + " " + value));
        System.out.println();

        System.out.println("iterator");
        Iterator<Map.Entry<Integer, String>> iterador = lista.entrySet().iterator();
        while(iterador.hasNext()) {
            Map.Entry<Integer, String> entry1 = iterador.next();
            System.out.println("Chave: " + entry1.getKey());
            System.out.println("Valor: " + entry1.getValue());
        }

    }
}
