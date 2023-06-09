package Exercicio2;
import java.util.InputMismatchException;
import java.util.Scanner;
public class Questao2 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int x = 0;
        int y = 0;
        boolean confere = false;

        while(!confere) {
            try {
                System.out.println("Eu sei dividir!");
                System.out.println("Informe o primeiro valor: ");
                x = teclado.nextInt();

                System.out.println("Informe o segundo valor: ");
                y = teclado.nextInt();
                teclado.nextLine();

                confere = true; // para quando os valores sao validos
            }catch (InputMismatchException e) {
                System.out.println("Digite somente números inteiros!");
                teclado.nextLine();
            }
        }
        try {
            double r = (x / y);
            System.out.println("O resultado é: " + r);
        }catch (ArithmeticException e) { //para nao permitir divisao por zero
            System.out.println("Não é permitido divisão por zero, digite um número válido!");
        }
    }
}
