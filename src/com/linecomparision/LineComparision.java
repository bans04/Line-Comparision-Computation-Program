package com.linecomparision;
/*
 * -----------------------Line comparison computation program-----------------------
 * -> Print welcome message
 * -> Calculate Length of Line
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
		
		System.out.println("Length of Line:-> " + line1.lineLength());
	}
}
