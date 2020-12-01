package beverages;

import beverages.Beverage;

public class ColdBeverage extends Beverage {

    private int temperature;
    public ColdBeverage(){
        this.temperature= 3;
    }

    public String drink() {
     return "drink a cold beverage!";
    }

    public String useStraw() {
        return "drinking with a straw!";
    }

    public int setTemperature( int temperature ) {
        return this.temperature = temperature;
    }
    public String withIce(String ice){
        return  "adding ice to your beverage!";
    }

    public String withIce(){
        return "no ice";
    }


    public int getTemperature() {
        return this.temperature;
    }
}
