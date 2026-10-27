class Solution:
    def lengthOfLIS(self, nums: list[int]) -> int:
        n = len(nums)
        # lenth of nums
        dp = [1] * n
        # array of nums

        for i in range(1, n):
            # indexing starts at index 1, in the above algorithm
            for j in range(i):

                if nums[i] > nums[j]:
                    dp[i] = max(dp[i], dp[j] + 1)
        
    

        return max(dp)