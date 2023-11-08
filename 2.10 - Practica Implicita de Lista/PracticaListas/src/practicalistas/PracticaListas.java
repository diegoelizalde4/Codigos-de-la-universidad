
package practicalistas;

import javax.swing.JOptionPane;

public class PracticaListas {

    public static void main(String[] args) {
        List L = new List();
        int opt;

        try {
            do {
                opt = Integer.parseInt(JOptionPane.showInputDialog(null, """
                                                                     [------MENU DE LISTA CON NOMBRES EN ORDEN ALFABETICO------]
                                                                     0.- SALIR 
                                                                     1.- INGRESAR UN NUEVO NOMBRE A LA LISTA
                                                                     2.- MOSTRAR LOS NOMBRES DE LA LISTA
                                                                     
                                                                     QUE OPCION DESEA REALIZAR?:
                                                                     """, "Menu de Listas", JOptionPane.QUESTION_MESSAGE));

                switch (opt) {
                    case 0 ->
                        JOptionPane.showMessageDialog(null, """
                                                        Gracias por usar el programa:
                                                        USO DE LISTAS CON STRINGS Y INTEGERS                                                      
                                                        """, "Programa de Listas", JOptionPane.INFORMATION_MESSAGE);
                    case 1 -> {
                        L.addToQueue(JOptionPane.showInputDialog(null, "Ingrese el nuevo nombre que desea añadir a la lista:", "Añadir Nuevo Nombre", JOptionPane.QUESTION_MESSAGE));
                        System.out.println("Elemento agregado con exito.");
                    }
                    case 2 ->
                        L.showQueue();

                    default ->
                        JOptionPane.showMessageDialog(null, """
                                                        Error: La opcion que digito no aparece dentro 
                                                        de las opciones posibles dentro del programa.
                                                        """, "ERROR WINDOW", JOptionPane.ERROR_MESSAGE);
                }
            } while (opt != 0);
        } catch (NumberFormatException e) {
            System.exit(0);
        }
    }

}
