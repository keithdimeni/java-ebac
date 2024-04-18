package com.keith.interfaces;

public class Lapis implements ICaneta{
    @Override
    public void escrever(String texto) {
        System.out.println("Escrevend valor '" + texto + "' na classe " + getClass().getSimpleName());
    }

    @Override
    public String getCor() {
        return "Cinza";
    }
}
