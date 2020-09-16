package com.company;

public class Rectangle extends Figure {
    private int length;
    private int width;

    public Rectangle(String name, int length, int width) {
        super.setName(name);
        this.length = length;
        this.width = width;
    }

    public int getLength() {
        return length;
    }

    public int getWidth() {
        return width;
    }

    public void calculatePerimeter(){
        System.out.println("Периметр прямоугольника = "+(length+width)*2);
    }

    @Override
    public String draw() {
        return " \uD83D\uDFE5  \uD83D\uDFE5 ";
    }
}
