class Solution(object):
    def fib(self, n):
        a,b=0,1
        if n==0: return 0
        if n==1: return 1
        next=0
        for i in range(1,n):
            next=a+b
            a=b
            b=next
        return b
        