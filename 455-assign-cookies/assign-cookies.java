class Solution {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);

        int no_of_students = g.length;
        int no_of_cookies = s.length;

        int pt1 = 0;
        int pt2 = 0; 

        int count = 0;

        while(pt2 < no_of_cookies && pt1<no_of_students){
            if(g[pt1] <= s[pt2]){
                count++;
                pt1++;
                pt2++;
            }else{
                pt2++;
            }
        }
        return count;
        
    }
}