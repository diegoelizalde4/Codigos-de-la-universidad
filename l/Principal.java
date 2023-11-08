package LSL;
import javax.swing.JOptionPane;

public class Principal {

    public static void main(String[] args) {
        Lista l = new Lista();
        int opc = 0;
        do {
            String opcion = JOptionPane.showInputDialog(null, "Lista Simple\n1. INSERTAR INICIO\n2. INSERTAR FINAL\n3. INSERTAR EN MEDIO\n4. MOSTRAR LISTA\n5. ELIMINAR INICIO\n6. ELIMINAR FINAL\n7. ELIMINAR EN MEDIO\n8. CONTAR NODOS\n0. SALIR");
            opc = Integer.parseInt(opcion);
            switch (opc) {
                case 1:
                {
                    String datoi;
                    int dato;
                    datoi = JOptionPane.showInputDialog(null, "Ingresa el dato:");
                    dato = Integer.parseInt(datoi);
                    l.insertarInicio(dato);
                    break;
                }
                case 2:
                {
                    String datoi;
                    int dato;
                    datoi = JOptionPane.showInputDialog(null, "Ingresa el dato:");
                    dato = Integer.parseInt(datoi);
                    l.insertarFinal(dato);
                    break;
                }
                case 3:
                {
                    String datoi;
                    int dato;
                    datoi = JOptionPane.showInputDialog(null, "Ingresa el dato:");
                    dato = Integer.parseInt(datoi);
                    int despues = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresa el valor después del cual deseas insertar:"));
                    l.insertarEnMedio(despues, dato);
                    break;
                }
                case 4:
                {
                    l.mostrar();
                    break;
                }
                case 5:
                {
                    l.eliminarInicio();
                    break;
                }
                case 6:
                {
                    l.eliminarFinal();
                    break;
                }
                case 7:
                {
                    int despues = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresa el valor que deseas eliminar en medio:"));
                    l.eliminarEnMedio(despues);
                    break;
                }
                case 8:
                {
                    int totalNodos = l.contarNodos();
                    JOptionPane.showMessageDialog(null, "La cantidad de nodos en la lista es: " + totalNodos);
                    break;
                }
                default:
                    if (opc == 0)
                        JOptionPane.showMessageDialog(null, "Fin del Programa.");
                    else
                        JOptionPane.showMessageDialog(null, "La opción no es correcta o no existe.");
            }
        } while (opc != 0);
    }
}

