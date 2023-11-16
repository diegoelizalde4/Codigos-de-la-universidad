package abb;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Abb tree = new Abb();

        int menu = 0;
        do{
            switch(menu){
                case 1:
                    System.out.println("Ingrese el número que desea insertar en el árbol binario de búsqueda: ");
                    int data = scanner.nextInt();
                    tree.insert(data);
                    break;
                case 2:
                    System.out.println("Recorrido del árbol binario de búsqueda en orden: ");
                    tree.inOrder();
                    break;
                case 3:
                    System.out.println("Recorrido del árbol binario de búsqueda en preorden: ");
                    tree.preOrder();
                    break;
                case 4:
                    System.out.println("Recorrido del árbol binario de búsqueda en postorden: ");
                    tree.postOrder();
                    break;
                case 5:
                    System.out.println("Saliendo del programa...");
                    break;
                case 6:
                    System.out.println("Ingrese el número que desea buscar en el árbol binario de búsqueda: ");
                    int dataSearch = scanner.nextInt();
                    tree.searchRec(tree.root, dataSearch);
                    break;
                case 7:
                    System.out.println("El número de hojas del árbol binario de búsqueda es: " + tree.getLeafCountRec(tree.root));
                    break;
                case 8:
                    System.out.println("La altura del árbol binario de búsqueda es: " + tree.height(tree.root));
                    break;
                case 9:
                    System.out.println("Eliminar un nodo del árbol binario de búsqueda: ");
                    int dataDelete = scanner.nextInt();
                    tree.delete(dataDelete);
                    break;
                default:
                    System.out.println("Opción no válida");
                    break;
            }
            System.out.println("Ingrese el número de la opción que desea realizar: ");
            System.out.println("1. Insertar un nodo en el árbol binario de búsqueda");
            System.out.println("2. Recorrer el árbol binario de búsqueda en orden");
            System.out.println("3. Recorrer el árbol binario de búsqueda en preorden");
            System.out.println("4. Recorrer el árbol binario de búsqueda en postorden");
            System.out.println("5. Salir");
            System.out.println("6. Ingresar un número para buscarlo en el árbol binario de búsqueda");
            System.out.println("7. Determinar el número de hojas del árbol binario de búsqueda");
            System.out.println("8. Determinar la altura del árbol binario de búsqueda");
            
            menu = scanner.nextInt();
        }while(menu != 5);


      

        scanner.close();
    }
}