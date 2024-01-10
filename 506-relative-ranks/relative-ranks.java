class Solution {
    public String[] findRelativeRanks(int[] a) {
        int n = a.length;
        int rank = 4, rankIndex = 0;
        String rankArr[] = {"Gold Medal","Silver Medal","Bronze Medal"};
        String[] ans = new String[n];
        int[] sortedArr = new int[n];
        for(int i=0; i<n; i++) sortedArr[i] = a[i];
        Arrays.sort(sortedArr);
        for(int i=n-1; i >= 0; i--){
            for(int j=0; j<n; j++){
                if(sortedArr[i] == a[j]){
                    if(rankIndex < rankArr.length) ans[j] = rankArr[rankIndex++];
                    else ans[j] = (rank++)+"";
                }
            }
        }
        return ans;
    }
}