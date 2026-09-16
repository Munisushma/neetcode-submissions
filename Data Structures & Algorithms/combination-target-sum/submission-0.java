class Solution {
    public List<List<Integer>> combinationSum(int[] nums, int target) {
        List<List<Integer>> result = new ArrayList<>();
        findCombinations(0,nums,new ArrayList<>(),target, result);
        return result;
    }
   private void  findCombinations(int index,int[] nums,List<Integer> current,int target,List<List<Integer>> result){
    if(index==nums.length){
        if(target==0){
            result.add(new ArrayList<>(current));
        }
        return;
    }
        if(nums[index]<=target){
            current.add(nums[index]);
       findCombinations(index,nums,current,target-nums[index],result);
       current.remove(current.size()-1); 
    }
    
    findCombinations(index+1,nums,current,target,result);


     }
}
