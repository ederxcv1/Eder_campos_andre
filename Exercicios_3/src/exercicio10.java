
import java.util.Scanner;
public class exercicio10 {
    public static void main(String[] args) {
        double QuantDiasAlugados,ValorDiario;
        Scanner s = new Scanner(System.in);
        System.out.println("Preço de um dia de aluguel de um carro ");
        ValorDiario = s.nextDouble();
        System.out.println("Quantidades de dias alugados ");
        QuantDiasAlugados = s.nextDouble();
        System.out.println("Resultado " + (QuantDiasAlugados * ValorDiario));
    }
}
