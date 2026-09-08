package arrays;

import java.util.Scanner;

public class arrayInputOutput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {5,3,5,-9,8,7,54};
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        int[] arr1 = new int[7];
        for(int i=0;i<arr1.length;i++){
            System.out.print(arr1[i]+" "); //by defalut values are 0
        }
        System.out.println();
        //input
        for(int i=0;i<arr.length;i++){
            arr1 [i] = sc.nextInt();
        }
        for(int i=0;i<arr1.length;i++){
            System.out.print(arr1[i]+" ");
        }
        sc.close();
    }
}
