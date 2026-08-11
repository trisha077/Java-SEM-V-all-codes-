import java.util.Scanner;

class StrRev {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter string: ");
        String s = sc.nextLine();

        // print reverse
        for (int i = s.length() - 1; i >= 0; i--)
            System.out.print(s.charAt(i));
    }
}
