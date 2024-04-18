package com.keith.agregacao;

import java.util.ArrayList;
import java.util.List;

public class Venda {

    private Comprador comprador;
    private Vendedor vendedor;
    private List<Produto> produtos;

    public Venda(){
        this.produtos = new ArrayList<>();
    }

    public Comprador getComprador() {
        return comprador;
    }

    public void setComprador(Comprador comprador) {
        this.comprador = comprador;
    }

    public Vendedor getVendedor() {
        return vendedor;
    }

    public void setVendedor(Vendedor vendedor) {
        this.vendedor = vendedor;
    }

    public List<Produto> getProdutos() {
        return produtos;
    }

    public void setProdutos(List<Produto> produto) {
        this.produtos = produto;
    }

    public void add(Produto produto) {
        this.produtos.add(produto);
    }

    public void remove(Produto produto) {
        this.produtos.remove(produto);
    }

    public void finalizarVenda() {
        System.out.println("Comprador: " + this.comprador.getNome());
        System.out.println();
        System.out.println("Comprou os Itens: ");
        this.produtos.forEach(produto -> {
            System.out.println("Nome do produto: " + produto.getNome() + "\nPreço: " + produto.getPreco());
        });
        System.out.println();
        System.out.println("Vendedor: " + this.vendedor.getNome());
    }

    public void cancelarVenda() {
        System.out.println("Venda cancelada");
    }
}
