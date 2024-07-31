package br.com.keith.behavioral.templateMethod;

public class Bombeiro extends Trabalhador {

    @Override
    protected void trabalhar() {
        System.out.println("Trabalho: Apagando incendio!");
    }
}
