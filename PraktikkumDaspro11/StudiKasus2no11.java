import java.util.Scanner;

public class StudiKasus2no11 {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Masukkan nama mahasiswa: ");
            String namaMahasiswa = input.nextLine();

            System.out.print("Jenis kegiatan (BELMAWA/BAKORMA/MANDIRI/PKM/LAINNYA): ");
            String jenisKegiatan = input.nextLine().trim();

            System.out.print("Jumlah dokumen: ");
            int jumlahDokumen = Integer.parseInt(input.nextLine().trim());

            int peringkatJuara = 0;
            String statusPendanaan = "";
            if (jenisKegiatan.equalsIgnoreCase("PKM")) {
                System.out.print("Status pendanaan PKM (lolos/tidak lolos): ");
                statusPendanaan = input.nextLine().trim();
            } else if (jenisKegiatan.equalsIgnoreCase("BELMAWA")
                    || jenisKegiatan.equalsIgnoreCase("BAKORMA")
                    || jenisKegiatan.equalsIgnoreCase("MANDIRI")) {
                System.out.print("Peringkat juara (masukkan 0 jika bukan juara 1/2/3): ");
                peringkatJuara = Integer.parseInt(input.nextLine().trim());
            }

            System.out.println("Validasi Dokumen");
            System.out.println("Nama mahasiswa: " + namaMahasiswa);
            System.out.println("Jenis kegiatan: " + jenisKegiatan);
            System.out.println("Jumlah dokumen: " + jumlahDokumen);

            String statusPengajuan;
            if (jumlahDokumen < 4) {
                statusPengajuan = "Dokumen tidak lengkap (kurang "
                        + (4 - jumlahDokumen) + " dokumen). Dana penghargaan tidak diberikan.";
            } else if (jumlahDokumen > 4) {
                statusPengajuan = "Jumlah dokumen melebihi ketentuan. Dana penghargaan tidak diberikan.";
            } else if (jenisKegiatan.equalsIgnoreCase("PKM")) {
                if (statusPendanaan.equalsIgnoreCase("lolos")) {
                    statusPengajuan = "Berhak memperoleh dana penghargaan (PKM lolos pendanaan).";
                } else {
                    statusPengajuan = "Tidak memperoleh dana penghargaan (PKM tidak lolos pendanaan).";
                }
            } else if (jenisKegiatan.equalsIgnoreCase("BELMAWA")
                    || jenisKegiatan.equalsIgnoreCase("BAKORMA")
                    || jenisKegiatan.equalsIgnoreCase("MANDIRI")) {
                if (peringkatJuara >= 1 && peringkatJuara <= 3) {
                    statusPengajuan = "Berhak memperoleh dana penghargaan (juara "
                            + peringkatJuara + ").";
                } else {
                    statusPengajuan = "Tidak memperoleh dana penghargaan (hanya untuk juara 1/2/3).";
                }
            } else {
                statusPengajuan = "Tidak memperoleh dana penghargaan "
                        + "(jenis kegiatan tidak termasuk ketentuan).";
            }

            System.out.println("Status\t\t: " + statusPengajuan);
        }
    }
}