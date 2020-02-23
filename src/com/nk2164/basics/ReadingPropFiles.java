package com.nk2164.basics;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadingPropFiles {

	public static void main(String args[]) throws IOException {
		Properties prop = readPropertiesFile("proptest.properties");
		System.out.println("Prop1: " + prop.getProperty("prop1"));
		System.out.println("Prop2: " + prop.getProperty("prop2"));
	}

	public static Properties readPropertiesFile(String fileName) throws IOException {
		FileInputStream fis = null;
		Properties prop = null;
		try {
			fis = new FileInputStream(fileName);
			prop = new Properties();
			prop.load(fis);
		} catch (FileNotFoundException fnfe) {
			fnfe.printStackTrace();
		} catch (IOException ioe) {
			ioe.printStackTrace();
		} finally {
			fis.close();
		}
		return prop;
	}
}
