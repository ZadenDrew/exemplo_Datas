
package exemplodatas;

import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author acabezaslopez
 */
public class Time {
     
    List<TraballadorTime> listaTrabajadorTime = new ArrayList();
    DateTimeFormatter fechaFormat = DateTimeFormatter.ofPattern("dd/LL/yyyy");

    /**
     * Método que crea una lista de trabajadores.
     */
    public void crearLista() {
        listaTrabajadorTime.add(new TraballadorTime("Ana", LocalDate.of(2015, Month.JANUARY, 21), LocalDate.of(2018, Month.MAY, 8)));
    }
    
    /**
     * Método que permite ver la fecha en la que se ha dado de alta un
     * trabajador.
     */
    public void verFechaAlta() {
        listaTrabajadorTime.stream().map((ltt) -> ltt.getFechaAlta()).forEach(System.out::println);
    }

    /**
     * Método que permite ver el tiempo que ha transcurrido entre la fecha de
     * alta y la de baja.
     */
    public void verTiempoEntreFechas() {
        listaTrabajadorTime.stream().map((ltt) -> (ltt.getFechaBaja().getYear() - ltt.getFechaAlta().getYear())).forEach(System.out::println);
    }

    /**
     * Método que permite ver los años de antigüedad de un trabajador.
     */
    public void añosAntiguedad() {
        listaTrabajadorTime.stream().map((ltt) -> (ltt.getFechaBaja().getYear() - ltt.getFechaAlta().getYear())).forEach(System.out::println);
    }
    
    public void formatearFecha() {
        System.out.println(fechaFormat.format(LocalDate.now()));
        
    }
}
