package hashing;

import java.util.Scanner;

public class CharacterHashing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        int hash[] = new int[26];
        for(int i=0;i<s.length();i++){
            hash[s.charAt(i) - 'a'] += 1;
        }

        int k = sc.nextInt();
        while (k-->0) {
            char c = sc.next().charAt(0);
            System.out.println(hash[c-'a']);
            
        }
        sc.close();
    }
}
