//public class Quicksort {
//}

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class QuickSort
{
    int partition(List arr, int low, int high)
    {
        int pivot = (int) arr.get(high);
        int i = (low-1); // index of smaller element
        for (int j=low; j<high; j++)
        {
            // If current element is smaller than the pivot
            if ((int)arr.get(j) < pivot)
            {
                i++;
                Collections.swap(arr,i,j);
                // swap arr[i] and arr[j]
            }
        }
        Collections.swap(arr,i+1,high);
        // swap arr[i+1] and arr[high] (or pivot)
        return i+1;
    }
    /* The main function that implements QuickSort()
    arr[] --> Array to be sorted,
    low --> Starting index,
    high --> Ending index */
    void sort(List arr, int low, int high)
    {
        if (low < high)
        {
			/* pi is partitioning index, arr[pi] is
			now at right place */
            int pi = partition(arr, low, high);

            // Recursively sort elements before
            // partition and after partition
            sort(arr, low, pi-1);
            sort(arr, pi+1, high);
        }
    }

    /* A utility function to print array of size n */
    static void printArray(List arr)
    {
        int n = arr.size();
        for (int i=0; i<n; ++i)
            System.out.print(arr.get(i)+" ");
        System.out.println();
    }

    // Driver program
    public static void main(String args[])
    {
        List<Integer> arr = new ArrayList<Integer>();
        arr.add(1);arr.add(6);arr.add(20);arr.add(7);arr.add(50);arr.add(13);arr.add(25);
        arr.add(8);
        int n=arr.size();
        QuickSort ob = new QuickSort();
        ob.sort(arr, 0, n-1);

        System.out.println("sorted array");
        printArray(arr);
    }
}

