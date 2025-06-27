Leetcode link -> 


  Brute Solution 

  class Solution {
    public int[] productExceptSelf(int[] nums) {
        int ans[]= new int[nums.length];
        for(int i=0;i<nums.length;i++){
            int product =1;
           for(int j=0;j<nums.length;j++){
               if(i!=j){
                  product = product * nums[j];
               }
           }

           ans[i]=product;
        }


        return ans;
    }
}


Optimal Solution 
  
