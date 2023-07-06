
import java.util.Scanner;
public class exercicio11 {
    public static void main(String[] args) {
        int Quadrado;

        Scanner s = new Scanner(System.in);
        System.out.println("Digite um numero para calcular o quadrado ");
        Quadrado = s.nextInt();
        System.out.println("Resultado " + (Quadrado * Quadrado));
    }
}
