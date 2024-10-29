class Solution:
    def heightChecker(self, heights: List[int]) -> int:
        check=sorted(heights)
        print(check)
        c=0
        for i in range(len(heights)):
            if heights[i]!=check[i]:
                c+=1
        return c