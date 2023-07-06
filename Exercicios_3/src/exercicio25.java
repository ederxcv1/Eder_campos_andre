
import java.util.Scanner;
public class exercicio25 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        double Real,Dolar;

        System.out.println("Digite um valor em dolar ");
        Dolar = s.nextDouble();
        Real = Dolar * 4.90;
        System.out.println(Dolar + "para real é " + Real + " reais");
    }
}
