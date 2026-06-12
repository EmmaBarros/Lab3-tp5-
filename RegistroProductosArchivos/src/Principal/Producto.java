
package Principal;

public class Producto {
   private String nombre;
   private double precio;

    public Producto(String nombre,double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }
    
     public Producto() {
        this.nombre = "";
        this.precio = 0;
    }
    

    @Override
    public String toString() {
        return "Producto \n" + "nombre :" + nombre + ", precio :" + precio + '}';
    }
   
   public static Producto fromString(String linea){
       //se corta la linea donde se deja la coma
     String[] partes = linea.split(",");
     if(partes.length == 2){//se verifica que tenga las 2 partes (nombre y precio)
         String nombre = partes[0]; //se asigna el nombre tal cual xq ya es texto
         double precio = Double.parseDouble(partes[1]);//pasameos el precio de string a double
         return new Producto(nombre,precio);//creamos y devolvemos el nuevo objeto Producto
     }
     return null;//si la linea esta vacia devolvemos null
   }
    
}
