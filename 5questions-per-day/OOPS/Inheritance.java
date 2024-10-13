package OOPS;

public class Inheritance {
    public static void main(String[] args) {
        Fish shark = new Fish();
        shark.eat();
        shark.swim();
    }
}

//There are mainly 4 types of Inheritance...
//1. Single level Inheritance
//2. Multilevel Inheritance
//3. Hierachial Inheritance
//4. Hybrid Inheritance



// Base class
class Animal {
    String color;

    void eat() {
        System.out.println("eating");
    }

    void breath() {
        System.out.println("breathing");
    }
}

// Derived class or Sub class
class Fish extends Animal {
    int fins;

    void swim() {
        System.out.println("swimming");
    }
}