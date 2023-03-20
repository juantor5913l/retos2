import java.util.Scanner;

public class reto1 {

    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);
        String[] palabras = {"Call of duty"};
        String palabraAdivinar = palabras[(int) (Math.random() * palabras.length)];
        char[] letrasCorrectas = new char[palabraAdivinar.length()];
        int intentos = 0;
        boolean descubrir = false;

        System.out.println("Categoria Juegos");

        while (!descubrir && intentos < 10) {
            System.out.print("Ingrese una letra: ");
            char letra = lectura.next().charAt(0);
            boolean letraCorrecta = false;

            for (int i = 0; i < palabraAdivinar.length(); i++) {
                if (palabraAdivinar.charAt(i) == letra) {
                    letrasCorrectas[i] = letra;
                    letraCorrecta = true;
                }
            }

            if (!letraCorrecta) {
                intentos++;
                System.out.println("Letra incorrecta. Te quedan " + (10 - intentos) + " intentos.");
            }

            System.out.println(letrasCorrectas);

            if (palabraAdivinar.equals(String.valueOf(letrasCorrectas))) {
                descubrir = true;
                System.out.println("¡Ganaste!");
            }
        }

        if (!descubrir) {
            System.out.println("Perdiste. La palabra era " + palabraAdivinar);
        }

        lectura.close();
    }
}
