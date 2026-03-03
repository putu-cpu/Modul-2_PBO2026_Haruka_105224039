import java.util.Scanner; 
public class latihan {
    public static void main(String[] args) throws Exception {

        String nama = "Haruka"; 
        int sks = 20; 
        double ipk = 3.0; 
        boolean isLulus    = true; 
        

        System.out.println("Nama : " + nama );
        System.out.println("SKS : " + sks + " dengan IPK :" + ipk);
        System.out.println("apakah saya lulus : " + isLulus);

        int a = 20, b= 10; 
        int c = 10 ,d= 3;  
        double hasil = c/d; 

        System.out.println("Hasil perkalian 20 dan 10 = " + (a*b));
        System.out.println("Hasil pembagian 10 dan 3  = " + (c/d));
        System.out.println("Hasil pembagian 10 dan 3  = " + ((double) c/d));
        System.out.println("Hasil pembagian 10 dan 3  = " + hasil);
        System.out.println("Modulus = " + (c%d));

        Scanner input = new Scanner (System.in); 

        System.out.println("Masukkan tanggal lahir : ");
        int tanggalLahir = input.nextInt() ; 

        input.nextLine (); 
        System.out.println("Masukkan nama : ");
        String namaLengkap = input.nextLine (); 

        System.out.println(namaLengkap + " " + tanggalLahir);

        input.close(); 


    }
}
