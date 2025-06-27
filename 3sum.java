Brute Solution 

public class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        
        Set<List<Integer>> set = new HashSet<>();
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                for(int k=j+1;k<nums.length;k++){
                    if(nums[i]+nums[j]+nums[k]==0){
                         List<Integer> at = Arrays.asList(nums[i],nums[j],nums[k]);
                         at.sort(null);
                         set.add(at);
                    }
                }
            }
        }
        // we need to return the arraylist so we will make one arraylist answer 
        // arrayList mai set likhoge andar tabhi toh set se arraylist mai copy hoga
        List<List<Integer>> answer = new ArrayList<>(set);
        return answer;
    }
}

// because we do not want to store duplicates and we know HashSet helps in storing unique so we will use HashSet but here we need to store the list of elemenets.


Better Solution using only 2 loops 

public class Solution {
    public List<List<Integer>> threeSum(int[] nums) { 
         Set<List<Integer>> st = new HashSet<>();

        for (int i = 0; i < nums.length; i++) {
            Set<Integer> hashset = new HashSet<>();
            for (int j = i + 1; j < nums.length; j++) {
                //Calculate the 3rd element:
                int third = -(nums[i] + nums[j]);

                //Find the element in the set:
                if (hashset.contains(third)) {
                    List<Integer> temp = Arrays.asList(nums[i], nums[j], third);
                    temp.sort(null);
                    st.add(temp);
                }
                hashset.add(nums[j]);
            }
        }

        // store the set elements in the answer:
        List<List<Integer>> ans = new ArrayList<>(st);
        return ans;
        

    }
}


