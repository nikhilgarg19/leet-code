class Solution {

    static List<List<Integer>> ans;
    static void swap(int arr[], int i, int j){
        int a = arr[i];
        arr[i] = arr[j];
        arr[j] = a;
    }

    static void helper(int arr[], int idx){
        if(idx==arr.length-1){
            ans.add(Arrays.stream(arr).boxed().toList());
            return;
        }

        HashSet<Integer> hp = new HashSet<>();
        for(int i=idx; i<arr.length; i++){
            if(hp.contains(arr[i])) continue;
            hp.add(arr[i]);
            swap(arr,i,idx);
            helper(arr,idx+1);
            swap(arr,i,idx);
        }
        
    }
    public List<List<Integer>> permuteUnique(int[] arr) {
        ans = new ArrayList<>();
        helper(arr,0);
        return ans;
    }
}