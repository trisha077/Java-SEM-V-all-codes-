import java.util.Scanner;

class reverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number: ");
        int n = sc.nextInt();
        int reverse = 0, sum = 0;

        // reverse and add digits
        while (n > 0) {
            int d = n % 10;
            reverse = reverse * 10 + d;
            sum = sum + d;
            n = n / 10;
        }

        System.out.println("reverse = " + rev);
        System.out.println("Sum = " + sum);
    }
}
