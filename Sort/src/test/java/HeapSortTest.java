import java.util.Arrays;

public class HeapSortTest {
    public static void main(String[] args) {
        int[] array = {1, 9, 3};
        System.out.println("Before = " + Arrays.toString(array));
        HeapSort sorter = new HeapSort();
        sorter.sort(array);
        System.out.println("After = " + Arrays.toString(array));

    }
}
