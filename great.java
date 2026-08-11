import java.util.Scanner;

class Great {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter three numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        // find greatest
        if (a >= b && a >= c)
            System.out.println("Greatest = " + a);
        else if (b >= a && b >= c)
            System.out.println("Greatest = " + b);
        else
            System.out.println("Greatest = " + c);
    }
}
