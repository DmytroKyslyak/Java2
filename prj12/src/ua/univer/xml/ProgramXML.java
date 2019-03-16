package ua.univer.xml;

import java.io.File;

import org.xml.sax.ErrorHandler;
import org.xml.sax.SAXException;
import org.xml.sax.SAXParseException;

import ua.univer.database.City;
import ua.univer.database.Country;


public class ProgramXML {

	public static void main(String[] args) {
		
		Country country= new Country(1, "UA");
		City city = new City(1, "Kiev", true, 2000, null);
	    
		MapXML map = new MapXML();
		try {
		//	map.validate("source"+File.separator+"map.xml", "source"+File.separator+"map.xsd");
			map.loadFromFile("C:\\Git\\Java2\\prj12\\map.xml");
			map.printCity();
			map.saveToFile("C:\\Git\\Java2\\prj12\\map2.xml");
		//	Map mapDB = new Map();
		//	for (Country c : map.countries) {
		//		mapDB.addCountry(c);
		//	}
		//	mapDB.show();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}

