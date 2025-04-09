import java.text.DecimalFormat;
import java.util.Scanner;

abstract class TemperatureBase {
    double temp;

    void setTempData(double temp) {
        this.temp = temp;
    }

    abstract void changeTemp();
}

class Fahrenheit extends TemperatureBase {
    double ctemp;

    void changeTemp() {
        ctemp = (5.0 / 9) * (temp - 32);
        System.out.println("Temperature in Celsius: " + temperature.d.format(ctemp));
    }
}

class Celsius extends TemperatureBase {
    double ftemp;

    void changeTemp() {
        ftemp = (9.0 / 5) * temp + 32;
        System.out.println("Temperature in Fahrenheit: " + temperature.d.format(ftemp));
    }
}

public class temperature {
    static DecimalFormat d=new DecimalFormat("#.##");
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Fahrenheit f = new Fahrenheit();
        System.out.print("Enter temperature in Fahrenheit: ");
        double tempF = sc.nextDouble();
        f.setTempData(tempF);
        f.changeTemp();
        Celsius c = new Celsius();
        System.out.print("Enter temperature in Celsius: ");
        double tempC = sc.nextDouble();
        c.setTempData(tempC);
        c.changeTemp();
        sc.close();
    }
}