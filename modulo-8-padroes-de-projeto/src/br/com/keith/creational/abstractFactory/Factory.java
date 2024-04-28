package br.com.keith.creational.abstractFactory;

public abstract class Factory {

    public Car create(String requestdGrade) {
        Car car = retrieveCar(requestdGrade);
        car = prepareCar(car);
        return car;
    }

    private Car prepareCar(Car car) {
        car.clean();
        car.mechanicCheck();
        car.fuelCar();
        return car;
    }
    abstract Car retrieveCar(String requestedGrade);

}
