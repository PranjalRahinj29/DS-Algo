package string;

import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class AnagramOfString {
    public static void anagranString(String inputString1,String inputString2){
       String s1 =  inputString1.replaceAll("\\s","");
      String s2 =inputString2.replaceAll("\\s","");
      boolean status = true;
      if(s1.length() != s2.length()){
          status = false;
      }else{
          char[] charArray1 = s1.toLowerCase().toCharArray();
          char[] charArray2 = s2.toLowerCase().toCharArray();
          Arrays.sort(charArray1);
          Arrays.sort(charArray2);
          status = Arrays.equals(charArray1,charArray2);
      }
        if (status) {
            System.out.println(s1 + " and " + s2 + " are anagrams");
        } else {
            System.out.println(s1 + " and " + s2 + " are not anagrams");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter A String :");
        String str = sc.nextLine();
        String str1 = sc.nextLine();
        anagranString(str,str1);
    }
}
