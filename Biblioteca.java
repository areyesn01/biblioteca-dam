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
        System.out.println("Mostrando libros: ");
        for (Libro l: libros){
            System.out.println(l);
        }
    }
}
