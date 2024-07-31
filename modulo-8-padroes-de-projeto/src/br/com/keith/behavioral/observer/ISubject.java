package br.com.keith.behavioral.observer;

public interface ISubject {

    public void add(IObserver IObserver);
    public void remove(IObserver IObserver);
    public void notifyAll(String titulo);

}
