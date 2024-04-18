package com.keith.composicao;


import java.util.HashSet;
import java.util.Set;

public class Banco {

    private Long codigo;

    private String nome;

    private Set<Corrente> contasCorrentes;

    private Set<Poupanca> contasPoupanca;

    public Banco() {
        this.contasCorrentes = new HashSet<>();
        this.contasPoupanca = new HashSet<>();
    }

    public Long getCodigo() {
        return codigo;
    }

    public void setCodigo(Long codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void add(Corrente contaCorrente) {
        this.contasCorrentes.add(contaCorrente);
    }
    public void add(Poupanca contaPoupanca) {
        this.contasPoupanca.add(contaPoupanca);
    }
}
