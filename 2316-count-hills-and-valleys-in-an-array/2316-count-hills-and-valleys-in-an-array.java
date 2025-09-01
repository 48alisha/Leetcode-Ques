class Solution {
    public int countHillValley(int[] nums) {
     int i=1;
     int j=i-1;
     int k=i+1;
     int count=0;
     for(;k<nums.length;){
        while(k<nums.length && nums[i]==nums[k]){
            k++;
        }
        if(k<nums.length && nums[i]!=nums[j] && nums[i]!=nums[k]){
            if((nums[i]>nums[j] && nums[i]>nums[k]) ||(nums[i]<nums[j] && nums[i]<nums[k])){
              count++;
            }
        }
        i=k;
        j=i-1;
        k=i+1;

     }
     return count;
        
    }
}