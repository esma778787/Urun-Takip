import java.util.Scanner;

public class Uygulama {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

        // Kullanıcıdan ürün bilgilerini al
        System.out.print("Ürün adı: ");
        String urunAdi = scanner.nextLine();

        System.out.print("Ürün kodu: ");
        String urunKodu = scanner.nextLine();

        System.out.print("Ürün fiyatı: ");
        double urunFiyati = scanner.nextDouble();

        scanner.nextLine(); // Dummy read to consume the newline character

        System.out.print("Ürün açıklaması: ");
        String urunAciklamasi = scanner.nextLine();

        // Elektronik ürün için ek bilgileri al
        System.out.print("Marka: ");
        String marka = scanner.nextLine();

        System.out.print("Model: ");
        String model = scanner.nextLine();

        // Gıda ürünü için ek bilgileri al
        System.out.print("Son kullanma tarihi (sadece gıda için): ");
        String sonKullanmaTarihi = scanner.nextLine();

        // Ürün nesnelerini oluştur
        Urun elektronikUrun = new ElektronikUrun(urunAdi, urunKodu, urunFiyati, urunAciklamasi, marka, model);
        Urun gidaUrun = new GidaUrun(urunAdi, urunKodu, urunFiyati, urunAciklamasi, sonKullanmaTarihi);

        // Test işlemleri
        System.out.println("Ürün adı: " + elektronikUrun.getUrunAdi());
        System.out.println("Ürün fiyatı: " + elektronikUrun.getUrunFiyati());
        elektronikUrun.fiyatiDegistir(1500.0);

        System.out.println();

        System.out.println("Ürün adı: " + gidaUrun.getUrunAdi());
        System.out.println("Ürün fiyatı: " + gidaUrun.getUrunFiyati());
        gidaUrun.stokMiktariGuncelle(50);

	}

}
