package Ejercicio1;
import java.util.Arrays;
public class IAlumno {

    private double Nfinal;

    static class Alumno implements Comparable<Alumno> {

        public String nombre, apellido, padron, sexo, condicion;
        public double Nfinal;

        public Alumno(String nombre, String apellido, String padron, String sexo, String condicion, double Nfinal) {
            this.nombre = nombre;
            this.apellido = apellido;
            this.padron = padron;
            this.sexo = sexo;
            this.condicion = condicion;
            this.Nfinal = Nfinal;
        
        }

        @Override
        public int compareTo(Alumno a) {
            if (Nfinal < a.Nfinal) {
                return -1;
            }
            if (Nfinal > a.Nfinal) {
                return 1;
            }
            return 0;
        }
    }
    
    public int compareTo(Alumno b){
        if (Nfinal > b.Nfinal) {
            return + 1;
        }
        if (Nfinal < b.Nfinal) {
            return 1;
        }
        return 0;
    }

    static void imprimeArrayAlumnos(Alumno[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println((i - 1) + ".Nombre: " + array[i].nombre + " - Apellido: " + array[i].apellido + " - Padron: " + array[i].padron + " - Sexo: " + array[i].sexo + " - Condicion: " + array[i].condicion + " -Nota Final:" + array[i].Nfinal);
        }
    }

}
