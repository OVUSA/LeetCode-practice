import java.util.Scanner;

public class JavaLoopTwo {
    public static void main(String []args){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();

            int num = a+(1*b);
            System.out.print(num+" ");


            for ( int k = 2; k<=n*4;k*=2){
                num = num +(k*b);
                System.out.print(num+ " ");
            }
            System.out.println();
        }
        in.close();
    }
}
