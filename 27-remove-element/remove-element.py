class Solution(object):
    def removeElement(self, nums, val):
        for i in range(len(nums)-1,-1,-1):
            if nums[i]==val:
                nums.remove(nums[i])
        return len(nums)
            
                