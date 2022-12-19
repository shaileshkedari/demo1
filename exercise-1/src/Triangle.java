
import java.util.Scanner;

public class Triangle
{
 public static void main(String[] args)
 {
 Scanner sc=new Scanner(System.in);
 float a,b,c,s;
 double area;
 
 System.out.println("enter the length for side a:");
 a=sc.nextFloat();
 System.out.println("enter the length for side b:");
 b=sc.nextFloat();
 System.out.println("enter the length for side c:");
 c=sc.nextFloat();
 
 s=(a+b+c)/2;
 area=Math.sqrt((s-a)*(s-b)*(s-c));
 System.out.println("area of triangle:"+area);
 
 }
 }