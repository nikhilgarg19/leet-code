class Solution:
    def isFascinating(self, n: int) -> bool:
        l=[1,2,3,4,5,6,7,8,9]
        a=2*n
        b=3*n
        res=str(n)+str(a)+str(b)
        for i in res:
            if int(i) not in l:
                return False
            else:
                l.remove(int(i))
        return len(l)==0
        