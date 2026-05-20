package Day4_OOPs;

class Animal {

    void sound() {

        System.out.println("Animal makes sound");

    }

}

class Cat extends Animal {

    void sound() {

        System.out.println("Cat meows");

    }

}

class Dog extends Animal {

    void sound() {

        System.out.println("Dog barks");

    }

}

class PolymorphismDemo {

    public static void main(String[] args) {

        Animal a;

        a = new Cat();
        a.sound();

        a = new Dog();
        a.sound();

    }
}
