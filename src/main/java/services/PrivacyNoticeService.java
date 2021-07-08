package services;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class PrivacyNoticeService {
	
	
	
	public static String sendPrivacyNoticeInformation()
	{
		
		FileReader reader;
		try {
			reader = new FileReader("C:\\Users\\856520\\BloomreachVirtualization\\src\\main\\resources\\response.properties");
			Properties p=new Properties();
			p.load(reader);
			
			return p.getProperty("privacyNoticeResponse");
		} catch (Exception e1) {
			e1.printStackTrace();
		}
		return null;  
	      
	      
	    
		
	
	
	}

}
