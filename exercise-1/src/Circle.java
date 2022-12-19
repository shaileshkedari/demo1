
import java.util.Scanner;

public class Circle
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int r;
		float circumference,area,pi;
		System.out.println("enter the radius of circle:");
		r=sc.nextInt();
		pi=22f/7;
		System.out.println("pi:"+pi);
		circumference=2*pi*r;
		area=pi*r*r;
		System.out.println("circumference of circle:"+circumference);
		System.out.println("area of circle:"+area);
	 } 
}