import java.util.Scanner;
public class exercicio_8 {
    public static void main(String[] args) {
        double NumDecimal;
        int NumInteiro;
        Scanner s = new Scanner(System.in);
        System.out.println("Digite um numero inteiro ");
        NumInteiro = s.nextInt();
        System.out.println("Digite um numero decimal ");
        NumDecimal = s.nextDouble();
        System.out.println("Numero decimal " + NumDecimal +"\nNumero inteiro "+NumInteiro);
    }
}
