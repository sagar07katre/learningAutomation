package com.AmazoCart.generic.common;

import com.AmazoCart.generic.excelutility.ReadExcelFile;
import com.AmazoCart.generic.javautility.Javautility;
import com.AmazoCart.generic.propertyfileutility.ReadPropertyFile;
import com.AmazoCart.generic.webdriverutility.WebdriverUtility;

public class ObjectUtility implements FrameworkConstant {
	public ReadExcelFile excelobj;
	public Javautility javaobj;
	public ReadPropertyFile propertyobj;
	public WebdriverUtility webdriverobj;

	public void objectCreation() {
		excelobj = new ReadExcelFile();
		javaobj = new Javautility();
		propertyobj = new ReadPropertyFile();
		webdriverobj = new WebdriverUtility();
	}
}
