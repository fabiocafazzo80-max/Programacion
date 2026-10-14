import java.util.Scanner;

public class ejercicio11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char[][] matrix;
        matrix = new char[8][8];
        boolean gameOver = false;
        for (int fila = 0; fila < matrix.length; fila++) {
            for (int col = 0; col < matrix[0].length; col++) {
                matrix[fila][col] = ' ';
            }
        }
        addShips(matrix);
        while (!gameOver) {
            // Bucle del juego
            printMatrix(matrix, false);
            int row = getRow(input);
            int col = getCol(input);

            if (matrix[row][col] == 'S') {
                matrix[row][col] = 'X';
            } else {
                matrix[row][col] = 'O';

            }

        }
    }

    static void addShips(char[][] tabla) {
        int numShips = 0;
        while (numShips < 10) {
            for (int i = 1; i < 10; i++) {
                int row = (int) (Math.random() * tabla.length);
                int col = (int) (Math.random() * tabla.length);
                if (tabla[row][col] != 'S') {
                    tabla[row][col] = 'S';
                    numShips++;
                }
            }
        }
    }

    // debug a truw imprime los barcos. Solo para depuración.
    static void printMatrix(char[][] tabla, boolean debug) {
        System.out.print("  ");
        for (int i = 1; i <= 8; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
        for (int row = 0; row < tabla.length; row++) {
            System.out.print(((char) (65 + row)) + " ");
            for (int col = 0; col < tabla[0].length; col++) {
                // Imprimo la matriz

                if (tabla[row][col] == 'S' != debug) {
                    System.out.print("  ");
                } else {
                    System.out.print(tabla[row][col] + " ");
                }
            }
            System.out.println();
        }
    }

    static int getRow(Scanner input) {
        System.out.print("Dame la letra de la fila: ");
        char letter = input.next().charAt(0);
        int row = letter - 65;
        return row;
    }

    static int getCol(Scanner input) {
        System.out.print("Dame el numero de la columna: ");
        int col = input.nextInt() - 1;
        return col;
    }
}