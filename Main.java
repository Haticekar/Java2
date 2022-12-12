package oop1;

public class Main {

	public static void main(String[] args) {
		// OOP
		// CLASS BİR NESNE , ÖZELLİK TUTUCU DEMEK

		String mesaj = "Vade oranı";

		Product product1 = new Product(); // BİR CLASS BÖYLE TANIMLANIR.

		product1.setName("Delonghi Kahve Makinesi");
		product1.setDiscount(7);
		product1.setUnitPrice(7500);
		product1.setUnitInStock(3);
		product1.setImageUrl("image1.jpg");
		// YAZMAK İÇİN SET OKUMAK İÇİN GET

		// PRODUCT DA STRING GİBİ BİR VERİ TİPİ. PRODUCT1 DE MESAJ GİBİ BİR İSİM.

		// set value DENİR AŞAĞIDAKİLERE
		// SET --> DEĞER ATAMA

		// YUKARADAKİ KISIM BİR BACKEND PROJESİ GİBİ

		// GET ---> OKUMAK DENİR

		// System.out.println(product1.name);

		// SYS İLE BÖLÜM İSE BİR FRONTED PROJESİ GİBİ

		Product product2 = new Product();
		product2.setName("Smeg Kahve Makinesi");
		product2.setDiscount(7);
		product2.setUnitPrice(7500);
		product2.setUnitInStock(3);
		product2.setImageUrl("image1.jpg");

		Product product3 = new Product();
		product3.setName("Kitchen Aid Kahve Makinesi");
		product3.setDiscount(7);
		product3.setUnitPrice(7500);
		product3.setUnitInStock(3); 
		product3.setImageUrl("image1.jpg");

		Product[] products = { product1, product2, product3 };
		// YUKARIDAKİ BÖLÜME STRİNG İNT GİBİ ŞEYLER YAZARSAK YANLIŞ OLUR.
		// ÇÜNKÜ VERİ TİPİ PRODUCT

		for (Product product : products) { // BURADA FOR EACH KULANDIK.
			// DEMEK İSTEDİĞİ GİT PRODUCTS LARI TEK TEK GEZ DEMEK--> PRDODUCTS
			// PRODUCT DA 2. OLAN DÖNGÜDE VERİLEN TAKMA İSİM
			System.out.println(product.getName());

		}

		IndividualCustomer individualCustomer = new IndividualCustomer();
		individualCustomer.setId(1);
		individualCustomer.setPhone("05444444");
		individualCustomer.setCustomerNumber("12345");

		individualCustomer.setFirstName("Hatice");
		individualCustomer.setLastName("Kar");

		CorporateCustomer corporateCustomer = new CorporateCustomer();
		corporateCustomer.setId(2);
		corporateCustomer.setCompanyName("Kodlama.io");
		corporateCustomer.setPhone("05443332424");
		corporateCustomer.setTaxNumber("1234567890");
		corporateCustomer.setCustomerNumber("54321");

		System.out.println(corporateCustomer.getCompanyName());
		System.out.println(individualCustomer.getFirstName());
		System.out.println(individualCustomer.getCustomerNumber());
		
		
	}
}
