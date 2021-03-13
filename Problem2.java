

class Solution {
  public static void main(String[]args) {
		
		int num = 123;
		
	  reverse(num);
		
		System.out.print(num);
		
	}
  
  public int reverse(int x) {
        String reversed = new StringBuilder().append(Math.abs(x)).reverse().toString();
try {
    return (x < 0) ? Integer.parseInt(reversed) * -1 : Integer.parseInt(reversed);
} catch (NumberFormatException e) {
    return 0;
}
    }
}   
   
