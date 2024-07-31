package br.com.keith.behavioral.templateMethod;

/**
 * @author mauricio.dimeni
 *
 * Template Method: permite definir o esqueleto de um algoritomo
 * em uma classe base e permite que as subclasses substituam todas
 * ou algumas etapas sem alterar a estrutura geral do algoritmo
 */
public class App {
    public static void main(String[] args) {
        Trabalhador bombeiro = new Bombeiro();
        Trabalhador policia = new Policia();

        bombeiro.executar();
        System.out.println("========================");
        policia.executar();
    }
}
