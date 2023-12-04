import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner tb = new Scanner(System.in);
        char tecken = 'a';
        boolean svar = Character.isDigit(tecken);
        System.out.println(siffra(tecken));
        }
        static boolean siffra(char tecken){
            boolean svar = Character.isDigit(tecken);
            if(svar){
                System.out.println(tecken+" är en siffra");
                return true;
            }
            else{
                System.out.println(tecken+" är inte en siffra");
                return false;
            }
        }

}
