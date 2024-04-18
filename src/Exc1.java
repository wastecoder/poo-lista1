import java.util.Scanner;

public class Exc1 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        double valor1, valor2, soma;

        System.out.print("Digite o 1o valor: ");
        valor1 = leia.nextDouble();

        System.out.print("Digite o 2o valor: ");
        valor2 = leia.nextDouble();

        soma = valor1 + valor2;
        System.out.println("Soma dos valores: " + soma);
    }
}
