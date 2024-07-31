package br.com.keith.behavioral.observer;

import java.util.ArrayList;
import java.util.List;

public class Jornalista implements ISubject {

    private List<IObserver> IObservers = new ArrayList<>();

    private String titulo;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    /**
     * @param IObserver
     */
    @Override
    public void add(IObserver IObserver) {
        IObservers.add(IObserver);
    }

    /**
     * @param IObserver
     */
    @Override
    public void remove(IObserver IObserver) {
        IObservers.remove(IObserver);
    }

    /**
     * @param titulo
     */
    @Override
    public void notifyAll(String  titulo) {
        this.titulo = titulo;
        IObservers.forEach((IObserver) -> {
            IObserver.update(this);
        });
    }

    @Override
    public String toString() {
        return "Jornalista{" +
                "titulo='" + titulo + '\'' +
                '}';
    }
}
