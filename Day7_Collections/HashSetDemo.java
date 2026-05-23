package Day7_Collections;

import java.util.HashSet;

public class HashSetDemo {

    public static void main(String[] args) {

        HashSet<String> set =
                new HashSet<String>();

        set.add("Java");
        set.add("Python");
        set.add("Java");

        System.out.println(set);

    }
}