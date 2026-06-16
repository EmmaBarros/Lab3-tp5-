
package Principal;
import java.io.*;
/**
 *
 * @author pc
 */
public class ArchivoProducto {
    private String rutaArch;

    public ArchivoProducto(String ruta) {
        this.rutaArch = ruta;
    }
 
     public void escribir(Producto[] p){
         try(BufferedWriter writer = new BufferedWriter(new FileWriter(this.rutaArch))){//se crea el fileWriter abriendo el canal hacia la ruta del archivo
             for(Producto prod : p){//recorre el vector productos 
                 writer.write(prod.toString());//agarra el producto actual y mediante el toString lo guarda en la memoria intermedia del archivo
                 writer.newLine();//mete un salto de linea o enter para poner una linea arriba de la otra
             }
             System.out.println("Archivo escrito Correctamente");
         }catch(IOException e){
             System.out.println("Error al escribir el archivo "+e.getMessage()
             );
         }
     }
     
     public void leer(){
         System.out.println("Lectura Arhivo");
         try(BufferedReader reader = new BufferedReader(new FileReader(this.rutaArch))){//se crea el FileReader con la ruta del archivo
             String linea; // variable temporal utilizada para almacenar las lineas del archivo
             while((linea = reader.readLine()) != null){ // el lector saca un renglon completo y lo guarda en la variable preguntando si no es nula
                 Producto prod = Producto.fromString(linea); //utiliza el metodo fromString separando por coma los parametros y devlviendo en una variable forma de producto
                 if(prod != null){// si el renglon no es nulo se muestra los atributos ya parseados
                     System.out.println("Nombre : "+prod.getNombre()+"Precio : "+prod.getPrecio());
                 }
             }
         }catch(IOException e){//se lanza la excepcion por cualquier erro de archivo presentado 
             System.out.println("Error al leer el earchivo : "+e.getMessage());
         }
     }
}
