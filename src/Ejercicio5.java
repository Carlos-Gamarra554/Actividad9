import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce el número decimal: ");
        int decimal = sc.nextInt();

        int binario = 0;
        int resto;
        int posicion = 1;

        while (decimal > 0);
        {
            resto = decimal % 2;
            decimal = decimal / 2;
            binario += resto * posicion;
            posicion *= 10;
        }
        System.out.print("Tu número en binario es: " + binario);
    }
}
