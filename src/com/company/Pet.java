package com.company;


public class Pet extends Animal {
    public Pet(String name) {
        super(name);
    }

    @Override
    public String draw() {
        return "pet " + " \uD83D\uDC15 ";
    }

    public String callSound() {
        return "дать голос";
    }
}
