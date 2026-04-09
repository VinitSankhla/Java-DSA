package pattern_printing;

import java.util.Scanner;

public class flippedtriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a value");
        int x = sc.nextInt();
        for (int i=1;i<=x;i++){
            for (int j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        sc.close();
    }
}
