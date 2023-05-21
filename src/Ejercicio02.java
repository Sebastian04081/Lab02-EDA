public class Ejercicio02{
    public static void main(String [] args){
        int[] A = {1,2,3,4,5};
        int d=2;
        int[] Aiz = rotarIzquierdaArray(A,d);
        System.out.print("A=[");
        imprimirArray(A);
        System.out.print("] -> Aiz=[");
        imprimirArray(Aiz);
        System.out.print("]");
    }
    public static int[] rotarIzquierdaArray(int[] A, int d){
        int longitud = A.length;
        int[] Aiz = new int[longitud];
        int cantidadRotaciones = d % longitud;
        for (int i=0;i<longitud;i++){
            int aux = (i+cantidadRotaciones)%longitud;
            Aiz[i] = A[aux];
        }
        return Aiz;
    }
    public static void imprimirArray(int[] A){
        for (int i=0;i<A.length;i++){
            System.out.print(A[i]+" ");
        }
    }
}
