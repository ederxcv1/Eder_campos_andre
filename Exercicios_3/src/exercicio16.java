
import java.util.Scanner;
public class exercicio16 {
    public static void main(String[] args) {
        double Produto, ValorDesconto;

        Scanner s = new Scanner(System.in);
        System.out.println("Digite o valor do produto ");
        Produto = s.nextDouble();
        System.out.println("Digite o desconto ");
        ValorDesconto = s.nextDouble();

        System.out.println("Resultado " + (Produto - (Produto * ValorDesconto)/100));


    }
}
