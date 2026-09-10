package arrays;

public class reverseArray {
    public static void main(String[] args) {
        int [] arr = {6,8,1,2,4,9};
        for(int k : arr){
            System.out.print(k+" ");
        }
        System.out.println();
        int i = 0;//will access from the front
        int j = arr.length-1;//will access from the end
        while(j>i){//till the front and the end meets 
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
