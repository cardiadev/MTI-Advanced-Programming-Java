class Animal {
    String kind;

    Animal(String k) {
        kind = k;
    }

    void getKind() {
        System.out.println("I'am a " + kind);
    }

    void getSound() {
        System.out.println("undefined");
    }
}

class Dog extends Animal {
    Dog(String k) {
        super(k);
    }

    void getKind() {
        super.getKind();
    }

    void getSound() {
        System.out.println("woof woof");
    }
}

class Cat extends Animal {
    Cat(String k) {
        super(k);
    }

    void getKind() {
        super.getKind();
    }

    void getSound() {
        System.out.println("miauuuu");
    }
}

class Duck extends Animal {
    Duck(String k) {
        super(k);
    }

    void getKind() {
        super.getKind();
    }

    void getSound() {
        System.out.println("quack quack");
    }
}

public class Polymorphism {
    public static void main(String[] args) {
        Animal[] animals = { new Dog("dog"), new Cat("cat"), new Duck("duck") };
        
        for(int i = 0; i < animals.length; i++) {
            animals[i].getKind();
            animals[i].getSound();
        }
    }
}
