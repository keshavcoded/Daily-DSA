package Sorting;

public class RecusriveBubble {

    static void recursive_bubbleSort(int arr[],int n){

        //base case
        if(n==1) return;

        int didSwap  = 0;

        for(int j=0;j<=n-2;j++){
            if(arr[j]>arr[j+1]){
                int temp  = arr[j];
                arr[j] = arr[j+1];
                arr[j+1] = temp;
                didSwap = 1;
            }
        }

        if(didSwap == 0) return;

        recursive_bubbleSort(arr, n-1);
    }

    public static void main(String[] args) {
        int arr[] = {13, 46, 24, 52, 20, 9};
        int n = arr.length;
        System.out.println("Unsorted Input Array:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        recursive_bubbleSort(arr, n);

        System.out.println("After sorting array:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
    
        }
    }
}
