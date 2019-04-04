package ua.univer.calc.manual;

import javax.xml.ws.Endpoint;

public class ProgramCalcWSManual {

	public static void main(String[] args) {
		System.out.println("start");
		Endpoint.publish("http://localhost:8080/WS/CalcManual", new CalcWSImpl());
		
	}

}
