package scannerExample;

import java.util.Scanner;

public class NumberCompare {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el primer numero");
        int firstNumber = scanner.nextInt();
        System.out.println("Ingrese el segundo numero");
        int secondNumber = scanner.nextInt();

        int sum = firstNumber + secondNumber;
        int difference = firstNumber - secondNumber;
        System.out.println("La suma de a + b: " + sum);
        System.out.println("La resta de a - b: " + difference);

        if(firstNumber >secondNumber) {
            System.out.println("el primer numero es mayor");
        }else {
            System.out.println("el segundo numero es mayor");
        }

        System.out.println("fin de la app");

        scanner.close();


    }
}
