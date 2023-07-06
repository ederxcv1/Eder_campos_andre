import java.util.Scanner;
public class exercicio19 {
    public static void main(String[] args) {

        int Meses,Idade;

        Scanner s = new Scanner(System.in);
        System.out.println("Digite sua idade ");
        Idade = s.nextInt();
        System.out.println("Digite quantos de meses  que você viveu ");
        Meses = s.nextInt();
        System.out.println("Resultado " + (Meses * 30));
    }
}
