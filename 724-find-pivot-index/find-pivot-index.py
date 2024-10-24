class Solution:
    def pivotIndex(self, nums: List[int]) -> int:
        ls,rs=0,0
        for i in range(len(nums)):
            ls=sum(nums[0:i])
            rs=sum(nums[i+1:])
            if ls==rs:
                return i
        return -1

        