package services;

import model.Product;

public class ProductService {
	
	public static Product sendProductInformation(String productSerialNumber)
	{
	
	if(Integer.parseInt(productSerialNumber)==1)
	{
	return new Product("35488555857","Chair");
	}
	else
	{
		return new Product("12455655","Table");
	}
	}

}
