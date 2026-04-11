package pattern_printing;

public class StarCross {
    public static void main(String[] args) {
        int x = 5;
        for (int i=0;i<x;i++){
            for (int j=0;j<x;j++){
                if (i==j || (i+j)==4) {
                    System.out.print("* ");
                }
                else System.out.print("  ");
            }
            System.out.println();
        }

    }
}
