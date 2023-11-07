package recursión;

import java.util.Queue;

public class Ejercicio4 {

    /*Escribir un método que tenga como argumentos dos colas del mismo tipo y devuelva
    cierto si las dos colas son idénticas.   
    Use la siguiente firma de método: public boolean identificarNumeroBinario(int numero)
    */
    
    public boolean compararColas(Queue<Integer> colaA, Queue<Integer> colaB) {
        if (colaA.size() != colaB.size()) {
            return false;
        }

        if (colaA.isEmpty()) {
            return true;
        }
        int a = colaA.poll();
        int b = colaB.poll();

        if (a == b) {
            return compararColas(colaA, colaB);
        } else {
            return false;
        }

    }
}
