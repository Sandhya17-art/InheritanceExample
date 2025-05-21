
class Animal {
    void eats() {
        System.out.println("Animal eats food");
    }
}

class Dog extends Animal {
    void barks() {
        System.out.println("Dogs bark");
    }
}

public class SingleInheritance {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.eats();
        d.barks();
    }
}
class Vechicle {
    void starts() {
        System.out.println("Gets Started");
    }
}