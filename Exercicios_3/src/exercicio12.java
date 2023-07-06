
import java.util.Scanner;
public class exercicio12 {
    public static void main(String[] args) {
        double Produto;
        Scanner s = new Scanner(System.in);
        System.out.println("Digite o valor do produto ");
        Produto = s.nextDouble();
        System.out.println("Resultado " + (Produto * 1.15));
    }
}
