package com.company;

public class Triangle extends Figure {
    private int sideA;
    private int sidB;
    private int sideC;

    public Triangle(String name, int sideA, int sidB, int sideC) {
        super.setName(name);
        this.sideA = sideA;
        this.sidB = sidB;
        this.sideC = sideC;
    }

    public int getSideA() {
        return sideA;
    }

    public int getSidB() {
        return sidB;
    }

    public int getSideC() {
        return sideC;
    }

    public void calculatePerimeter() {
        System.out.println("Периметр треугольника = " + sideA + sidB + sideC);
    }

    @Override
    public String draw() {
        return "\uD83D\uDD3A ";
    }
}
