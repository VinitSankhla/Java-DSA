package forloop;

import java.util.Scanner;

public class digitsofnumber {
    public static void main(String[] args) {
        //Count the number of digits
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to find the number of digits in it");
        int a = sc.nextInt();
        int count = 0;
        int sum = 0;
        if(a==0) a=1;//base case of a = 0 as 0 is a digit
        while(a!=0){
            count++;
            sum +=(a%10);
            a/=10;
        }
        System.out.println("The count of the digits is : "+count);
        System.out.print("The sum of digits is : ");
        System.out.println((sum>0) ? sum : -sum);
        sc.close();
    }
}
