// Write a simple program to find the area of a circle.

// Take pi to be 3.1428
// So lets start 

// import Scanner
import java.util.Scanner;

class Area
{
    public static void main(String[] args) {
        System.out.println("This program calculates the area of a circle");
        System.out.println();
        
        final double PI = 3.1428,Area;
        int r;
        System.out.println("Enter the radius of the circle");
        Scanner ref = new Scanner(System.in);
        r = ref.nextInt();

        Area = PI*r*r;
        System.out.print("Area of a circle = "  +Area);


    }

}

