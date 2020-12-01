package tests;

import beverages.Beverage;
import beverages.ColdBeverage;
import org.junit.jupiter.api.Test;

import beverages.Person;

import static org.junit.jupiter.api.Assertions.*;

class ColdBeverageTest {

    @Test
    public void shouldCreateABeverage() {

        Beverage beverage = new Beverage();
        assertEquals("drink a beverage", beverage.drink());

    }

    @Test
    public void shouldCreateAColdBeverage(){
        Beverage beverage = new ColdBeverage();
        assertEquals("drink a cold beverage!", beverage.drink());
    }
    @Test
    public void personShouldBeAbleToDrinkABeverage() {

        Beverage beverage = new ColdBeverage();
        Person person = new Person();
        assertEquals("drink a cold beverage!", person.drinkABeverage(beverage));

    }
    @Test
    public void shouldBeAbleToAddIceToColdBeverage(){
        Beverage beverages = new ColdBeverage();
        ColdBeverage beverage = (ColdBeverage)beverages;

        assertEquals("adding ice to your beverage!", beverage.withIce("Ice please!"));
    }
    @Test
    public void shouldReturnOptimumTemperatureForAColdBeverage(){
        Beverage beverages = new ColdBeverage();
        ColdBeverage beverage = (ColdBeverage)beverages;
        assertEquals(3, beverage.getTemperature());
    }
    @Test
    public void shouldDrinkWithAStraw(){
        Beverage beverages = new ColdBeverage();
        ColdBeverage beverage = (ColdBeverage)beverages;
        Person person = new Person();
        assertEquals("drinking with a straw!", beverage.useStraw());
    }

}

































