package implementor.concrete;

import implementor.Engine;

public class BigEngine implements Engine {

    private int horsepower;

    public BigEngine() {
        this.horsepower = 350;
    }

    @Override
    public int go() {
        System.out.println("The big engine is running");
        return horsepower;
    }

    public int getHorsepower() {
        return horsepower;
    }

    public void setHorsepower(int horsepower) {
        this.horsepower = horsepower;
    }
}
