class Solution {
    public int fib(int n) {
        int a=0,b=1;
        int next=0;
        if (n==0 || n==1){
            return n;
        }
        for(int i=1;i<n;i++){
            next=a+b;
            a=b;
            b=next;
        }
        return b;
    }
}