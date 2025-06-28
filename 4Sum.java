Leetcode Link -> https://leetcode.com/problems/4sum/description/

Brute Solution  
  
class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
      Set<List<Integer>> set = new HashSet<>();
      for(int i=0;i<nums.length;i++){
        for(int j=i+1;j<nums.length;j++){
            for(int k=j+1;k<nums.length;k++){
                for(int p=k+1;p<nums.length;p++){
                    if(nums[i]+nums[j]+nums[k]+nums[p]==target){
                        List<Integer> at = Arrays.asList(nums[i],nums[j],nums[k],nums[p]);
                        at.sort(null);
                        set.add(at);
                    }
                }
            }
        }
      }

       List<List<Integer>> answer = new ArrayList<>(set);

       return answer;

    }
}

