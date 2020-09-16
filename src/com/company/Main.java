package com.company;

public class Main {

    public static void main(String[] args) {
        Square square = new Square("Square", 15, 15);
        Circle circle = new Circle("Circle", 20);

        Figure[] figures = new Figure[]{square, circle,
                new Triangle("Triangle", 5, 8, 10),
                new Rectangle("Rectangle", 20, 35),
                new Square("Square", 15, 15),
                new Circle("Circle", 25)};
        for (int i = 0; i < figures.length; i++) {
            System.out.println(figures[i].getName() + " " + figures[i].draw() + " ");
            figures[i].calculatePerimeter();

        }


        Pet pet = new Pet("Пес");
        System.out.println("--------------------------------");
        System.out.println(pet.draw() + " " + pet.getName());
        System.out.println(pet.callSound());
    }
}
