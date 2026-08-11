public class index {
    public static void main(String[] args) {
        String s = "Hello";
        int index = 1;

        s = s.substring(0, index) + "a" + s.substring(index + 1);

        System.out.println(s);
    }
}
