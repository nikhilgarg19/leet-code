class Solution(object):
    def searchInsert(self, nums, target):
        for i  in range(len(nums)):
            if nums[i]==target:
                return i
            elif nums[i]>target:
                return i
            elif i==len(nums)-1:
                return i+1
        