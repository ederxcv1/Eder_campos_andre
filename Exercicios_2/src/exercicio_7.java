import java.util.Scanner;
public class exercicio_7 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int Idade ;
        String Cidade,Nome;
        System.out.println("Digite seu nome ");
        Nome = s.next();
        System.out.println("Digite sua idade ");
        Idade = s.nextInt();
        System.out.println("Digite em que cidade mora ");
        Cidade = s.next();
        System.out.println("Seu nome " + Nome + "\nSua idade " + Idade + " anos\nMora em " + Cidade);

    }
}
