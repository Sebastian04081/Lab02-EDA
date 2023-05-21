public class Ejercicio04 {
    public static void main(String[] args) {
        List<String> lista = new List<>();
        
        lista.add("Manzana");
        lista.add("Banana");
        lista.add("Naranja");
        
        System.out.println("Tamaño de la lista: " + lista.getSize());
        System.out.println("Contiene 'Banana'? " + lista.contains("Banana"));

        System.out.println("Elementos de la lista: " + lista.toString());
        
        lista.add(1, "Uva");
        
        System.out.println("Tamaño de la lista después de agregar en la posición 1: " + lista.getSize());
        
        System.out.println("Elementos de la lista: " + lista.toString());

        lista.clear();
        
        System.out.println("Tamaño de la lista después de limpiarla: " + lista.getSize());
        System.out.println("La lista está vacía después de limpiarla? " + lista.isEmpty());
    }
}
