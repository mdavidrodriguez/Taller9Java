
package Ejercicio1;

import Ejercicio1.IAlumno.Alumno;
import static Ejercicio1.IAlumno.imprimeArrayAlumnos;
import java.util.Arrays;
public class Test {
    public static void main(String[] args) {
        Alumno[] arrayAlumnos = new Alumno[7];
        arrayAlumnos[0] = new Alumno("Mateo", "Rodriguez", "Luis", "Masculino", "Ninguna", 4.0);
        arrayAlumnos[1] = new Alumno("Carlos", "Mejia", "Camilo", "Masculino", "Ninguna", 3.2);
        arrayAlumnos[2] = new Alumno("Alberto", "Perez", "Ramon", "Masculino", "Ninguna", 3.5);
        arrayAlumnos[3] = new Alumno("Luisa", "Ramos", "Jorge", "Femenino", "Ninguna", 2.5);
        arrayAlumnos[4] = new Alumno("Marta", "Sierra", "Gabriel", "Femenino", "Ninguna", 1.5);
        arrayAlumnos[5] = new Alumno("Alejandra", "Montero", "Jose", "Femenino", "Ninguna", 3.1);
        arrayAlumnos[6] = new Alumno("Andres", "Daza", "Manuel", "Masculino", "Ninguna", 1.0);
        
        System.out.println("Alumnos sin ordenar");
        System.out.println("Asignatura: Algortimos Y Programacion III");
        System.out.println("-------------------------------------------------");
        imprimeArrayAlumnos(arrayAlumnos);
        Arrays.sort(arrayAlumnos);
        System.out.println("\nOrdenamiento de Acuerdo a la Nota Final");
        System.out.println("Asignatura: Algortimos Y Programacion III");
        System.out.println("---------------------------------------------------");
        imprimeArrayAlumnos(arrayAlumnos);
        
    
}
    
}
    

