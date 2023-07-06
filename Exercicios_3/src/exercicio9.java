
import java.util.Scanner;
public class exercicio9 {
    public static void main(String[] args) {

        double ValorL, QuantL;

        Scanner s = new Scanner(System.in);
        System.out.println("Valor do litro ");
        ValorL = s.nextDouble();
        System.out.println("quantidade de litros de combustível ");
        QuantL = s.nextDouble();
        System.out.println("Resultado " + (ValorL * QuantL));

    }
}
