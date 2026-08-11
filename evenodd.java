public class evenodd {
    public static void main(String[] args) {
        String s = "24";
        Integer n = Integer.valueOf(s);

        if (n % 2 == 0)
            System.out.println("Even");
        else
            System.out.println("Odd");
    }
}
