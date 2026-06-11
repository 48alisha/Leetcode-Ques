class Solution(object):
    def maxSubArray(self, nums):
       currentsum=0
       maxsum=nums[0]

       for num in nums:
        currentsum=num+currentsum
        maxsum=max(maxsum,currentsum)

        if currentsum<0:
            currentsum=0

       return maxsum