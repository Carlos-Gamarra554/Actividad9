import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("1. Decimal a binario\n" +
                "2. Decimal a octal\n" +
                "3. Decimal a hexadecimal\n" +
                "4. Binario a decimal\n" +
                "5. Binario a hexadecimal\n" +
                "6. Binario a octal\n" +
                "7. Octal a decimal\n" +
                "8. Ocatal a binario\n" +
                "9. Octal a hexadecimal\n" +
                "10. Hexadecimal a decimal\n" +
                "11. Hexadecimal a benario\n" +
                "12. Hexadecimal a octal\n" +
                "Elige una opción: ");
        int opcion = sc.nextInt();

        switch (opcion) {
            case 1:
                System.out.print("Tu número en binario es: " + binarios());
                break;
            case 2:
                System.out.print("Tu número en octal es: ");
                break;
            case 3:
                System.out.print("Tu número en hexadecimal es: ");
                break;
            case 4:
                System.out.print("Tu número en decimal es: " + decimales());
                break;
            case 5:
                System.out.print("Tu número en hexadecimal es: ");
                break;
            case 6:
                System.out.print("Tu número en octal es: ");
                break;
            case 7:
                System.out.print("Tu número en decimal es: ");
                break;
            case 8:
                System.out.print("Tu número en binario es: ");
                break;
            case 9:
                System.out.print("Tu número en hexadecimal es: ");
                break;
            case 10:
                System.out.print("Tu número en decimal es: ");
                break;
            case 11:
                System.out.print("Tu número en binario es: ");
                break;
            case 12:
                System.out.print("Tu número en octal es: ");
                break;
            default:
                System.out.println("Opción no válida!");
                break;
        }
    }

    public static int binarios() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce el número decimal: ");
        int decimal = sc.nextInt();

        int binario = 0;
        int resto;
        int posicion = 1;

        while (decimal > 0) {
            resto = decimal % 2;
            decimal = decimal / 2;
            binario += resto * posicion;
            posicion *= 10;
        }
        return binario;
    }

    public static int decimales(){
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce el número binario: ");
        String binario = sc.nextLine();

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
