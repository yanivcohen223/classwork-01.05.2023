package org.example;

public class DannyWay extends BbqWay{
    public DannyWay() {}

    @Override
    public void cleaning_the_yard() {
        System.out.println("dosent clean the yard");
    }

    @Override
    public void buying_meat() {
        System.out.println("buying food through the phone");
    }

    @Override
    public void alert_friends() {
        System.out.println("sending messages in the friend group");
    }

    @Override
    public void cooking_dish() {
        System.out.println("invites his big brother to cook");
    }

    @Override
    public void raise_a_toast() {
        System.out.println("raising a toast with grape juice");
    }
}
