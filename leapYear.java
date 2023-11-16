import java.util.Scanner;
public class leapYear {
    //Checking the given year is LEAP YEAR or not
    public static void main(String[] args) {
        int year;
        System.out.println("enter year");
        Scanner sc= new Scanner(System.in);
        year=sc.nextInt();
        if(((year%4==0)&&(year%100!=0))||(year%400==0))
        System.out.println("Year is Leap Year");
        else
        System.out.println("Year is not a Leap Year");
    }
    
}
