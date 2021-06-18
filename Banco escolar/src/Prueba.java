/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

public class Prueba {
    public static void main(String[] args) {
        TarjetaCredito tarjetacredito = new TarjetaCredito(100);
        tarjetacredito.depositar(0);
        tarjetacredito.sumaIntereses(10);
        System.out.println("-----------------------------------------------------");
        TarjetaDebito tarjetadebito = new TarjetaDebito(100);
        tarjetadebito.depositar(500);
        tarjetadebito.retirar(700);
        System.out.println("-----------------------------------------------------");
        CuentaAhorro cuentaahorro = new CuentaAhorro(900.25);
        cuentaahorro.depositar(500);
        cuentaahorro.invertir(600);
        
    }
}
