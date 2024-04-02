package com.keith.Set;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/**
 * HashSet não tem ordem
 * Não repete valores na lista
 * Mais rápido que TreeSet
 */
public class ExemploHashSet {
    public static void main(String[] args) {
        exemploListaSimples();
        exemploListaSimplesOrdemAscendente();
    }

    /**
     * Não repete valores na lista
     */
    private static void exemploListaSimples() {
        System.out.println("**** Exemplo Lista Simples ****");
        Set<String> lista = new HashSet<>();
        lista.add("João da Silva");
        lista.add("Antônio de Sousa");
        lista.add("Lúcia Ferreira");
        lista.add("João da Silva");
        System.out.println(lista);
        System.out.println();
    }

    private static void exemploListaSimplesOrdemAscendente() {
        System.out.println("**** Exemplo Lista Simples Ordem Ascendente ****");
        Set<String> lista = new HashSet<>();
        lista.add("João da Silva");
        lista.add("Antônio de Sousa");
        lista.add("Lúcia Ferreira");
//        Collections.sort(lista);
        System.out.println(lista);
    }
}
