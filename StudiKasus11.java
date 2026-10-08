import java.util.Scanner;

public class StudiKasus11 {
    public static void main(String[] args) {
        final int HARGA_CUP = 18000;

        int jumlahCup, uangBayar;
        int totalHarga, diskon, totalBayar, kembalian, kurang;

        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan jumlah cup: ");
        jumlahCup = input.nextInt();

        System.out.print("Masukkan uang bayar: ");
        uangBayar = input.nextInt();

        totalHarga = jumlahCup * HARGA_CUP;
        diskon = 0;

        if (totalHarga >= 100000) {
            diskon = totalHarga * 10 / 100;
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