package OOPS;

/**
 * Multilevel_Inheritance
 */
public class Multilevel_Inheritance {

    public static void main(String[] args) {
        Dog dobby = new Dog();
        dobby.eat();
        dobby.legs = 4;
        dobby.breed = "Golden-Retriver";
        System.out.println(dobby.legs);
        System.out.println(dobby.breed);
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
    int legs;
}

class Dog extends Mammal {
    String breed;
}