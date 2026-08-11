import java.util.Scanner;

class ScanAdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // take numbers
        System.out.print("Enter two numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println("Sum = " + (a + b));
    }
}
