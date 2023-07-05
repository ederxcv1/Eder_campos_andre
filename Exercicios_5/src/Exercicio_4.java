/*4- Agora, alguns exercícios de geometria com a classe Math do Java, para conhecermos as fórmulas e
conceitos de geometria em cálculos de áreas, perímetros e outras propriedades das figuras geométricas.
a) Calcular a área de um círculo, sendo fornecido pelo usuário o RAIO.
b) Calcular a circunferência de um círculo, onde o usuário informa o RAIO.
c) Calcular a hipotenusa de um triângulo retângulo, onde o usuário fornece o CATETO1 e CATETO2
d) Calcular o perímetro de um retângulo:
e) Calcular a área de um triângulo, sendo fornecido pelo usuário a BASE e a ALTURA do triângulo
*/
import java.util.Scanner;
public class Exercicio_4 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        double Raio, Area1, Circinferencia, Cateto1, Cateto2, Hipotenusa, Perimetro,RetanguloLado1,
                RetanguloLado2, Base, Altura, Area2;

        System.out.println("Digite o raio: ");
        Raio = s.nextDouble();
        Area1 = Math.PI * (Raio * Raio);
        System.out.println("Resultado " + Area1);

        Circinferencia = 2 * Math.PI * Raio;
        System.out.println("Resultado " + Circinferencia);

        System.out.println("Digite o cateto 1 ");
        Cateto1 = s.nextDouble();
        System.out.println("Digite o cateto 2 ");
        Cateto2 = s.nextDouble();
        Cateto1 = Math.pow(Cateto1, 2);
        Cateto2 = Math.pow(Cateto2, 2);
        Hipotenusa = Cateto1 + Cateto2;
        Hipotenusa = Math.sqrt(Hipotenusa);
        System.out.println("Resultado " + Hipotenusa);

        System.out.println("Digite o primeiro lado do retângulo: ");
        RetanguloLado1 = s.nextDouble();
        System.out.println("Digite o segundo lado do retângulo: ");
        RetanguloLado2 = s.nextDouble();
        Perimetro = 2 * (RetanguloLado1 + RetanguloLado2);
        System.out.println("Resultado " + Perimetro);

        System.out.println("Digite altura do triângulo: ");
        Altura = s.nextDouble();
        System.out.println("Digite base do triângulo: ");
        Base = s.nextDouble();
        Area2 = (Altura * Base)/2;
        System.out.println("Resultado " + Area2);


    }
}
