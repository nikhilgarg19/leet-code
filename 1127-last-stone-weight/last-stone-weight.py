class Solution:
    def lastStoneWeight(self, stones: List[int]) -> int:
        if len(stones)==1: return stones[0]
        if len(stones)==2: return abs(stones[0]-stones[1])
        res=sorted(stones)
        for i in range(len(stones)-1,0,-1):
            res=sorted(res)
            print(res)
            res[i-1]=abs(res[i]-res[i-1])
        return res[0]

