package arrays;

import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int data = sc.nextInt();
        int low = 0;
        int high = arr.length - 1;
        while(low <= high){
           int mid = (low + high) / 2 ;
           if(arr[mid] > data){
               high = mid - 1;
           }else if(arr[mid] < data){
              low = mid  + 1;
           }else {
               System.out.println(mid);
               return;
           }
        }
        System.out.println(-1);

    }

}
