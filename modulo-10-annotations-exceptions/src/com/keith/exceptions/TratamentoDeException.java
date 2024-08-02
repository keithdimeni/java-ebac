package com.keith.exceptions;

public class TratamentoDeException {
    public static void main(String[] args) {
        String frase = null;
        String novaFrase = null;

        try {
            novaFrase = frase.toUpperCase();
        } catch(NullPointerException e) {
            System.out.println("A frase inicial esta nula");
            frase = "Frase Vazia";
            novaFrase = frase.toUpperCase();

        }
        System.out.println();
        System.out.println("Frase Antiga " + frase);
        System.out.println("Frase Nova " + novaFrase);
    }
}
