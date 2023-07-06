
import java.util.Scanner;
public class exercicio15 {
    public static void main(String[] args) {

        double Quilogramas, Altura;

        Scanner s = new Scanner(System.in);
        System.out.println("Digite o peso de uma pessoa em quilogramas ");
        Quilogramas = s.nextDouble();
        System.out.println("Digite  altura dessa pessoa em  metros ");
        Altura = s.nextDouble();
        System.out.println("Resultado " + (Quilogramas / (Altura * Altura)));
    }
}
