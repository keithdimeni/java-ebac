package com.keith.Set;

import com.keith.domain.Aluno;

import java.util.HashSet;
import java.util.Set;

public class ExemploHashSetAluno {
    public static void main(String[] args) {
        Set<Aluno> alunos = new HashSet<>();
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
