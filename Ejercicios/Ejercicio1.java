package Ejercicios;
//En este reto deberás programar la operación matemática "6 / 2 ( 1 + 2 )" utilizando las instrucciones necesarias.

// ¿Cuál es el resultado correcto de la operación? ¿1 ó 9?
// Explique por que la otra calculadora genera un resultado diferente.

public class Ejercicio1 {
    public static void main(String[] args) {
        System.out.println("La respuesta es:" + (6 / 2 * (1 + 2)));/*
                                             * En este Ejercicio el resultado es 9, ya que primera mente se resuelven
                                             * los paréntesis
                                             * (1 + 2) quedando así: (6/2*3) y por ultimo realizar la división ya que
                                             * el código es ejecutado de izquierda a derecha por lo tanto el resultado
                                             * de (6 / 2) es multiplicado por
                                             * el resultado de la suma anterior siendo asi( 3 * 3 = 9 )
                                             */

    }

}
