package ua.univer.figures.base;

import ua.univer.figures.Figure;

public class Triangle extends Figure {
	Point apexA;
	Point apexB;
	Point apexC;
	private Line sideAB;
	private Line sideBC;
	private Line sideAC;
	public Triangle(Point apexA, Point apexB, Point apexC) {
		super();
		this.apexA = apexA;
		this.apexB = apexB;
		this.apexC = apexC;
		//sideAB = new Line(apexA, apexB);
		//sideAC = new Line(apexA, apexC);
		//sideBC = new Line(apexB, apexC);
	}
	public Line getSideAB() {
		if(sideAB==null)sideAB = new Line(apexA, apexB);
		return sideAB;
	}
	
	
}
