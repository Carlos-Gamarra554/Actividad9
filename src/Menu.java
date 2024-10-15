import org.w3c.dom.ls.LSOutput;
import java.util.Scanner;

        public class Menu {
            public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);

                System.out.print("1. Números Capicúa\n" +
                        "2. Números primos\n" +
                        "3. Siguiente número primo\n" +
                        "4. Potencias\n" +
                        "5. Número de dígitos\n" +
                        "6. Voltea el número\n" +
                        "Elige la función: ");

                int opcion = sc.nextInt();

                switch (opcion) {
                    case 1:
                        System.out.println("Números capicúa!");
                        if (esCapicua()) {
                            System.out.println("El número es capicúa!");
                        } else {
                            System.out.println("El número no es capicúa!");
                        }
                        break;
                    case 2:
                        System.out.println("Números primos!");
                        if (esPrimo()) {
                            System.out.println("El número es primo!");
                        } else {
                            System.out.println("El número no es primo!");
                        }
                        break;
                    case 3:
                        System.out.println("Siguiente número primo!");
                        System.out.println("El siguiente número primo es: " + siguientePrimo());
                        break;
                    case 4:
                        System.out.println("Potencias!");
                        System.out.println("El resultado de la potencia es: " + potencia());
                        break;
                    case 5:
                        System.out.println("Número de ígitos!");
                        System.out.println("El número de dígitos es: " + digitos());
                        break;
                    case 6:
                        System.out.println("Voltea el número!");
                        System.out.println("Tu número dado la vuelta es: " + voltea());
                        break;
                    case 7:
                        System.out.println("DígitoN!");
                        break;
                    case 8:
                        System.out.println("Posición de dígito!");
                        break;
                    case 9:
                        System.out.println("Quita números por detrás!");
                        break;
                    case 10:
                        System.out.println("Quita números por delante!");
                        break;
                    case 11:
                        System.out.println("Pega por detrás!");
                        break;
                    case 12:
                        System.out.println("Pega por delante!");
                        break;
                    case 13:
                        System.out.println("Trozo de número!");
                        break;
                    case 14:
                        System.out.println("Junta números!");
                        break;
                    default:
                        System.out.println("Opción no válida!");
                        break;
                }
            }
            //Pedir número
            public static int numero() {
                Scanner sc = new Scanner(System.in);
                System.out.print("Introduce un número: ");
                int num = sc.nextInt();

                return num;
            }
            //1
            public static boolean esCapicua() {

                String numD = Integer.toString(numero());
                String numI = new StringBuilder(numD).reverse().toString();

                return numD.equals(numI);
            }
            //2
            public static boolean esPrimo() {
                Scanner sc = new Scanner(System.in);
                System.out.print("Introduce un número: ");
                int num = sc.nextInt();

                if (num < 2) return false;

                for (int i = 2; i <= Math.sqrt(num); i++) {
                    if (num % i == 0) {
                        return false;
                    }
                }
                return true;
            }
            //3
            public static int siguientePrimo() {
                int num = numero();

                num++;
                for (int i = 2; i <= Math.sqrt(num); i++)
                while (num % i == 0) {
                    num++;
                }
                return num;
            }
            //4
            public static double potencia() {
                Scanner sc = new Scanner(System.in);
                double num = numero();
                System.out.print("Introduce la potencia: ");
                double pot = sc.nextInt();
                double resultado = Math.pow(num, pot);
                return resultado;
            }
            //5
            public static int digitos() {
                int cantidadDigitos = String.valueOf(numero()).length();
                return cantidadDigitos;
            }
            //6
            public static int voltea() {

                String numero = String.valueOf(numero());
                String numeroVolteado = new StringBuilder(numero).reverse().toString();

                return Integer.parseInt(numeroVolteado);
            }




        }