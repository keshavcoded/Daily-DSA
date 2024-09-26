package Sorting;

public class SortingAlgorithms {


    //selection sort
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

        print(n,arr,type);
        
    }

    //bubble sort

    static void bubble_sort(int n, int arr[],String type){

        for(int i=n-1; i>=0;i--){
            int swapDone = 0;
            for(int j=0;j<=i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    swapDone = 1;
                }
            }
            if(swapDone == 0){
                break;
            }
        }
        print(n,arr,type);
    }

    //insertion sort

    static void insertion_sort(int n,int arr[], String type){
        for(int i=0;i<n;i++){
            int curr = i;
            while(curr>0 && arr[curr-1] > arr[curr]){
                int temp = arr[curr-1];
                arr[curr-1] = arr[curr];
                arr[curr] = temp;
                curr--;
            }
        }

        print(n, arr, type);
    }

    //print method
    static void print(int n, int arr[], String type){
        System.out.println("After " + type + " sort:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String args[]) {

        int arr[] = {13, 46, 24, 52, 20, 9};
        int n = arr.length;
        System.out.println("Unsorted Input Array:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        /* selection_sort(n, arr, "selection"); */
        /* bubble_sort(n, arr, "bubble"); */
        insertion_sort(n, arr, "insertion");
    }

}
