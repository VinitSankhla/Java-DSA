package forloop;

import java.util.Scanner;

public class forloop2 {
    public static void main(String[] args) {
        //take n as input and print 1 n 2 n-1 3 n-2 ...
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i=0;n-i>=0;i++){
            System.out.println(i+1);
            System.out.println(n-i);
            
        }
        sc.close();
    }
}
