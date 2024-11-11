class Solution:
    def arrayPairSum(self, nums: List[int]) -> int:
        nums.sort()
        l=[]
        for i in range(0,len(nums),2):
            l.append(nums[i])
        return sum(l)