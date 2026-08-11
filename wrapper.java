public class Wrapper {
    public static void main(String[] args) {
        String s = "123";
        Integer n = Integer.valueOf(s);

        System.out.println("String: " + s);
        System.out.println("Wrapper Object: " + n);
        System.out.println("Primitive: " + n.intValue());
    }
}
