package co.com.k4soft.tarifa.model;


import co.com.k4soft.tarifa.model.businessexception.BusinessException;


public class Validator {


    public static void validarObjetoNulo(Object object, String mensaje) throws BusinessException {
        if(object == null){
            throw new BusinessException(mensaje);
        }
    }

    public static void validarValorCero(double valor, String mensaje) throws BusinessException {
        if(valor == 0){
            throw new BusinessException(mensaje);
        }
    }

    public static void validarCadenaVacia(String cadena, String mensaje) throws BusinessException {
        if(cadena == null || "".equals(cadena)){
            throw new BusinessException(mensaje);
        }
    }
}
