//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {


        while (true) {
            System.out.println("Sozu daxil edin:");

            Scanner scanner = new Scanner(System.in);
            String soz = scanner.next(), b = "";
            char c;


            for (int i = 0; i < soz.length(); i++) {
                c = soz.charAt(i);
                b = c + b;

            }
            System.out.println("Sozun tersi: " + b);


        }
    }
}