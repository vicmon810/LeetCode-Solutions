class Solution {
    public int removeDuplicates(int[] nums) {
       int j =1; 
       for (int i = 1; i < nums.length; i++){
        if (nums[i] != nums[j]){
            nums[j] = nums[i]
            j++
        }

       }    
       return j;
    }
}
