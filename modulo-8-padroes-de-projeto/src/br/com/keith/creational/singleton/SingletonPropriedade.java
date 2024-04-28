package br.com.keith.creational.singleton;

public class SingletonPropriedade {
    private static SingletonPropriedade singletonPropriedade;
    private String value;

    private SingletonPropriedade(String value){
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public static SingletonPropriedade getInstance(String value) {
        if (singletonPropriedade == null) {
            singletonPropriedade = new SingletonPropriedade(value);
        }
        return singletonPropriedade;
    }
}
