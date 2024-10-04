package Sorting;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class QuickSort {

    static int partition(List<Integer> arr, int low, int high){
        int i = low;
        int j = high;
        int pivot = arr.get(low);

        while(i<j){
            while(arr.get(i)<=pivot && i<=high-1){
                i++;
            }

            while(arr.get(j)>pivot && j>=low+1){
                j--;
            }

            if(i<j){
                int temp = arr.get(i);
                arr.set(i, arr.get(j));
                arr.set(j, temp);
            }
        }
        int temp = arr.get(low);
        arr.set(low,arr.get(j));
        arr.set(j, temp);
        return j;
    }

    static void quickSort(List<Integer> arr, int low, int high){
        if(low<high){
            int partitionIndex = partition(arr,low, high);
            quickSort(arr, low, partitionIndex - 1);
            quickSort(arr, partitionIndex + 1, high);
        }
    }

    public static void main(String[] args) {

        List<Integer> arr = new ArrayList<>();
        arr = Arrays.asList(new Integer[] {13, 92, 24, 52, 20, 9});
        int n = arr.size();
        System.out.println("Unsorted Input Array:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr.get(i) + " ");
        }
        System.out.println();
        quickSort(arr, 0, n-1);
        System.out.println("The sorted array after merge sort");
        for(int i=0;i<n;i++){
            System.out.println(arr.get(i)+ " ");
        }
    }
    
}
