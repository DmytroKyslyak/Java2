package ua.univer.calc.manual;

import javax.jws.WebService;

@WebService(endpointInterface="ua.univer.calc.manual.ICalcWS")
public class CalcWSImpl implements ICalcWS {

	@Override
	public double sum(double x, double y) {
		// TODO Auto-generated method stub
		return x+y;
	}

	@Override
	public double multy(double x, double y) {
		// TODO Auto-generated method stub
		return x*y;
	}

	@Override
	public double div(double x, double y) {
		// TODO Auto-generated method stub
		return x/y;
	}

}
