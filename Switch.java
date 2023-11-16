public class Switch {
    //Checking the number is EVEN OR ODD.
    public static void main(String[] args) {
        int number=2;
        switch(number%2){
            case 0: System.out.println("number is even");
            break;
            case 1: System.out.println("number is odd");
            break;
            default:
            System.out.println("Invalid number");
        }

    }
}
