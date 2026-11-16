
public class ProsesAkhirBulan {

    public void potongBiayaAdmin(Rekening[] semua) {
        for (Rekening rekening : semua) {
            int biaya = rekening.biayaAdmin();

            if (biaya == 0 || rekening.tarik(biaya)) {
                System.out.printf(
                        "%d biaya admin  : Rp%,d%n",
                        rekening.getNomor(), biaya
                );
            } else {
                System.out.printf(
                        "%d biaya admin  : gagal%n",
                        rekening.getNomor()
                );
            }
        }
    }

    public void tambahBunga(BerBunga[] berbunga) {
        for (BerBunga rekening : berbunga) {
            int bunga = rekening.tambahBunga();
            Rekening r = (Rekening) rekening;

            System.out.printf(
                    "%d bunga        : Rp%,d%n",
                    r.getNomor(), bunga
            );
        }
    }

    public void autodebet(Rekening[] semua, int jumlah) {
        for (Rekening rekening : semua) {
            boolean berhasil = rekening.tarik(jumlah);

            System.out.printf(
                    "%d autodebet    : %s%n",
                    rekening.getNomor(),
                    berhasil ? "Rp" + String.format("%,d", jumlah)
                            : "gagal"
            );
        }
    }
}
