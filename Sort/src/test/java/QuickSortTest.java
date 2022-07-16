
import java.util.Arrays;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author ASUS
 */
public class QuickSortTest {

    public static void main(String[] args) {
        QuickSort sorter = new QuickSort();
        int[] array = new int[]{9, 4, 6, 2};
        sorter.sort(array);
        System.out.println(Arrays.toString(array));
    }
}
