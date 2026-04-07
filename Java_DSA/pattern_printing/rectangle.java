package pattern_printing;

public class rectangle {
    public static void main(String[] args) {
        int x = 3;
        int y = 6;
        for(int i=0;i<x;i++){
            for(int j=0;j<y;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
