package ua.univer.calc;

import ua.univer.calc.manual.CalcWSImplService;
import ua.univer.calc.manual.ICalcWS;

public class ProgramClient {

	public static void main(String[] args) {
		CalcWSImplService service = new CalcWSImplService();
		ICalcWS calc = service.getCalcWSImplPort();
		System.out.println(calc.multy(3, 4));

	}

}
