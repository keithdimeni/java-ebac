package com.keith.interfaces;

public interface ICaneta {

    public void escrever(String texto);

    public String getCor();

    /**
     * Usado quando um método tem um comportamento
     * igual em todas as classes que implementam a interface
     * */
    default void escreverIgualATodas(){
        System.out.println("Escrita igual a todas");
    }
}
