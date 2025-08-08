package bucles;

public class Bucle {

    public static void main(String[] args) {

        int MAX_COUNT = 5;
        int currentNumber = 0;
        for (currentNumber = 0; currentNumber < MAX_COUNT; currentNumber++) {
            System.out.println("Valor: " + currentNumber);
        }

        System.out.println("Sale con i=" + currentNumber);


        int counter = 0;
        int acumulador = 0;

        while (counter < 5) {
            System.out.println("Counter: " + counter);
            acumulador = acumulador + counter;
            counter++;
        }
        System.out.println("Acumulador: " + acumulador);

        int counter2 = 30;
        do {
            System.out.println("Counter 2: " + counter2);
            counter2++;
        } while (counter2 < 5);


    }

}
