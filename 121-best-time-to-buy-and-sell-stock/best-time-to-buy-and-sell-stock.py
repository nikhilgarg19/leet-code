class Solution(object):
    def maxProfit(self, prices):
        min=2**31-1
        max_res=0
        res=0
        for i in range(0,len(prices)):
            if prices[i]<min:
                min=prices[i]
            elif prices[i]-min>max_res:
                max_res=max(max_res,prices[i]-min)
        return max_res
                                
            
            
        