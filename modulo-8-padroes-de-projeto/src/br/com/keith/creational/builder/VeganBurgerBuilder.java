package br.com.keith.creational.builder;

public class VeganBurgerBuilder extends BurgerBuilder {

    @Override
    public void buildBun() {
        burger.setBun("White Bread");
    }

    @Override
    void buildMeat() {
        burger.setMeat("Vegan Beef");
    }

    @Override
    void buildSalad() {
        burger.setSalad("Russian Salad");
    }

    @Override
    void buildCheese() {
    }

    @Override
    void buildSauce() {
        burger.setSauce("Secret Sauce");
    }

}
