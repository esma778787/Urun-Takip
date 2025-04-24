
public class GidaUrun extends Urun{
	
	private String sonKullanmaTarihi;

    public GidaUrun(String urunAdi, String urunKodu, double urunFiyati, String urunAciklamasi, String sonKullanmaTarihi) {
        super(urunAdi, urunKodu, urunFiyati, urunAciklamasi);
        this.sonKullanmaTarihi = sonKullanmaTarihi;
    }

    // Override edilmiş metot
    @Override
    public void stokMiktariGuncelle(int yeniStokMiktari) {
        System.out.println("Gıda ürününün stok miktarı güncellendi: " + yeniStokMiktari);
    }

}
