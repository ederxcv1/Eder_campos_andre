
import java.util.Scanner;
public class exercicio23 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        double numP , numS;

        System.out.println("Digite um numero ");
        numP = s.nextDouble();
        System.out.println("Digite um numero ");
        numS = s.nextDouble();

        System.out.println(Math.sqrt(numP));
        System.out.println(Math.pow(numP , numS));
    }
}
