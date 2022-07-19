
import java.util.Arrays;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author ASUS
 */
public class QuickSort implements Sort {

    @Override
    public void sort(int[] array) {
        sort(array, 0, array.length - 1);
    }

    private void sort(int[] array, int lowIndex, int highIndex) {
        if (lowIndex >= highIndex) {
            return;
        }

        int pivot = array[highIndex];
        int leftPointer = lowIndex;
        int rightPointer = highIndex;

        leftPointer = partition(leftPointer, rightPointer, array, pivot, highIndex);

        sort(array, lowIndex, leftPointer - 1);
        sort(array, leftPointer + 1, highIndex);

    }

    private int partition(int leftPointer, int rightPointer, int[] array, int pivot, int highIndex) {
        while (leftPointer < rightPointer) {
            while (array[leftPointer] <= pivot && leftPointer < rightPointer) {
                leftPointer++;
            }
            while (array[rightPointer] >= pivot && rightPointer > leftPointer) {
                rightPointer--;
            }
            swap(array, leftPointer, rightPointer);
        }
        swap(array, leftPointer, highIndex);
        return leftPointer;
    }

    private void swap(int[] array, int indexA, int indexB) {
        int tmp = array[indexA];
        array[indexA] = array[indexB];
        array[indexB] = tmp;
    }

    @Override
    public void sort(String[] array) {
        sort(array, 0, array.length -1);
    }

    private void sort(String[] array, int lowIndex, int highIndex) {
        if (lowIndex >= highIndex) {
            return;
        }

        int leftPointer = lowIndex;
        int rightPointer = highIndex;
//        String pivot = array[highIndex];
        while (leftPointer < rightPointer) {
            while (array[leftPointer].charAt(0) <= array[highIndex].charAt(0) && leftPointer < rightPointer) {
                leftPointer++;
            }

            while (array[rightPointer].charAt(0) >= array[highIndex].charAt(0) && leftPointer < rightPointer) {
                rightPointer--;
            }

            swap(array, leftPointer, rightPointer);

        }

        swap(array, leftPointer, highIndex);

        sort(array, 0, leftPointer - 1);
        sort(array, leftPointer + 1, highIndex);

    }

    private void swap(String[] array, int indexA, int indexB) {
        var tmp = array[indexA];
        array[indexA] = array[indexB];
        array[indexB] = tmp;
    }

    @Override
    public void sort(char[] array) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void sort(double[] array) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
