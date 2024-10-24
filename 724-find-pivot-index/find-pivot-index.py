class Solution:
    def pivotIndex(self, nums: List[int]) -> int:
        total_sum = sum(nums)  # Total sum of the array
        left_sum = 0  # Running sum of the left side
        
        for i in range(len(nums)):
            # Check if left_sum equals the right sum
            if left_sum == (total_sum - left_sum - nums[i]):
                return i
            
            # Update the left_sum by adding the current element
            left_sum += nums[i]
        
        # If no pivot index is found, return -1
        return -1


