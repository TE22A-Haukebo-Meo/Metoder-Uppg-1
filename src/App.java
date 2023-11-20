import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("HurlånglinjevillDUha?");
        Scanner tb = new Scanner(System.in);
        int längd = tb.nextInt();
        ritaLinje(längd);
    }
        static void ritaLinje(int längd)
        {
            for(int i=0 ; i<längd; i++){
                System.out.print("-");
            }
        }
}
