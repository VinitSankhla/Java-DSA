package arrays;

public class reverseArray {
    public static void main(String[] args) {
        int [] arr = {6,8,1,2,4,9};
        int i = 0;
        int j = arr.length-1;
        while(j>i){
            swap(arr,i, j);
            i++;
            j--;
        }
        for(int k : arr){
            System.out.print(k+" ");
        }
    }
    public static void swap(int[] arr,int i,int j){
        int temp = arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
}
