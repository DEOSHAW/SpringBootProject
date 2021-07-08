package services;

import java.util.ArrayList;
import java.util.HashMap;

public class DeliveryService {
	/*
	 earliestAchievableDeliveryDate": "2020-11-13T18:00:59.999Z",
      "carrierServiceName": "OverNight",
      "outBase": "NF1ON",
      "carrierCode": "NF1MAN",
      "warehouseDespatchDate": "2020-11-12T18:00:59.999Z",
      "orderCutOffDate": "2020-11-10T23:59:00.999Z"
    }

	 */
	
	String earliestAchievableDeliveryDate,carrierServiceName,outBase,carrierCode,warehouseDespatchDate,orderCutOffDate;
	static ArrayList<DeliveryService> listOfDeliveryConsignment=new ArrayList<DeliveryService>();
	//static HashMap<String,DeliveryService> mapOfDeliveryConsignment=new HashMap<String,DeliveryService>();
	
	
	public DeliveryService(String earliestAchievableDeliveryDate, String carrierServiceName, String outBase, String carrierCode, String warehouseDespatchDate,String orderCutOffDate) {
		this.earliestAchievableDeliveryDate=earliestAchievableDeliveryDate;
		this.carrierServiceName=carrierServiceName;
		this.outBase=outBase;
		this.carrierCode=carrierCode;
		this.warehouseDespatchDate=warehouseDespatchDate;
		this.orderCutOffDate=orderCutOffDate;
	}
	
	public void setAchievableDeliveryDate(String earliestAchievableDeliveryDate)
	{
		this.earliestAchievableDeliveryDate=earliestAchievableDeliveryDate;
	}
	public String getAchievableDeliveryDate()
	{
		return earliestAchievableDeliveryDate;
	}
	public void setCarrierServiceName(String carrierServiceName)
	{
		this.carrierServiceName=carrierServiceName;
	}
	public String getCarrierServiceName()
	{
		return carrierServiceName;
	}
	public void setOutBase(String outBase)
	{
		this.outBase=outBase;
	}
	public String getOutBase()
	{
		return outBase;
	}
	public void setCarrierCode(String carrierCode)
	{
		this.carrierCode=carrierCode;
	}
	public String getCarrierCode()
	{
		return carrierCode;
	}
	public void setWarehouseDespatchDate(String warehouseDespatchDate)
	{
		this.warehouseDespatchDate=warehouseDespatchDate;
	}
	public String getWarehouseDespatchDate()
	{
		return warehouseDespatchDate;
	}
	public void setOrderCutOffDate(String orderCutOffDate)
	{
		this.orderCutOffDate=orderCutOffDate;
	}
	public String getOrderCutOffDate()
	{
		return orderCutOffDate;
	}




	public static DeliveryService add(DeliveryService service)
	{
		//listOfDeliveryConsignment.add(service);
		//mapOfDeliveryConsignment.put("deliveryOptions", new DeliveryService("2021-05-09T18:00:59.999Z","OverNight","NF1ON","NF1MAN","2021-05-08T18:00:59.999Z","2021-05-08T18:00:59.999Z"));
		listOfDeliveryConsignment.add(new DeliveryService("2021-05-09T18:00:59.999Z","OverNight","NF1ON","NF1MAN","2021-05-08T18:00:59.999Z","2021-05-08T18:00:59.999Z"));
	    //System.out.println("Size of array is: "+listOfDeliveryConsignment.size());
	    return new DeliveryService("2021-05-09T18:00:59.999Z","OverNight","NF1ON","NF1MAN","2021-05-08T18:00:59.999Z","2021-05-08T18:00:59.999Z");
	    
	}

}
