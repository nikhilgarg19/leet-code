class Solution {
    public List<List<Integer>> generate(int numRows) {
    ArrayList<Integer> row = new ArrayList<Integer>();
    List<List<Integer>> rowList = new ArrayList<List<Integer>>();
    
    for(int i=0; i<numRows; i++){
        row.add(0, 1);
        for(int j=1; j<i; j++)
            row.set(j, row.get(j)+row.get(j+1));
        row.set(i, 1);
        rowList.add(new ArrayList<Integer>(row));
    }
    return rowList;
}
}