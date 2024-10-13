class Solution(object):
    def singleNumber(self, nums):
        nums.sort()
        print(nums)
        res=0
        for i in nums:
            res=res ^ i
        return res

            


        