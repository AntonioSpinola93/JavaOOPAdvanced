package AdvancedJavaOOP._6;

public class Exercises {
    public static void main(String[] args) {
        exercise1();
        exercise2();
        exercise3();
        exercise4();
        exercise5();
    }

    public enum Days {
        MONDAY(false),
        TUESDAY(false),
        WEDNESDAY(false),
        THURSDAY(false),
        FRIDAY(true),
        SATURDAY(true),
        SUNDAY(true);

        private final boolean weekend;

        Days(boolean weekend) {
            this.weekend = weekend;
        }

        public boolean getWeekend() {
            return weekend;
        }
    }

    private enum Seasons {
        SPRING, SUMMER, FALL, WINTER

    }

    private enum TrafficLight {
        RED, YELLOW, GREEN
    }

    private enum Operator {

        ADD,
        SUBTRACT,
        MULTIPLE,
        DIVIDE;
    }

    /**
     * 1:
     * <p>
     * <p>
     * Create an enum called "Days" with the values "MONDAY", "TUESDAY", "WEDNESDAY", "THURSDAY", "FRIDAY", "SATURDAY", "SUNDAY".
     * <p>
     * Loop over the values with Days.values() and print them out.
     */
    private static void exercise1() {
        System.out.println("\nExercise 1: ");
        Days[] days = Days.values();
        for (Days day : days) {
            //ordinal inserisce l index dei valori nell enumeratore
            System.out.println(day + " : " + day.ordinal());
        }
    }

    /**
     * 2:
     * <p>
     * <p>
     * Create an enum called "Seasons" with the values "SPRING", "SUMMER", "FALL", "WINTER".
     * <p>
     * Write a method that takes a Seasons value as input and returns the corresponding date range of months in that season.
     */
    private static void exercise2() {
        System.out.println("\nExercise 2: ");
        Seasons allSeasons = Seasons.WINTER;
        switch (allSeasons) {
            case SPRING:
                System.out.println("Dal 21 Marzo al 20 Giugno");
                break;
            case SUMMER:
                System.out.println("Dal 21 Giugno al 20 Settembre");
                break;
            case FALL:
                System.out.println("Dal 21 Settembre al 20 Dicembre");
                break;
            case WINTER:
                System.out.println("Dal 21 Dicembre al 20 Marzo");
                break;
        }
    }

    /**
     * 3:
     * <p>
     * <p>
     * Create an enum called "TrafficLight" with the values "RED", "YELLOW", "GREEN".
     * <p>
     * Write code that simulates the behavior of a traffic light. It should take the current state of the traffic light as input and return the next state.
     */
    private static void exercise3() {
        System.out.println("\nExercise 3: ");
        // Your code here
        TrafficLight semaforo = TrafficLight.GREEN;
        if (semaforo == TrafficLight.RED) {
            System.out.println("STOP !!" + "\uD83D\uDD34");

        } else if (semaforo == TrafficLight.YELLOW) {
            System.out.println("Rallenta e fermati" + "\uD83D\uDFE1");
        } else if (semaforo == TrafficLight.GREEN) {
            System.out.println("Puoi passare" + "\uD83D\uDFE2");
        }


    }

    /**
     * 4:
     * <p>
     * Given the Days enum from exercise 1, add a local field called isWeekend and set it to true for the weekend days and false for the weekdays.
     * <p>
     * Write an if statement that prints weekend or weekday based on the enum
     */

    private static void exercise4() {


        System.out.println("\nExercise 4: ");
        Days[] days = Days.values();
        for (Days day : days) {
            if (day.getWeekend() == false) {
                System.out.println(day + " Non è weekend");
            }else{
            System.out.println(day + " Finalmente weekend");

            }


        }


        // Your code here
    }

    /**
     * 5:
     * <p>
     * <p>
     * Create an enum called "Operator" with the values "ADD", "SUBTRACT", "MULTIPLY", "DIVIDE".
     * <p>
     * Write a method that takes two integers and an Operator value as input, performs the corresponding operation on the integers, and returns the result.
     */
    private static void exercise5() {
        System.out.println("\nExercise 5: ");
        // Your code here

        double num1 = 5.0;
        double num2 = 2.0;
        Operator calcolatrice = Operator.SUBTRACT;
        switch (calcolatrice) {
            case ADD:
                System.out.println(num1 + num2);
                break;
            case SUBTRACT:
                System.out.println(num1 - num2);
                break;
            case MULTIPLE:
                System.out.println(num1 * num2);
                break;
            case DIVIDE:
                System.out.println(num1 / num2);
        }
    }

}
