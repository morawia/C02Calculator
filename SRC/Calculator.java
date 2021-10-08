public class Calculator {

    public static void main(String[] args) {
        double numberKomma = 2.333;
        System.out.println(numberKomma);

        boolean Wahrheit = false;
        System.out.println(Wahrheit);

        char Zeichen = 'c';
        System.out.println(Zeichen);

        String Zeichenkette = "DIMI ist echt korrekt";
        System.out.println(Zeichenkette);

        int number = 1;
        System.out.println(number);

        int value1 = 4;
        int value2 = 3;
        //addition
        System.out.println("addition: " + (value1+value2));
        //subtraction
        System.out.println("subtraction: "+ (value1 - value2));
        //multiplikation
        System.out.println("multiplication: "+ value1*value2);
        //division
        System.out.println("division: "+ value1/value2);
        //modulo
        System.out.println("Modulo: "+ value1%value2);
    }
}
