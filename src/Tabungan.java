public class Tabungan extends Rekening implements BerBunga {
    private double bunga;

    public Tabungan(int nomor, String pemilik,
                    int saldo, double bunga) {
        super(nomor, pemilik, saldo);
        this.bunga = bunga;
    }

    @Override
    public boolean tarik(int jumlah) {
        if (jumlah > 0 && saldo >= jumlah) {
            saldo -= jumlah;
            return true;
        }
        return false;
    }

    @Override
    public int biayaAdmin() {
        return saldo < 500000 ? 5000 : 0;
    }

    @Override
    public int tambahBunga() {
        int jumlahBunga = (int) (saldo * bunga / 100);
        saldo += jumlahBunga;
        return jumlahBunga;
    }

    @Override
    public String keterangan() {
        return String.format(
                "Tabungan, bunga %.1f%% per bulan", bunga
        );
    }
}
