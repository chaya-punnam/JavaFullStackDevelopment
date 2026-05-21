package Day5_AdvancedJava;

interface AnimalInterface {

    void sound();

}

class CatInterface implements AnimalInterface {

    public void sound() {

        System.out.println("Cat meows");

    }

}

public class InterfaceDemo {

    public static void main(String[] args) {

        CatInterface c = new CatInterface();

        c.sound();

    }
}