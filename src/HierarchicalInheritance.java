
class Car extends Vechicle {
    void Honks() {
        System.out.println("Car Honks");
    }
}

class Airplane extends Vechicle {
    void flys() {
        System.out.println("Flys in Sky");
    }
}

public class HierarchicalInheritance {
    public static void main(String[] args) {
        Car d = new Car();
        System.out.println("Dog:");
        d.starts();  
        d.Honks();  

        Airplane c = new Airplane();
        System.out.println("\nCat:");
        c.starts();   
        c.flys();  
    }
}