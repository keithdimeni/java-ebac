package com.keith.domain;

public class Aluno implements Comparable<Aluno> {
    private String nome;
    private String curso;
    private Double nota;
    private String sala;

    public Aluno(String nome, String curso, Double nota) {
        this.nome = nome;
        this.curso = curso;
        this.nota =  nota;
    }

    public Aluno (String nome, String curso, Double nota, String sala) {
        this(nome, curso, nota);
        this.sala = sala;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public Double getNota() {
        return nota;
    }

    public void setNota(Double nota) {
        this.nota = nota;
    }

    public String getSala() {
        return sala;
    }

    public void setSala(String sala) {
        this.sala = sala;
    }

    /**
     * Método usado para converter o objeto em String
     * @return
     */
//    public String toString() {
//        return "Nome: " + this.nome
//                + "\nCurso: " + this.curso
//                + "\nNota: " + this.nota
//                + "\nSala: " + this.sala;
//    }

    public String toString() {
        return this.nome;
    }


    /**
     *
     * Usado para comparação entre objetos e verificar se o mesmo é igual
     * @param aluno
     * @return
     */
//    @Override
//    public int compareTo(Aluno aluno) {
//        return 0;
//    }

    @Override
    public int compareTo(Aluno aluno) {
        return this.nome.compareTo(aluno.getNome());
    }
}
