package com.keith.domain;

import java.util.Comparator;

public class ComparaNotaAluno implements Comparator<Aluno> {
    @Override
    public int compare(Aluno aluno1, Aluno aluno2) {
        return Double.compare(aluno1.getNota(), aluno2.getNota());
    }
}
