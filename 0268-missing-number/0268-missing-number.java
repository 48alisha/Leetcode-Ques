class Solution {
    public int missingNumber(int[] nums) {
        int sum=0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
        }
        int sum1=0;
        int n=nums.length;
        while(n>=0){
            sum1+=n;
            n--;
        }
        return sum1-sum;
        
    }
}