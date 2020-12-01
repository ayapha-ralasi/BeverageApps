package temperatures;

import beverages.HotBeverage;

;

public class Microwave implements Heatable {
    private HotBeverage hotBeverage;


    public int temperature() {
        return this.hotBeverage.getTemperature();
    }
    public void heatUpTo(int heat) {
        this.hotBeverage.setTemperature(heat);
    }


    public int low(Heatable heatable ){
      int lowTemp = this.hotBeverage.setTemperature(this.hotBeverage.getTemperature() + 30);
      return lowTemp;
    }

    public int medium(Heatable heatable ){
        int mediumTemp = this.hotBeverage.setTemperature(this.hotBeverage.getTemperature() + 60);
        return mediumTemp;
    }
    public int high(Heatable heatable ){
      int highTemp = this.hotBeverage.setTemperature(this.hotBeverage.getTemperature() + 90);
        return highTemp;
    }




}
