
import java.io.Serializable;
import java.util.ArrayList;


public class Deporte implements Serializable{
    private ArrayList<Torneo> torneos = new ArrayList();
    private String  nombre;
private static final long serialVersionUID = 252345345378L;
    
    public Deporte() {
    }

    public Deporte(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    

    public ArrayList<Torneo> getTorneos() {
        return torneos;
    }

    public void setTorneos(ArrayList<Torneo> torneos) {
        this.torneos = torneos;
    }

    @Override
    public String toString() {
        return nombre;
    }
    
    
}
