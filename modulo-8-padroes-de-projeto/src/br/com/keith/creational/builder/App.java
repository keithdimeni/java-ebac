package br.com.keith.creational.builder;

public class App {

    /**
     * Builder: fornece uma interface generica para construção incrimental de agregações.
     * Esse padrão esconde detalhes de como os componentes são criados, representdados e compostos.
     * */
    public static void main(String[] args) {
        System.out.println("Application");

        Manager manager  = new Manager(new CheeseBurgerBuilder());
        (manager.buildBurger()).print();
        System.out.println();
        Manager manager1 = new Manager(new VeganBurgerBuilder());
        (manager1.buildBurger()).print();

    }
}
