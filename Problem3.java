class Solution {
    
    public int romanToInt(String s) { 
        int result = 0;
		 for ( int i = 0; i < s.length();i++) {
			 int s1 = value(s.charAt(i));
			 
			 if (i+1 <s.length()) {
				 int s2 = value(s.charAt(i+1));
				 if (s1>=s2) {
					 result = result +s1;
				 }else {
					 result = result+s2-s1;
					 i++;
				 }
			 }else {
				 result = result +s1;
			 	}
	}return result;
        
    }
    public  static int value (char c) {
		  int num = 0;
		  
		  if (c =='I') {
			  return num +1;
			  
		  }else if ( c =='V') {
			  return num +5;
			  
		  }else if (c =='X') {
			  return num +10;
			  
		  }else if (c=='L'){
	            return num+50;
	            
	      }else if (c =='C'){
	            return 100;
	            
	      }else if (c =='D'){
	            return num +500;
	            
	      }else if (c =='M'){
	            return num + 1000;}
		  
	        return num;
	  }
}
