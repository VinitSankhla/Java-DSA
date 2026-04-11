package pattern_printing;

import java.util.Scanner;

public class FloydsTriangle {
    public static void main(String[] args) {
        int a=1;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number till you want to print floyd's triangle : ");
        int x = sc.nextInt();
        
        for (int i=1;i<=x;i++){
                for (int j=1;j<=i;j++){
                    if (a<=x) {
                        System.out.print(a + " ");
                        a++;
                    }
                    else break ;
            }
            System.out.println();
        }
        sc.close();
    }
}
