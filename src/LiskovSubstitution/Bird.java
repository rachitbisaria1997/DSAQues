package LiskovSubstitution;

public class Bird {

    public void fly(){
        System.out.println("Bird is flying");
    }

}

class Ostrich extends Bird{

    @Override
    public void fly(){
        throw new UnsupportedOperationException("Ostrich cannot fly");
    }

}

class TestLSPViolation {

    public static void makeBirdFly(Bird bird){
        bird.fly();
    }

    public static void main(String[] args) {

        Bird bird = new Bird();
        Bird ostrich = new Ostrich();

        makeBirdFly(bird);
        makeBirdFly(ostrich);   // ❌ Throws exception → LSP is violated

    }

}

//    The Liskov Substitution Principle (LSP) states that objects of a subclass should be able to replace objects of the parent class without affecting the program’s correctness.
 //       In other words, a subclass must behave in a way that doesn’t break the expectations set by its base class.