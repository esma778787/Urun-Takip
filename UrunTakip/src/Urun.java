
public class Urun {

	private String urunAdi;
    private String urunKodu;
    private double urunFiyati;
    private String urunAciklamasi;

    public Urun(String urunAdi, String urunKodu, double urunFiyati, String urunAciklamasi) {
        this.urunAdi = urunAdi;
        this.urunKodu = urunKodu;
        this.urunFiyati = urunFiyati;
        this.urunAciklamasi = urunAciklamasi;
    }

    public String getUrunAdi() {
        return urunAdi;
    }

    public String getUrunKodu() {
        return urunKodu;
    }

    public double getUrunFiyati() {
        return urunFiyati;
    }

    public String getUrunAciklamasi() {
        return urunAciklamasi;
    }

    public void setUrunAciklamasi(String yeniAciklama) {
        this.urunAciklamasi = yeniAciklama;
    }

    // Override edilebilir metotlar
    public void fiyatiDegistir(double yeniFiyat) {
        this.urunFiyati = yeniFiyat;
        System.out.println("Ürün fiyatı güncellendi: " + yeniFiyat);
    }

    public void stokMiktariGuncelle(int yeniStokMiktari) {
        System.out.println("Stok miktarı güncellenemez.");
    }
}
