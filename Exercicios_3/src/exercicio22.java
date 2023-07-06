
import java.util.Scanner;
public class exercicio22 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int numP ,numS;
        System.out.println("Digite o primeiro numero ");
        numP = s.nextInt();
        System.out.println("Digite o segundo numero ");
        numS = s.nextInt();
        MaiorNumero(numP,numS);
    }
    static void MaiorNumero(int num,int num2){
        if(num2 > num){
            System.out.println("O maior numero " + num2);
        }else if(num > num2){
            System.out.println("O maior numero " + num);
        }
    }
}
