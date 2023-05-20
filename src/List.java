public class List<T> {
    private Node<T> root;

    public List() {
        this.root = null;
    }

    public Node<T> getRoot() {
        return root;
    }

    public void setRoot(Node<T> root) {
        this.root = root;
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