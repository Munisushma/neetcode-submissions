class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<>();
        for(int i=1;i<=numRows;i++){
            result.add(generateRows(i));
        }
        return result;
    }
    private List<Integer> generateRows(int row){
        int ans = 1;
        List<Integer> temp = new ArrayList<>();
        temp.add(ans);
        for(int col=1;col<row;col++){
            ans = ans*(row-col);
            ans = ans/(col);
            temp.add(ans);

        }
        return temp;
    }
}