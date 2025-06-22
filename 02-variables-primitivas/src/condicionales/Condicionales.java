package condicionales;

public class Condicionales {

    public static void main(String[] args) {
        int age = -10;

        if (age >= 18) {
            System.out.println("Es mayor");
        } else if ( age > 1 && age < 18) {
            System.out.println("Es menor");
        } else {
            System.out.println("Dato no valido");
        }


        int day = 3;

        switch (day) {
            case 1:
                System.out.println("Lunes");
                break;
            case 2:
                System.out.println("Martes");
                break;
            case 3:
                System.out.println("Miercoles");
                break;
            default:
                System.out.println("dato no valido");

        }

    }
}
