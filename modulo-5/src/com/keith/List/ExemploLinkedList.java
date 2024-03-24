package com.keith.List;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class ExemploLinkedList {
    public static void main(String[] args) {
        exemploListaSimples();
        exemploListaSimplesOrdemAscendente();
    }

    private static void exemploListaSimples() {
        System.out.println("**** Exemplo Lista Simples ****");
        List<String> lista = new LinkedList<>();
        lista.add("João da Silva");
        lista.add("Antônio Sousa");
        lista.add("Lúcia Ferreira");
        System.out.println(lista);
        System.out.println();

        lista.remove(0);
        System.out.println(lista);
        Boolean contem = lista.contains("Antônio Sousa");
        System.out.println(contem);

        for (String nomeLista : lista) {
            System.out.println(nomeLista);
        }
        System.out.println(":: " + lista.get(1));

        System.out.println();
    }

    private static void exemploListaSimplesOrdemAscendente() {
        System.out.println("**** Exemplo Lista Simples Ordem Ascendente ****");
        List<String> lista = new LinkedList<>();
        lista.add("João da Silva");
        lista.add("Antônio Sousa");
        lista.add("Lúcia Ferreira");
        Collections.sort(lista);
        System.out.println(lista);
        System.out.println();
    }
}
