package PraktikkumDaspro11;
import java.util.Scanner;

public class StudiKasus1 {
    public static void main(String[] args) {
        final int HARGA_CUP = 18000;
        final int BATAS_DISKON = 100000;
        final int PERSENTASE_DISKON = 10;

        int jumlahCup, uangBayar;
        int totalHarga, diskon, totalBayar, kembalian, kurang;

        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan jumlah cup: ");
        jumlahCup = input.nextInt();

        System.out.print("Masukkan uang bayar: ");
        uangBayar = input.nextInt();

        if (jumlahCup <= 0 || uangBayar < 0) {
            System.out.println("Jumlah cup harus lebih dari 0 dan uang bayar tidak boleh negatif.");
            input.close();
            return;
        }

        input.close();

        totalHarga = jumlahCup * HARGA_CUP;
        diskon = 0;

        if (totalHarga >= BATAS_DISKON) {
            diskon = totalHarga * PERSENTASE_DISKON / 100;
        }

        totalBayar = totalHarga - diskon;

        System.out.println("Total harga: " + totalHarga);
        System.out.println("Diskon: " + diskon);
        System.out.println("Total bayar: " + totalBayar);

        if (uangBayar >= totalBayar) {
            kembalian = uangBayar - totalBayar;
            System.out.println("Kembalian: " + kembalian);
        } else {
            kurang = totalBayar - uangBayar;
            System.out.println("Uang tidak cukup, kurang: " + kurang);
        }
    }
}