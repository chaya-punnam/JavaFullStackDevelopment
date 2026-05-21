package Day5_AdvancedJava;

abstract class AnimalAbstract {

    abstract void sound();

}

class DogAbstract extends AnimalAbstract {

    void sound() {

        System.out.println("Dog barks");

    }

}

public class AbstractionDemo {

    public static void main(String[] args) {

        DogAbstract d = new DogAbstract();

        d.sound();

    }
}