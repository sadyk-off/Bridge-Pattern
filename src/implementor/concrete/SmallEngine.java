package implementor.concrete;

import implementor.Engine;

public class SmallEngine implements Engine {

    private int horsepower;

    public SmallEngine() {
        horsepower = 100;
    }

    @Override
    public int go() {
        System.out.println("The small engine is running");
        return horsepower;
    }

    public int getHorsepower() {
        return horsepower;
    }

    public void setHorsepower(int horsepower) {
        this.horsepower = horsepower;
    }
}
