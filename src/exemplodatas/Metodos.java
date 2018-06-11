
package exemplodatas;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author acabezaslopez
 */
public class Metodos {
        List<TraballadorDate> listaTrabajadorDate = new ArrayList();

    /**
     * Método que crea una lista de trabajadores.
     */
    public void crearLista() {
        listaTrabajadorDate.add(new TraballadorDate("Ana", Date.from(Instant.ofEpochSecond(1425254400)), Date.from(Instant.now())));
    }

    /**
     * Método que permite ver la fecha en la que se ha dado de alta un
     * trabajador.
     */
    public void verFechaAlta() {
        listaTrabajadorDate.stream().map((ltd) -> ltd.getFechaAlta()).forEach(System.out::println);
    }

    /**
     * Método que permite ver el tiempo que ha transcurrido entre la fecha de
     * alta y la de baja.
     */
    public void verTiempoEntreFechas() {
        listaTrabajadorDate.stream().map((ltd) -> (ltd.getFechaBaja().getTime() - ltd.getFechaAlta().getTime()) / (31556900000.0)).forEach(System.out::println);
    }

    /**
     * Método que permite ver los años de antigüedad de un trabajador.
     */
    public void añosAntiguedad() {
        listaTrabajadorDate.stream().map((ltd) -> (ltd.getFechaBaja().getTime() - ltd.getFechaAlta().getTime()) / (31556900000.0)).forEach(System.out::println);
    }

}
