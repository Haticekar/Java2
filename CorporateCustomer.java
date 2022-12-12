package oop1;

public class CorporateCustomer extends Customer {
	
	private String CompanyName;  // SSADECE CORPORATECUSTOMER A ÖZEL
	private String TaxNumber;
	
	public String getCompanyName() {
		return CompanyName;
	}
	public void setCompanyName(String companyName) {
		CompanyName = companyName;
	}
	public String getTaxNumber() {
		return TaxNumber;
	}
	public void setTaxNumber(String taxNumber) {
		TaxNumber = taxNumber;
	}
	

}
