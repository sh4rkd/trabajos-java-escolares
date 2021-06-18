/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


public class Cuenta_base {
    private double montoActual;
    
    public void depositar(double cantidad){
        this.montoActual = montoActual + cantidad;          
        System.out.println("Se han depositado $"+cantidad+"\nTu Saldo actual es de $"+this.getMontoActual());
    }

    public double getMontoActual() {
        return montoActual;
    }

    public void setMontoActual(double montoActual) {
        this.montoActual = montoActual;
    }
    
}
