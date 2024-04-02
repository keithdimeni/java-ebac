package com.keith.Set;

import com.keith.domain.Aluno;

import java.util.Set;
import java.util.TreeSet;

public class ExemploTreeSetAluno {

    /**
     * Para não repetir objetos na lista é necessário que a classe
     * Aluno implemente a classe Comparable
     * @param args
     */
    public static void main(String[] args) {
        Set<Aluno> alunos = new TreeSet<>();
        Aluno a = new Aluno("João da Silva", "Linux", 8.8);
        Aluno b = new Aluno("Antônio da Silva", "AWS", 6.8);
        Aluno c = new Aluno("Lúcia Ferreira", "Java", 9.8);
        Aluno d = new Aluno("Antônio da Silva", "Angular", 2.8);

        alunos.add(a);
        alunos.add(b);
        alunos.add(c);
        alunos.add(d);
        System.out.println(alunos);

        System.out.println(alunos.contains(a));
        alunos.remove(a);
        System.out.println(alunos.contains(a));
    }
}
