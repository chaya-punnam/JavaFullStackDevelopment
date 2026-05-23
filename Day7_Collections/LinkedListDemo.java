package Day7_Collections;

import java.util.LinkedList;

public class LinkedListDemo {

    public static void main(String[] args) {

        LinkedList<String> list =
                new LinkedList<String>();

        list.add("Java");
        list.add("Python");
        list.add("Spring");

        System.out.println(list);

        list.addFirst("HTML");

        list.addLast("React");

        System.out.println(list);

    }
}