package Sorting;

public class SortingAlgorithms {

    static void selection_sort(int n, int arr[], String type){


        for(int i=0;i<n-1;i++){
            int min = i; 
            for(int j = i+1;j<n;j++){ 
                if(arr[min]>arr[j]){  
                    min = j; 
                }
            }
                int temp = arr[min]; 
                arr[min] = arr[i];
                arr[i] = temp;
        }
        System.out.println("After " + type + " sort:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String args[]) {

        int arr[] = {13, 46, 24, 52, 20, 9};
        int n = arr.length;
        System.out.println("Before selection sort:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        selection_sort(n, arr, "selection");
    }

}
