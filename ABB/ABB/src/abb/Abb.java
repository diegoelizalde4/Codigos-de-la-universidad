package abb;
//Declaracion de la clase Abb
class Abb {
    Node root;

    public Abb() {
        root = null;
    }
    //Check if the tree is empty
    public boolean isEmpty() {
        return root == null;
    }
    //Insert data in the tree
    public void insert(int data) {
        root = insertRec(root, data);
    }
    //Insert data in the tree
    private Node insertRec(Node root, int data) {
        if (root == null) {
            root = new Node(data);
            return root;
        }
        if (data < root.data) {
            root.left = insertRec(root.left, data);
        } else if (data > root.data) {
            root.right = insertRec(root.right, data);
        }
        return root;
    }
    //Order the tree
    public void inOrder() {
        inOrderRec(root);
    }

    private void inOrderRec(Node root) {
        if (root != null) {
            inOrderRec(root.left);
            System.out.println(root.data);
            inOrderRec(root.right);
        }
    }

    public void preOrder() {
        preOrderRec(root);
    }

    private void preOrderRec(Node root) {
        if (root != null) {
            System.out.println(root.data);
            preOrderRec(root.left);
            preOrderRec(root.right);
        }
    }

    public void postOrder() {
        postOrderRec(root);
    }

    private void postOrderRec(Node root) {
        if (root != null) {
            postOrderRec(root.left);
            postOrderRec(root.right);
            System.out.println(root.data);
        }
    }
    //Search a node in the tree
    public void searchRec(Node root, int data) {
        if (root != null) {
            if (root.data == data) {
                System.out.println("El número " + data + " se encuentra en el árbol binario de búsqueda");
            } else if (data < root.data) {
                searchRec(root.left, data);
            } else if (data > root.data) {
                searchRec(root.right, data);
            }
        } else {
            System.out.println("El número " + data + " no se encuentra en el árbol binario de búsqueda");
        }
    }
    //Determines the number of leaves in the tree

    public int getLeafCountRec(Node root) {
        if (root == null) {
            return 0;
        } else if (root.left == null && root.right == null) {
            return 1;
        } else {
            return getLeafCountRec(root.left) + getLeafCountRec(root.right);
        }
    }
    //Calculate the height of the tree
    public int height(Node root) {
        if (root == null) {
            return 0;
        } else {
            int leftHeight = height(root.left);
            int rightHeight = height(root.right);
            if (leftHeight > rightHeight) {
                return (leftHeight + 1);
            } else {
                return (rightHeight + 1);
            }
        }
    }
    //Delete a node in the tree
    public void delete(int data) {
        
        root = deleteRec(root, data);
    }
    private deleteRec(Node root, int data) {
        if (root == null) {
            return root;
        }
        if (data < root.data) {
            root.left = deleteRec(root.left, data);
        } else if (data > root.data) {
            root.right = deleteRec(root.right, data);
        } else {
            if (root.left == null) {
                return root.right;
            } else if (root.right == null) {
                return root.left;
            }
            root.data = minValue(root.right);
            root.right = deleteRec(root.right, root.data);
        }
        return root;
    }
    //Find the minimum value in the tree
    public int minValue(Node root) {
        int minv = root.data;
        while (root.left != null) {
            minv = root.left.data;
            root = root.left;
        }
        return minv;
    }

    


    public void exit() {
        System.exit(0);
    }
}