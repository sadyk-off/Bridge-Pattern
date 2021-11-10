package abstraction.concrete;

import abstraction.Vehicle;
import implementor.Engine;

public class BigBus extends Vehicle {

    public BigBus(Engine engine) {
        super(engine);
        this.weightInKilos = 3000;

    }

    @Override
    public void drive() {
        System.out.println("\nThe big bus is driving");
        int horsepower = engine.go();
        reportOnSpeed(horsepower);
    }
}
