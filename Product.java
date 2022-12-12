package oop1;

// PascalCase --> CLASS LARIN İSİMLENDİRİLMESİ.

// KELİMLERİN İLK HARFİ BÜYÜK

public class Product {
	private String name;
	private double unitPrice;
	private double discount;
	private String imageUrl;
	private int unitInStock;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getUnitPrice() {
		return unitPrice;
	}

	public void setUnitPrice(double unitPrice) {
		this.unitPrice = unitPrice;
	}

	public double getDiscount() {
		return discount;
	}

	public void setDiscount(double discount) {
		this.discount = discount;
	}

	public String getImageUrl() {
		return imageUrl;
	}

	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}

	public int getUnitInStock() {
		return unitInStock;
	}

	public void setUnitInStock(int unitInStock) {
		this.unitInStock = unitInStock;
	}

	// PRODUCT BİR CLASS TIR
	// CLASS DEDİĞİMİZ BİR ŞABLON.
	// BU ŞABLONDA NAME= KAHVE MAKİNESİ YAZMAYACAĞIZ

	// BU PRODUCT DA NELER OLABİLİR, HANGİ ÖZELLİKLERİ TUTACAĞIZ.

	// FİELDLAR camelCase YAZILIR.

	// PRİVATE ÖZEL BİR DURUM GETİRMEK İÇİN
	// YANİ YA SADECE GET(OKUNABİLSİN) YA DA SADECE SET (DEĞER YAZILSIN ) DİYE

	// PRİVATE SADECE O CLASSIN İÇİNDE KULLANILABİLİR DEMEK
	// PRİVATE O CLASS A ÖZEL DEMEK

}
