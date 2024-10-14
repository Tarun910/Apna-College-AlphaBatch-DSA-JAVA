package OOPS;

public class Method_Overriding {
    public static void main(String[] args) {
        Deer d = new Deer();
        d.eat(); 
    }
}

class Animal {
    void eat() {
        System.out.println("eats anything!");
    }
}

class Deer extends Animal {
    void eat() {
        System.out.println("eats grass!");
    }
}