package com.keith.array;

import java.util.Scanner;

public class ExemploBubbleSortDinamico {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Digite os números separados por , ");

        String resposta = s.next();
        String[] vetorString = resposta.split(",");
        int[] vetor = convert(vetorString);
        int auxiliar = 0;
        int i = 0;

        System.out.println("Vetor DESORDENADO: ");
        for (i = 0; i < vetor.length; i++){
            System.out.println(" " + vetor[i]);
        }
        System.out.println();

        for (i = 0; i < vetor.length; i++) {
            for (int j = 0; j < vetor.length - 1; j++) {
                if (vetor[j] > vetor[j + 1]){
                    auxiliar = vetor[j];
                    vetor[j] = vetor[j + 1];
                    vetor[j + 1] = auxiliar;
                }
            }
        }
        System.out.println("Vetor ORDENADO|ORGANIZADO");
        for (i = 0; i < vetor.length; i++) {
            System.out.println(" " + vetor[i]);
        }
    }

    public static int[] convert(String[] vetorString){
        int[] numeros = new int[vetorString.length];
        for(int i = 0; i < vetorString.length; i++){
            numeros[i] = Integer.parseInt(vetorString[i]);
        }
        return numeros;
    }
}
