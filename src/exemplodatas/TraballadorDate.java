package exemplodatas;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author acabezaslopez
 */
public class TraballadorDate {

    private String nome;
    private Date dataAlta, dataBaixa;
    private SimpleDateFormat fch;

    public TraballadorDate() {
    }

    /**
     * Constructor por parámetros.
     *
     * @param nombre Nombre del trabajador.
     * @param fechaAlta Fecha en la que el trabajador se ha dado de alta.
     * @param fechaBaja Fecha en la que el trabajador se ha dado de baja.
     */
    public TraballadorDate(String nombre, Date dataAlta, Date dataBaja) {
        this.nome = nombre;
        this.dataAlta = dataAlta;
        this.dataBaixa = dataBaixa;
    }

    // SETS:
    public void setNombre(String nome) {
        this.nome = nome;
    }

    public void setFechaAlta(Date dataAlta) {
        this.dataAlta = dataAlta;
    }

    public void setFechaBaja(Date dataBaixa) {
        this.dataBaixa = dataBaixa;
    }

    // GETS:
    public String getNombre() {
        return nome;
    }

    public Date getFechaAlta() {
        return dataAlta;
    }

    public Date getFechaBaja() {
        return dataBaixa;
    }

    /**
     * Método que devuelve los valores de los que está compuesto el elemento.
     *
     * @return Devuelve el conjunto de valores del que está compuesto.
     */
    @Override
    public String toString() {
        return "-----------------------------------------------------------"
                + "\nTrabajadorDate{" + "Nombre: " + nome + ", fechaAlta: " + dataAlta + ", fechaBaja: " + dataBaixa;
    }

}
