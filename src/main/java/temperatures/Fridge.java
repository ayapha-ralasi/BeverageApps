package temperatures;

import beverages.ColdBeverage;
import temperatures.Coolable;

public class Fridge implements Coolable {


    public ColdBeverage coldBeverage;

    public void coolDownWith( int coolDown ) {
        int coolTemp = this.coldBeverage.getTemperature() - coolDown;
        this.coldBeverage.setTemperature(coolTemp);
    }

    public int temperature() {
        return this.coldBeverage.getTemperature();
    }

    public void coolForMinutes(Coolable coolable){

        this.coldBeverage.setTemperature(this.coldBeverage.getTemperature() - 3);
    }

    public void coolForHours(Coolable coolable){

        this.coldBeverage.setTemperature(this.coldBeverage.getTemperature() - 10);
    }

    public void coolForDays(Coolable coolable){

        this.coldBeverage.setTemperature(this.coldBeverage.getTemperature() - 20);
    }
}


