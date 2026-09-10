package arrays;

public class minInArray {
    public static void main(String[] args) {
        int[] arr = {-7,5,-8,9,7,2};
        int min = arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]<min){min=arr[i];}
        }
        System.out.println(min);
    }
}
