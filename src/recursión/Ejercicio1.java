
package recursión;

public class Ejercicio1 {
    /*Implemente un método recursivo que imprima la cantidad de vocales de una palabra  
    Use la siguiente firma de método:public void imprimirVocales(String palabra)*/
    
    public void imprimirVocales(String palabra){
        if (!palabra.isEmpty()) {
          char x = palabra.charAt(0);
            if ((x == 'a') || (x == 'e') || (x == 'i') || (x == 'o') || (x == 'u')) {
                System.out.println(x);  
            }
            //Aplicamos recursión para invocar de nuevo el método y hacer que vuelva y valide si hay una vocal
            imprimirVocales(palabra.substring(1));
        }
    }
}
