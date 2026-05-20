package Day4_OOPs;

class Animal {

    void sound() {

        System.out.println("Animal makes sound");

    }

}

class Dog extends Animal {

    void bark() {

        System.out.println("Dog barks");

    }

}

class InheritanceDemo {

    public static void main(String[] args) {

        Dog d = new Dog();

        d.sound();

        d.bark();

    }
}
