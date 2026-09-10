package arrays;

public class secondMax {
    public static void main(String[] args) {
        int[] arr = {10,10,8,7,9,4,5,6,1,2};
        int a = Integer.MIN_VALUE;
        int b = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>a){
                b=a;
                a=arr[i];//shift a to be and max to a
            }
            else if(arr[i]>b && arr[i]!=a){
                b=arr[i];//change only b
            }
        }
        if(b==Integer.MIN_VALUE){
                System.out.println("NO SECOND MAX");//when all elements are same
            }
        
        else{System.out.println("The second max element is : "+b);}
    }
}
