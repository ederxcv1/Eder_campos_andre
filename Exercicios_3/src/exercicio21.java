import java.util.Scanner;
public class exercicio21 {
    public static void main(String[] args) {
        double PesoQuilogramas, Altura;
        Scanner s = new Scanner(System.in);
        System.out.println("Digite seu peso em quilogramas ");
        PesoQuilogramas = s.nextDouble();
        System.out.println("Digite sua altura em metros ");
        Altura = s.nextDouble();
        System.out.println("Resultado " + (PesoQuilogramas / (Altura * Altura)));
    }
}
