class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()){
            return false;
        }
    HashMap<Character,Integer> map =new HashMap<>();
    for(char x:s.toCharArray()){
        map.put(x,map.getOrDefault(x,0)+1);
    }
    for(char y:t.toCharArray()){
        if(!map.containsKey(y)){
            return false;
        }
        map.put(y,map.getOrDefault(y,0)-1);
        if(map.get(y)<0){
            return false;
        }
    }
    return true;
    }
}
