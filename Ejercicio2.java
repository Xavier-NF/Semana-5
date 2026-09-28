import java.util.Scanner;
public class Ejercicio2 {
public static void main(String[] args) {
try (Scanner entrada = new Scanner(System.in)) {
    int numero1;
    int numero2;

    System.out.print("Ingrese sueldo 1: ");
    numero1 = entrada.nextInt();

    System.out.print("Ingrese sueldo 2: ");
    numero2 = entrada.nextInt();

    System.out.println();

    System.out.print(numero1 + " es mayor que " + numero2 + ": ");
    System.out.println(numero1 > numero2);

    System.out.print(numero1 + " es menor que " + numero2 + ": ");
    System.out.println(numero1 < numero2);

    System.out.print(numero1 + " es mayor o igual que " + numero2 + ": ");
    System.out.println(numero1 >= numero2);

    System.out.print(numero1 + " es menor o igual que " + numero2 + ": ");
    System.out.println(numero1 <= numero2);

    System.out.print(numero1 + " es igual a " + numero2 + ": ");
    System.out.println(numero1 == numero2);

    System.out.print(numero1 + " es diferente de " + numero2 + ": ");
    System.out.println(numero1 != numero2);

    System.out.println();

    // Determinar cuál estudiante obtuvo el mejor promedio
    if (numero1 > numero2) {
        System.out.println("El practicante 1 gana mas.");
    } else if (numero2 > numero1) {
        System.out.println("El practicante 2 gana mas.");
    } else {
        System.out.println("Ambos ganan lo mismo.");
    }

    // Calcular la diferencia entre ambos promedios
    int diferencia = Math.abs(numero1 - numero2);

    System.out.println("La diferencia salarial es: " + diferencia);
}
  } // Fin del método main
} // Fin de la clase Lectura