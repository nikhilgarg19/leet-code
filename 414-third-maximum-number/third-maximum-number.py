class Solution:
    def thirdMax(self, nums: List[int]) -> int:
        s=sorted(set(nums))
        print(s)
        s1=list(s)
        print(s1)
        if len(s)>=3:
            return s1[-3]
        else:
            return s1[-1]

