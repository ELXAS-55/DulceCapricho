package dulcecapricho.modelo;

public class PagoTransferencia extends Pago {
    
    @Override
    public void procesarPago() {
        System.out.println("pago realizado por transferencia");
    }
    
}
