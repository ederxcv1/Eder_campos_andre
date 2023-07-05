import java.util.Scanner;
public class exercicio_10 {
    public static void main(String[] args) {
        int NumeroP,NumeroS,X;
        Scanner s = new Scanner(System.in);
        System.out.println("Digite o primeiro numero ");
        NumeroP = s.nextInt();
        System.out.println("Digite o segundo numero ");
        NumeroS = s.nextInt();
        X = NumeroP;
        NumeroP = NumeroS;
        NumeroS = X;
        System.out.println("Primeiro numero " + NumeroP +"\n"+ "Segundo numero " + X);
    }
}