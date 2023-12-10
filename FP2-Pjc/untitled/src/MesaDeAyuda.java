
import java.util.ArrayList;
import java.util.List;

public class MesaDeAyuda {
    private String nombre;
    private List<Incidencia> listaIncidencia;

    public MesaDeAyuda(String nombre) {
        this.nombre = nombre;
        this.listaIncidencia = new ArrayList<>();
    }

    public void agregarIncidencia(Incidencia incidencia) {
        this.listaIncidencia.add(incidencia);
    }

    @Override
    public String toString() {
        return "MesaDeAyuda{" +
                "nombre='" + nombre + '\'' +
                ", listaIncidencia=" + listaIncidencia +
                '}';
    }
}
