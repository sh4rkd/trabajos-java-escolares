
import java.text.DecimalFormat;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


public class TarjetaDebito extends Cuenta_base{
    public TarjetaDebito(double apertura){
       this.setMontoActual(apertura);
        System.out.println("Se ha aperturado una Tarjeta de debito con $"+this.getMontoActual());
    }
    
    @Override
    public void depositar(double cantidad) {
        super.depositar(cantidad); 
    }

    public void retirar(double cantidad){
        if(cantidad < this.getMontoActual()){
            this.setMontoActual(this.getMontoActual()-cantidad);
            System.out.println("Se ha retirado $"+cantidad+"\nTu saldo actual es: $"+new DecimalFormat("#.00").format(this.getMontoActual()));
        }else{
            System.out.println("No puedes retirar $"+cantidad+" Solo dispones de $"+new DecimalFormat("#.00").format(this.getMontoActual()));
            
            System.out.println(new TarjetaCredito(100).toString());
        }
    }
}
