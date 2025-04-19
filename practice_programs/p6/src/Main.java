class Animal {
    void move() {
        System.out.println("Animal is moving");
    }
}

class Cheetah extends Animal {
    void move() {
        System.out.println("Cheetah is running");
    }
}

public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.move();

        Animal cheetah = new Cheetah();
        cheetah.move();
    }
}