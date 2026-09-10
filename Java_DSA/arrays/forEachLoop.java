package arrays;

public class forEachLoop {
    public static void main(String[] args) {//just for traversing the array and can not change the elements
        int[] arr= {10,20,30,40,50,60,70,80};//mainly used for printing, read, access
        for(int i : arr){
            System.out.print(i+" ");// i me directly array ke element aa rhe hai rather than the index
        }
        System.out.println();
        // for(int i : arr){
        //     i *= 2;//this will not happen as it is not possible with for each loop
        // }
        for(int i : arr){
            System.out.print(i+" ");
        }
    }
}
