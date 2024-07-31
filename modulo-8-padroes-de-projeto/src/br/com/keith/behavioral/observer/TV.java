package br.com.keith.behavioral.observer;

public class TV implements IObserver {
    /**
     * @param ISubject
     */
    @Override
    public void update(ISubject ISubject) {
        System.out.println("Recebendo a noticia via TV" + ISubject.toString());
    }
}
