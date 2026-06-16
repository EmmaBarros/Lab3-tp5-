
package Principal;
import ED.*;
import java.io.*;

/**
 *
 * @author emami
 */
public class ArchivoLista {
    private String archRuta;

    public ArchivoLista(String ruta) {
        this.archRuta = ruta;
    }
    
    
    
    public void escribir(Lista<String> lista){
        try(BufferedWriter writer = new BufferedWriter(new FileWriter(this.archRuta))){
        Nodo<String> p = lista.inicio();
        while( p!=null ){
            writer.write(p.getDato());
            writer.newLine();
            p = p.getPs();
        }
            System.out.println("Archivo escrito correctamente");
        }catch(IOException e){
            System.out.println("Error al escribir archivo "+e.getMessage());        
        }
    }
    
    public void leer(){
        System.out.println("Lectura archivo Lista");
        try(BufferedReader reader = new BufferedReader(new FileReader(this.archRuta))){
            String linea;
            Lista<String> lista = new Lista<>();

            while((linea = reader.readLine())!= null ){
                lista.insertarPri(linea);            
            }
            System.out.println("elementos leidos correctamente");
            lista.visualizar();
        }catch(IOException e){
            System.out.println("error al leer el archivo : "+e.getMessage());
        }
    }
}
