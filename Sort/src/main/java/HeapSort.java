public class HeapSort implements Sort {

    @Override
    public void sort(int[] array) {
        this.heapify(array);
    }

    @Override
    public void sort(String[] array) {

    }

    @Override
    public void sort(char[] array) {

    }

    @Override
    public void sort(double[] array) {

    }

    public void heapify(int[] array) {
        int largestIndex = this.getLargestIndex(array, 0, 1, 2);
        swap(array, 0, largestIndex);
    }

    public int getLargestIndex(int[] array, int rootIndex, int leftIndex, int rightIndex) {
        if (array[leftIndex] >= array[rootIndex] && array[leftIndex] >= array[rightIndex]) {
            return leftIndex;
        }

        if (array[rightIndex] >= array[rootIndex] && array[rightIndex] >= array[leftIndex]) {
            return rightIndex;
        }

        return rootIndex;
    }

    public void swap(int[] array, int indexA, int indexB) {
        var tmp = array[indexA];
        array[indexA] = array[indexB];
        array[indexB] = tmp;
    }
}
