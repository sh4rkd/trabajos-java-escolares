/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author lilol
 */
public class Tutor extends Datos_escolares implements iCalificacion {

    Alumno alumno;    
    
    public Tutor(int id, String nombre, String apellido, String correoElectronico) {
        super(id, nombre, apellido, correoElectronico);
    }

    @Override
    public int mostrarCalificaciones() {
       return this.alumno.mostrarCalificaciones();        
    }

    public Alumno getAlumno() {
        return alumno;
    }

    public void setAlumno(Alumno alumno) {
        this.alumno = alumno;
    }
    
    
}
