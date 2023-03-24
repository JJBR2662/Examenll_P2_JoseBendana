
public class Partido {
    private String nombre1, nombre2;
    private int punt1, punt2;
    
    public Partido(){
        
    }

    public Partido(String nombre1, String nombre2, int punt1, int punt2) {
        this.nombre1 = nombre1;
        this.nombre2 = nombre2;
        this.punt1 = punt1;
        this.punt2 = punt2;
    }

    public String getNombre1() {
        return nombre1;
    }

    public void setNombre1(String nombre1) {
        this.nombre1 = nombre1;
    }

    public String getNombre2() {
        return nombre2;
    }

    public void setNombre2(String nombre2) {
        this.nombre2 = nombre2;
    }

    public int getPunt1() {
        return punt1;
    }

    public void setPunt1(int punt1) {
        this.punt1 = punt1;
    }

    public int getPunt2() {
        return punt2;
    }

    public void setPunt2(int punt2) {
        this.punt2 = punt2;
    }

    @Override
    public String toString() {
        return "Partido{" + "nombre1=" + nombre1 + ", nombre2=" + nombre2 + ", punt1=" + punt1 + ", punt2=" + punt2 + '}';
    }
    
    
    
}
