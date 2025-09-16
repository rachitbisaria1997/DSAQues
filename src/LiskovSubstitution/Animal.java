package LiskovSubstitution;

public class Animal {

    public void eat(){
        System.out.println("Animal is eating");
    }

}

class Dog extends Animal{

    @Override
    public void eat(){
        System.out.println("Dog is eating");
    }

    public void bark(){
        System.out.println("dog is barking");
    }

}

class TestLSP{

    public static void letAnimalsEat(Animal animal){
        animal.eat();
    }

    public static void main(String[] args) {

        Animal myAnimal = new Animal();
        Animal myDog = new Dog();

        letAnimalsEat(myAnimal);
        letAnimalsEat(myDog);

    }

}
