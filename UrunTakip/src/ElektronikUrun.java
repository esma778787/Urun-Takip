
public class ElektronikUrun extends Urun {
	private String marka;
    private String model;

    public ElektronikUrun(String urunAdi, String urunKodu, double urunFiyati, String urunAciklamasi, String marka, String model) {
        super(urunAdi, urunKodu, urunFiyati, urunAciklamasi);
        this.marka = marka;
        this.model = model;
    }

    // Override edilmiş metot
    @Override
    public void fiyatiDegistir(double yeniFiyat) {
        super.fiyatiDegistir(yeniFiyat);
        System.out.println("Elektronik ürün fiyatı güncellendi: " + yeniFiyat);
    }

}
