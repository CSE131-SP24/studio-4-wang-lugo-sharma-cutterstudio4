package studio4;

import java.awt.Color;

import edu.princeton.cs.introcs.StdDraw;

public class Flag {
	public static void main(String[] args) {
		
		StdDraw.setPenRadius(0.05);
		Color green = new Color(32, 92, 28);

		StdDraw.setPenColor(green);
		StdDraw.filledCircle(0.5, 0.5, 0.5);
		
		StdDraw.setPenRadius(0.05);
		StdDraw.setPenColor(StdDraw.PINK);
		StdDraw.filledCircle(0.5, 0.5, 0.4);
		
		StdDraw.setPenRadius(0.05);
		StdDraw.setPenColor(StdDraw.BLACK);
		StdDraw.filledCircle(0.3, 0.6, 0.01);
		
		StdDraw.setPenRadius(0.05);
		StdDraw.setPenColor(StdDraw.BLACK);
		StdDraw.filledCircle(0.7, 0.6, 0.01);
		
		StdDraw.setPenRadius(0.05);
		StdDraw.setPenColor(StdDraw.BLACK);
		StdDraw.filledRectangle(0.5, 0.35, 0.15, 0.01);
		
	
	}
}