package com.keith.exercicios;

public class Pessoa {
    private String nome;
    private Integer sexo;

    public Pessoa(String nome, Integer sexo){
        this.nome = nome;
        this.sexo = sexo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getSexo() {
        return sexo;
    }

    public void setSexo(Integer sexo) {
        this.sexo = sexo;
    }

    @Override
    public String toString() {
        return  nome + " - " + sexo;
    }
}
