package com.AmazoCart.generic.propertyfileutility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.Keys;

import com.AmazoCart.generic.common.BaseClass;
import com.AmazoCart.generic.common.FrameworkConstant;

public class ReadPropertyFile implements FrameworkConstant {

	FileInputStream fis;
	FileOutputStream fos;
	Properties p;
	//String key;
	//String value;
	
	public String readData(String key) {
		// Convert the Physical file into Java Understandable
				try {
					fis = new FileInputStream(PropertyPath);
				} catch (FileNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

				// creating Instance/object for Properties class
				p = new Properties();

				// load the all Common Data
				try {
					p.load(fis);
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

				// fetch the data
				String data = p.getProperty(key);

				return data;
	}

	public void displaydata(String key) {
		// Convert the Physical file into Java Understandable
				try {
					fis = new FileInputStream(PropertyPath);
				} catch (FileNotFoundException e) {
					e.printStackTrace();
				}

				// creating Instance for Properties class
				p = new Properties();

				// load the all Common Data
				try {
					p.load(fis);
				} catch (IOException e) {
					e.printStackTrace();
				}

				// fetch the data
				String data = p.getProperty(key);
				
				//Print on Console
				System.out.println(data);
	}

	public void writeData(String key, String value) {
		// enter the data
				p.put(key, value);

				// create instance for FILE output Stream
				try {
					fos = new FileOutputStream(PropertyPath);
				} catch (FileNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

				// store the Data
				try {
					p.store(fos, "Updated the New Key-value Sucessfully");
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
	}

}

