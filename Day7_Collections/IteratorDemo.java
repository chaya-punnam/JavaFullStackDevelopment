package Day7_Collections;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorDemo {

    public static void main(String[] args) {

        ArrayList<String> list =
                new ArrayList<String>();

        list.add("Java");
        list.add("Spring");
        list.add("React");

        Iterator<String> itr =
                list.iterator();

        while(itr.hasNext()) {

            System.out.println(
                    itr.next());

        }

    }
}