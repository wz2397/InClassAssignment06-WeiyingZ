package com.example.weiyingzhu.inclassassignment06;

import java.io.Serializable;

/**
 * Created by weiyingzhu on 18/2/27.
 */

public class Animal implements Serializable {
    private int leg;
    private String animal;
    private boolean fur;
    private String info;

    public int getLeg() {
        return leg;
    }

    public String getAnimal() {
        return animal;
    }

    public boolean isFur() {
        return fur;
    }

    public String getInfo() {
        return info;
    }

    public void setLeg(int leg) {
        this.leg = leg;
    }

    public void setAnimal(String animal) {
        this.animal = animal;
    }

    public void setFur(boolean fur) {
        this.fur = fur;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public Animal(int leg, String animal, boolean fur, String info) {
        this.leg = leg;
        this.animal = animal;
        this.fur = fur;
        this.info = info;
    }

    @Override
    public String toString() {
        return animal + '\n' + " has " + leg + " legs " + '\n' +
                animal + "has fur=" + fur + '\n' + info
                ;
    }
}
