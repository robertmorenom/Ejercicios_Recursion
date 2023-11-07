package recursión;

import java.util.LinkedList;
import java.util.Queue;

public class Cliente {

    public static void main(String[] args) {

        Ejercicio1 prueba = new Ejercicio1();
        prueba.imprimirVocales("Perrito");

        Ejercicio2 prueba2 = new Ejercicio2();
        int coincidencias = prueba2.contarCoincidencias("geologia", 'o');
        System.out.println("\nLas coincidencias son:" + coincidencias);

        Ejercicio3 prueba3 = new Ejercicio3();
        boolean esBinario = prueba3.identificarNumeroBinario((int) 0646462D);
        if (esBinario) {
            System.out.println("\nEl numero es binario");
        } else {
            System.out.println("\nEl numero NO es binario");
        }

        Ejercicio4 prueba4 = new Ejercicio4();
        Queue<Integer> colaA = new LinkedList<Integer>();
        Queue<Integer> colaB = new LinkedList<Integer>();
        for (int i = 0; i < 10; i++) {
            colaA.add(i);
            colaB.add(i - 1);
        }
        boolean sonIguales = prueba4.compararColas(colaA, colaB);
        if (sonIguales) {
            System.out.println("\nLas colas son identicas");
        } else {
            System.out.println("\nLas colas son diferentes");
        }

    }

}
