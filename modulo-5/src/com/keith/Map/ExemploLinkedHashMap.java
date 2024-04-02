package com.keith.Map;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * A ordem de iteração é a ordem que as chaves são inseridas no mapa
 */
public class ExemploLinkedHashMap {
    public static void main(String[] args) {
        exemploListaSimples();
    }

    public static void exemploListaSimples() {
        System.out.println("**** EXEMPLO LISTA SIMPLES ****");
        Map<Integer, String> lista = new LinkedHashMap<>();
        lista.put(1, "João da Silva");
        lista.put(2, "Antônio Sousa");
        lista.put(4, "João da Silva");
        lista.put(3, "Lúcia Ferreira");

        System.out.println(lista);
    }
}
