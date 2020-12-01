package beverages;

import beverages.Beverage;

public class HotBeverage extends Beverage {

    private int temperature;

    @Override
    public String drink() {
       return "drink a hot beverage";
    }

    public void drinkSlowly() {
        System.out.println("drink slowly, it's hot!");
    }
    public void withSugar(int sugar){
        System.out.println("adding " + sugar + " teaspoons of sugar");
    }
    public void withMilk(int milkVolume){
        System.out.println("adding " + milkVolume + " mls of milk");
    }

    public int setTemperature(int temperature ) {
        this.temperature = temperature;
        return temperature;
    }

    public int getTemperature() {
        return this.temperature;
    }

}
