
import javax.swing.JProgressBar;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author roliv
 */
public class HiloProgress extends Thread{
    private JProgressBar barra;
    private Deporte depo;
    private boolean vive, avanzar;

    public HiloProgress(JProgressBar barra, Deporte depo) {
        this.barra = barra;
        avanzar = true;
        vive=true;
        this.depo = depo;
    }

    public JProgressBar getBarra() {
        return barra;
    }

    public void setBarra(JProgressBar barra) {
        this.barra = barra;
    }

    public boolean isVive() {
        return vive;
    }

    public void setVive(boolean vive) {
        this.vive = vive;
    }

    public boolean isAvanzar() {
        return avanzar;
    }

    public void setAvanzar(boolean avanzar) {
        this.avanzar = avanzar;
    }
    
    @Override
    public void run(){
        long tiempo = (long)depo.getTorneos().size()/7;
        int max = (int) tiempo;
        barra.setMaximum(max);
        while(vive){
            if (avanzar) {
                
                barra.setValue(barra.getValue()+1);
                if (barra.getValue() == tiempo){
                    vive = false;
                }
            }
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
            }
        }
    }
}
