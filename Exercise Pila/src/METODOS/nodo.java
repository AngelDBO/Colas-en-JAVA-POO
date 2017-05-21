package METODOS;

public class nodo {

    String IDpelicula;
    String NombreP;
    String GeneroP;
    float duracion;
    nodo siguiente;

    nodo(String IDpelicula, String NombreP, float duracion, String generoP) {

        this.IDpelicula = IDpelicula;
        this.NombreP = NombreP;
        this.GeneroP = GeneroP;
        this.duracion = duracion;
        nodo siguiente = null;

    }

}
