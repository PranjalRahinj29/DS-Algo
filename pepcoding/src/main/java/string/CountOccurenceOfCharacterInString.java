package string;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CountOccurenceOfCharacterInString {
    static Map<Character, Integer> countCharacter(String inputString) {
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();

        // char[] charArray=inputString.toCharArray();

        for (int i = 0; i < inputString.length(); i++) {
            char c = inputString.charAt(i);
            if (map.containsKey(c)) {
                map.put(c, map.get(c) + 1);
            } else {
                map.put(c, 1);
            }
        }
        return map;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter A Input String : ");
        String str = sc.nextLine();
        Map<Character, Integer> characterIntegerMap = countCharacter(str);
        System.out.println("Output is :" + characterIntegerMap);
    }
}
