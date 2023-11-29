import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner tb = new Scanner(System.in);
        System.out.println("Droppa vilket tal du vill");
        double tal = tb.nextDouble();
        tal_positivt(tal);
        System.out.println(tal_positivt(tal));
    }
        static boolean tal_positivt(double tal){
            if (tal<0) {
                return true;
            }
            else{
                return false;
            }
        }
}
