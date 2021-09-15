package arrays;

import javax.sound.midi.SysexMessage;
import java.util.Scanner;

public class ReverseAnArray {
    public static void Reverse(int[] arr){
        int i =0;
        int j = arr.length - 1;
        while(i <j){
           int temp = arr[i];
           arr[i] = arr[j];
           arr[j] = temp;
           i++;
           j--;



        }
        System.out.println("Reversed Array : ");
        for(int k =0;k<arr.length;k++){
            System.out.println(arr[k]);
        }

    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0;i<arr.length;i++){
            arr[i] =sc.nextInt();
        }
        Reverse(arr);



    }
}
