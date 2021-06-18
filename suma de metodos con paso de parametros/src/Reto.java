/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author lilol
 */
public class Reto {
    public String suma(int valor1,int valor2){
        return "El resultado es: "+(valor1+valor2);
    }
    
    public static void main(String[] args) {
        int b = 0;
        Reto a = new Reto();
        System.out.println(a.suma(10,5));
    }
}
