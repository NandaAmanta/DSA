import java.util.List;

public class BubbleSort {

    public static void sort(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - 1; j++) {
                if(arr[j+1] < arr[j]){
                    swap(arr , j+1 , j);
                }
            }
        }
    }

    public static void swap(int[] arr , int a , int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}
