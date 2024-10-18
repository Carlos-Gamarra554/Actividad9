import org.w3c.dom.ls.LSOutput;
import java.util.Scanner;

        public class Ejercicio1 {
            public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);

                System.out.print("1. Números Capicúa\n" +
                        "2. Números primos\n" +
                        "3. Siguiente número primo\n" +
                        "4. Potencias\n" +
                        "5. Número de dígitos\n" +
                        "6. Voltea el número\n" +
                        "7. digitoN\n" +
                        "8. Posición del dígito\n" +
                        "9. Quita por detrás\n" +
                        "10. Quita por delante\n" +
                        "11. Pegar por detrás\n" +
                        "12. Pegar por delante\n" +
                        "13. Trozo de número\n" +
                        "14. Juntar números\n" +
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
                        System.out.println("El carácter en dicha posición es: " + digitoN());
                        break;
                    case 8:
                        System.out.println("Posición de dígito!");
                        System.out.println("El dígito en la posición elegida es: " + posicionDeDigito());
                        break;
                    case 9:
                        System.out.println("Quita números por detrás!");
                        System.out.println("El resultado es: " + quitaPorDetras());
                        break;
                    case 10:
                        System.out.println("Quita números por delante!");
                        System.out.println("El resultado es: " + quitarPorDelante());
                        break;
                    case 11:
                        System.out.println("Pega por detrás!");
                        System.out.println("El resultado es: " + pegarPorDetras());
                        break;
                    case 12:
                        System.out.println("Pega por delante!");
                        System.out.println("El resultado es: " + pegarPorDelante());
                        break;
                    case 13:
                        System.out.println("Trozo de número!");
                        System.out.println("El resultado es: " + trozoDeNumero());
                        break;
                    case 14:
                        System.out.println("Junta números!");
                        System.out.println("El resultado es: " + juntaNumeros());
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
                return sc.nextInt();
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
            //7
            public static int digitoN() {
                Scanner sc = new Scanner(System.in);
                int num = numero();
                System.out.print("Introduce la posición que quieres saber: ");
                int posicion = sc.nextInt();

                return (num / (int) Math.pow(10, posicion - 1)) % 10;
            }
            //8
            public static int posicionDeDigito() {
                Scanner sc = new Scanner(System.in);
                int numero = numero();
                System.out.print("Introduce la posición que desees saber: ");
                int num2 = sc.nextInt();
                int resultado = 0;
                String num = Integer.toString(numero);

                for (int i = 0; i < num.length(); i++) {
                    if (num.charAt(i) == (char) (num2 + '0')) {
                        return i + 1;
                    }
                    resultado = i + 1;
                }
                return resultado;
            }
            //9
            public static int quitaPorDetras() {
                Scanner sc = new Scanner(System.in);
                int num = numero();
                System.out.print("Introduce la cantidad de números que quieres quitar: ");
                int quitar = sc.nextInt();

                return (num / (int) (Math.pow(10, quitar)));

            }
            //10
            public static int quitarPorDelante() {
                Scanner sc = new Scanner(System.in);
                int num = numero();
                System.out.print("Introduce la cantidad de números que quieres quitar: ");
                int quitar = sc.nextInt();
                String numero = String.valueOf(Math.abs(num));

                if (quitar >= numero.length()) {
                    return 0;
                }
                String resultado = numero.substring(quitar);
                return Integer.parseInt(resultado);
            }
            //11
            public static int pegarPorDetras() {
                Scanner sc = new Scanner(System.in);
                int num = numero();
                System.out.print("Introduce los números que quieres pegar: ");
                int pegar = sc.nextInt();

                if (pegar < 0 || pegar > 9) {
                    System.out.print("Introduce el número de nuevo: ");
                    return num;
                }
                return num * 10 + pegar;
            }
            //12
            public static int pegarPorDelante() {
                Scanner sc = new Scanner(System.in);
                int num = numero();
                System.out.print("Introduce los números que quieres pegar: ");
                int num2 = num;
                int pegar = sc.nextInt();
                int numDigitos = 0;

                while (num2 > 0) {
                    num2 = num2 / 10;
                    numDigitos++;
                }
                return num + (pegar * (int) Math.pow(10, numDigitos));
            }
            //13
            public static int trozoDeNumero() {
                Scanner sc = new Scanner(System.in);
                int num = numero();
                System.out.print("Introduce el dígito de comienzo: ");
                int inicio = sc.nextInt();
                System.out.print("Introduce el dígito del final: ");
                int fin = sc.nextInt();
                String numStr = Integer.toString(num);

                if (inicio < 0 || fin >= numStr.length() || inicio > fin) {
                    System.out.println("Índices inválidos.");
                    return -1;
                }
                String trozoNum = numStr.substring(inicio -1, fin);

                return Integer.parseInt(trozoNum);
            }
            //14
            public static int juntaNumeros() {
                Scanner sc = new Scanner(System.in);
                int num = numero();
                System.out.print("Introduce el número que quieras pegar: ");
                int pegarNum = sc.nextInt();
                int numDigitos = Integer.toString(pegarNum).length();

                return num * (int) Math.pow(10, numDigitos) + pegarNum;
            }
        }
