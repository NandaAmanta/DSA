
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
//        var array = Generator.array(500000);
//        sorter.sort(array);
//        System.out.println(Arrays.toString(array));

        String[] arrayString = {
            "Hallo", "Nanda", "Amanta", "IPutu",
            "Hallo", "Nanda", "Amanta", "IPutu",
            "Hallo", "Nanda", "Amanta", "IPutu",
            "Hallo", "Nanda", "Amanta", "IPutu",
            "Hallo", "Nanda", "Amanta", "IPutu",
            "Hallo", "Nanda", "Amanta", "IPutu",
            "Hallo", "Nanda", "Amanta", "IPutu",
            "Hallo", "Nanda", "Amanta", "IPutu",
            "Hallo", "Nanda", "Amanta", "IPutu",
            "Hallo", "Nanda", "Amanta", "IPutu",
            "Hallo", "Nanda", "Amanta", "IPutu",
            "Hallo", "Nanda", "Amanta", "IPutu",
            "Hallo", "Nanda", "Amanta", "IPutu",
            "Hallo", "Nanda", "Amanta", "IPutu",
            "Hallo", "Nanda", "Amanta", "IPutu",
            "Hallo", "Nanda", "Amanta", "IPutu",
            "Hallo", "Nanda", "Amanta", "IPutu",
            "Hallo", "Nanda", "Amanta", "IPutu",
            "Hallo", "Nanda", "Amanta", "IPutu",
            "Hallo", "Nanda", "Amanta", "IPutu",
            "Hallo", "Nanda", "Amanta", "IPutu",
            "Hallo", "Nanda", "Amanta", "IPutu",
            "Hallo", "Nanda", "Amanta", "IPutu",
            "Hallo", "Nanda", "Amanta", "IPutu",
            "Hallo", "Nanda", "Amanta", "IPutu",
            "Hallo", "Nanda", "Amanta", "IPutu",
            "Hallo", "Nanda", "Amanta", "IPutu",
            "Hallo", "Nanda", "Amanta", "IPutu",
            "Hallo", "Nanda", "Amanta", "IPutu",
            "Hallo", "Nanda", "Amanta", "IPutu",
            "Hallo", "Nanda", "Amanta", "IPutu",
            "Hallo", "Nanda", "Amanta", "IPutu",
            "Hallo", "Nanda", "Amanta", "IPutu",
            "Hallo", "Nanda", "Amanta", "IPutu",
            "Hallo", "Nanda", "Amanta", "IPutu"
        };
        sorter.sort(arrayString);
        System.out.println(Arrays.toString(arrayString));
    }
}
