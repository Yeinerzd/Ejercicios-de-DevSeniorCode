package Ejercicios;

public class Ejercicio5 {
    public static void main(String[] args) {
        /*
         * Estás interesado en comprarte un nuevo PC y en la tienda de tu barrio cuesta
         * 660€ con todos los accesorios incluidos. Sin embargo,
         * el vendedor te descuenta el 10% por pronto pago ¿Cuánto tienes que pagar en
         * total por el ordenador con todos los accesorios?
         */
        float precio = 660;
        float descuento = precio * 0.10f;
        System.out.println("El Valor a Pagar es de : " + (precio - descuento)); /*
                                                                                 * Después de aplicar un descuento del
                                                                                 * 10% sobre un precio de 660€,
                                                                                 * el valor a pagar es de 594€.
                                                                                 */
    }

}
