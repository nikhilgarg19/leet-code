class Solution {
    public int removeDuplicates(int[] nums) {
     int s = 1;
      int c = 0;
        for(int i = 1;i<nums.length;i++){
            if(nums[i] == nums[i-1]){
                c++;
            }
            else{
                c=0;
            }

            if(c<=1){
                nums[s] = nums[i];
                s++;
            }
        }
        return s;
    }
}