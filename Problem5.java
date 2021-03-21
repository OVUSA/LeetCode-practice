class Solution {
    public int removeElement(int[] nums, int val) {
         int index = 0;
        
      for ( int i = 0; i <nums.length-1;i++){
          if (nums[i]== val){
              index++;
          } 
        if (nums[i+1]>=nums.length-1){
              if (nums[i]!=val){
                int temp = nums[i];
                nums[i]= nums[nums.length];
                nums[nums.length] = temp
      }     
        return nums.length;
    }
}
