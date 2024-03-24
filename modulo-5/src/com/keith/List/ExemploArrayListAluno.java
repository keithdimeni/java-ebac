package com.keith.List;

import com.keith.domain.Aluno;
import com.keith.domain.ComparaNotaAluno;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ExemploArrayListAluno {
    public static void main(String[] args) {
        exemploListaSimplesOrdenadaClasseExterna();
        exemploListaSimplesOrdenadaComparadorAluno();
    }

    private static void exemploListaSimplesOrdenadaClasseExterna () {
        System.out.println("**** Exemplo Lista Simples Ordenada Classe Externa ****");
        List<Aluno> listaAluno = new ArrayList<Aluno>();

        Aluno a = new Aluno("João da Silva", "Linux Básico", 0d);
        Aluno b = new Aluno("Antônio Sousa", "OpenOffice", 0d);
        Aluno c = new Aluno("Lúcia Ferreira", "Internet", 0d);

        listaAluno.add(a);
        listaAluno.add(b);
        listaAluno.add(c);

        System.out.println(listaAluno);
        Collections.sort(listaAluno);
        System.out.println(listaAluno);
        System.out.println();

    }

    private static void exemploListaSimplesOrdenadaComparadorAluno () {
        System.out.println("**** Exemplo Lista Simples Ordenada Comparador Aluno ****");
        List<Aluno> listaAluno = new ArrayList<Aluno>();

        Aluno a = new Aluno("João da Silva", "Linux Básico", 10d);
        Aluno b = new Aluno("Antônio Sousa", "OpenOffice", 16d);
        Aluno c = new Aluno("Lúcia Ferreira", "Internet", 9d);

        listaAluno.add(a);
        listaAluno.add(b);
        listaAluno.add(c);

        System.out.println();
        System.out.println("Lista sem Ordenação " + listaAluno);
        Collections.sort(listaAluno);
        System.out.println("Lista Com Ordenação " + listaAluno);


        ComparaNotaAluno comparaNotaAluno = new ComparaNotaAluno();
        Collections.sort(listaAluno, comparaNotaAluno);
        System.out.println("Lista com ordenação por nota " + listaAluno);
        System.out.println();

    }
}
