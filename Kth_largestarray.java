import java.util.Arrays;

public class Kth_largestarray {

    public static int Kthlarge(int arr[], int key) {

        Arrays.sort(arr);  

        
        return arr[arr.length - key];
    }

    public static void main(String[] args) {
        int a[] = {3,2,1,5,6,4};
        int key = 2;

        System.out.print("Kth Largest = " + Kthlarge(a, key));
    }
}

