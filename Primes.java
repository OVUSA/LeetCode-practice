public class Primes {

public static void main(String[] args) {
	Scanner sc = new Scanner (System.in);
	int numCases = sc.nextInt();
		      
	for ( int m = 0; m< numCases;m++){
	int val = sc.nextInt();

	for(int i=2; i<=val/i; i++){
	if(val%i==0) val=1;
	}

	if(val==1) System.out.println("Not prime");
	else System.out.println("Prime");

	}
}
