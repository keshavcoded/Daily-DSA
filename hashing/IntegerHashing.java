package hashing;
import java.util.*;
public class IntegerHashing {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }

        //computing hash

        int hash[] = new int[13];
        for(int i=0;i<n;i++){
            hash[arr[i]] += 1;  
        }

        int k = sc.nextInt();
        while(k-- != 0){
            int number = sc.nextInt();
             System.out.println(hash[number]);

        }
        sc.close();
    }
    
}
