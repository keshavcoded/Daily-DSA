package hashing;

import java.util.Arrays;
import java.util.HashMap;

public class LC1838 {

    static int maxFrequency(int nums[], int k){
        int left = 0;
        long totalOps = 0;
        int maxFrequency = 1;

        HashMap<Integer,Integer> map = new HashMap<>();
        Arrays.sort(nums);

        for(int right = 0;right<nums.length;right++){
            map.put(nums[right], map.getOrDefault(nums[right], 0)+1);

            if(right>0){
                totalOps += (long)(nums[right] - nums[right-1]) * (right - left);
            }

            while (totalOps>k) {
                totalOps -= nums[right] - nums[left];
                map.put(nums[left], map.get(nums[left])-1);
                left ++;
            }

            maxFrequency = Math.max(maxFrequency, right-left+1);

        }
        return maxFrequency;

    }

    public static void main(String[] args) {
        int[] nums = {10};
        int k = 100;

        System.out.println("Maximum possible frequency: " + maxFrequency(nums, k)); 
    }
    
}
