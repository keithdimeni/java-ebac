package com.keith.exercicios;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class TarefaNomePessoas {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Escreva nome de pessoas separado por vírgula(,): ");
        String nomes = s.next();
        List<String> lista = new ArrayList<>();
        Collections.addAll(lista, nomes.split(","));
        Collections.sort(lista);
        System.out.println(lista);
    }
}
