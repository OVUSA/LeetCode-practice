import java.util.Scanner;

public class Solution {

    public static String getSmallestAndLargest(String s, int k) {
        String smallest = "";
        String largest = "";
        
        
        int end = k;
       ArrayList <String>temps = new ArrayList<>();
       int i = 0;
        while (i+end<=s.length()){
            temps.add(s.substring(i,i+end));
            i++;
        }
        
        Collections.sort(temps);
       
        smallest = temps.get(0);
        largest = temps.get(temps.size()-1);
                  
              return smallest + "\n" + largest;
        }
        
        
        
        // Complete the function
        // 'smallest' must be the lexicographically smallest substring of length 'k'
        // 'largest' must be the lexicographically largest substring of length 'k'
        
      
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();
      
        System.out.println(getSmallestAndLargest(s, k));
    }
}
