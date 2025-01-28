package Ejercicios;

public class Ejercicio6 {
    public static void main(String[] args) {

        /*
         * Para aprovechar la temporada de rebajas he salido de compras.
         * He pagado 34€ por unos pantalones que tenían un descuento del 15%. ¿Qué
         * precio tenían antes
         * de aplicar el descuento?
         */
        float precioFinal = 34.00f;
        float descuento = 15.00f;
        float precioOriginal = precioFinal / (1 - (descuento / 100));

        System.out.println("El precio Inicial de los pantalones era de: " + precioOriginal);
        //El precio original de los pantalones antes del descuento era 40.0€. 
    }

}
