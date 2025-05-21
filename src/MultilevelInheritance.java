class CatName {
    public void makessound() {
        System.out.println("Cat makes sound like meow.");
    }
}

class Cupcake extends CatName {
    public void weeps() {
        System.out.println("Cupcake is a cry baby.");
    }
}

class Latte extends Cupcake {
    public void eats() {
        System.out.println("Latte loves to eat fish.");
    }
}

public class MultilevelInheritance {
    public static void main(String[] args) {
        Latte p = new Latte();
        p.makessound(); // Inherited from CatName
        p.weeps();      // Inherited from Cupcake
        p.eats();       
    }
}