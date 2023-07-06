
import java.util.Scanner;
public class exercicio17 {
    public static void main(String[] args) {
        double Produto,Parcelas;
        Scanner s = new Scanner(System.in);
        System.out.println("Digite o valor do produto ");
        Produto = s.nextDouble();
        System.out.println("Digite quantidade de Parcelas ");
        Parcelas = s.nextDouble();
        System.out.println("Resultado " + (Produto / Parcelas));
    }
}
