package co.com.k4soft.tarifa;


import co.com.k4soft.tarifa.model.Tarifa;
import co.com.k4soft.tarifa.model.businessexception.BusinessException;
import org.junit.Rule;
import org.junit.jupiter.api.Test;
import org.junit.rules.ExpectedException;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;


@RunWith(SpringRunner.class)
@SpringBootTest
public class TarifaTest {

    @Rule
    public final ExpectedException exception = ExpectedException.none();


    @Test
    public void crearTarifaSinPrecio() throws Exception {
        exception.expect(BusinessException.class);
        exception.expectMessage(Tarifa.VALOR_PRECIO_REQUERIDO);
        Tarifa tarifa = new Tarifa.TarifaBuilder().build();
    }

    @Test
    public void crearTarifaConPrecioCero() throws Exception {
        exception.expect(BusinessException.class);
        exception.expectMessage(Tarifa.VALOR_PRECIO_REQUERIDO);
        Tarifa tarifa = new Tarifa.TarifaBuilder().setPrecio(0).build();
    }

    @Test
    public void crearTarifaConSinNombre() throws Exception {
        exception.expect(BusinessException.class);
        exception.expectMessage(Tarifa.NOMBRE_TARIFA_NO_PUEDE_SER_VACIO);
        Tarifa tarifa = new Tarifa.TarifaBuilder().setPrecio(1500).build();
    }

    @Test
    public void crearTarifaConConNombreVacio() throws Exception {
        exception.expect(BusinessException.class);
        exception.expectMessage(Tarifa.NOMBRE_TARIFA_NO_PUEDE_SER_VACIO);
        Tarifa tarifa = new Tarifa.TarifaBuilder().setPrecio(1500).setNombre("").build();
    }

    @Test
    public void insertarTarifaSinId() throws Exception {
        exception.expect(BusinessException.class);
        exception.expectMessage(Tarifa.ID_TARIFA_DEBE_SER_OBLIGATORIO);
        Tarifa tarifa = new Tarifa.TarifaBuilder().setPrecio(1500).setNombre("Automóvil").build();
    }







}