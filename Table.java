import java.util.Scanner;

public class Table {
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("================================");
        for(int i=0;i<3;i++){

            int count = 0;
            String s1=sc.next();
            int x=sc.nextInt();
            int spaces = countElements(s1);
            String num = Integer.toString(x);


            System.out.print(s1);
            for ( int n =0; n <spaces;n++){
                System.out.print(" ");
            }
            int temp = num.length();

            if (temp <3){
                for ( int m = 0; m<(3-num.length());m++){
                    System.out.print(0);
                }

                System.out.println(x);
            }else{
                System.out.println(x);
            }

        }
        System.out.println("================================");

    }
    static int countElements(String word){
        return 15-word.length();
    }

}


