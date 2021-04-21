
public class Solution {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        
      String one = A.substring(0, A.length()/2-1);
      
      StringBuffer two = new StringBuffer(A.substring(A.length()/2-1, A.length()));
          
     if (two.reverse().equals(one)){
         System.out.println("Yes");
     }else {
         System.out.println("No");
     }
    }
}
