package Day5_AdvancedJava;

final class FinalClass {

    final int x = 100;

    void display() {

        System.out.println("Final Variable = " + x);

    }

}

public class FinalKeywordDemo {

    public static void main(String[] args) {

        FinalClass f = new FinalClass();

        f.display();

    }
}