import abstraction.Vehicle;
import abstraction.concrete.BigBus;
import abstraction.concrete.SmallCar;
import implementor.concrete.BigEngine;
import implementor.concrete.SmallEngine;

public class Main {

    public static void main(String[] args) {
        Vehicle vehicle = new BigBus(new SmallEngine());
        vehicle.drive();
        vehicle.setEngine(new BigEngine());
        vehicle.drive();

        vehicle = new SmallCar(new SmallEngine());
        vehicle.drive();
        vehicle.setEngine(new BigEngine());
        vehicle.drive();
    }
}
