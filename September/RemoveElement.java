public class RemoveElement {
   public static void main(String[] args){
       int count = 0;
        for ( int i = 0; i < nums.length-1;i++){
            if(nums[i]== nums[i+1]){
                count++;
                char temp = '_';
                for( int k = 1;k<nums.length-1;k++){
                    nums[i] = nums[k];
                }
                nums[nums.length-1-i] = temp;
                
            }else{
                continue;
            }
            
        }
        return nums.length;
    }
    

    }
}
