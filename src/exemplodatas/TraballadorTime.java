
package exemplodatas;

import java.time.LocalDate;

/**
 *
 * @author acabezaslopez
 */
public class TraballadorTime {
      private String nombre;
    private LocalDate fechaAlta;
    private LocalDate fechaBaja;

    /**
     * Constructor por defecto.
     */
    public TraballadorTime() {
    }

    /**
     * Constructor por parámetros.
     *
     * @param nombre Nombre del trabajador.
     * @param fechaAlta Fecha en la que el trabajador se ha dado de alta.
     * @param fechaBaja Fecha en la que el trabajador se ha dado de baja.
     */
    public TraballadorTime(String nombre, LocalDate fechaAlta, LocalDate fechaBaja) {
        this.nombre = nombre;
        this.fechaAlta = fechaAlta;
        this.fechaBaja = fechaBaja;
    }

    // SETS:
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setFechaAlta(LocalDate fechaAlta) {
        this.fechaAlta = fechaAlta;
    }

    public void setFechaBaja(LocalDate fechaBaja) {
        this.fechaBaja = fechaBaja;
    }

    // GETS:
    public String getNombre() {
        return nombre;
    }

    public LocalDate getFechaAlta() {
        return fechaAlta;
    }

    public LocalDate getFechaBaja() {
        return fechaBaja;
    }

    /**
     * Método que devuelve los valores de los que está compuesto el elemento.
     *
     * @return Devuelve el conjunto de valores del que está compuesto.
     */
    @Override
    public String toString() {
        return "-----------------------------------------------------------"
                + "\nTrabajadorTime{" + "Nombre: " + nombre + ", fechaAlta: " + fechaAlta + ", fechaBaja: " + fechaBaja;
    }
}
