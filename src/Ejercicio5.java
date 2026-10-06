import java.util.Scanner;
public class Ejercicio5 {

    // Atributos

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] array; // Declaración
        array = new int[10]; // instanciación
        System.out.println("Introduce 10 valores enteros: ");
        for (int i = 0; i < array.length; i++){
            array[i] = input.nextInt();
        }
        System.out.println("Orden inverso: ");
        for (int i = 9; i >= 0; i--){
            System.out.println("Elemento indice" + i +"=" + array[i]);

        }
    }
}