import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Palindrome Algorithm"+"\n"+"enter a word to check if it is a palindrome");

        Scanner myObj = new Scanner(System.in);

        String s = myObj.nextLine();
        String rev = "";

        System.out.println(s);

        int i;

        for ( i = s.length()-1;i >= 0; i--) {
            rev = rev + s.charAt(i);
        }

        boolean palindrome = s.equals(rev);
        System.out.println(palindrome);
    }
}