package com.keith.abstratas;

public class Comissionado extends Empregado {

    private Double totalVenda;
    private Double totalCommisao;

    public Double getTotalVenda() {
        return totalVenda;
    }

    public void setTotalVenda(Double totalVenda) {
        this.totalVenda = totalVenda;
    }

    public Double getTotalCommisao() {
        return totalCommisao;
    }

    public void setTotalCommisao(Double totalCommisao) {
        this.totalCommisao = totalCommisao;
    }

    @Override
    public Double vencimento() {
        return totalVenda * totalCommisao;
    }
}
