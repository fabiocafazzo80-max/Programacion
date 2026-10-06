import java.util.Scanner;
public class Ejercicio6 {

    // Atributos

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] array; // Declaración
        int temp;
        array = new int[10]; // instanciación
        System.out.println("Introduce 10 valores enteros: ");
        for (int i = 0; i < array.length; i++){
            array[i] = input.nextInt();
        }
        for(int i = 0; i <= 4; i++){
         temp = array[i];
         array[i] = array[9-i];
         array[9-i] = temp;

        }
        for (int i = 0; i < array.length; i++){
            System.out.println("Elemento indice" + i +"=" + array[i]);
        }
    }
}