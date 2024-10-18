public class Ejercicio2 {
    public static void main(String[] args) {

        System.out.println("Lista de los primeros 1000 números primos!");

        int contador = 0;
        int num = 2;

        while (contador < 1000 && num < 1000) {
            if (esPrimo(contador)) {
                System.out.println(contador);
                contador++;
            }
        }
    }
        public static boolean esPrimo(int num){
                for (int i = 2; i < Math.sqrt(num); i++) {
                    if (num % i == 0) {
                        return false;
                    }
                }
            return true;
    }
}