import java.util.Scanner;
/**
 * TemperatureDriver runs and tests the Temperature class.
 *
 * @author Celine
 * @version 1.0
 */
public class TemperatureDriver{
   /**
    * main() reads two Fahrenheit temperatures and 
    * displays their Celsius and Kelvin equivalents.
    */ 
   public static void main(String[] args){
       double inputTemperature = 0.0;
       Scanner keyboard = new Scanner(System.in);
       Temperature t1 = new Temperature();
       Temperature t2;
       
       System.out.print("Enter a Fahrenheit temperature: ");
       inputTemperature = keyboard.nextDouble();
       System.out.println("You entered " + inputTemperature + " degrees Fahrenheit");
       t1.setDegreesFahrenheit(inputTemperature);
       System.out.println("Which is " + t1.getDegreesCelsius() + " degrees Celsius");
       System.out.println("and " + t1.getDegreesKelvin() + " degrees Kelvin.");
       
       System.out.print("Enter another Fahrenheit tempearature: ");
       inputTemperature = keyboard.nextDouble();
       System.out.println("You entered " + inputTemperature + " degrees Fahrenheit");
       t2 = new Temperature(inputTemperature);
       System.out.println("Which is " + t2.getDegreesCelsius() + " degrees Celsius");
       System.out.println("and " + t2.getDegreesKelvin() + " degrees Kelvin.");
   }
}
