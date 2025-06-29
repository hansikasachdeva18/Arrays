Brute 

class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] ans=new int[2];
        for(int i=0;i<nums.length-1;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]+nums[j]==target){
                    ans[0]=i;
                    ans[1]=j;
                    break;
                }
            }
        }
        return ans;
    }
}


Better 
class Solution {
    public int[] twoSum(int[] nums, int target) {
       HashMap<Integer, Integer> map = new HashMap<>();
       int arr[]= new int[2];
       for(int i=0;i<nums.length;i++){
        int value = nums[i];// 3, 3
        int ans=target-value; // 3, 3
        if(map.containsKey(ans)) {
            arr[0]=i; //1
            arr[1]=map.get(ans);
            return arr;
        }
        map.put(nums[i], i);// 3,0
       }

       return arr;
    }
}


