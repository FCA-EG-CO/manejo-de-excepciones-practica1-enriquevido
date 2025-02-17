import java.io.IOException;
import java.util.Scanner;

public class NumeroPar {
    public static int verificadorPar (int num){
        if (num != 0)
            throw new ArithmeticException("Excepción: El numero es impar");
        return num % 2;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Introduce un numero: ");
        int num = input.nextInt();

        try {
            int result = verificadorPar(num);
            if (result == 0) {
                System.out.println("El número es par");
            }
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("Ejecución finalizada.");
    }
}
