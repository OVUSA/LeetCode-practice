public class Redex{ 

public static void main(String[] args){
      Scanner sc = new Scanner (System.in);
      
       int N = sc.nextInt();
        //SortedMap<String,String> firstNameAndEmail = new TreeMap<>();
        List<String> names = new  ArrayList<>();
        String gmailRedex = ".+@gmail\\.com$";
         Pattern pattern = Pattern.compile(gmailRedex);
        
        
       for( int i = 0;i< N ; i++){
         
       String name = sc.next();
       String email = sc.next();
       Matcher matcher = pattern.matcher(email);
       if ( matcher.find()){
           names.add(name);
       }
    }
    
       Collections.sort(names);
        

        for ( String a : names){
            System.out.println(a);
         }
    }          
}
