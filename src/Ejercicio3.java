public class Ejercicio3 {
    public static void main(String[] args) {

        System.out.println("Lista de los primeros 99999 números capicúa!");

        int contador = 0;
        int num = 1;

        while (contador <= 99999) {
            if (esCapicua(contador)) {
                System.out.println(contador);
                contador++;
            }
        }
    }

    public static boolean esCapicua(int num) {
        int numero = num;
        int numeroVolteado = 0;

        while (num != 0) {
            int digito = num % 10;
            numeroVolteado = numeroVolteado * 10 + digito;
            num /= 10;
        }
        if (numero == numeroVolteado) {
            return true;
        } else {
            return false;
        }
    }
}