public class Sorts{
    /**Bubble sort of an int array. 
    *Upon completion, the elements of the array will be in increasing order.
    *@param data  the elements to be sorted.
    */
    public static void bubbleSort(int[] data){
        boolean swapped = true;
        for(int i = 0; i < data.length && swapped; ++i) {
            swapped = false;
            for(int j = 0; j < data.length - i - 1; ++j) {
                if(data[j] > data[j + 1]) {
                    int temp = data[j + 1];
                    data[j + 1] = data[j];
                    data[j] = temp;
                    swapped = true;
                }
            }
        }
    }

    public static void selectionSort(int[] data){
        for(int i = 0; i < data.length; ++i) {
            for(int j = i + 1; j < data.length; ++j) {
                if(data[i] > data[j]) {
                    int temp = data[i];
                    data[i] = data[j];
                    data[j] = temp;
                }
            }
        }
    }

    public static void insertionSort(int[] data) {
        for(int i = 1; i < data.length; ++i) {
            int temp = data[i];
            int j = i - 1;
            for(; j >= 0 && data[j] > temp; --j) {
                data[j + 1] = data[j];
            }
            data[j + 1] = temp;
        }
    }
}