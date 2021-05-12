import java.util.Scanner;

public class Solution {

static boolean isAnagram(String string1, String string2) {
        String workingCopy1 = removeJunk(string1);
        String workingCopy2 = removeJunk(string2);

        workingCopy1 = workingCopy1.toLowerCase();
        workingCopy2 = workingCopy2.toLowerCase();

        workingCopy1 = sort(workingCopy1);
        workingCopy2 = sort(workingCopy2);

        return workingCopy1.equals(workingCopy2);
    }

    protected static String removeJunk(String string) {
        int i, len = string.length();
        StringBuilder dest = new StringBuilder(len);
          char c;

        for (i = (len - 1); i >= 0; i--) {
            c = string.charAt(i);
            if (Character.isLetter(c)) {
                dest.append(c);
            }
        }

        return dest.toString();
    }

    protected static String sort(String string) {
        char[] charArray = string.toCharArray();

        java.util.Arrays.sort(charArray);

        return new String(charArray);
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
