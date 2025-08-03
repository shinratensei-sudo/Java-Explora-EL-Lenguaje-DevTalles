package bucles;

public class Bucle {

    public static void main(String[] args) {

        int i = 0;
        for (i = 0; i < 5; i++) {
            System.out.println("Valor: " + i);
        }

        System.out.println("Sale con i=" + i);


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
