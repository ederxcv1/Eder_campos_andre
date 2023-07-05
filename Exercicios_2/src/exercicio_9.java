import java.util.Scanner;
public class exercicio_9 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String NomePessoa,NomeRua,Numero,CEP,Cidade,Estado,Telefone,CPF;

        System.out.println("Digite nome ");
        NomePessoa = s.next();
        System.out.println("Digite nome da rua ");
        NomeRua = s.next();
        System.out.println("Digite numero ");
        Numero = s.next();
        System.out.println("Digite CEP ");
        CEP = s.next();
        System.out.println("Digite cidade ");
        Cidade = s.next();
        System.out.println("Digite estado ");
        Estado = s.next();
        System.out.println("Digite telefone ");
        Telefone = s.next();
        System.out.println("Digite CPF ");
        CPF = s.next();
        System.out.println("Nome........:"+ NomePessoa );
        System.out.println("Endereço RUA:" +NomeRua +  " NUMERO:" + Numero + " CEP:"+ CEP );
        System.out.println("Cidade......:" + Cidade );
        System.out.println("Estado......:" +Estado);
        System.out.println("CPF.........:"+ CPF );
        System.out.println("Tel. Celular:" + Telefone);
    }
}
