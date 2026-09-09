package arrays;
import java.util.Arrays;

public class sortArrayBuiltIn {
    public static void main(String[] args) {
        // sort - ascending order
        int[] arr = {4,-6,-7,9,89,7,-1,6};
        print(arr);
        Arrays.sort(arr);
        print(arr);

    }
    public static void print (int[] arr){
        for(int i = 0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}
