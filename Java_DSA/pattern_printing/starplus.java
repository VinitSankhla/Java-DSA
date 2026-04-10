package pattern_printing;

import java.util.Scanner;

public class starplus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of vertical length :");
        int x = sc.nextInt();
        for(int i=0;i<x;i++){
            for(int j=0;j<x;j++){
                if (i==(x/2) || j==(x/2)){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        sc.close();   
    }
}
