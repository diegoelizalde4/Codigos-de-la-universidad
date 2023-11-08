
package tdapilas;

import javax.swing.JOptionPane;

public class TDAPilas {

    public static void main(String[] args) {
        Stack s = new Stack();
        int opt;

        try {
            do {
                opt = Integer.parseInt(JOptionPane.showInputDialog(null, """
                                                                     [------------------MENU DE PILAS------------------]
                                                                     0.- SALIR 
                                                                     1.- PUSH (INGRESAR NUEVOS ELEMENTOS A LA PILA)
                                                                     2.- POP (ELIMINAR ELEMENTOS DE A LA PILA)
                                                                     3.- TOP/PEEK (OBTENER EL ULTIMO ELEMENTO AGREGADO)
                                                                     4.- SIZE (CUANTOS NODOS HAY EN LA PILA)
                                                                     
                                                                     Que opción desea realizar?:
                                                                     """, "Menu de Pilas", JOptionPane.QUESTION_MESSAGE));

                switch (opt) {
                    case 0 ->
                        JOptionPane.showMessageDialog(null, """
                                                        Gracias por usar el programa:
                                                        USO DE PILAS (STACKS)                                                        
                                                        """, "Programa de Pilas(Stack)", JOptionPane.INFORMATION_MESSAGE);
                    case 1 -> {
                        s.push(Integer.parseInt(JOptionPane.showInputDialog(null, "Digite el valor numerico que desea agregar a la pila:", "Añadir Nuevo Elemento", JOptionPane.QUESTION_MESSAGE)));
                        System.out.println("Elemento agregado con exito.");
                    }
                    case 2 -> {
                        s.pop();
                        System.out.println("Elemento eliminado con exito.");
                    }
                    case 3 ->
                        s.peek();

                    case 4 ->
                        s.size();

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
