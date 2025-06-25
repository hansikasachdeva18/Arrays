//  Using Extra Space Leetcode link -> https://leetcode.com/problems/merge-sorted-array/submissions/1675709039/
Solution 1 
  
class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        // lets use extra space here 

        int answer[] = new int[m+n];

        int index = 0;

        int i=0; // pointer for num1
        int j=0; // pointer for nums2

        while(i<m && j<n){
            if(nums1[i]<=nums2[j]){
                answer[index]=nums1[i];
                i++;
                index++;
            }
            else{
                answer[index]=nums2[j];
                j++;
                index++;
            }
        }

        //if array nums1 is pending and nums2 is finished

        while(i<m){
           answer[index++]=nums1[i++];
        }

        // nums2 is pending
         while(j<n){
           answer[index++]=nums2[j++];
        }

        // copy all the elements in arrays 1 because question xpects the final sorted merged array to be stored in-place in nums1[].

        for (int k = 0; k < m + n; k++) {
            nums1[k] = answer[k];
        }

    }
}



Solution 2  Using inbuilt sorting function

class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        // we are merging here
        for (int i = 0; i < n; i++) {
            nums1[m + i] = nums2[i];
        }
        // sorting using inbuilt
        Arrays.sort(nums1);
    }
}


Solution 3 Optimal One (without using extra space) but using inbuit function twice

class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
       // pick last element from array 1 and call it largest 
       // pick first element from array 2 call it smallest
       int left = m - 1;
        int right = 0;
        while (left >= 0 && right < n) {
            if (nums1[left] > nums2[right]) {
                int temp = nums1[left];
                nums1[left] = nums2[right];
                nums2[right] = temp;
                left--;
                right++;
            } 
            //break otherwise
            else break;
        }
       // You are sorting nums1 *before* copying nums2 into it if you only write  Arrays.sort(nums1);
       // instead write 
        Arrays.sort(nums1, 0, m);
        Arrays.sort(nums2);
        int indexOfnums2 = 0;
        for(int k=m;k<m+n;k++){
            nums1[k]=nums2[indexOfnums2];
            indexOfnums2++;
         }

    }
}







  
