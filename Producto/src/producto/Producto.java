
package producto;


public class Producto {

   
    public static void main(String[] args) {
       
   
    private String nombre;
    private double precio;

    
    public Producto(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "nombre=" + nombre + ", precio=" + precio +", ";
    }
    
    
    public double calcular(int cantidad){
        return precio*cantidad;
    }
    
    
}
    
