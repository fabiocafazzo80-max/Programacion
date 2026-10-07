import java.util.Scanner;
class Ejercicio9 {
    public static void main(String[] args) {
        int cont1 = 0, contFilas = 0, contCols =0;
        Scanner input = new Scanner(System.in);
        int[][] array;
        array = new int[10][10];
        System.out.println("Introduce 10 numeros: ");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++){
                array[i][j] = 1 ;
            }
        }
        array[0][4] = 8;
        array[2][6] = 8;
        array[3][1] = 8;
        array[8][6] = 8;
        for (int fila = 0; fila < array.length; fila++){
            for (int col = 0; col< array.length; col++){
                System.out.print(array[fila][col] + " ");
            }
            System.out.println();
        }
        for(int fila = 0; fila < array.length; fila++){
            cont1 = 0;
            for (int col = 0; col< array.length; col++){
                if (array[fila][col] == 1) {
                    cont1++;
                }
            }
            if (cont1 == array[0].length) {
                contFilas++;
            }
        }
        for (int col = 0; col < array[0].length; col++) {
            cont1 = 0;
            for (int fila = 0; fila < array[0].length; fila++) {
                if (array[fila][col] == 1) {
                    cont1++;
                }
            }
            if (cont1 == 10) {
                contCols++;
            }
        }
        System.out.println("Rows 1s = " + contFilas);
        System.out.println("Cols 1s = " + contCols);
    }
}