package org.example;

public abstract class BbqWay {

    abstract void wich_way(){};
    abstract void cleaning_the_yard(){}
    abstract void buying_meat(){}
    abstract void alert_friends(){}
    abstract void cooking_dish(){}
    abstract void raise_a_toast(){}


    public BbqWay() {
        this.cleaning_the_yard();
        this.buying_meat();
        this.alert_friends();
        this.cooking_dish();
        this.raise_a_toast();
    }
}
