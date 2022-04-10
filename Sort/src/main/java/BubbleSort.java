class BubbleSort implements Sort {

    public void swap(int[] array, int a, int b) {
        var tmp = array[a];
        array[a] = array[b];
        array[b] = tmp;
    }

    public void swap(double[] array, int a, int b) {
        var tmp = array[a];
        array[a] = array[b];
        array[b] = tmp;
    }

    @Override
    public void sort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - 1; j++) {
                if (array[j] > array[j + 1]) {
                    swap(array, j, j + 1);
                }
            }
        }
    }

    @Override
    public void sort(String[] array) {
        System.out.println("This Method is Still working.");
    }

    @Override
    public void sort(char[] array) {
        System.out.println("This Method is Still working.");
    }

    @Override
    public void sort(double[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - 1; j++) {
                if (array[j] > array[j + 1]) {
                    swap(array, j, j + 1);
                }
            }
        }
    }
}
