import java.util.Scanner;
public class Ejercicio3 {
public static void main(String[] args) {
try (Scanner entrada = new Scanner(System.in)) {
    int numero1;
    int numero2;

    System.out.print("Ingrese ventas del vendedor 1: ");
    numero1 = entrada.nextInt();

    System.out.print("Ingrese ventas del vendedor 2: ");
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
        System.out.println("El vendedor 1 realizó mas ventas.");
    } else if (numero2 > numero1) {
        System.out.println("El vendedor 2 realizó mas ventas.");
    } else {
        System.out.println("Ambos vendedores realizaron las mismas ventas.");
    }

    // Calcular la diferencia entre ambos promedios
    int diferencia = Math.abs(numero1 - numero2);

    System.out.println("La diferencia de ventas es: S/" + diferencia);
}
  } // Fin del método main
} // Fin de la clase Lectura