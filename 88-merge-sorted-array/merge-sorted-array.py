class Solution(object):
    def merge(self, nums1, m, nums2, n):
        for i in nums2:
            nums1[m]=i
            m+=1
        return nums1.sort()
        

        