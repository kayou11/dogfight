package jpu2016_dogfight.model;

public class Position {
	private double x;
	private double y;
	private double maxX;
	private double maxY;
	
	
	public Position(double x, double y, double maxX, double maxY){
		this.x = x;
		this.y = y;
		this.maxX = maxX;
		this.maxY = maxY;
				
	}
	public Position(Position position){
		
	}
	public double getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public double getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	public double getMaxX() {
		return maxX;
	}
	private void setMaxX(double maxX) {
		this.maxX = maxX;
	}
	private double getMaxY() {
		return maxY;
	}
	public void setMaxY(double maxY) {
		this.maxY = maxY;
	}

}
