package Sorting;
import java.util.*;

public class MergeSort {

    static void merge(int arr[],int low, int mid, int high){

       ArrayList<Integer> temp = new ArrayList<>();

       int left = low;
       int right = mid+1;

       while(left<=mid && right<=high){

        if(arr[left]<=arr[right]){
            temp.add(arr[left]);
            left++;
        }
        else{
            temp.add(arr[right]);
            right++;
        }
       }
       //adding the left out elements
       while (left<=mid) {
        temp.add(arr[left]);
        left++;
        
       }

       while( right<=high){
        temp.add(arr[right]);
        right++;
       }

       //adding the elemtns from the temp array to the main array

       for(int i= low;i<=high;i++){
        arr[i]  = temp.get(i-low);
       }

    }

    static void merge_sort(int arr[], int low, int high){
        if(low>=high)
           return;

        int mid = (low+high)/2;
        merge_sort(arr, low, mid);
        merge_sort(arr, mid+1, high);
        merge(arr, low, mid, high);
            
    }


    public static void main(String[] args) {
        int arr[] = {13, 46, 24, 52, 20, 9};
        int n = arr.length;
        System.out.println("Unsorted Input Array:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        merge_sort(arr, 0, n-1);
        System.out.println("The sorted array after merge sort");
        for(int i=0;i<n;i++){
            System.out.println(arr[i]+ " ");
        }
    }
}
