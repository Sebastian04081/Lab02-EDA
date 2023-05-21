public class List<T> {
    private Node<T> root;
    private int size;

    public List() {
        this.root = null;
        this.size = 0;
    }

    public List(T data){
        this.root = new Node<>(data);
        this.size = 0;
    }

    public Node<T> getRoot() {
        return root;
    }

    public void setRoot(Node<T> root) {
        this.root = root;
    }

    public void add(T dato) {
        Node<T> nuevoNodo = new Node<>(dato);
        if (root == null) {
            root = nuevoNodo;
        } else {
            Node<T> nodoActual = root;
            while (nodoActual.getNextNode() != null) {
                nodoActual = nodoActual.getNextNode();
            }
            nodoActual.setNextNode(nuevoNodo);
        }
        size++;
    }

    public void add(int posicion, T dato) {
        if (posicion < 0 || posicion > size) {
            throw new IndexOutOfBoundsException("Posición fuera de rango");
        }
        
        Node<T> nuevoNodo = new Node<>(dato);
        
        if (posicion == 0) {
            nuevoNodo.setNextNode(root);
            root = nuevoNodo;
        } else {
            Node<T> nodoActual = root;
            for (int i = 0; i < posicion - 1; i++) {
                nodoActual = nodoActual.getNextNode();
            }
            
            nuevoNodo.setNextNode(nodoActual.getNextNode());
            nodoActual.setNextNode(nuevoNodo);
        }
        
        size++;
    }

    public boolean isEmpty() {
        return size == 0;
    }
    
    public int getSize() {
        return size;
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
        size = 0;
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