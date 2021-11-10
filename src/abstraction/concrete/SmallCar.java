package abstraction.concrete;

import abstraction.Vehicle;
import implementor.Engine;

public class SmallCar extends Vehicle {

    public SmallCar(Engine engine) {
        super(engine);
        this.weightInKilos = 600;
    }

    @Override
    public void drive() {
        System.out.println("\nThe small car is driving");
        int horsepower = engine.go();
        reportOnSpeed(horsepower);
    }
}
