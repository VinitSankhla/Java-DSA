package pattern_printing;

import java.util.Scanner;

public class numbersquare2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int x = sc.nextInt();
        for (int i=1;i<=x;i++){
            for(int j=1;j<=x;j++){
                System.out.print(i+" ");
            }
            System.out.println();
        }
    sc.close();
    }
}
