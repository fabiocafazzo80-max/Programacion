import java.util.Scanner;
public class Ejercicio7 {

    // Atributos

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int dni;
        int resto;
        char[] array = {'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'};
        System.out.println("Dime un DNI: ");
        dni = input.nextInt();

        resto = dni %23;
        System.out.println(array[resto]);


    }
}