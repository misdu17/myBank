package util;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadProperty {
	
public String propertyFilePath = "testConfig/config.properties";

public String getPropertyValue(String propertyKey){
	String propertyValue = null;
	try {
		FileInputStream fileInput = new FileInputStream(new File(propertyFilePath));
		Properties properties = new Properties();
		properties.load(fileInput);
		propertyValue = properties.getProperty(propertyKey);
		fileInput.close();
	} catch (FileNotFoundException e) {
		e.printStackTrace();
	} catch (IOException e) {
		e.printStackTrace();
	}
	return propertyValue;
}
	

}
