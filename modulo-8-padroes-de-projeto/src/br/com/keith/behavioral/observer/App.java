package br.com.keith.behavioral.observer;

/**
 * @autor mauricio.dimeni
 *
 * IObserver: permite que um objeto notifiqaue outros
 * objetos sobre alterações em seu estado.
 */
public class App {

    public static void main(String[] args) {
        Jornalista jornalista = new Jornalista();
        jornalista.add(new TV());
        jornalista.notifyAll("Teste");
    }
}
