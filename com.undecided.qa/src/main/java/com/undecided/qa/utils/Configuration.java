package com.undecided.qa.utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class Configuration {
	
	// we will create a structure to read file
	
	private static Configuration configuration;
	private static Properties properties;
	private static String pathString = "configuration/config.properties";
	
	public Configuration(String path) {
		if(path ==null) {
			loadProperty(pathString);
			
		}else {
			loadProperty(path);
		}
		
		
		
	}
	
	private void loadProperty(String path) {
		 properties = new Properties();
		try {
			InputStream iStream = new FileInputStream(path);
			properties.load(iStream);
		}catch(IOException e) {
			
			e.printStackTrace();
			
		}

	}
	
	
	public String getConfiguration(String key) {
		return properties.getProperty(key);
		
	}
	



}
