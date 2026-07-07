package methods;

import java.util.Scanner;

public class PermutationCombination {

    public static int fact(int x){
        int f=1;
        for (int i =1;i<=x;i++){
            f*=i;
        }
        return f;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Give n");
        int n = sc.nextInt();
        System.out.println("Give r");
        int r = sc.nextInt();
        int ncr = fact(n)/(fact(r)*fact(n-r));
        int npr = fact(n)/fact(r);
        System.out.println("NCR : "+ncr);
        System.out.println("NPR : "+npr);
    sc.close();
    }
}
