
import java.util.Arrays;

public class BubbleSortTest {

    public static void main(String[] args) {
        BubbleSort sorter = new BubbleSort();
        var array = Generator.array(100000);

        sorter.sort(array);
        System.out.println("After : " + Arrays.toString(array));

    }

}
