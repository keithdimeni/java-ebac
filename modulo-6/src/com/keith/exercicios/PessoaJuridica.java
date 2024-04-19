package com.keith.exercicios;

import java.util.HashSet;
import java.util.Set;

public class PessoaJuridica extends Pessoa {

    private Set<PessoaFisica> listaPessoaFisica;

    public PessoaJuridica() {
        this.listaPessoaFisica = new HashSet<PessoaFisica>();
    }

    public void add(PessoaFisica pessoaFisica) {
        this.listaPessoaFisica.add(pessoaFisica);
    }

    public void remove(PessoaFisica pessoaFisica) {
        this.listaPessoaFisica.remove(pessoaFisica);
    }

    public void removeAll(Set<PessoaFisica> listaPessoasFisicas) {
        this.listaPessoaFisica.removeAll(listaPessoasFisicas);
    }

    public Set<PessoaFisica> list() {
        return this.listaPessoaFisica;
    }

}
