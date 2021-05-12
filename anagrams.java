import java.util.Scanner;

public class Solution {

static boolean isAnagram(String a, String b) {
        a = a.toLowerCase();
        b = b.toLowerCase();
        char[] second = new char[b.length()];
        char [] first = new char[a.length()];
        for ( int i = 0 ; i < a.length();i++){
            first.add(a.charAt(i));
            second.add(b.charAt(i));
          
        }
      int match= 0;
       
       for ( int j= 0; i < a.length(); j ++){
           for ( int i = 0; i < b.length(); i++){
               if (a(j)== b(i)){
                   match++;
                   second.remove(b(i));
                   break;
               }
           }
       }
       
    return (match == a.length() ? true:false);
    
    }

  public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}
