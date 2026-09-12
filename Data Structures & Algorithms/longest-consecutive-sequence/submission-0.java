class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        int maxCount=0;
        for(int num:nums){
            set.add(num);
        }
        for(int num:set){
            if(!set.contains(num-1)){
                int currLength =1;
                while(set.contains(num+currLength)){
                    currLength++;
                }
                maxCount = Math.max(currLength,maxCount);
            }
        }
        return maxCount;
    }
}
