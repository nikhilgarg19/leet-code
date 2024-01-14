class Solution {
    public int firstMissingPositive(int[] nums) {
        Arrays.sort(nums);
        int j=0;
        for (int i = 0; i < nums.length-1; i++) {
            if (nums[i] != nums[i + 1]) {
                nums[j++] = nums[i];
            }
        }
 
        nums[j++] = nums[nums.length - 1];
        int a=1;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>0){
                if(nums[i]!=a)
                return a;
                a++;
            }
            
        }
        return a;
    }
}