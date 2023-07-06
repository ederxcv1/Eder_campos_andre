
import java.util.Scanner;
public class exercicio2 {
    public static void main(String[] args) {

        double PI = Math.PI,Raio,Area;

        Scanner s = new Scanner(System.in);
        System.out.println("Digite raio ");
        Raio = s.nextInt();
        Area = PI * (Raio * Raio);
        System.out.println("Resultado " + Area);
    }
}
