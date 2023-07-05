import java.util.Scanner;
public class Exercicio_3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        double X;
        System.out.println("Digite um numero: ");
        X = s.nextDouble();
        //a-
        System.out.println(Math.tan(X));
        //b-
        System.out.println(Math.asin(X));
        //c-
        System.out.println(Math.acos(X));
        //d-
        System.out.println(Math.atan(X));
        //e-
        System.out.println(Math.log(X));
    }
}
