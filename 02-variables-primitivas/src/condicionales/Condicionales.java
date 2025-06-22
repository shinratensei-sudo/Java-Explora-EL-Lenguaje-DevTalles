package condicionales;

public class Condicionales {

    public static void main(String[] args) {
        int age = 20;
        double grade = 5.0;
        boolean isAdult = age >= 18;

        boolean hasPassGrade = grade > 5.9;


        if (isAdult && hasPassGrade) {
            System.out.println("el estudiante aprobo");
        } else if(isAdult && !hasPassGrade) {
            System.out.println("el estudiante reprobo");
        } else {
            System.out.println("no es estudiante");
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
