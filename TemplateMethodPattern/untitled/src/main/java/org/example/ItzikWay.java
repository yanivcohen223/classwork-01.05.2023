package org.example;

public class ItzikWay extends BbqWay{
    public ItzikWay() {
    }

    @Override
    public void cleaning_the_yard() {
        super.cleaning_the_yard();
        System.out.println();
        System.out.println("cleaning the whole yard and invites a cleaning company");
    }

    @Override
    public void buying_meat() {
        super.buying_meat();
        System.out.println("going to buy the food in the supermarket");
    }

    @Override
    public void alert_friends() {
        super.alert_friends();
        System.out.println("call each friend with his phone");
    }

    @Override
    public void cooking_dish() {
        super.cooking_dish();
        System.out.println("waking up at six am to start cooking");
    }

    @Override
    public void raise_a_toast() {
        super.raise_a_toast();
        System.out.println("raising a toast with pina colada");
    }
}
