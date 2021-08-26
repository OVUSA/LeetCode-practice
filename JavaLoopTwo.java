import java.util.Scanner;

public class JavaLoopTwo {
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            
            int num = a + (1 * b);
            System.out.print(num + " ");

            int temp = 2;
            for ( int k = 0;k<n-1;k++){
                num = num +(temp*b);
                System.out.print(num+" ");
                temp = temp +temp;
            }
            System.out.println();          
        }
        in.close();
    }
}
