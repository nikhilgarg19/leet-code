class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
		Arrays.sort(nums1);
        Arrays.sort(nums2);
        Set<Integer> a = new HashSet<>();
        int i = 0,j=0;
        while(i<nums1.length && j<nums2.length){
            if(nums1[i] == nums2[j]){
                a.add(nums1[i]);
                i++;
                j++;
            }else if(nums1[i] > nums2[j]){
                j++;
            }else{
                i++;
            }
        }
        int ans[] = new int[a.size()];
        int k=0;
        for(int l : a){
            ans[k++] = l;
        }
        return ans;
    }
}