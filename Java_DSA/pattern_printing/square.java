package pattern_printing;

import java.util.Scanner;

public class square {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Give the side of the square :");
        int x = sc.nextInt();
        for(int i=0;i<x;i++){
            for(int j=0;j<x;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        sc.close();
    }
}
