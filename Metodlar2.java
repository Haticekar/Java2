package youtube2;

public class Metodlar2 {

	public static void main(String[] args) {
		int sonuc=topla(30,25,21,12,8);
		System.out.println(sonuc);
		mesajVer();
		
		int sonuc2=topla2(0,12);
		System.out.println(sonuc2);
		

	}
	public static int topla(int... sayilar) {
		int toplam =0;
		for(int sayi:sayilar) {
			toplam+=sayi;
		}
		return toplam;
		
	}
	public static int topla2(int sayi1,int sayi2) {
		return sayi1+sayi2;
	}
	public static void mesajVer() {
		System.out.println("Mesaj verildi.");
		return; //BURAYA RETURN YAZILSA DA OLUR YAZILMASA DA RETURN BURDA BİTİR DEMEK 
		
	}

}
