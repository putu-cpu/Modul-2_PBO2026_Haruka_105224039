import java.util.Scanner; 
public class Tugas1 {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Masukkan panjang :");
        double panjang = input.nextDouble(); 

        System.out.println("Masukkan lebar : ");
        double lebar = input.nextDouble(); 

        System.out.println("Masukkan tinggi : ");
        double tinggi = input.nextDouble(); 

        double luas = 2 * panjang * tinggi + 2 * lebar * tinggi; 
        double cat = Math.ceil(luas/10); 

        System.out.println("Luas dinding = " + luas + " m2");
        System.out.println("cat : " + cat + " liter");

        input.close();
    }
}
