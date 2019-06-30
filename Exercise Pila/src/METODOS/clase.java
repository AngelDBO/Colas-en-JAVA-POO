package METODOS;

import javax.swing.JOptionPane;

public class clase {

    nodo tope;
    nodo base;

    clase() {

        tope = null;
        base = null;
    }

    nodo getBuscarP(String IDpelicula) {
        nodo p;
        if (tope == null) {
            return null;
        } else {
            p = tope;
            do {
                if (IDpelicula.equalsIgnoreCase(p.IDpelicula)) {
                    return p;
                } else {
                    p = p.siguiente;
                }

            } while (p != tope);
            return null;
        }

    }

    void AgregarP(nodo p) {
        if (tope == null) {
            tope = base = p;
            base.siguiente = tope;
            JOptionPane.showMessageDialog(null, "Elemento agregado a la cola");
        } else {
            p.siguiente = tope;
            base.siguiente = p;
            tope = p;
        }

    }

    void MostrarPila() {
        nodo p = tope;
        if (tope == null) {
            JOptionPane.showMessageDialog(null, "No hay elementos para mostrar");
        } else {
            String info = "";
            do {
                info += " <<<..INoformacion de la pelicula..>>> \n \n";
                info += "El ID la pelicula es: " + p.IDpelicula + "\n";
                info += "El nombre la pelicula es: " + p.NombreP + "\n";
                info += "La duracion de la pelicula es: " + p.duracion + "\n";
                info += "El genero de la pelicula es: " + p.GeneroP + "\n";
                JOptionPane.showMessageDialog(null, info);
                info = "";
                p = p.siguiente;
            } while (p != tope);
        }
    }

    void setPop() {
        if (tope == null) {
            JOptionPane.showMessageDialog(null,
                    "Imposible eliminar! Pila vacia...");
        } else {
            if (tope == base) {
                tope = base = null;
                JOptionPane.showMessageDialog(null,
                        "Elemento atendido, Pila vacia!");
            } else {
                base.siguiente = tope.siguiente;
                nodo q = tope;
                tope = tope.siguiente;
                q.siguiente = null;
                q = null;
                JOptionPane.showMessageDialog(null,
                        "Elemento atendido!");
            }
        }
    }

    void getBuscarIDpelicula(String ID) {

        nodo p;
        p = getBuscarP(ID);
        if (p == null) {
            JOptionPane.showMessageDialog(null, "El ID de la pelicula no existe");
        } else {
            String info = "";
            do {
                info += " <<<..INoformacion de la pelicula..>>> \n \n";
                info += "El ID la pelicula es: " + p.IDpelicula + "\n";
                info += "El nombre la pelicula es: " + p.NombreP + "\n";
                info += "La duracion de la pelicula es: " + p.duracion + "\n";
                info += "El genero de la pelicula es: " + p.GeneroP + "\n";
                JOptionPane.showMessageDialog(null, info);
                info = "";
                p = p.siguiente;
            } while (p != tope);
        }

    }

    void vaciarPila() {
        tope = base = null;
        JOptionPane.showMessageDialog(null, "Todas las peliculas fueron eliminadas con exito!!  ;(");

    }

}
