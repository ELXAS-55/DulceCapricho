package dulcecapricho;

import dulcecapricho.modelo.Inventario;
import dulcecapricho.modelo.Producto;
import dulcecapricho.modelo.Pago;
import dulcecapricho.modelo.PagoEfectivo;
import dulcecapricho.modelo.PagoTransferencia;

public class DulceCapricho {


    public static void main(String[] args) {
        Inventario inventario = new Inventario();
        
        Producto oreo = new Producto("postre oreo", 7.000, 10);
        inventario.agregarproducto(oreo);
        
        Producto arequipe = new Producto("postre de arequipe", 7.000, 8);
        inventario.agregarproducto(arequipe);
        
        Producto leche = new Producto("postre de tres leches", 7.000, 5);
        inventario.agregarproducto(leche);
        
        try {
            oreo.vender(15);
        }catch (Exception e) {
           System.out.println(e.getMessage());
        }
        
        Pago pago1 = new PagoEfectivo();
        Pago pago2 = new PagoTransferencia();
        
        pago1.procesarPago();
        pago2.procesarPago();
        
        System.out.println("Productos cargados correctamente");
   
    }
    
}
