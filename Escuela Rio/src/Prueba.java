
import java.util.ArrayList;
import java.util.List;
import static javax.swing.JOptionPane.showInputDialog;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author lilol
 */
public class Prueba {

    public static void main(String[] args) {
        List<Maestro> maestro = new ArrayList();
        List<Alumno> alumno = new ArrayList();
        List<Tutor> tutor = new ArrayList();
        int salir = 1;
        do {
            int opcion = Integer.parseInt(showInputDialog("1.Maestros\n2.Alumnos\n3.Tutores"));
            switch (opcion) {
                case 1:
                    int salirmaestro = 0;
                    do {
                        switch (Integer.parseInt(showInputDialog("1.Agregar Maestro\n2.Mostrar Maestros\n3.Salir de Maestros"))) {
                            case 1:
                                maestro.add(new Maestro(maestro.size(), showInputDialog("Nombre del maestro " + maestro.size()), showInputDialog("Apellido del Maestro " + maestro.size()), showInputDialog("Correo del Maestro " + maestro.size())));
                                break;
                            case 2:
                                if (Integer.parseInt(showInputDialog("1.Mostrar por ID (me se el ID del Maestro)\n2.Mostrar todos los Maestros")) == 1) {
                                    System.out.println("Maestro:");
                                    maestro.get(Integer.parseInt(showInputDialog("¿Cual es el ID del Maestro?"))).imprimirPerfil();
                                    System.out.println("-----------------------------------");
                                } else {
                                    for (int i = 0; i < maestro.size(); i++) {
                                        System.out.println("Maestro:");
                                        maestro.get(i).imprimirPerfil();
                                        System.out.println("-----------------------------------");
                                    }
                                }
                                break;
                            default:
                                salirmaestro = 1;
                                break;
                        }
                    } while (salirmaestro != 1);
                    break;
                case 2:
                    int salirestudiante = 0;
                    do {
                        switch (Integer.parseInt(showInputDialog("1.Agregar Alumno\n2.Mostrar Alumnos\n3.Salir de Alumnos"))) {
                            case 1:
                                alumno.add(new Alumno(alumno.size(), showInputDialog("Nombre de Alumno " + alumno.size()), showInputDialog("Apellido del Alumno " + alumno.size()), showInputDialog("Correo del Alumno " + alumno.size())));
                                alumno.get(alumno.size() - 1).guardarCalificacion(Integer.parseInt(showInputDialog("¿Cual es la calificacion de " + alumno.get(alumno.size() - 1).getNombre() + "?")));
                                break;
                            case 2:
                                if (Integer.parseInt(showInputDialog("1.Mostrar por ID (me se el ID del Alumno)\n2.Mostrar todos los Alumnos")) == 1) {
                                    int id_alumno = Integer.parseInt(showInputDialog("¿Cual es el ID del Alumno?"));
                                    System.out.println("Alumno:");
                                    alumno.get(id_alumno).imprimirPerfil();
                                    System.out.println("Calificacion: " + alumno.get(id_alumno).mostrarCalificaciones());
                                    System.out.println("-----------------------------------");
                                    break;
                                } else {
                                    for (int i = 0; i < alumno.size(); i++) {
                                        System.out.println("Alumno:");
                                        alumno.get(i).imprimirPerfil();
                                        System.out.println("Calificacion: " + alumno.get(i).mostrarCalificaciones());
                                        System.out.println("-----------------------------------");
                                    }
                                    break;
                                }
                            default:
                                salirestudiante = 1;
                                break;
                        }
                    } while (salirestudiante != 1);
                    break;
                case 3:
                    int salirtutor = 0;
                    do {
                        switch (Integer.parseInt(showInputDialog("1.Agregar Tutor\n2.Mostrar Tutores\n3.Salir de Tutores"))) {
                            case 1:
                                tutor.add(new Tutor(tutor.size(), showInputDialog("Nombre de Tutor " + tutor.size()), showInputDialog("Apellido del Tutor " + tutor.size()), showInputDialog("Correo del Tutor " + tutor.size())));
                                tutor.get(tutor.size() - 1).setAlumno(alumno.get(Integer.parseInt(showInputDialog("Dame el ID del Alumno a asignar"))));
                                break;
                            case 2:
                                if (Integer.parseInt(showInputDialog("1.Mostrar por ID (me se el ID del Tutor)\n2.Mostrar todos los Tutores")) == 1) {
                                    int id_tutor = Integer.parseInt(showInputDialog("¿Cual es el ID del Tutor?"));
                                    System.out.println("Tutor:");
                                    tutor.get(id_tutor).imprimirPerfil();
                                    System.out.println("Nombre de alumno: " + tutor.get(id_tutor).getAlumno().getNombre());
                                    System.out.println("Apellido de alumno: " + tutor.get(id_tutor).getAlumno().getApellido());
                                    System.out.println("Correo de alumno: " + tutor.get(id_tutor).getAlumno().getCorreoElectronico());
                                    System.out.println("Calificacion del alumno: " + tutor.get(id_tutor).mostrarCalificaciones());
                                    System.out.println("-----------------------------------");
                                    break;
                                } else {
                                    for (int id_tutor = 0; id_tutor < alumno.size(); id_tutor++) {
                                        System.out.println("Tutor:");
                                        tutor.get(id_tutor).imprimirPerfil();
                                        System.out.println("Nombre de alumno: " + tutor.get(id_tutor).getAlumno().getNombre());
                                        System.out.println("Apellido de alumno: " + tutor.get(id_tutor).getAlumno().getApellido());
                                        System.out.println("Correo de alumno: " + tutor.get(id_tutor).getAlumno().getCorreoElectronico());
                                        System.out.println("Calificacion del alumno: " + tutor.get(id_tutor).mostrarCalificaciones());
                                        System.out.println("-----------------------------------");
                                    }
                                    break;
                                }
                            default:
                                salirtutor = 1;
                                break;
                        }
                    } while (salirtutor != 1);
                    break;
            }
        } while (salir != Integer.parseInt(showInputDialog("Desea Salir de la aplicacion?\n1. Si\n2. No")));
    }
}
