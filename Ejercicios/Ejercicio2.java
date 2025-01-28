package Ejercicios;

public class Ejercicio2 {
    public static void main(String[] args) {

        /*
         * En el mercado, podemos encontrar que el precio del producto Pernil Iberic
         * D'Engreix Llen. Azuaga en porción de 100 gramos cuesta 5,95€ y el vendedor
         * nos dice que el precio por kilo cuesta 29,75€. ¿Crees que es correcto el
         * precio?
         */
        float preciog = 5.95f;
        float precioKg = preciog * 10;
        System.out.println("El precio de Aguaza por kg es de: " + precioKg);
        /*
         * El precio es incorrecto ya que al hacer el calculo me arroja un valor de 59.5
         * € por Kg.
         * A 29.75 € le estaría cobrando el doble del precio correcto.
         */

    }
}
