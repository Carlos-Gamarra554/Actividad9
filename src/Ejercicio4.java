import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce el número binario: ");
        String binario = sc.nextLine();

        int decimal = binarios(binario);
        System.out.print("Tu número en decimal es: " + decimal);
    }

    public static int binarios(String binario){
        int decimal = 0;
        int longitud = binario.length();

        for (int i = 0; i < longitud; i++) {
            if (binario.charAt(i) == '1') {
                decimal += Math.pow(2, longitud - 1 - i);
            }
        }
        return decimal;
    }
}
