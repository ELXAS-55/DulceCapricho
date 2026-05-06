package dulcecapricho.modelo;

import java.util.ArrayList;

public class Inventario {
    
    private ArrayList<Producto> productos;
    
    public Inventario(){
        productos = new ArrayList<>();     
    }
    
    public void agregarproducto(Producto producto) {
        productos.add(producto);
    }
    
   
}
