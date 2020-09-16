package com.company;

public class Circle extends Figure {
    private int radius;
    private final double PI = 3.14;

    public Circle(String name, int radius) {
        super.setName(name);
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

    public void calculatePerimeter() {
        System.out.println("Периметр круга = " + 2 * PI * radius);
    }

    @Override
    public String draw() {
        return " ⭕ ";
    }
}
