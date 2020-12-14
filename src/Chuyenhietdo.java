import java.util.Scanner;

public class Chuyenhietdo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("nhập Fahrenheit");
        double F =sc.nextDouble();
        System.out.println("Fahrenheit To Celsius "+fahrenheitToCelsius(F));
    }
    public static double celsiusToFahrenheit(double C){
        double F=(9.0/5)*C+32;
        return F;

    }
    public static double fahrenheitToCelsius(double F){
        double C=(5.0/9)*F-32;
        return C;
    }

}
