import java.util.Scanner;

class Range {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter range: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = 0;

        // add numbers in range
        for (int i = a; i <= b; i++) {
            if (i >= a && i <= b)
                sum += i;
        }

        System.out.println("Sum = " + sum);
    }
}
