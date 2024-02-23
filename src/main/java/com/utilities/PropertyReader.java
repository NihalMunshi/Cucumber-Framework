package com.utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertyReader 
{
	private Properties prop;
	
	public Properties init_prop() throws IOException
	{
		prop= new Properties();
		FileInputStream fis =new FileInputStream("./src/test/resources/config/config.properties");
		prop.load(fis);
		return prop;
	}
}
