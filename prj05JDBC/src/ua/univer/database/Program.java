package ua.univer.database;

public class Program {
public static void main(String[] args) {
	try {
		Map map = new Map();
		map.show();
		//map.addCountry(new Country(5, "CANADA"));
		//map.deleteCountry("CANADA");
		map.show();
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
}
