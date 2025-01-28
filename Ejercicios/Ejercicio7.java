package Ejercicios;

import java.util.Scanner;

public class Ejercicio7 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce el primer número: ");
        double numero1 = scanner.nextDouble();

        System.out.print("Introduce el segundo número: ");
        double numero2 = scanner.nextDouble();

        double suma = numero1 + numero2;
        double resta = numero1 - numero2;
        double multiplicacion = numero1 * numero2;
        double division = numero1 / numero2;

        System.out.println("Los Resultados son: ");
        System.out.println("Suma: " + suma);
        System.out.println("Resta: " + resta);
        System.out.println("Multiplicación: " + multiplicacion);
        System.out.println( "Divicion: " + (numero2 == 0 ? "No es posible Dividir " : division));

        scanner.close();
    }
}
