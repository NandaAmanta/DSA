import java.util.Arrays;

public class Test {

    public static void main(String[] args) {
        BubbleSort sorter = new BubbleSort();
        int[] arr = {5, 1, 2, 3, 4};
        System.out.println(Arrays.toString(arr));

        sorter.sort(arr);
        System.out.println(Arrays.toString(arr));


    }

}
