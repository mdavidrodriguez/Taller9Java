
package vistaEjercicio2;
import Ejercicio2.Cliente;
import java.util.ArrayList;
import java.util.Scanner;
public class Prestamo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        ArrayList <Cliente> listado = new ArrayList();
        Cliente c1, c2;
        
        System.out.println("Datos para solicitar el libro\n"
                + "Por favor Digite sus datos: ");
        c1 = new Cliente(1274644,"Cronica de una Muerte Anunciada","Gabriel Garcia Marquez");
        listado.add(c1);
        c2 = new Cliente(1235674,"Cien años de soledad","Gabriel Garcia Marquez");
        listado.add(c2);
        
        System.out.println("Listado de libros");
        for(Cliente  c: listado){
            System.out.println("Codigo del Libro: " + c.getCodigo() + "\nTitulo: " + c.getTitulo() + "\nAutor: " + c.getAutor());
        }
        
        
    }
    
}
