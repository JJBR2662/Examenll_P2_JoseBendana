
import java.util.ArrayList;

    /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author roliv
 */
public class Torneo {
    private String nombre, periodo;
    private ArrayList<Equipo> equipos = new ArrayList();
    private ArrayList<Partido> partidos = new ArrayList();

    public Torneo(String nombre, String periodo) {
        this.nombre = nombre;
        this.periodo = periodo;
    }

    public Torneo() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Equipo> getEquipos() {
        return equipos;
    }

    public void setEquipos(ArrayList<Equipo> equipos) {
        this.equipos = equipos;
    }

    public ArrayList<Partido> getPartidos() {
        return partidos;
    }

    public void setPartidos(ArrayList<Partido> partidos) {
        this.partidos = partidos;
    }

    public String getPeriodo() {
        return periodo;
    }

    public void setPeriodo(String periodo) {
        this.periodo = periodo;
    }
    
    

    @Override
    public String toString() {
        return nombre ;
    }
     
     
}
