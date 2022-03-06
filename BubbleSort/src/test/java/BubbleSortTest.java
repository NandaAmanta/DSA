import java.util.Arrays;

public class BubbleSortTest {

    public static void main(String[] args) {
        int[] arr = {3,4,2,1,4,6,5,12,34,1};
        BubbleSort.sort(arr);

        System.out.println("Result By BubbleSort: ");
        for(int x:arr) System.out.print(x + " ");
    }

}
