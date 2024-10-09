class Solution(object):
    def twoSum(self, nums, target):
        res=[]
        for i in range(1,len(nums)):
            for j in range(0,i):
                if nums[i]+nums[j]==target:
                    res.append(i)
                    res.append(j)
        return res
        