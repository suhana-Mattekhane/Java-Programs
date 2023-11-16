import java.util.Scanner;
public class weakdays {
    //Print the weekdays by its number
    public static void main(String[] args) {
        int day;
        System.out.println("enter number");
        Scanner sc= new Scanner(System.in);
        day=sc.nextInt();
        if(day==1){
            System.out.println("sunday");
        }
        else if(day==2){
            System.out.println("monday");
        }
        else if(day==3){
            System.out.println("Tuesday");
        }
        else if(day==4){
            System.out.println("Wednesday");
        }
        else if(day==5){
            System.out.println("Thursday");
        }
            else if(day==6){
                System.out.println("Friday");
            }
            else{
                System.out.println("Saturday");
            }
        }
    }
    
