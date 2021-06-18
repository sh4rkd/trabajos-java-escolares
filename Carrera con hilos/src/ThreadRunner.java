
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTextArea;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author lilol
 */
public class ThreadRunner extends Thread {

    private Runner runner;
    private JTextArea txt;

    public ThreadRunner(Runner runner, JTextArea txt) {
        this.runner = runner;
        this.txt = txt;
    }

    @Override
    public void run() {
        try {
            long TInicio = System.currentTimeMillis();
            int time = runner.getSpeed() * 1000;
            Thread.sleep(time);
            long TFin = System.currentTimeMillis();
            if(txt.getText().length()>0){
                String v[]=txt.getText().split("\n");
                v[v.length-1]=(v.length+1)+" - " + runner.getName() + " - Tiempo: " + (TFin - TInicio)/1000 + " segundos" + "\n";
                txt.setText(txt.getText()+v[v.length-1]);
            }else{             
                txt.setText("1 - " + runner.getName() + " - Tiempo: " + (TFin - TInicio)/1000 + " segundos" + "\n");   
            }
            System.out.println("finalice");

        } catch (InterruptedException ex) {
            Logger.getLogger(ThreadRunner.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
