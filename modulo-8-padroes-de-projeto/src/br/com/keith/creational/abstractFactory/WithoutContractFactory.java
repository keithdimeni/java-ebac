package br.com.keith.creational.abstractFactory;

public class WithoutContractFactory extends Factory{
    @Override
    Car retrieveCar(String requestedGrade) {
        if ("A".equals(requestedGrade)) {
            return new BMW(200, "Medium", "Black");
        } else {
            return null;
        }
    }
}
