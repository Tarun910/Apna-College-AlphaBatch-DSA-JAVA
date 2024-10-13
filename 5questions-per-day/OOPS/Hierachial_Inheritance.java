package OOPS;

public class Hierachial_Inheritance {
    public static void main(String[] args) {

    }
}

class Animal {
    String color;

    void eat() {
        System.out.println("eating");
    }

    void breath() {
        System.out.println("breathing");
    }
}

class Mammal extends Animal {
    void walk() {
        System.out.println("walking");
    }
}

class Fish extends Animal {
    void swim() {
        System.out.println("swimming");
    }
}

class Bird extends Animal {
    void fly() {
        System.out.println("flying");
    }
}