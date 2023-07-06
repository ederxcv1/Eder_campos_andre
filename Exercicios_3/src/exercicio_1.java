import java.util.Scanner;
public class exercicio_1 {
    public static void main(String[] args) {
        int NumeroP,NumeroS;
        Scanner s = new Scanner(System.in);
        System.out.println("Digite o primeiro numero ");
        NumeroP = s.nextInt();
        System.out.println("Digite o segundo numero ");
        NumeroS = s.nextInt();
        System.out.println("Resultado " + (NumeroP + NumeroS));
    }
}
