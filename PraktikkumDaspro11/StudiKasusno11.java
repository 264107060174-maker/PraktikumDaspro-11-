
import java.util.Scanner;

public class StudiKasusno11 {
    public StudiKasusno11() {
    }
    
    public static void main(String[] args) {
        Scanner var8 = new Scanner(System.in);
        System.out.print("Masukkan jumlah cup: ");
        int var1 = var8.nextInt();
        System.out.print("Masukkan uang bayar: ");
        int var2 = var8.nextInt();
        int var3 = var1 * 18000;
        int var4 = 0;
        if (var3 >= 100000) {
            var4 = var3 * 10 / 100;
        }

        int var5 = var3 - var4;
        System.out.println("Total harga: " + var3);
        System.out.println("Diskon: " + var4);
        System.out.println("Jumlah cup: " + var5);
        if (var2 >= var5) {
            int var6 = var2 - var5;
            System.out.println("Kembalian: " + var6);
        } else {
            int var7 = var5 - var2;
            System.out.println("Uang bayar tidak cukup, kurang: " + var7);
        }
    }
}