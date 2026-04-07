package pattern_printing;

import java.util.Scanner;

public class alphabetSquare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Give the Length of the alphabets :");
        int x = sc.nextInt();
        for(int i=0;i<x;i++){
            for(int j=0;j<x;j++){
                System.out.print((j+64)+" ");
            }
            System.out.println();
        }
        sc.close();
    }
}
