package com.keith.Map;

import com.keith.domain.Aluno;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ExemploSalaAula {
    public static void main(String[] args) {
        Map<Integer, List<Aluno>> listaSala = new HashMap<>();
        List<Aluno> alunosSala1 = criarTurma("Sala 1", 10);
        listaSala.put(1, alunosSala1);

        List<Aluno> alunosSala2 = criarTurma("Sala 2", 30);
        listaSala.put(2, alunosSala2);

        imprimirAlunosSala(listaSala.get(1));
    }

    public static List<Aluno> criarTurma(String sala, int count) {
        List<Aluno> alunos = new ArrayList<>();
        for (int i = 0; i < count; i++){
            Aluno aluno = new Aluno("Nome Aluno " + i, "Curso " + i, (double)i, sala);
            alunos.add(aluno);
        }
        return alunos;
    }
    public static void imprimirAlunosSala(List<Aluno> alunos){
        System.out.println("**** IMPRIMIR ALUNOS SALA ****");
        System.out.println();

        System.out.println("for API Stream");
        alunos.forEach(aluno -> System.out.println("Nome: " + aluno.getNome() + " Sala: " + aluno.getSala()));
        System.out.println();

        System.out.println("for java(comum)");
        for (Aluno aluno : alunos) {
            System.out.println("Nome: " + aluno.getNome() + " Sala: " + aluno.getSala());
        }
        System.out.println();

        System.out.println("for java com contador (outro for comum)");
        for (int i = 0; i < alunos.size(); i++) {
            Aluno aluno = alunos.get(i);
            System.out.println("Nome: " + aluno.getNome() + " Sala: " + aluno.getSala());
        }


    }
}
