package br.com.keith.behavioral.templateMethod;

public class Policia extends Trabalhador{

    @Override
    protected void trabalhar() {
        System.out.println("Trabalho: Prendendo os bandidos");
    }
}
