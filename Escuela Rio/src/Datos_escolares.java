/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author lilol
 */
public abstract class Datos_escolares {    
    private int id;
    private String nombre;
    private String apellido;
    private String correoElectronico;

    public Datos_escolares(int id, String nombre, String apellido, String correoElectronico) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.correoElectronico = correoElectronico;
    }
   
    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }
    
    public void imprimirPerfil(){
        System.out.println("ID: "+this.getId()+"\nNombre: "+this.getNombre()+"\nApellido: "+this.getApellido()+"\nEmail: "+this.getCorreoElectronico());
    }
}
