package forloop;
import java.util.Scanner;

public class primecomposite {
    public static void main(String[] args) {
        // check if a numebr is prime or composite 
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number to check if prime or composite");
    int a = sc.nextInt();
    int b = 0;
    for (int i = 2;i<=Math.sqrt(a);i++){
        if (a%i==0) {
            b=1;
            break;
        }
    }
    sc.close();
    if (a==0||a==1) {
        System.out.println("Neither prime nor composite");
    }
    else if (b==1) {
        System.out.println("Composite number");
    }
    else System.out.println("Prime number");
    }
    
}
