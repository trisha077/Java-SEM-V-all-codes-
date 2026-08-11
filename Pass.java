import java.util.Scanner;

class Pass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String password = "java123";

        System.out.print("Enter password: ");
        String p = sc.nextLine();

        // compare passwords
        if (p.equals(password))
            System.out.println("Correct Password");
        else
            System.out.println("Wrong Password");
    }
}
