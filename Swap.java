public class Swap {
    // Swapping of two numbers without using 3rd Variable
    public static void main(String[] args) {

        int number1 = 5, number2 = 4 ;
        number1 = number1 + number2;
        number2 = number1 - number2;
        number1 = number1 - number2;

        System.out.println(number1+" "+number2);
    }
}
