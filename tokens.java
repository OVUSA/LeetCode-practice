public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        if(!scan.hasNext()) { System.out.print(0);return;}
        String s = scan.nextLine();
        s = s.trim();
        
        String[] tokens = s.split("[!,?._'@\\s]+");
       
        int num= tokens.length;
  
        System.out.println(num);
        
        for (String a :tokens ){
             System.out.println(a);
        }
       
        scan.close();
    }
}
