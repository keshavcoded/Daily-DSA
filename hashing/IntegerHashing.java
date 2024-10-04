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

        /* int hash[] = new int[13];
        for(int i=0;i<n;i++){
            hash[arr[i]] += 1;  
        } */

        HashMap<Integer,Integer> mp = new HashMap<>();
        for(int i=0;i<n;i++){
            int key = arr[i];
            int freq = 0;
            if(mp.containsKey(key)){
                freq = mp.get(key);
                freq++;
                mp.put(key,freq);
            }
        }

        int k = sc.nextInt();
        while(k-->0){
            int number = sc.nextInt();
            if( mp.containsKey(number)){
                System.out.println(mp.get(number));
            }
            else{
                System.out.println(0);
            }
        }
        sc.close();
    }
    
}
