public class LibraryFines {

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        //System.out.println("Actual return:");
        String[] date = sc.nextLine().split(" ");
       // System.out.println("Due date:");
        String [] date2 = sc.nextLine().split(" ");
        
        int noFine = 0;
        int daysFine = 15;
        int monthsFine = 500;
        int yearFine = 10000;
        
        
        
        int []actualReturn = new int[3];
        int [] dueDate = new int [3];
        
        
        for ( int i = 0; i < 3;i++) {
            actualReturn[i]=Integer.parseInt(date[i]);
            dueDate [i]= Integer.parseInt(date2[i]);
        }
        
        
        int []elapsedDate = new int[3];
        int finesToPay= 0; 
            
        for ( int i = 0; i < 3 ;i++){
            if ( actualReturn[i]!=dueDate[i]){
                elapsedDate[i]= actualReturn[i]-dueDate[i];
            }
        }
        
        
        if ( elapsedDate[0]> 0 && elapsedDate[1]==0 && elapsedDate[2]==0 ){
            finesToPay = elapsedDate[0]*daysFine;          
        }
        if ( elapsedDate[1]>0 && elapsedDate[2]==0) {
            finesToPay = finesToPay+ (elapsedDate[1]*monthsFine);
        }
        
        if ( elapsedDate[2]>0 ) {
                finesToPay = 1000;
            }
         
        System.out.println(finesToPay);
    
    }

}
