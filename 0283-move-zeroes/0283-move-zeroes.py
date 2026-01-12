class Solution:
    def moveZeroes(self, nums: List[int]) -> None:
        count = 0
        result = []

        for i in range(len(nums)):
            if nums[i] == 0:
                count += 1
            else:
                result.append(nums[i])

        result.extend([0] * count)
        nums[:] = result

        