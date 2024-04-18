package com.keith.agregacao;

public class Programa {
    public static void main(String[] args) {
        Produto produto1 = criarProduto(57445L, "Óleo de Soja", 6.19);
        Produto produto2 = criarProduto(98745L, "Pão de forma", 7.0);

        Vendedor vendedor = criarVendedor("Marcos", 0.18);

        Comprador comprador = criarComprador("Marisa", 658d);

        Venda venda = new Venda();
        venda.setVendedor(vendedor);
        venda.setComprador(comprador);
        venda.add(produto1);
        venda.add(produto2);

        venda.finalizarVenda();
    }

    public static Produto criarProduto(Long codigo, String nome, Double preco) {
        Produto produto = new Produto();
        produto.setCodigo(codigo);
        produto.setNome(nome);
        produto.setPreco(preco);

        return produto;
    }

    public static Vendedor criarVendedor(String nome, Double comissao) {
        Vendedor vendedor = new Vendedor();
        vendedor.setNome(nome);
        vendedor.setComissao(comissao);

        return vendedor;
    }

    public static Comprador criarComprador(String nome, Double verba) {
        return new Comprador(nome, verba);
    }

}
