package recursión;

public class Ejercicio2 {

    /*Implmente un método que imprima la cantidad de ocurrencias de determinada 
    letra dentro de una palabra. Use la siguiente firma de método: public int contarCoincidencias(String texto, char letra)
    */
    
    public int contarCoincidencias(String texto, char letra) {
        if (texto.isEmpty()) {
            return 0;
        }
        int contador = 0;
        if (texto.charAt(0) == letra) {
            contador++;
        }
        contador += contarCoincidencias(texto.substring(1), letra);
        return contador;

    }

}
