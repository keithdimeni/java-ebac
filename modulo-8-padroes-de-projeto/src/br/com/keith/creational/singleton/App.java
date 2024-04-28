package br.com.keith.creational.singleton;

public class App {
    public static void main(String[] args) {
        Singleton singleton = Singleton.getInstance();
        Singleton a = Singleton.getInstance();

        System.out.println(singleton);
        System.out.println(a);

        SingletonPropriedade singletonPropriedade = SingletonPropriedade.getInstance("teste1");
        SingletonPropriedade singletonPropriedade2 = SingletonPropriedade.getInstance("teste2");

        System.out.println(singletonPropriedade.getValue());
        System.out.println(singletonPropriedade2.getValue());


    }
}
