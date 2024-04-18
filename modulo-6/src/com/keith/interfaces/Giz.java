package com.keith.interfaces;

public class Giz implements ICaneta{
    @Override
    public void escrever(String texto) {
        System.out.println("Escrevendo valor '" + texto + "' na classe " + getClass().getSimpleName());
    }

    @Override
    public String getCor() {
        return "Branco";
    }
}
