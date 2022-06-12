package com.linecomparision;
/*
 * -------------------------------Line class-------------------------------
 * -> Create method for calculate Line length
 * 
 * */

public class Line {
	int x1;
	int x2;
	int y1;
	int y2;
	double lineLength;
	
	public double lineLength() {
		return lineLength = Math.sqrt( (x2 - x1) ^ 2 + (y2- y1) ^ 2);
	}
}
