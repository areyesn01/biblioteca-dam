import java.util.LinkedList;

public class Biblioteca {

        private LinkedList<Libro> libros;

        public Biblioteca() {
            this.libros = new LinkedList<>();
        }

    public void agregarLibro(Libro l) {
        libros.add(l);
    }
}
