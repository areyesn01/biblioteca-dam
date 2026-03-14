import java.util.LinkedList;

public class Biblioteca {

        private LinkedList<Libro> libros;

        public Biblioteca() {
            this.libros = new LinkedList<>();
        }

    public void agregarLibro(Libro l) {
        libros.add(l);
    }

    public void mostrarLibro(){
        System.out.println("CATALOGO DE LIBROS");
        System.out.println("------------------");

        for (Libro l: libros){
            System.out.println(l);
        }
    }

    public void prestarLibro(Libro l) {
        libros.remove(l);
    }

    public void devolverLibro(Libro l) {
        libros.add(l);
    }
}
