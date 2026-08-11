public class calculator {
    public static void main(String[] args) {
        String a = "20", b = "5", op = "*";

        Integer x = Integer.valueOf(a);
        Integer y = Integer.valueOf(b);

        switch (op) {
            case "+": System.out.println(x + y); break;
            case "-": System.out.println(x - y); break;
            case "*": System.out.println(x * y); break;
            case "/": System.out.println(x / y); break;
            default: System.out.println("Invalid operation");
        }
    }
}
