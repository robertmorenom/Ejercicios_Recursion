package recursión;

public class Ejercicio3 {

    /*Implmente un método que compruebe si un número es binario. 
    Un número es binario está formado unicamente por ceros y unos.  
    Use la siguiente firma de método: public boolean identificarNumeroBinario(int numero)
    */
    
    public boolean identificarNumeroBinario(int numero) {
        int ultimo = numero % 10;
        int recorte = numero / 10;
        if (numero == 0 || numero == 1) {
            return true;
        }

        if (ultimo == 0 || ultimo == 1) {
            return identificarNumeroBinario(recorte);
        } else {
            return false;
        }
    }
}
