package dulcecapricho.modelo;

public class Producto {
    
    private String nombre;
    private double precio;
    private int stock;
    
    public Producto(String nombre, double precio, int stock) {
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
        
    }
    public String getNombre(){
        return nombre;
    }
    public double precio(){
        return precio;
    }
    public int stock(){
        return stock;
    }    
        
    public void vender(int cantidad) throws Exception{
        if (cantidad > stock) {
            throw new Exception("stock insuficiente"); 
        }
        
        stock -= cantidad;
    }    
}
