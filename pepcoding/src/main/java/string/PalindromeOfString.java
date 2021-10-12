package string;

import java.util.Scanner;

public class PalindromeOfString {
    public static void palindromString(String inputString) {
        int i = 0;
        int j = inputString.length() - 1;
        while (i < j) {
            if (inputString.charAt(i) == inputString.charAt(j)) {
                i++;
                j--;
                System.out.println("String is palindrome");
                break;
            }else {
                System.out.println("String is not palindrome");
                break;
            }
        }

    }
    public static void main(String[] args) {
        System.out.println("Enter a string : ");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        palindromString(str);

    }
}
