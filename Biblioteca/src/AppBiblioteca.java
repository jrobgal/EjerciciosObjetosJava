import clasesbiblioteca.*;
import java.util.Scanner;

public class AppBiblioteca {
    private Libro libro;
    public static void main(String[] args) throws Exception {
        AppBiblioteca appBiblioteca = new AppBiblioteca();
        appBiblioteca.cargarLibro();
        appBiblioteca.imprimir();
    }

    public void cargarLibro() {
        Scanner sc = new Scanner(System.in);
        libro = new Libro();
        System.out.println("Digite el codigo del libro:");
        libro.setCodigo(Integer.parseInt(sc.nextLine()));
        //sc.nextLine();
        System.out.println("Digite el nombre del libro:");
        libro.setNombre(sc.nextLine());
        System.out.println("Digite el año de publicacion:");
        libro.setAñoPublicacion(Integer.parseInt(sc.nextLine()));
        System.out.println("Digite la edicion:");
        libro.setEdicion(Integer.parseInt(sc.nextLine()));
        Autor autor = new Autor();
        System.out.println("Digite el codigo del autor del libro:");
        autor.setCodigo(Integer.parseInt(sc.nextLine()));
        //sc.nextLine();
        System.out.println("Digite el nombre del autor del libro:");
        autor.setNombre(sc.nextLine());

        libro.setAutor(autor);
        
    }

    public void imprimir() {
        System.out.println(libro);
    }
}
