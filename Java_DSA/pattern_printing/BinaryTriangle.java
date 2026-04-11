package pattern_printing;

import java.util.Scanner;

public class BinaryTriangle {
    public static void main(String[] args) {
        int a=1;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows you want to print in Binary Triangle : ");
        int x = sc.nextInt();
        outerloop:
        for (int i=1;i<=x;i++){
                for (int j=1;j<=i;j++){
                    if (a<=x) {
                        System.out.print(a + " ");
                        a^=1;
                    }
                    else break outerloop;
            }
            System.out.println();
        }
        sc.close();
    }
}
