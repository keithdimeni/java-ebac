package com.keith.exercicios;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class TaferaLerNomeESexo {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Digite o nome: ");
        String nome1 = s.next();
        System.out.println("Digite o sexo: ");
        Integer sexo1 = s.nextInt();

        System.out.println("Digite o nome: ");
        String nome2 = s.next();
        System.out.println("Digite o sexo: ");
        Integer sexo2 = s.nextInt();

        System.out.println("Digite o nome: ");
        String nome3 = s.next();
        System.out.println("Digite o sexo: ");
        Integer sexo3 = s.nextInt();

        List<Pessoa> pessoa = new ArrayList<>();
        pessoa.add(new Pessoa(nome1, sexo1));
        pessoa.add(new Pessoa(nome2, sexo2));
        pessoa.add(new Pessoa(nome3, sexo3));

        ComparaSexoPessoa comparaSexoPessoa = new ComparaSexoPessoa();
        Collections.sort(pessoa, comparaSexoPessoa);
        System.out.println(pessoa);
    }
}
