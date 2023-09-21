import java.util.Scanner;

public class HargaBayar04 {

    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);

        //Deklarasi
        int harga,jumlah;
        float dis, total, bayar, jmlDis;
        String Merk;
        int jmlhal;

        //input
        System.out.print("Masukkan merk buku : ");
        Merk = input.nextLine();
        System.out.print("Masukkan jumlah halaman : ");
        jmlhal = input.nextInt();
        System.out.print("Masukkan diskon : ");
        dis = input.nextFloat();
        System.out.print("Masukkan harga barang yang dibeli : ");
        harga = input.nextInt();
        System.out.print("Masukkan Jumlah Barang Yang Dibeli : ");
        jumlah = input.nextInt();
        total=harga*jumlah;
        jmlDis=total*dis;
        bayar=total-jmlDis;

        //output
        System.out.println("Diskon yang anda dapatkan adalah "+ jmlDis);
        System.out.println("Jumlah yang harus dibayar adalah " + bayar);




    }
}