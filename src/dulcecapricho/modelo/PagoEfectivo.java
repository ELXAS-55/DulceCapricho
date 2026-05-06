package dulcecapricho.modelo;


public class PagoEfectivo extends Pago {
    
    @Override
    public void procesarPago() {
        System.out.println("pago realizado en efectivo");
    }
    
}
