
import java.util.Scanner;
public class PaintCal
{
   public static void main(String[] args)
   {
	Scanner sc=new Scanner(System.in);
	int noofWindows,noofDoors;
    double length,width,height;
	
	System.out.println("Enter the length of room: ");
	length=sc.nextDouble();
	System.out.println("Enter the width of room: ");
	width=sc.nextDouble();
	System.out.println("Enter the height of room: ");
	height=sc.nextDouble();
	System.out.println("Enter the number of windows in room: ");
	noofWindows=sc.nextInt();
	System.out.println("Enter the number of doors in room: ");
	noofDoors=sc.nextInt();
	
	double totalsurfaceArea=2*(length*width+length*height+width*height);
    System.out.println("Total surface area of room= "+totalsurfaceArea);
    
    double areaofDoors=20*noofDoors;
    System.out.println("Total area of doors :"+areaofDoors);
    
    double areaofWindows=15*noofWindows;
    System.out.println("Total area of windows :"+areaofWindows);
    
    double areaofFloor=length*width;
    System.out.println("Total area of Floor :"+areaofFloor);
    
    double paintingArea=totalsurfaceArea-areaofDoors-areaofWindows-areaofFloor;
    System.out.println("Total painting area:"+paintingArea);
    
    double paintNeeded=paintingArea/350;
    System.out.println("paint needed to be paint the room is:"+paintNeeded);
    
    
}
}