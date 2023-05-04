package org.example;

public abstract class BbqWay {

    void wich_way(){
        System.out.println(this.getClass());
    };
    abstract void cleaning_the_yard();
    abstract void buying_meat();
    abstract void alert_friends();
    abstract void cooking_dish();
    abstract void raise_a_toast();


    public BbqWay() {
        this.wich_way();
        this.cleaning_the_yard();
        this.buying_meat();
        this.alert_friends();
        this.cooking_dish();
        this.raise_a_toast();
    }
}
