import java.util.Scanner;
public class exercicio_1 {
    public static void main(String[] args) {
        String Cidade,Nome;
        Scanner s = new Scanner(System.in);
        System.out.println("Digite seu nome ");
        Nome = s.nextLine();
        System.out.println("Digite cidade onde mora ");
        Cidade = s.nextLine();
        System.out.println(" Olá " +  Nome + ", você mora em " + Cidade + ".");
    }
}
