import java.util.Scanner;

public class PostTest {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Input
        System.out.println("=== SISTEM PAYROLL PERUSAHAAN ===");
        System.out.print("Nama Karyawan: ");
        String nama = input.nextLine();

        System.out.print("Gaji Pokok (Rp): ");
        double gajiPokok = input.nextDouble();

        System.out.print("Jumlah Jam Lembur: ");
        int jamLembur = input.nextInt();

        // Perhitungan
        double upahLemburPerJam = gajiPokok / 173;
        double totalLembur = jamLembur * upahLemburPerJam;
        double gajiKotor = gajiPokok + totalLembur;
        double pajak = 0.05 * gajiKotor;
        double bpjs = 0.01 * gajiPokok;
        double gajiBersih = gajiKotor - pajak - bpjs;

        // Output
        System.out.println("\n=== SLIP GAJI ===");
        System.out.println("Karyawan: " + nama);
        System.out.printf("Upah Lembur/Jam : Rp %.2f\n", upahLemburPerJam);
        System.out.printf("Total Uang Lembur : Rp %.2f\n", totalLembur);
        System.out.printf("Gaji Bruto : Rp %.2f\n", gajiKotor);
        System.out.printf("Potongan Pajak : Rp %.2f\n", pajak);
        System.out.printf("Potongan BPJS : Rp %.2f\n", bpjs);
        System.out.printf("GAJI BERSIH : Rp %.2f\n", gajiBersih);

        input.close();
    }
}
