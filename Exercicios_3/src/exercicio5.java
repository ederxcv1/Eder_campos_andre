
import java.util.Scanner;
public class exercicio5 {
    public static void main(String[] args) {
        double DinheiroPorHora,HorasThabalhadas,SalarioDiario;
        Scanner s = new Scanner(System.in);
        System.out.println("Digite dinheiro ganho por hora ");
        DinheiroPorHora = s.nextDouble();
        System.out.println("Digite horas trabalhadas ");
        HorasThabalhadas = s.nextDouble();
        SalarioDiario = DinheiroPorHora * HorasThabalhadas;
        System.out.println("Salario por dia" + SalarioDiario);
    }
}
