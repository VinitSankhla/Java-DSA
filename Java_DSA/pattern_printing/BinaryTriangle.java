package pattern_printing;

import java.util.Scanner;

public class BinaryTriangle {
    public static void main(String[] args) {
        // int a=1;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows you want to print in Binary Triangle : ");
        int x = sc.nextInt();
        if (x<=0) {
            System.out.println("Enter a positive value only !");
            sc.close();
            return;
        }
        for (int i=1;i<=x;i++){
                for (int j=1;j<=i;j++){
                        if ((i+j)%2==0) {
                            System.out.print(1 + " ");
                        }
                        else {System.out.print(0+" ");}
            }
            System.out.println();
        }
        sc.close();
    }
}

