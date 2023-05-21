import java.util.Arrays;

public class ejer01 {
    public static void main(String[]args){
        int arreglo[]={1,2,3};
        int[] Ain = invertirArray(arreglo);
        System.out.println("Arreglo original:\n" + Arrays.toString(arreglo));
        System.out.println("Arreglo invertido:\n" +Arrays.toString(Ain));
    }

    public static int[] invertirArray(int[]A){
        int[] Ain = new int [A.length];
        for(int i=0; i<A.length; i++){
            Ain[i]= A[A.length-1-i];
        }
        return Ain;
    }
}