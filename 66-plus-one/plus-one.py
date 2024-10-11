class Solution(object):
    def plusOne(self, digits):
        ans=[]
        b=0
        n=len(digits)-1
        for i in digits:
            b+=i*(10**n)
            n-=1
        b=b+1
        while(b!=0):
            ans.append(b%10)
            b=b/10
        ans.reverse()
        return ans


        
                

        