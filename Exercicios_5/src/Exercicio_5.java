import java.util.Scanner;
public class Exercicio_5 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        double Hipotenusa, Oposto, Adjacente;
        System.out.println("Digite a hipotenusa ");
        Hipotenusa = s.nextDouble();
        System.out.println("Digite o oposto ");
        Oposto = s.nextDouble();
        Adjacente = Math.sqrt(Math.pow(Hipotenusa, 2) - Math.pow(Oposto, 2));
        System.out.println("adjacente = " + Adjacente);
    }
}
