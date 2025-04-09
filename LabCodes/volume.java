import java.text.DecimalFormat;
import java.util.Scanner;
// code
interface Shape {
    void volume();
}

class Cone implements Shape {
    double radius, height;
    
    Cone(double r, double h) {
        radius = r;
        height = h;
    }
    
    public void volume() {
        double vol = (1.0 / 3) * Math.PI * radius * radius * height;
        System.out.println("Volume of Cone: " + volume.d.format(vol));
    }
}

class Hemisphere implements Shape {
    double radius;
    
    Hemisphere(double r) {
        radius = r;
    }
    
    public void volume() {
        double vol = (2.0 / 3) * Math.PI * radius * radius * radius;
        System.out.println("Volume of Hemisphere: " + volume.d.format(vol));
    }
}

class Cylinder implements Shape {
    double radius, height;
    
    Cylinder(double r, double h) {
        radius = r;
        height = h;
    }
    
    public void volume() {
        double vol = Math.PI * radius * radius * height;
        System.out.println("Volume of Cylinder: " + volume.d.format(vol));
    }
}

public class volume {
    static DecimalFormat d=new DecimalFormat("#.##");
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter radius and height of the cone: ");
        double rCone = sc.nextDouble();
        double hCone = sc.nextDouble();
        Cone cone = new Cone(rCone, hCone);
        System.out.print("Enter radius of the hemisphere: ");
        double rHemisphere = sc.nextDouble();
        Hemisphere hemisphere = new Hemisphere(rHemisphere);
        System.out.print("Enter radius and height of the cylinder: ");
        double rCylinder = sc.nextDouble();
        double hCylinder = sc.nextDouble();
        Cylinder cylinder = new Cylinder(rCylinder, hCylinder);
        cone.volume();
        hemisphere.volume();
        cylinder.volume();
        sc.close();
    }
}