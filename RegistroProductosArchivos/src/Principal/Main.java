
package Principal;


public class Main {

    public static void main(String[] args) {
        Producto[] p = new Producto[3]; 

        p[0] = new Producto("Prod1",60.50);
        p[1] = new Producto("Prod2",10.45);
        p[2] = new Producto("Prod3",100.25);
        
        //creacion del archivo 
        ArchivoProducto archivo = new ArchivoProducto("Productos.txt");
       
            archivo.escribir(p);
        
            archivo.leer();
    
    }   
}
