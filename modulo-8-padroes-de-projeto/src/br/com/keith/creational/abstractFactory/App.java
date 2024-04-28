package br.com.keith.creational.abstractFactory;

public class App {

    public static void main(String[] args) {
        Customer customer = new Customer("A", false);
        Factory factory = getFactory(customer);
        (factory.create(customer.getGradeRequest())).startEngine();
    }

    private static Factory getFactory(Customer customer) {
        if ( customer.hasCompanyContract()) {
            return new ContractFactory();
        } else {
            return new WithoutContractFactory();
        }
    }

}
