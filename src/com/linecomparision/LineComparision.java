package com.linecomparision;
/*
 * -----------------------Line comparison computation program-----------------------
 * -> Print welcome message
 * -> Calculate Length of Line
 * 
 * @Dnyandeo Bansode
 * 
 * */

public class LineComparision {

	public static void main(String[] args) {
		System.out.println("Welcome to Line Comparision Computation Program..|");
		Line line1 = new Line();
		line1.x1 = 2;
		line1.x2 = 9;
		line1.y1 = 3;
		line1.y2 = 8;
		Double line1Length = line1.lineLength();
		System.out.println("Length of Line1:-> " + line1Length);
		
		Line line2 = new Line();
		line2.x1 = 2;
		line2.x2 = 9;
		line2.y1 = 3;
		line2.y2 = 8;
		double line2Length = line2.lineLength();
		System.out.println("Length of line2:-> " + line2Length);
		
		if(line1Length.equals(line2Length)) {
			System.out.println("line1 and line2 is equals..|");
		}else {
			System.out.println("line1 and line2 is not equals..|");
		}
	}
}
