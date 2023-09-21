import java.util.Scanner;
public class Gaji04 {
    public static void main(String [] args) {

        //Deklarasi
        Scanner input = new Scanner(System.in);
        int JmlMasuk, JmlTdkMasuk, TOtGaji;
        int gaji, potGaji;
        
        //Input
        System.out.println("Masukkan gaji");
        gaji = input.nextInt();
        System.out.println("Masukkan potongan gaji");
        potGaji = input.nextInt();
        System.out.println("Masukkan Jumlah Hari Masuk Kerja Anda ");
        JmlMasuk = input.nextInt();
        System.out.println("Masukkan Jumlah Hari Tidak Masuk kerja Anda ");
        JmlTdkMasuk= input.nextInt();
        TOtGaji = (JmlMasuk * gaji) - (JmlTdkMasuk * potGaji);
        
        //Output
        System.out.println("Gaji yang anda terima adalah " + TOtGaji);
    }
}