package LSL;

import javax.swing.JOptionPane;
public class Principal {
    public static void main(String[] args) {
        ListaCircular lista = new ListaCircular();
        int opc = 0;
        do {
            String opcion = JOptionPane.showInputDialog(null, "Lista Circular\n1. INSERTAR AL INICIO\n2. INSERTAR AL FINAL\n3. INSERTAR EN MEDIO\n4. ELIMINAR AL INICIO\n5. ELIMINAR AL FINAL\n6. ELIMINAR EN MEDIO\n7. MOSTRAR ELEMENTOS DE LA LISTA\n8. ENCONTRAR ELEMENTO\n0. SALIR");
            opc = Integer.parseInt(opcion);
            switch (opc) {
                case 1: {
                    String datoi;
                    int dato;
                    datoi = JOptionPane.showInputDialog(null, "Ingresa el dato:");
                    dato = Integer.parseInt(datoi);
                    lista.insertarInicio(dato);
                    break;
                }
                case 2: {
                    String datoi;
                    int dato;
                    datoi = JOptionPane.showInputDialog(null, "Ingresa el dato:");
                    dato = Integer.parseInt(datoi);
                    lista.insertarFinal(dato);
                    break;
                }
                case 3: {
                    String datoi;
                    int dato;
                    datoi = JOptionPane.showInputDialog(null, "Ingresa el dato:");
                    dato = Integer.parseInt(datoi);
                    int despues = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresa el valor después del cual deseas insertar:"));
                    lista.insertarEnMedio(despues, dato);
                    break;
                }
                case 4: {
                    lista.eliminarInicio();
                    break;
                }
                case 5: {
                    lista.eliminarFinal();
                    break;
                }
                case 6: {
                    int despues = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresa el valor que deseas eliminar en medio:"));
                    lista.eliminarEnMedio(despues);
                    break;
                }
                case 7: {
                    lista.mostrar();
                    break;
                }
                case 8: {
                    String datoi;
                    int dato;
                    datoi = JOptionPane.showInputDialog(null, "Ingresa el dato que deseas buscar:");
                    dato = Integer.parseInt(datoi);
                    int posicion = lista.buscar(dato);
                    if (posicion != -1) {
                        JOptionPane.showMessageDialog(null, "El elemento se encuentra en la posición: " + posicion);
                    } else {
                        JOptionPane.showMessageDialog(null, "Elemento No Encontrado.");
                    }
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


