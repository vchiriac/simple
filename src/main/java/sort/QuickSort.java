package sort;

/**
 * Created by valentinchiriac on 19/06/16.
 */
public class QuickSort {
    private int[] array;
    private int size;

    public QuickSort(int n) {
        size = n;
        //create array with size n+1
        array = new int[n + 1];

        //asign value into the array
        for (int i = 0; i < n; i++) {
            array[i] = (int) Math.round(Math.random() * 89 + 10);
        }
        //set the last element as big value
        array[n] = 99999;
    }

    public int partition(int p, int q) {
        int i = p;
        int j = q + 1;


        // Get the pivot element from the middle of the list
        int pivot = array[p];

        // Divide into two lists
        do {
            // If the current value from the left list is smaller than the pivot
            // element then get the next element from the left list
            do {
                i++;

            } while (array[i] < pivot);

            // If the current value from the right list is larger than the pivot
            // element then get the next element from the right list
            do {
                j--;
            } while (array[j] > pivot);

            // If we have found a values in the left list which is larger than
            // the pivot element and if we have found a value in the right list
            // which is smaller than the pivot element then we exchange the values.

            if (i < j) {
                swap(i, j);
            }

        } while (i < j);

        //swap the pivote element and j th element
        swap(p, j);
        return j;
    }

    private void swap(int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    public void quicksort() {
        // Recursion
        quicksort(0, size - 1);
    }

    public void quicksort(int p, int q) {
        int j;
        if (p < q) {
            // Divide into two lists
            j = partition(p, q);
            // Recursion
            quicksort(p, j - 1);
            quicksort(j + 1, q);
        }
    }

    public void print(){
        //print the elements of array
        for(int i=0;i<size;i++){
            System.out.print(array[i]+" | ");
        }
        System.out.println();

    }
}
