public class Primes {

	public static void main(String[] args) {
	      Scanner sc = new Scanner (System.in);
	      int numCases = sc.nextInt();
	    
	      for ( int i = 0; i < numCases;i++) {
	    	  int num = sc.nextInt();
	    	  primeNum (num);
	      }
	      
	      
	    }
	
	public static void primeNum(int num) {
		if ( (num %2 ==0 && num!=2)|| num % 3==0 && num!=3) {
			System.out.println("Not prime");
			
		}else {
			System.out.println("Prime");
			
		
	}
	}
}
