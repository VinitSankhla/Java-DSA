package arrays;

public class PassingArrayToMethods {
    public static void main(String[] args) {
        int[] x = {1,2,4,5,6,8,99};
        System.out.println(x[2]);
        change(x);
        System.out.println(x[2]);
        
    }//whenever we pass our array to methods then the array is passed by reference
    // further explanation in shallowCopyDeepCopy.java file
    public static void change (int[] y){
        y[2]=100;
    }
}
