public class List<T> {
    private Node<T> root;

    public List() {
        this.root = null;
    }

    public List(T data){
        Node<T> newRoot = new Node<>(data);
        this.root = newRoot; 
    }

    public Node<T> getRoot() {
        return root;
    }

    public void setRoot(Node<T> root) {
        this.root = root;
    }

    public boolean isEmpty() {
        return root == null;
    }
    
    public int getSize() {
        int tamaño = 0;
        Node<T> nodoActual = root;
        while (nodoActual != null) {
            tamaño++;
            nodoActual = nodoActual.getNextNode();
        }
        return tamaño;
    }
    
    public boolean contains(T dato) {
        Node<T> nodoActual = root;
        while (nodoActual != null) {
            if (nodoActual.getData().equals(dato)) {
                return true;
            }
            nodoActual = nodoActual.getNextNode();
        }
        return false;
    }
    
    public void clear() {
        root = null;
    }

    @Override
    public String toString() {
        String resultado = "";
        Node<T> nodoActual = root;
        boolean primerNodo = true;

        while (nodoActual != null) {
            if (primerNodo) {
                resultado += nodoActual.getData();
                primerNodo = false;
            } else {
                resultado += ", " + nodoActual.getData();
            }
            nodoActual = nodoActual.getNextNode();
        }

        return resultado;
    }
}