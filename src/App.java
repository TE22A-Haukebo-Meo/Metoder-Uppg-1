import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        //System.out.println("HurlånglinjevillDUha?");
        Scanner tb = new Scanner(System.in);
        /*int längd = tb.nextInt();
        ritaLinje(längd);*/
        System.out.println("Hurbredrektangelvillduha?");
        int bredd = tb.nextInt();
        System.out.println("Hurlhögrektangelvillduha?");
        int höjd =tb.nextInt();
        ritaRektangel(bredd, höjd);
    }
        static void ritaLinje(int längd)
        {
            for(int i=0 ; i<längd; i++){
                System.out.print("-");
            }
        }
        static void ritaRektangel(int bredd, int höjd){
            for(int i=0; i<bredd; i++){
                System.out.println();
                for(int a=0; a<höjd; a++){
                    System.out.print("*");
                }
            }
        }
}
