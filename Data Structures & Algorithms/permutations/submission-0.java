class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result= new ArrayList<>();
        List<Integer> current = new ArrayList<>();
        boolean[] freq = new boolean[nums.length];
        backtrack(nums,current,result,freq);
        return result;
    }
    private void backtrack(int[] nums,List<Integer>current,List<List<Integer>>result,boolean[] freq){
        if(current.size()==nums.length){
            result.add(new ArrayList<>(current));
            return;
        }
        for(int i=0;i<nums.length;i++){
            if(!freq[i]){
                freq[i]=true;
                current.add(nums[i]);
                backtrack(nums,current,result,freq);
                current.remove(current.size()-1);
                freq[i]=false;
            }
        }
    }
}
