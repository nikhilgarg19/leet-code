class Solution:
    def merge(self, nums1: List[int], m: int, nums2: List[int], n: int) -> None:
        for i in nums2:
            nums1[m]=i
            m+=1
        return nums1.sort()