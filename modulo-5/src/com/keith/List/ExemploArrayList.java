package com.keith.List;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * É como um array cujo tamanho pode crescer.
 * A busca de um elemento é rápida, mas inserceções e exclusões não são.
 *
 * @author keith.dimeni
 */
public class ExemploArrayList {
    public static void main(String[] args) {

        exemploListaSimples();
        exemploListaSimplesOrdemAscendente();
        exemploNumeros();

    }

    private static void exemploListaSimples() {
        System.out.println("***** Exemplo Lista Simples *****");
        List<String> lista = new ArrayList<>();
        lista.add("João da Silva");
        lista.add("Antônio Sousa");
        lista.add("Lúcia Ferreira");
        System.out.println(lista);
        System.out.println();
    }

    private static void exemploListaSimplesOrdemAscendente() {
        System.out.println("***** Exemplo Lista Simples Ordem Ascendente *****");
        List<String> lista = new ArrayList<>();
        lista.add("João da Silva");
        lista.add("Antônio Sousa");
        lista.add("Lúcia Ferreira");
        Collections.sort(lista); // Collections é uma classe utulitária diferente da interface Collection
        System.out.println(lista);
        System.out.println();
    }

    private static void exemploNumeros() {
        System.out.println("***** Exemplo Números *****");
        List<Integer> numeros = new ArrayList<>();
        numeros.add(1);
        numeros.add(8);
        numeros.add(3);
        System.out.println(numeros);

        Collections.sort(numeros);
        System.out.println(numeros);
        System.out.println();
    }

}
