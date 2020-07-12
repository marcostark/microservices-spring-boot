package dev.marcosouza.store.dto;

public class AddressDTO {

	private String street;
	
	private String number;
	
	private String uf;

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public String getUf() {
		return uf;
	}

	public void setUf(String uf) {
		this.uf = uf;
	}

	@Override
	public String toString() {
		return "AddressDTO{" +
				"street='" + street + '\'' +
				", number='" + number + '\'' +
				", uf='" + uf + '\'' +
				'}';
	}
}
