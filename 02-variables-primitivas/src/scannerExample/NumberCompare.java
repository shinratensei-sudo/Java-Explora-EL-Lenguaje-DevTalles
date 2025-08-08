package scannerExample;

import java.util.Scanner;

public class NumberCompare {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el primer numero");
        int a = sc.nextInt();
        System.out.println("Ingrese el segundo numero");
        int b = sc.nextInt();
        System.out.println("La suma de a + b: " + (a+b));
        System.out.println("La resta de a - b: " + (a-b));

        if(a>b) {
            System.out.println("el primer numero es mayor");
        }else {
            System.out.println("el segundo numero es mayor");
        }


    }
}
