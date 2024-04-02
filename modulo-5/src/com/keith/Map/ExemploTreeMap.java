package com.keith.Map;

import java.util.Map;
import java.util.TreeMap;

public class ExemploTreeMap {
    public static void main(String[] args) {
        exemploListaSimples();
        exemploListaSimplesPegandoPelaChave();
    }

    /**
     * Chave nunca se repete
     * Garante que as chaves estarão em ordem ascendente
     * pode ser retirado do mapa por chave
     */
    public static void exemploListaSimples() {
        System.out.println("**** EXEMPLO LISTA SIMPLES ****");
        Map<Integer, String> lista = new TreeMap<>();
        lista.put(1, "João da SIlva");
        lista.put(2, "Antônio Sousa");
        lista.put(4, "João da SIlva");
        lista.put(3, "Lúcia Ferreira");

        System.out.println(lista);
        System.out.println();
    }

    public static void exemploListaSimplesPegandoPelaChave() {
        System.out.println("**** EXEMPLO LISTA SIMPLES PEGANDO PELA CHAVE ****");
        Map<Integer, String> lista = new TreeMap<>();
        lista.put(1, "João da SIlva");
        lista.put(2, "Antônio Sousa");
        lista.put(4, "João da SIlva");
        lista.put(3, "Lúcia Ferreira");

        String nome = lista.get(2);

        System.out.println(nome);
        System.out.println();
    }

}
