package arrays;

import java.util.Scanner;

public class sumOfArray {
    public static void main(String[] args) {
        System.out.print("Enter the length of array : ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int[] arr = new int[a];
        System.out.println("Enter the values of array");
        for(int i=0;i<a;i++){
            arr[i]=sc.nextInt();
        }//array created
        sc.close();
        System.out.print("Sum of elements :");
        int sum = 0;
        for(int i=0;i<a;i++){
            sum=sum+arr[i];
        }
        System.out.print(sum);
    }
}
