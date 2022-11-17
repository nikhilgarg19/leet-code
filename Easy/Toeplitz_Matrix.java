class Solution {
    public boolean isToeplitzMatrix(int[][] arr) {
        int m=arr.length;
        int n=arr[0].length;
        // int l=m+n-1;
        
        for(int a=m-1;a>=0;a--){
            int t=a, j=0;
            while((t+1)<m && (j+1)<n){
                // System.out.print(arr[t][j]+" ");
                if(arr[t][j]!=arr[++t][++j]) return false;
            }
        }
        for(int a=1;a<n;a++){
            int t=a, i=0;
            while((t+1)<n && (i+1)<m){
                // System.out.print(arr[i][t]+" ");
                if(arr[i][t]!=arr[++i][++t]) return false;
            }
        }
        return true;
    }
}