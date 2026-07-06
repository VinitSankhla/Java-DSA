package methods;

public class nestedmethods {
    public static void main(String[] args) {
        hello();
    }


    public static void hello() {
        System.out.println("Hello 1");
        hey();
    }
    public static void hey(){
        hii();
        System.out.println("Hey 3");
    }
    public static void hii(){
        System.out.println("Hii 2");
    }
}
