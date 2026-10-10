import java.util.Scanner;

public class StudiKasus2no11 {
    public static void main(String[] args) {
        String namaMahasiswa;
        String jenisKegiatan;
        String statusDokumen;
        int jumlahDokumen;

        Scanner input = new Scanner(System.in);

        System.out.print("Nama mahasiswa : ");
        namaMahasiswa = input.nextLine();

        System.out.print("Jenis kegiatan (BELMAWA/BAKORMA/Mandiri/PKM/lainnya) : ");
        jenisKegiatan = input.nextLine();

        System.out.print("Status dokumen (lolos/tidak lolos) : ");
        statusDokumen = input.nextLine();

        System.out.print("Jumlah dokumen : ");
        jumlahDokumen = input.nextInt();

        input.close();

        System.out.println("\n--- Validasi Dokumen ---");
        System.out.println("Nama mahasiswa\t: " + namaMahasiswa);
        System.out.println("Jenis kegiatan\t: " + jenisKegiatan);
        System.out.println("Jumlah dokumen\t: " + jumlahDokumen);

        if (jumlahDokumen < 1 || jumlahDokumen > 4) {
            System.out.println("Status\t\t: Dokumen tidak lengkap (kurang 1 dokumen). Dana pengajuan tidak diberikan.");
        } else {
            if (jenisKegiatan.equalsIgnoreCase("BELMAWA") || jenisKegiatan.equalsIgnoreCase("BAKORMA") || jenisKegiatan.equalsIgnoreCase("Mandiri")) {
                if (statusDokumen.equalsIgnoreCase("lolos")) {
                    if (jumlahDokumen == 1 || jumlahDokumen == 2 || jumlahDokumen == 3) {
                        System.out.println("Status\t\t: lolos");
                    } else {
                        System.out.println("Status\t\t: tidak lolos");
                    }
                } else {
                    System.out.println("Status\t\t: tidak lolos");
                }
            } else if (jenisKegiatan.equalsIgnoreCase("PKM")) {
                if (statusDokumen.equalsIgnoreCase("lolos")) {
                    if (jumlahDokumen == 1 || jumlahDokumen == 3) {
                        System.out.println("Status\t\t: lolos");
                    } else {
                        System.out.println("Status\t\t: tidak lolos");
                    }
                } else {
                    System.out.println("Status\t\t: tidak lolos");
                }
            } else {
                System.out.println("Status\t\t: tidak lolos");
            }
        }
    }
}
