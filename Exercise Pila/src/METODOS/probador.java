package METODOS;

import javax.swing.JOptionPane;

public class probador {

    public static void main(String[] args) {
        clase l = new clase();
        String IDpelicula, nombreP, generoP = "";
        float duracion;
        nodo aux = null;
        int op = 0;

        do {

            op = Integer.parseInt(JOptionPane.showInputDialog(
                    "   Menu   \n"
                    + "1. Añadir pelicula \n"
                    + "2. Mostrar todas  pelicula \n"
                    + "3. Buscar pelicula \n"
                    + "4. Eliminar pelicula \n"
                    + "5. Eliminar todas las peliculas\n"
                    + "6. Salir \n "
                    + " Entre su opcion"));

            switch (op) {

                case 1:
                    IDpelicula = JOptionPane.showInputDialog("Ingrese ID de la pelicula");
                    nombreP = JOptionPane.showInputDialog("Ingrese nombre de la pelicula");
                    duracion = Float.parseFloat(JOptionPane.showInputDialog("Ingrese duracion de la pelicula"));
                    generoP = JOptionPane.showInputDialog("Ingrese genero de la pelicula");
                    aux = new nodo(IDpelicula, nombreP, duracion, generoP);
                    l.AgregarP(aux);
                    break;

                case 2:
                    l.MostrarPila();
                    break;

                case 3:
                    String ID = JOptionPane.showInputDialog("iNGRWSW ID");
                    l.getBuscarIDpelicula(ID);

                    break;

                case 4:
                    l.setPop();

                    break;

                case 5:
                    l.vaciarPila();

            }

        } while (op != 5);

    }

}
