package ua.univer.calc.manual;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public interface ICalcWS {
	@WebMethod
	double sum(double x, double y);
	@WebMethod
	double multy(double x, double y);
	@WebMethod
	double div(double x, double y);
}
