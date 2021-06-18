
import java.text.DecimalFormat;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


public class TarjetaCredito extends Cuenta_base {
    
    public TarjetaCredito(double apertura){
        this.setMontoActual(apertura);
        System.out.println("Se ha aperturado una Tarjeta de credito con $"+this.getMontoActual());
    }
    
    @Override
    public void depositar(double cantidad) {
        super.depositar(cantidad);
        
    }

    public void sumaIntereses(double cantidad){
        this.setMontoActual((this.getMontoActual()+cantidad)+((this.getMontoActual()+cantidad)*.15));
        System.out.println("Se añadieron $"+cantidad+" a los intereses\nEl monto actual es $"+new DecimalFormat("#.00").format(this.getMontoActual()));
    }
}
