package string;

import java.util.Scanner;

public class ReverseString {
    public static void reverse(String inputString){
               char [] charArray = inputString.toCharArray();
               int left = 0;
               int right = charArray.length - 1;
               for(left = 0;left <right;left++,right--){
                   char temp = charArray[left];
                   charArray[left] =charArray[right];
                   charArray[right] = temp;
               }
               for(char c : charArray){
                 System.out.println(c);
                 System.out.println();
               }


            }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter A String :");
        String str = sc.nextLine();
        reverse(str);
    }
}
