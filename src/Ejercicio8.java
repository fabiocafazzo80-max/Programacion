import java.util.Scanner;
public class Ejercicio8 {
    // Atributos

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[][] array;
        array = new int[10][10];
        System.out.println("Dime 10 numeros: ");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                array[i][j] = 1;
            }


        }
        array[0][4] = 0;
        array[2][6] = 0;
        array[3][1] = 0;
        array[8][6] = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {


            }
        }
    }
}