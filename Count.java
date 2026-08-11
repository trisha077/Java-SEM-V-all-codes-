import java.util.Scanner;

class Count {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter string: ");
        String s = sc.nextLine();

        // length gives character count
        System.out.println("Characters = " + s.length());
    }
}
