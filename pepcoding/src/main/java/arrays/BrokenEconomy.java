package arrays;

import java.util.Scanner;

public class BrokenEconomy {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i =0;i<arr.length;i++){
              arr[i] = sc.nextInt();
        }
        int data = sc.nextInt();
        int low = 0;
        int high = arr.length - 1;
        int ceil = -1;  //just high value than data
        int floor = -1;  //just low value than data

        while(low <= high){
            int mid = (low + high) /2;
            if(arr[mid] == data){
                ceil = arr[mid];
                floor = arr[mid];
                break;

            }else if(arr[mid] < data){
                low = mid + 1;
                floor = arr[mid];

            }else{
                high = mid -1;
                ceil = arr[mid];
            }
        }
        System.out.println(ceil);
        System.out.println(floor);

    }

}
