package Day3_Arrays_Strings;

class StringCompare {

    public static void main(String[] args) {

        String a = "Java";
        String b = "Java";

        String c = new String("Java");

        System.out.println("Using == operator:");

        System.out.println(a == b);

        System.out.println(a == c);

        System.out.println("Using equals() method:");

        System.out.println(a.equals(c));

    }
}
