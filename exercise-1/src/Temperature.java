
import java.util.Scanner;

public class Temperature
{
 public static void main(String[] args)
 {
 Scanner sc=new Scanner(System.in);
 float cel;

 System.out.println("enter the temperature in celcius:");
 cel=sc.nextFloat();
 
double fah=1.8*cel+32;
 System.out.println( cel +" cel is equivalent temperature in Fahrenheit:"+ fah);
 }
}