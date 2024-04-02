package com.keith.Set;

import java.util.LinkedHashSet;
import java.util.Set;

public class ExemploLinkedHashSet {
    /**
     * Seus elementos são iterados na ordem que foram inseridos
     * @param args
     */
    public static void main(String[] args) {
        System.out.println("****** exemploListaSimples ******");
        Set<String> lista = new LinkedHashSet<String>();
        lista.add("João da Silva");
        lista.add("Antônio Sousa");
        lista.add("Lúcia Ferreira");
        System.out.println(lista);
        System.out.println();
    }
}
