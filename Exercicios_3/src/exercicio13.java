
import java.util.Scanner;
public class exercicio13 {
    public static void main(String[] args) {

        double ValorProduto, QuantComprada;

        Scanner s = new Scanner(System.in);
        System.out.println("Digite o valor do produto ");
        ValorProduto = s.nextDouble();
        System.out.println("Quantidades de produtos comprados:");
        QuantComprada = s.nextDouble();
        System.out.println("Resultado " + (QuantComprada * ValorProduto));
    }
}
