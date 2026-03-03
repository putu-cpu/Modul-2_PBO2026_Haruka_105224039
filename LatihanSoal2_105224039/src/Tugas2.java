import java.util.Scanner;

public class Tugas2 {
    public static void main(String[] args) throws Exception {

        Scanner input = new Scanner (System.in); 


        System.out.println("Masukkan Celsius : ");
        double c = input.nextDouble(); 

        double f = c * 9/5 + 32; 
        double k = c+ 273.15; 
        double r = c* 4/5; 

        System.out.printf("Fahrenheit : %.2f\n", f);
        System.out.printf("Kelvin     : %.2f\n", k);
        System.out.printf("Reamur     : %.2f\n", r);

        input.close(); 


    }
}
