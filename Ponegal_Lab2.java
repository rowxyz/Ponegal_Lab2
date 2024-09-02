import java.util.Scanner;

class Cylinder {
    double radius, height;
    String unit;

    // Method to get user input
    public void getInput() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the radius of the cylinder followed by unit (e.g., 5 cm): ");
        radius = sc.nextDouble();
        unit = sc.next(); // Read the unit directly after radius
        System.out.print("Enter the height of the cylinder in " + unit + ": ");
        height = sc.nextDouble();
    }

    // Method to compute the area
    public double area() {
        return (2 * Math.PI * radius * radius) + (2 * Math.PI * radius * height);
    }
}

class CylinderVol extends Cylinder {

    // Method to compute the volume
    public double volume() {
        return Math.PI * radius * radius * height;
    }
}

public class Ponegal_Lab2 {
    public static void main(String[] args) {
        // Create an instance of the CylinderVol class
        CylinderVol cyl = new CylinderVol();

        // Get input from the user
        cyl.getInput();

        // Compute and display the area and volume
        System.out.println("Area of the Cylinder = " + cyl.area() + " " + cyl.unit + "^2");
        System.out.println("Volume of the Cylinder = " + cyl.volume() + " " + cyl.unit + "^3");
    }
}
