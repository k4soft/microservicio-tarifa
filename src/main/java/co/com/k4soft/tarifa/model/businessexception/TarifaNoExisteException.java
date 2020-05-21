package co.com.k4soft.tarifa.model.businessexception;

public class TarifaNoExisteException extends RuntimeException {
    public TarifaNoExisteException(String mensaje) {
        super(mensaje);
    }
}
