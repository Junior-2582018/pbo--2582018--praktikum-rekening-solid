
public class Deposito extends Rekening implements BerBunga {

    private double bunga;

    public Deposito(int nomor, String pemilik,
                    int saldo, double bunga) {
        super(nomor, pemilik, saldo);
        this.bunga = bunga;
    }

    @Override
    public boolean tarik(int jumlah) {
        throw new UnsupportedOperationException(
                "Deposito tidak bisa ditarik"
        );
    }

    @Override
    public int biayaAdmin() {
        return 0;
    }

    @Override
    public int tambahBunga() {
        int hasil = (int) (saldo * bunga / 100);
        saldo += hasil;
        return hasil;
    }

    @Override
    public String keterangan() {
        return String.format(
                "Deposito, bunga %.1f%% per bulan", bunga
        );
    }
}
