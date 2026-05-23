package Day7_Collections;

import java.util.HashMap;

public class HashMapDemo {

    public static void main(String[] args) {

        HashMap<Integer, String> map =
                new HashMap<Integer, String>();

        map.put(101, "Chaya");
        map.put(102, "Java");

        System.out.println(map);

        System.out.println(
                map.get(101));

    }
}