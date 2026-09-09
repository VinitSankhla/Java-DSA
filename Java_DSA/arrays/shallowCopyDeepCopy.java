package arrays;

import java.util.Arrays;

public class shallowCopyDeepCopy {
    public static void main(String[] args) {
        int[] arr = {10,20,30,40,50};
        int[] shallow = arr; //shallow is shallow copy of arr
        shallow[0]=100;
        System.out.println(arr[0]);
        System.out.println(shallow[0]);

        int[] deep = Arrays.copyOf(arr, arr.length);
        deep[0]=99;
        System.out.println(deep[0]);
        System.out.println(arr[0]);//Deep copy 
    }
}
