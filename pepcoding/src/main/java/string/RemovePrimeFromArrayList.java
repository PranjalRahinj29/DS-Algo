package string;

import java.util.ArrayList;
import java.util.Scanner;

public class RemovePrimeFromArrayList {
    public static boolean isPrime(int value){
        for(int div =2;div*div <=value;div++){
            if(value % div ==0){
                return false;
            }
        }
        return true;
    }
    public static void solution(ArrayList<Integer> al){
        for(int i =al.size()-1;i>=0;i--){
            int val = al.get(i);
            if(isPrime(val) == true){
                al.remove(i);
            }

        }
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter a numbers :");
        int n = scn.nextInt();
        ArrayList<Integer> al = new ArrayList<>();
        for(int i = 0 ; i < n; i++){
            al.add(scn.nextInt());
        }
        solution(al);
        System.out.println(al);
    }
}
