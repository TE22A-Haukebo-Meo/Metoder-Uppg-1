import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Cuantos largos radie vill du ha?");
        Scanner tb = new Scanner(System.in);
        double radie = tb.nextDouble();
        System.out.println("Omkretsen är "+omkretsCirkel(radie));
    }
        static double omkretsCirkel(double radie)
        {
            double omkrets = 3.14*radie*2;
            return omkrets;
        }
}
