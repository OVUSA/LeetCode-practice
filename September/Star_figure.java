import java.util.Scanner;
class Star_figure{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String [][] ar = new String [n][n];

        for ( int i = 0; i <ar.length;i++){
            for ( int j = 0;j< ar.length;j++) {
                if (i == j || i ==ar.length / 2 || j == ar.length / 2) {
                    ar[i][j] = "*";

                }else if (n-j==i+1) {
                    ar[i][j] = "*";
                }else {
                    ar[i][j]= ".";
                }
                System.out.print(ar[i][j]+ " ");
            }
           System.out.println();
        }
  }
}
