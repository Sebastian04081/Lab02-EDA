/*
 * Viviano Bustamante Adrian 
 * Triangulo Recursivo
*/
public class Ejercicio03 {
  public static void main(String[] args) {
    int num;
    num=9;
    trianguloRecursivo(num);
  }
  public static void trianguloRecursivo(int base){
    if (base > 0) {
            trianguloRecursivo(base -1); // Llamada recursiva 
            for (int i = 0; i < base; i++) {
                System.out.print("* "); // Dibujar asteriscos 
            }
            System.out.println(); // Cambiar de línea 
        }
  }
}
