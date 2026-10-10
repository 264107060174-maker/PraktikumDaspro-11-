import java.util.Scanner;

public class StudiKasus2no11 {
    public static void main(String[] args) {
        String namaMahasiswa;
        String jenisKegiatan;
        int jumlahDokumen;
        int peringkatJuara;
        String statusPengajuan;

        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan nama mahasiswa: ");
        namaMahasiswa = input.nextLine();

        System.out.print("Jenis kegiatan (BELMAWA/BAKORMA/MANDIRI/PKM/LAINNYA): ");
        jenisKegiatan = input.nextLine();

        System.out.print("Jumlah dokumen: ");
        jumlahDokumen = input.nextInt();
        System.out.print("Peringkat juara: ");
        peringkatJuara = input.nextInt();
        input.nextLine();
        input.close();

        System.out.println("Validasi Dokumen");
        System.out.println("Nama mahasiswa: " + namaMahasiswa);
        System.out.println("Jenis kegiatan: " + jenisKegiatan);
        System.out.println("Jumlah dokumen: " + jumlahDokumen);
        System.out.println("Peringkat juara: " + peringkatJuara);

        statusPengajuan = "tidak lolos";

        if (jumlahDokumen < 4) {
            System.out.println("Status\t\t: Dokumen tidak lengkap (kurang "
                    + (4 - jumlahDokumen) + " dokumen). Dana pengajuan tidak diberikan.");
        } else if (jumlahDokumen > 4) {
            System.out.println("Status\t\t: Jumlah dokumen melebihi ketentuan. Dana pengajuan tidak diberikan.");
        } else {
            if (jenisKegiatan.equalsIgnoreCase("BELMAWA")
                    || jenisKegiatan.equalsIgnoreCase("BAKORMA")
                    || jenisKegiatan.equalsIgnoreCase("MANDIRI")
                    || jenisKegiatan.equalsIgnoreCase("PKM")) {
                statusPengajuan = "lolos";
            }

            System.out.println("Status\t\t: " + statusPengajuan);
        }
    }
}