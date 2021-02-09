package com.Utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {
	
	private Properties prop;
	
	public Properties readProp()
	{
		try 
		{
			prop = new Properties();
			//System.out.println(System.getProperty("user.dir"));
			FileInputStream fis = new FileInputStream("./src/test/resources/com/ConfigFiles/Config.properties");
			prop.load(fis);
		} 
		catch (FileNotFoundException e) 
		{
			e.printStackTrace();
		}
		catch (IOException e)
		{
			e.printStackTrace();
		}
		
		return prop;
	}

}
