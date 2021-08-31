public class RemoveElement {
      public static void main(String[] args){
       int [] nums = {1,1,2};
       removeDuplicates(nums);

    }

    public static int removeDuplicates(int[] nums) {

       Set<Integer> num = new HashSet<Integer>();
       for(int i :nums){
           Integer i1 = new Integer(i);
           num.add(i1);

       }

       for(Integer i: num){
           nums[i] = i;
           System.out.print(nums[i]+" ");
       }



        return num.size();
    }
    }
}
