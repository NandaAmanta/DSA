import java.util.Arrays;

public class BubbleSortTest {

    public static void main(String[] args) {
        BubbleSort sorter = new BubbleSort();
        int[] arr = {5, 1, 2, 3, 4};
        System.out.println("Before : " + Arrays.toString(arr));

        sorter.sort(arr);
        System.out.println("After : " + Arrays.toString(arr));

    }

}
