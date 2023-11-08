
package tdacolas;

import javax.swing.JOptionPane;


public class TDAColas {


    public static void main(String[] args) {
        Queque q = new Queque();
        int opt;

        try {
            do {
                opt = Integer.parseInt(JOptionPane.showInputDialog(null, """
                                                                     [------------------MENU DE COLAS------------------]
                                                                     0.- SALIR 
                                                                     1.- ENQUEUE (INGRESAR NUEVOS ELEMENTOS A LA COLA)
                                                                     2.- DEQUEUE (ELIMINAR ELEMENTOS DE A LA COLA)
                                                                     3.- FRONT (OBTENER EL ULTIMO ELEMENTO AGREGADO)
                                                                     4.- SIZE (CUANTOS NODOS HAY EN LA COLA)
                                                                     
                                                                     Que opción desea realizar?:
                                                                     """, "Menu de Colas", JOptionPane.QUESTION_MESSAGE));

                switch (opt) {
                    case 0 ->
                        JOptionPane.showMessageDialog(null, """
                                                        Gracias por usar el programa:
                                                        USO DE COLAS (QUEUES)                                                        
                                                        """, "Programa de Colas(Queues)", JOptionPane.INFORMATION_MESSAGE);
                    case 1 -> {
                        q.enqueue(Integer.parseInt(JOptionPane.showInputDialog(null, "Digite el valor numerico que desea agregar a la cola:", "Añadir Nuevo Elemento", JOptionPane.QUESTION_MESSAGE)));
                        System.out.println("Elemento agregado con exito.");
                    }
                    case 2 -> {
                        q.dequeue();
                        System.out.println("Elemento eliminado con exito.");
                    }
                    case 3 ->
                        q.front();

                    case 4 ->
                        q.size();

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
