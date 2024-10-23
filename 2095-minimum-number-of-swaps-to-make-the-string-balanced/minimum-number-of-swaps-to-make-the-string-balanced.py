class Solution:
    def minSwaps(self, s: str) -> int:
        swap=0
        for i in s:
            if i=="[":
                swap+=1
            elif swap>0: 
                swap-=1
        return (swap+1)//2