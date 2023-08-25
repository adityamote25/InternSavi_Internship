import java.util.Scanner;
import java.util.*;
import java.lang.*;
class convert{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
      
        System.out.println("------------------------------------------------------------------------- ");
        System.out.println("Tool for Temperature conversion");
        System.out.println("1.Fahrenheit to Celsius ");
        System.out.println("2.Celsius to Fahrenheit ");
        System.out.println("Enter your choice:");
        int ch=sc.nextInt();
        System.out.println("------------------------------------------------------------------------- ");
        switch(ch){
            case 1:
                System.out.println("Enter the Temperature in Fahrenheit:");
                float Fahrenheit =sc.nextFloat();  
                float Celsius  = ((Fahrenheit-32)*5)/9;  
                System.out.println("Temperature in celsius is: "+Celsius);  
                break;
            case 2:
                System.out.println("Enter the Temperature in Celsius:");
                float Celsius2 =sc.nextFloat();  
                float Fahrenheit2  = ((9*Celsius2)/5)+32;  
                System.out.println("Temperature in Fahrenheit is: "+Fahrenheit2);
                break;
            case 3:
            System.exit(0);
            default:System.out.println("Please enter correct choice");

        }
        
    }
}
