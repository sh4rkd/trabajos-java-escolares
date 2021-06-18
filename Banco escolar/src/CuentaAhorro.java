
import java.text.DecimalFormat;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


public class CuentaAhorro extends Cuenta_base{
    public CuentaAhorro(double apertura){
        this.setMontoActual(apertura);
        System.out.println("Se ha aperturado una Cuenta de Ahorro con $"+this.getMontoActual());
    }
    
    @Override
    public void depositar(double cantidad) {
        super.depositar(cantidad);
    }

    public void invertir(double cantidad){
        this.setMontoActual((this.getMontoActual()+cantidad)+((this.getMontoActual()+cantidad)*.10));
        System.out.println("Se han invertido $"+cantidad+"\nTu saldo actual es de $"+new DecimalFormat("#.00").format(this.getMontoActual()));
    }
}
