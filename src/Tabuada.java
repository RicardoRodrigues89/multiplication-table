import java.util.Scanner;

public class Tabuada {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println(">>>TABUADA<<<");

        System.out.println("Digite um número: ");
        int numero = scanner.nextInt();

        System.out.println("A tabuada do " + numero + " é: ");

        for (int i = 1; i <= 10; i ++) {
            int total = numero * i;
            System.out.println(numero + " x " + i + " = " + total);
        }

        scanner.close();
    }
}