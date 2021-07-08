package model;

public class Product {
	
	private String ean;
	private String description;
	
	public Product(String ean,String description)
	{
		super();
		this.ean=ean;
		this.description=description;
	}

	public String getEan() {
		return ean;
	}

	public String getDescription() {
		return description;
	}

	@Override
	public String toString() {
		return "Product [ean=" + ean + ", description=" + description + "]";
	}
	
	
	

}
