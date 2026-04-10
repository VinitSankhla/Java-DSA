package pattern_printing;

import java.util.Scanner;

public class hollowRectangle {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows :");
        int x = sc.nextInt();
        System.out.print("Enter number of columns :");
        int y = sc.nextInt();
        for(int i=0;i<x;i++){
            for(int j=0;j<y;j++){
                if (i==0 || i==(x-1) || j==0 || j==(y-1)){
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
