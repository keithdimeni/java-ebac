package com.keith.interfaces;

public class Main {
    public static void main(String[] args) {

        /**
         * ICaneta
         * */
        ICaneta caneta = new CanetaEsferografica();
        caneta.escrever("Olá Maurício");
        System.out.println(caneta.getCor());
        caneta.escreverIgualATodas();

        ICaneta giz = new Giz();
        giz.escrever("Giz Branco");
        System.out.println(giz.getCor());
        giz.escreverIgualATodas();

        ICaneta lapis = new Lapis();
        lapis.escrever("LAPIS");
        System.out.println(lapis.getCor());

        System.out.println();

        /**
         * ICarro
         * */
        ICarro caminhao = new Caminhao();
        caminhao.andar();
        caminhao.parar();

        ICarro carroPasseio = new CarroPasseio();
        carroPasseio.andar();
        carroPasseio.parar();
    }
}
