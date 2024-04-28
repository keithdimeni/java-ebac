package br.com.keith.creational.builder;

public class Manager {

    BurgerBuilder builder;
    public Manager(BurgerBuilder builder) {
        this.builder = builder;
    }

    public Burger buildBurger() {
        builder.buildBun();
        builder.buildMeat();
        builder.buildSalad();
        builder.buildCheese();
        builder.buildSauce();

        return builder.build();
    }

}
