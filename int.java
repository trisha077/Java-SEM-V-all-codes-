public class int {
    public static void main(String[] args) {
        Integer a = Integer.valueOf("25");
        Integer b = Integer.valueOf("40");
        Integer c = Integer.valueOf("15");

        int max = Math.max(a, Math.max(b, c));

        System.out.println("Largest = " + max);
    }
}
