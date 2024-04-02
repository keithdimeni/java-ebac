package com.keith.Set;

import java.util.Set;
import java.util.TreeSet;

public class ExemploTreeSet {
    public static void main(String[] args) {
        exemploListaSimples();
    }

    /**
     * Não repete valores na lista
     * Tem ordem natural de objetos
     */
    private static void exemploListaSimples() {
        System.out.println("**** Exemplo Lista Simples ****");
        Set<String> lista = new TreeSet<>();
        lista.add("João da Silva");
        lista.add("Antônio de Sousa");
        lista.add("Lúcia Ferreira");
        lista.add("João da Silva");
        System.out.println(lista);
        System.out.println();
    }
}
