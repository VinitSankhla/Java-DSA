package arrays;

public class searchInArray {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50, 60};
        int x = 70;
        int index = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                index = i;
                break;
            }
        }
        if (index != -1) {
            System.out.println("The element found on the index : " + index);
        } else {
            System.out.println("Element not found in the array");
        }
    }
}
