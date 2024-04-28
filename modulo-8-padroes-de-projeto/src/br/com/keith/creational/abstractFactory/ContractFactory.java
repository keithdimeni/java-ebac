package br.com.keith.creational.abstractFactory;

public class ContractFactory  extends Factory{
    @Override
    Car retrieveCar(String requestedGrade) {
        if ("A".equals(requestedGrade)) {
            return new Toyota(100, "Full", "Blue");
        } else {
            return null;
        }
    }
}
