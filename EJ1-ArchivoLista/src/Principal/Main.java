
package Principal;
import ED.*;
/**
 *
 * @author emami
 */
public class Main {

   
    public static void main(String[] args) {
        Lista<String> lista = new Lista<>();
        ArchivoLista archivo = new ArchivoLista("Archivo.txt");
        lista.insertarPri("Archivo1");
        lista.insertarPri("Archivo2");
        lista.insertarPri("Archivo3");
        
      
            archivo.escribir(lista);
 
             archivo.leer();
    }
    
}
