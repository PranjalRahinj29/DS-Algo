package string;

import java.util.Scanner;

public class ToggleCaseOfString {
    public static String toggleCase(String str) {
        StringBuilder sb = new StringBuilder(str);
        for (int i = 0; i < sb.length(); i++) {
            char ch = sb.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                char upperCase = (char) ('A' + ch - 'a');
                sb.setCharAt(i, upperCase);
            } else {
                char lowerCase = (char) ('a' + ch - 'A');
                sb.setCharAt(i, lowerCase);
            }
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter a String :");
        String str = scn.next();
        System.out.println(toggleCase(str));
    }
}
