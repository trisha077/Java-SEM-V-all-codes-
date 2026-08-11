import java.util.Scanner;

class Palin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter string: ");
        String s = sc.nextLine();
        String r = "";

        // reverse string
        for (int i = s.length() - 1; i >= 0; i--)
            r += s.charAt(i);

        if (s.equals(r))
            System.out.println("Palindrome");
        else
            System.out.println("Not Palindrome");
    }
}
