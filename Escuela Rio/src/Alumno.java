/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author lilol
 */
public class Alumno extends Datos_escolares implements iCalificacion{
    private int calificacion;
    
    public Alumno(int id, String nombre, String apellido, String correoElectronico) {
        super(id, nombre, apellido, correoElectronico);
    }

    @Override
    public int mostrarCalificaciones() {
       return this.calificacion;
    }

    public void guardarCalificacion(int calificacion) {
        this.calificacion=calificacion;
    }
    
}
