class Solution {
    public int[] asteroidCollision(int[] asteroids) {
       Stack<Integer> stack  = new Stack<>();
       for(int i:asteroids){
        boolean alive = true;
        while(alive && i<0 && !stack.isEmpty() && stack.peek()>0){
            if(stack.peek()<-i){
                stack.pop();
                continue;
            } else if(stack.peek()== -i){
                alive = false;
                stack.pop();
                break;
            } else{
           
                alive = false;
                break;
            }
        }
        if(alive){
            stack.push(i);
        }
       } 
       int[]  result = new int[stack.size()];
       for(int i= result.length-1;i>=0;i--){
        result[i]= stack.pop();
       }
       return result;
    }
}