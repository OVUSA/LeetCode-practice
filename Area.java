import java.util.Scanner;

public class Area {
    static int B;
    static int H;
    static boolean flag;

    public Area(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter B");
        System.out.println("Enter H");

        B = sc.nextInt();
        H = sc.nextInt();
        flag = print(B,H);
    }


    public static boolean print(int breadth, int height ){
        if (breadth>0 && height >0){
            return true;
        }else
            System.out.println("java.lang.Exception: Breadth and height must be positive");
        return false;

    }

    public static void main(String[] args){

        Area area1 = new Area();
        if(flag){
            int area=B*H;
            System.out.print(area);
        }

    }//end of main

}//end of class
